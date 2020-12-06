package frontend;

import antlr4.projectBaseVisitor;
import antlr4.projectParser;
import intermediate.symtab.Predefined;
import intermediate.symtab.Symtab;
import intermediate.symtab.SymtabEntry;
import intermediate.symtab.SymtabEntry.Kind;
import intermediate.symtab.SymtabStack;
import intermediate.type.TypeChecker;
import intermediate.type.Typespec;
import intermediate.type.Typespec.Form;
import intermediate.util.BackendMode;
import intermediate.util.CrossReferencer;

import java.util.ArrayList;
import java.util.HashSet;

import static frontend.SemanticErrorHandler.Code.*;
import static intermediate.symtab.SymtabEntry.Kind.*;

import static intermediate.type.Typespec.Form.*;
import static intermediate.util.BackendMode.EXECUTOR;

/**
 * Semantic operations.
 * Perform type checking and create symbol tables.
 */
public class Semantics extends projectBaseVisitor<Object>
{
    private BackendMode mode;
    private SymtabStack symtabStack;
    private SymtabEntry programId;
    private SemanticErrorHandler error;
    
    public Semantics(BackendMode mode)
    {
        // Create and initialize the symbol table stack.
        this.symtabStack = new SymtabStack();
        Predefined.initialize(symtabStack);
        
        this.mode = mode;
        this.error = new SemanticErrorHandler();
    }
    
    public SymtabEntry getProgramId() { return programId; }
    public int getErrorCount() { return error.getCount(); };
    
    /**
     * Return the default value for a data type.
     * @param type the data type.
     * @return the default value.
     */
    public static Object defaultValue(Typespec type)
    {
        type = type.baseType();

        if      (type == Predefined.integerType) return Integer.valueOf(0);
        else if (type == Predefined.realType)    return Float.valueOf(0.0f);
        else if (type == Predefined.booleanType) return Boolean.valueOf(false);
        else if (type == Predefined.charType)    return Character.valueOf('#');
        else /* string */                        return String.valueOf("#");
    }

    @Override 
    public Object visitProgram(projectParser.ProgramContext ctx)
    { 
        visit(ctx.programHeader());
        visit(ctx.mainProgram().compoundStatement());
        
        // Print the cross-reference table.
        CrossReferencer crossReferencer = new CrossReferencer();
        crossReferencer.print(symtabStack);

        return null;
    }
    
    @Override 
    public Object visitProgramHeader(projectParser.ProgramHeaderContext ctx)
    { 
        projectParser.ProgramIdentifierContext idCtx = ctx.programIdentifier();
        String programName = idCtx.IDENTIFIER().getText();  // don't shift case
        
        programId = symtabStack.enterLocal(programName, PROGRAM);
        programId.setRoutineSymtab(symtabStack.push());
        
        symtabStack.setProgramId(programId);
        symtabStack.getLocalSymtab().setOwner(programId);
        
        idCtx.entry = programId;
        return null;
    }
    
    /**
     * Return the number of values in a datatype.
     * @param type the datatype.
     * @return the number of values.
     */
    private int typeCount(Typespec type)
    {
        int count = 0;
        
        if (type.getForm() == ENUMERATION)
        {
            ArrayList<SymtabEntry> constants = type.getEnumerationConstants();
            count = constants.size();
        }
        else  // subrange
        {
            int minValue = type.getSubrangeMinValue();
            int maxValue = type.getSubrangeMaxValue();
            count = maxValue - minValue + 1;
        }
        
        return count;
    }

   /*/ @Override
    public Object visitVariableDeclarations(
                                projectParser.VariableDeclarationsContext ctx)
    { 
        PascalParser.TypeSpecificationContext typeCtx = ctx.typeSpecification();
        visit(typeCtx);
        
        PascalParser.VariableIdentifierListContext listCtx = 
                                                ctx.variableIdentifierList();
        
        // Loop over the variables being declared.
        for (PascalParser.VariableIdentifierContext idCtx : 
                                                listCtx.variableIdentifier())
        {
            int lineNumber = idCtx.getStart().getLine();        
            String variableName = idCtx.IDENTIFIER().getText().toLowerCase();
            SymtabEntry variableId = symtabStack.lookupLocal(variableName);
            
            if (variableId == null)
            {
                variableId = symtabStack.enterLocal(variableName, VARIABLE);
                variableId.setType(typeCtx.type);
                
                // Assign slot numbers to local variables.
                Symtab symtab = variableId.getSymtab();
                if (symtab.getNestingLevel() > 1)
                {
                    variableId.setSlotNumber(symtab.nextSlotNumber());
                }
                
                idCtx.entry = variableId;
            }
            else
            {
                error.flag(REDECLARED_IDENTIFIER, ctx);
            }
            
            variableId.appendLineNumber(lineNumber);        
        }
        
        return null;
    }

    @Override 
    @SuppressWarnings("unchecked")
    public Object visitRoutineDefinition(
                                    PascalParser.RoutineDefinitionContext ctx) 
    {
        PascalParser.FunctionHeadContext  funcCtx = ctx.functionHead();
        PascalParser.ProcedureHeadContext procCtx = ctx.procedureHead();
        PascalParser.RoutineIdentifierContext idCtx = null;
        PascalParser.ParametersContext parameters = null;
        boolean functionDefinition = funcCtx != null;
        Typespec returnType = null;
        String routineName;
        
        if (functionDefinition)
        {
            idCtx = funcCtx.routineIdentifier();
            parameters = funcCtx.parameters();
        }
        else
        {
            idCtx = procCtx.routineIdentifier();
            parameters = procCtx.parameters();
        }
        
        routineName = idCtx.IDENTIFIER().getText().toLowerCase();
        SymtabEntry routineId = symtabStack.lookupLocal(routineName);
        
        if (routineId != null)
        {
            error.flag(REDECLARED_IDENTIFIER, 
                       ctx.getStart().getLine(), routineName);
            return null;
        }

        routineId = symtabStack.enterLocal(
                        routineName, functionDefinition ? FUNCTION : PROCEDURE);
        routineId.setRoutineCode(DECLARED);
        idCtx.entry = routineId;
        
        // Append to the parent routine's list of subroutines.
        SymtabEntry parentId = symtabStack.getLocalSymtab().getOwner();
        parentId.appendSubroutine(routineId);
        
        routineId.setRoutineSymtab(symtabStack.push());
        idCtx.entry = routineId;
        
        Symtab symtab = symtabStack.getLocalSymtab();
        symtab.setOwner(routineId);
        
        if (parameters != null)
        {
            ArrayList<SymtabEntry> parameterIds = (ArrayList<SymtabEntry>)
                                visit(parameters.parameterDeclarationsList());
            routineId.setRoutineParameters(parameterIds);
            
            for (SymtabEntry parmId : parameterIds)
            {
                parmId.setSlotNumber(symtab.nextSlotNumber());
            }
        }
        
        if (functionDefinition)
        {
            PascalParser.TypeIdentifierContext typeIdCtx = 
                                                    funcCtx.typeIdentifier();
            visit(typeIdCtx);
            returnType = typeIdCtx.type;
            
            if (returnType.getForm() != SCALAR)
            {
                error.flag(INVALID_RETURN_TYPE, typeIdCtx);
                returnType = Predefined.integerType;
            }
            
            routineId.setType(returnType);
            idCtx.type = returnType;
        }
        else
        {
            idCtx.type = null;
        }
        
        visit(ctx.block().declarations());     
        
        // Enter the function's associated variable into its symbol table.
        if (functionDefinition)
        {
            SymtabEntry assocVarId =
                                symtabStack.enterLocal(routineName, VARIABLE);
            assocVarId.setSlotNumber(symtab.nextSlotNumber());
            assocVarId.setType(returnType);
        }
        
        visit(ctx.block().compoundStatement());
        routineId.setExecutable(ctx.block().compoundStatement());
        
        symtabStack.pop();
        return null;
    }

    @Override 
    @SuppressWarnings("unchecked")
    public Object visitParameterDeclarationsList(
                            PascalParser.ParameterDeclarationsListContext ctx)
    {
        ArrayList<SymtabEntry> parameterList = new ArrayList<>();
        
        // Loop over the parameter declarations.
        for (PascalParser.ParameterDeclarationsContext dclCtx : 
                                                    ctx.parameterDeclarations())
        {
            ArrayList<SymtabEntry> parameterSublist =
                                        (ArrayList<SymtabEntry>) visit(dclCtx);
            parameterList.addAll(parameterSublist);
        }
        
        return parameterList;
    }

    @Override 
    public Object visitParameterDeclarations(
                                PascalParser.ParameterDeclarationsContext ctx) 
    {
        Kind kind = ctx.VAR() != null ? REFERENCE_PARAMETER : VALUE_PARAMETER;
        PascalParser.TypeIdentifierContext typeCtx = ctx.typeIdentifier();
        
        visit(typeCtx);
        Typespec parmType = typeCtx.type;
        
        ArrayList<SymtabEntry> parameterSublist = new ArrayList<>();
        
        // Loop over the parameter identifiers.
        PascalParser.ParameterIdentifierListContext parmListCtx = 
                                                ctx.parameterIdentifierList();
        for (PascalParser.ParameterIdentifierContext parmIdCtx : 
                                            parmListCtx.parameterIdentifier())
        {
            int lineNumber = parmIdCtx.getStart().getLine();   
            String parmName = parmIdCtx.IDENTIFIER().getText().toLowerCase();
            SymtabEntry parmId = symtabStack.lookupLocal(parmName);
            
            if (parmId == null)
            {
                parmId = symtabStack.enterLocal(parmName, kind);
                parmId.setType(parmType);
                
                if (   (kind == REFERENCE_PARAMETER) 
                    && (mode != EXECUTOR)
                    && (parmType.getForm() == SCALAR))
                {
                    error.flag(INVALID_REFERENCE_PARAMETER, parmIdCtx);
                }
            }
            else
            {
                error.flag(REDECLARED_IDENTIFIER, parmIdCtx);
            }
            
            parmIdCtx.entry = parmId;
            parmIdCtx.type  = parmType;
            
            parameterSublist.add(parmId);
            parmId.appendLineNumber(lineNumber);    
        }
        
        return parameterSublist;
    }/*/
    
    @Override 
    public Object visitAssignmentStatement(
                                    projectParser.AssignmentStatementContext ctx)
    {
        projectParser.LhsContext lhsCtx = ctx.lhs();
        projectParser.RhsContext rhsCtx = ctx.rhs();
        
        visitChildren(ctx);
        
        Typespec lhsType = lhsCtx.type;
        Typespec rhsType = rhsCtx.expression().type;
        
        if (!TypeChecker.areAssignmentCompatible(lhsType, rhsType))
        {
            error.flag(INCOMPATIBLE_ASSIGNMENT, rhsCtx);
        }
        
        return null;
    }

    @Override 
    public Object visitLhs(projectParser.LhsContext ctx)
    {
        projectParser.VariableContext varCtx = ctx.variable();
        visit(varCtx);
        ctx.type = varCtx.type;
        
        return null;
    }

    @Override 
    public Object visitIfStatement(projectParser.IfStatementContext ctx)
    {
        projectParser.ExpressionContext     exprCtx  = ctx.expression();
        projectParser.TrueStatementContext  trueCtx  = ctx.trueStatement();
        projectParser.FalseStatementContext falseCtx = ctx.falseStatement();
        
        visit(exprCtx);
        Typespec exprType = exprCtx.type;
        
        if (!TypeChecker.isBoolean(exprType))
        {
            error.flag(TYPE_MUST_BE_BOOLEAN, exprCtx);
        }
        
        visit(trueCtx);
        if (falseCtx != null) visit(falseCtx);
        
        return null;
    }

   /*/ @Override
    public Object visitSwitchStatement(projectParser.SwitchStatementContext ctx)
    {
        projectParser.ExpressionContext exprCtx = ctx.expression();
        visit(exprCtx);
        Typespec exprType = exprCtx.type;
        Form exprTypeForm = exprType.getForm();
        
        if (   (   (exprTypeForm != SCALAR) 
                && (exprTypeForm != ENUMERATION) 
                && (exprTypeForm != SUBRANGE))
            || (exprType == Predefined.realType)
            || (exprType == Predefined.stringType))
        {
            error.flag(TYPE_MISMATCH, exprCtx);
            exprType = Predefined.integerType;
        }
        
        HashSet<Integer> constants = new HashSet<>();
        projectParser.SwitchBranchListContext branchListCtx = ctx.switchBranchList();
        
        // Loop over the CASE branches.
        for (projectParser.CaseBranchContext branchCtx :
                                                    branchListCtx.caseBranch())
        {
            projectParser.CaseConstantListContext constListCtx =
                                                    branchCtx.caseConstantList();
            projectParser.StatementContext stmtCtx = branchCtx.caseCompound().statement();
            
            if (constListCtx != null)
            {
                // Loop over the CASE constants in each branch.
                for (PascalParser.CaseConstantContext caseConstCtx : 
                                                    constListCtx.caseConstant())
                {
                    PascalParser.ConstantContext constCtx = 
                                                        caseConstCtx.constant();
                    Object constValue = visit(constCtx);
                    
                    caseConstCtx.type  = constCtx.type;
                    caseConstCtx.value = 0;
                    
                    if (constCtx.type != exprType)
                    {
                        error.flag(TYPE_MISMATCH, constCtx);
                    }
                    else if (   (constCtx.type == Predefined.integerType)
                             || (constCtx.type.getForm() == ENUMERATION))
                    {
                        caseConstCtx.value = (Integer) constValue;
                    }
                    else if (constCtx.type == Predefined.charType)
                    {
                        caseConstCtx.value = (Character) constValue;
                    }
                    
                    if (constants.contains(caseConstCtx.value))
                    {
                        error.flag(DUPLICATE_CASE_CONSTANT, constCtx);
                    }
                    else
                    {
                        constants.add(caseConstCtx.value);
                    }
                }
            }
            
            if (stmtCtx != null) visit(stmtCtx);
        }
        
        return null;
    }/*/

    @Override 
    public Object visitWhileStatement(projectParser.WhileStatementContext ctx)
    {
        projectParser.ExpressionContext exprCtx = ctx.expression();
        visit(exprCtx);
        Typespec exprType = exprCtx.type;
        
        if (!TypeChecker.isBoolean(exprType))
        {
            error.flag(TYPE_MUST_BE_BOOLEAN, exprCtx);
        }
        
        visit(ctx.compoundStatement());
        return null;
    }

    @Override 
    public Object visitForStatement(projectParser.ForStatementContext ctx)
    {
        projectParser.VariableContext varCtx = ctx.forInitialization().assignmentStatement().lhs().variable();
        visit(varCtx);
        
        String controlName = varCtx.getText().toLowerCase();
        Typespec controlType = Predefined.integerType;
        
        if (varCtx.entry != null)
        {
            controlType = varCtx.type;
            
            if (   (controlType.getForm() != SCALAR )
                || (controlType == Predefined.realType)
                || (controlType == Predefined.stringType)
                || (varCtx.modifier().size() != 0))
            {
                error.flag(INVALID_CONTROL_VARIABLE, varCtx);
            }
        }
        else
        {
            error.flag(UNDECLARED_IDENTIFIER, ctx.getStart().getLine(), 
                       controlName);
        }
        
        projectParser.ExpressionContext startCtx = ctx.forInitialization().assignmentStatement().rhs().expression();
        projectParser.ExpressionContext endCtx   = ctx.forControl().expression();
        
        visit(startCtx);
        visit(endCtx);
        
        if (startCtx.type != controlType) error.flag(TYPE_MISMATCH, startCtx);
        if (startCtx.type != endCtx.type) error.flag(TYPE_MISMATCH, endCtx);
        
        visit(ctx.compoundStatement());
        return null;
    }



    @Override
    public Object visitFunctionCallFactor(
                                    projectParser.FunctionCallFactorContext ctx)
    {
        projectParser.FunctionCallContext callCtx = ctx.functionCall();
        projectParser.FunctionNameContext nameCtx = callCtx.functionName();
        projectParser.ArgumentListContext listCtx = callCtx.argumentList();
        String name = callCtx.functionName().getText().toLowerCase();
        SymtabEntry functionId = symtabStack.lookup(name);
        boolean badName = false;
        
        ctx.type = Predefined.integerType;

        if (functionId == null)
        {
            error.flag(UNDECLARED_IDENTIFIER, nameCtx);
            badName = true;
        }
        else if (functionId.getKind() != FUNCTION)
        {
            error.flag(NAME_MUST_BE_FUNCTION, nameCtx);
            badName = true;
        }
        
        // Bad function name. Do a simple arguments check and then leave.
        if (badName)
        {
            for (projectParser.ArgumentContext exprCtx : listCtx.argument())
            {
                visit(exprCtx);
            }
        }
        
        // Good function name.
        else
        {
            ArrayList<SymtabEntry> parameters = functionId.getRoutineParameters();
            checkCallArguments(listCtx, parameters);
            ctx.type = functionId.getType();
        }
        
        nameCtx.entry = functionId;
        nameCtx.type  = ctx.type;

        return null;
    }
    
    /**
     * Perform semantic operations on procedure and function call arguments.
     * @param listCtx the ArgumentListContext.
     * @param parameters the arraylist of parameters to fill.
     */
    private void checkCallArguments(projectParser.ArgumentListContext listCtx,
                                    ArrayList<SymtabEntry> parameters)
    {
        int parmsCount = parameters.size();
        int argsCount = listCtx != null ? listCtx.argument().size() : 0;
        
        if (parmsCount != argsCount)
        {
            error.flag(ARGUMENT_COUNT_MISMATCH, listCtx);
            return;
        }
        
        // Check each argument against the corresponding parameter.
        for (int i = 0; i < parmsCount; i++)
        {
            projectParser.ArgumentContext argCtx = listCtx.argument().get(i);
            projectParser.ExpressionContext exprCtx = argCtx.expression();
            visit(exprCtx);
            
            SymtabEntry parmId = parameters.get(i);
            Typespec parmType = parmId.getType();
            Typespec argType  = exprCtx.type;
            
            // For a VAR parameter, the argument must be a variable
            // with the same datatype.
            if (parmId.getKind() == REFERENCE_PARAMETER)
            {
                if (expressionIsVariable(exprCtx))
                {
                    if (parmType != argType)
                    {
                        error.flag(TYPE_MISMATCH, exprCtx);
                    }
                }
                else
                {
                    error.flag(ARGUMENT_MUST_BE_VARIABLE, exprCtx);
                }
            }
            
            // For a value parameter, the argument type must be
            // assignment compatible with the parameter type.
            else if (!TypeChecker.areAssignmentCompatible(parmType, argType))
            {
                error.flag(TYPE_MISMATCH, exprCtx);
            }
        }
    }

    /**
     * Determine whether or not an expression is a variable only.
     * @param exprCtx the ExpressionContext.
     * @return true if it's an expression only, else false.
     */
    private boolean expressionIsVariable(projectParser.ExpressionContext exprCtx)
    {
        // Only a single simple expression?
        if (exprCtx.simpleExpression().size() == 1)
        {
            projectParser.SimpleExpressionContext simpleCtx =
                                              exprCtx.simpleExpression().get(0);
            // Only a single term?
            if (simpleCtx.term().size() == 1)
            {
                projectParser.TermContext termCtx = simpleCtx.term().get(0);
                
                // Only a single factor?
                if (termCtx.factor().size() == 1)
                {
                    return termCtx.factor().get(0) instanceof 
                                            projectParser.VariableFactorContext;
                }
            }
        }
        
        return false;
    }

    @Override 
    public Object visitExpression(projectParser.ExpressionContext ctx)
    {
        projectParser.SimpleExpressionContext simpleCtx1 =
                                                ctx.simpleExpression().get(0);

        // First simple expression.
        visit(simpleCtx1);
        
        Typespec simpleType1 = simpleCtx1.type;
        ctx.type = simpleType1;
        
        projectParser.RelOpContext relOpCtx = ctx.relOp();
        
        // Second simple expression?
        if (relOpCtx != null)
        {
            projectParser.SimpleExpressionContext simpleCtx2 =
                                                ctx.simpleExpression().get(1);
            visit(simpleCtx2);
            
            Typespec simpleType2 = simpleCtx2.type;
            if (!TypeChecker.areComparisonCompatible(simpleType1, simpleType2))
            {
                error.flag(INCOMPATIBLE_COMPARISON, ctx);
            }
            
            ctx.type = Predefined.booleanType;
        }
        
        return null;
    }

    @Override 
    public Object visitSimpleExpression(projectParser.SimpleExpressionContext ctx)
    {
        int count = ctx.term().size();
        projectParser.SignContext signCtx = ctx.sign();
        Boolean hasSign = signCtx != null;
        projectParser.TermContext termCtx1 = ctx.term().get(0);
        
        if (hasSign)
        {
            String sign = signCtx.getText();
            if (sign.equals("+") && sign.equals("-"))
            {
                error.flag(INVALID_SIGN, signCtx);
            }
        }
        
        // First term.
        visit(termCtx1);
        Typespec termType1 = termCtx1.type;
        
        // Loop over any subsequent terms.
        for (int i = 1; i < count; i++)
        {
            String op = ctx.addOp().get(i-1).getText().toLowerCase();
            projectParser.TermContext termCtx2 = ctx.term().get(i);
            visit(termCtx2);
            Typespec termType2 = termCtx2.type;
            
            // Both operands boolean ==> boolean result. Else type mismatch.
            if (op.equals("or"))
            {
                if (!TypeChecker.isBoolean(termType1))
                {
                    error.flag(TYPE_MUST_BE_BOOLEAN, termCtx1);
                }
                if (!TypeChecker.isBoolean(termType2))
                {
                    error.flag(TYPE_MUST_BE_BOOLEAN, termCtx2);
                }
                if (hasSign)
                {
                    error.flag(INVALID_SIGN, signCtx);
                }
                
                termType2 = Predefined.booleanType;
            }
            else if (op.equals("+"))
            {
                // Both operands integer ==> integer result
                if (TypeChecker.areBothInteger(termType1, termType2))
                {
                    termType2 = Predefined.integerType;
                }

                // Both real operands ==> real result 
                // One real and one integer operand ==> real result
                else if (TypeChecker.isAtLeastOneReal(termType1, termType2))
                {
                    termType2 = Predefined.realType;
                }
                
                // Both operands string ==> string result
                else if (TypeChecker.areBothString(termType1, termType2))
                {
                    if (hasSign) error.flag(INVALID_SIGN, signCtx);                    
                    termType2 = Predefined.stringType;
                }

                // Type mismatch.
                else
                {
                    if (!TypeChecker.isIntegerOrReal(termType1))
                    {
                        error.flag(TYPE_MUST_BE_NUMERIC, termCtx1);
                        termType2 = Predefined.integerType;
                    }
                    if (!TypeChecker.isIntegerOrReal(termType2))
                    {
                        error.flag(TYPE_MUST_BE_NUMERIC, termCtx2);
                        termType2 = Predefined.integerType;
                    }
                }
            }
            else  // -
            {
                // Both operands integer ==> integer result
                if (TypeChecker.areBothInteger(termType1, termType2))
                {
                    termType2 = Predefined.integerType;
                }

                // Both real operands ==> real result 
                // One real and one integer operand ==> real result
                else if (TypeChecker.isAtLeastOneReal(termType1, termType2))
                {
                    termType2 = Predefined.realType;
                }
                
                // Type mismatch.
                else
                {
                    if (!TypeChecker.isIntegerOrReal(termType1))
                    {
                        error.flag(TYPE_MUST_BE_NUMERIC, termCtx1);
                        termType2 = Predefined.integerType;
                    }
                    if (!TypeChecker.isIntegerOrReal(termType2))
                    {
                        error.flag(TYPE_MUST_BE_NUMERIC, termCtx2);
                        termType2 = Predefined.integerType;
                    }
                }
            }
            
            termType1 = termType2;
        }
        
        ctx.type = termType1;
        return null;
    }

    @Override 
    public Object visitTerm(projectParser.TermContext ctx)
    {
        int count = ctx.factor().size();
        projectParser.FactorContext factorCtx1 = ctx.factor().get(0);
        
        // First factor.
        visit(factorCtx1);
        Typespec factorType1 = factorCtx1.type;
        
        // Loop over any subsequent factors.
        for (int i = 1; i < count; i++)
        {
            String op = ctx.mulOp().get(i-1).getText().toLowerCase();
            projectParser.FactorContext factorCtx2 = ctx.factor().get(i);
            visit(factorCtx2);
            Typespec factorType2 = factorCtx2.type;
            
            if (op.equals("*"))
            {
                // Both operands integer  ==> integer result
                if (TypeChecker.areBothInteger(factorType1, factorType2))
                {
                    factorType2 = Predefined.integerType;
                }

                // Both real operands ==> real result 
                // One real and one integer operand ==> real result
                else if (TypeChecker.isAtLeastOneReal(factorType1, factorType2))
                {
                    factorType2 = Predefined.realType;
                }
                
                // Type mismatch.
                else
                {
                    if (!TypeChecker.isIntegerOrReal(factorType1))
                    {
                        error.flag(TYPE_MUST_BE_NUMERIC, factorCtx1);
                        factorType2 = Predefined.integerType;
                    }
                    if (!TypeChecker.isIntegerOrReal(factorType2))
                    {
                        error.flag(TYPE_MUST_BE_NUMERIC, factorCtx2);
                        factorType2 = Predefined.integerType;
                    }
                }
            }
            else if (op.equals("/"))
            {
                // All integer and real operand combinations ==> real result
                if (   TypeChecker.areBothInteger(factorType1, factorType2)
                    || TypeChecker.isAtLeastOneReal(factorType1, factorType2))
                {
                    factorType2 = Predefined.realType;
                }
                
                // Type mismatch.
                else 
                {
                    if (!TypeChecker.isIntegerOrReal(factorType1))
                    {
                        error.flag(TYPE_MUST_BE_NUMERIC, factorCtx1);
                        factorType2 = Predefined.integerType;
                    }
                    if (!TypeChecker.isIntegerOrReal(factorType2))
                    {
                        error.flag(TYPE_MUST_BE_NUMERIC, factorCtx2);
                        factorType2 = Predefined.integerType;
                    }
                }
            }
            else if (op.equals("div") || op.equals("mod"))
            {
                // Both operands integer ==> integer result. Else type mismatch.
                if (!TypeChecker.isInteger(factorType1))
                {
                    error.flag(TYPE_MUST_BE_INTEGER, factorCtx1);
                    factorType2 = Predefined.integerType;
                }
                if (!TypeChecker.isInteger(factorType2))
                {
                    error.flag(TYPE_MUST_BE_INTEGER, factorCtx2);
                    factorType2 = Predefined.integerType;
                }
            }
            else if (op.equals("and"))
            {
                // Both operands boolean ==> boolean result. Else type mismatch.
                if (!TypeChecker.isBoolean(factorType1))
                {
                    error.flag(TYPE_MUST_BE_BOOLEAN, factorCtx1);
                    factorType2 = Predefined.booleanType;
                }
                if (!TypeChecker.isBoolean(factorType2))
                {
                    error.flag(TYPE_MUST_BE_BOOLEAN, factorCtx2);
                    factorType2 = Predefined.booleanType;
                }
            }
            
            factorType1 = factorType2;
        }

        ctx.type = factorType1;
        return null;
    }

    @Override 
    public Object visitVariableFactor(projectParser.VariableFactorContext ctx)
    {
        projectParser.VariableContext varCtx = ctx.variable();
        visit(varCtx);        
        ctx.type  = varCtx.type;
        
        return null;
    }


    @Override
    public Object visitVariable(projectParser.VariableContext ctx)
    {
        String variableName = ctx.IDENTIFIER().getText().toLowerCase();
        SymtabEntry variableId = symtabStack.lookup(variableName);
        
        if (variableId != null)
        {
            int lineNumber = ctx.getStart().getLine();
            ctx.type = variableId.getType();
            ctx.entry = variableId;
            variableId.appendLineNumber(lineNumber);
            
            Kind kind = variableId.getKind();
            switch (kind)
            {
                case TYPE:
                case PROGRAM:
                    error.flag(INVALID_VARIABLE, ctx);
                    break;
                    
                default: break;
            }
        }
        else
        {
            error.flag(UNDECLARED_IDENTIFIER, ctx);
            ctx.type = Predefined.integerType;
        }

        return null;
    }

    /**
     * Determine the datatype of a variable that can have modifiers.
     * @param varCtx the VariableContext.
     * @param varType the variable's datatype without the modifiers.
     * @return the datatype with any modifiers.
     */
    private Typespec variableDatatype(
                        projectParser.VariableContext varCtx, Typespec varType)
    {
        Typespec type = varType;
        
        // Loop over the modifiers.
        for (projectParser.ModifierContext modCtx : varCtx.modifier())
        {
            // Subscripts.
            if (modCtx.index() != null)
            {
                    projectParser.IndexContext indexCtx = modCtx.index();

                    if (type.getForm() == ARRAY)
                    {
                        Typespec indexType = type.getArrayIndexType();
                        projectParser.ExpressionContext exprCtx =
                                                        indexCtx.expression();
                        visit(exprCtx);
                        
                        if (indexType.baseType() != exprCtx.type.baseType())
                        {
                            error.flag(TYPE_MISMATCH, exprCtx);
                        }
                        
                        // Datatype of the next dimension.
                        type = type.getArrayElementType();
                    }
                    else
                    {
                        error.flag(TOO_MANY_SUBSCRIPTS, indexCtx);
                    }

            }
                
                // Not a record variable.
                else
                {
                    error.flag(INVALID_FIELD, modCtx);
                }
            }

        
        return type;
    }
    
    @Override 
    public Object visitNumberFactor(projectParser.NumberFactorContext ctx)
    {
        projectParser.NumberContext          numberCtx   = ctx.number();
        projectParser.UnsignedNumberContext  unsignedCtx = numberCtx.unsignedNumber();
        projectParser.IntegerConstantContext integerCtx  = unsignedCtx.integerConstant();

        ctx.type = (integerCtx != null) ? Predefined.integerType
                                        : Predefined.realType;
        
        return null;
    }

    @Override 
    public Object visitCharacterFactor(
                                    projectParser.CharacterFactorContext ctx)
    {
        ctx.type = Predefined.charType;
        return null;
    }

    @Override 
    public Object visitStringFactor(projectParser.StringFactorContext ctx)
    {
        ctx.type = Predefined.stringType;
        return null;
    }

    @Override 
    public Object visitNotFactor(projectParser.NotFactorContext ctx)
    {
        projectParser.FactorContext factorCtx = ctx.factor();
        visit(factorCtx);
        
        if (factorCtx.type != Predefined.booleanType)
        {
            error.flag(TYPE_MUST_BE_BOOLEAN, factorCtx);
        }
        
        ctx.type = Predefined.booleanType;
        return null;
    }

    @Override 
    public Object visitParenthesizedFactor(
                                    projectParser.ParenthesizedFactorContext ctx)
    {
        projectParser.ExpressionContext exprCtx = ctx.expression();
        visit(exprCtx);
        ctx.type = exprCtx.type;

        return null;
    }
}
