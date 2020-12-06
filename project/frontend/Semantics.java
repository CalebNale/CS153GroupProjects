package frontend;

import java.util.ArrayList;
import java.util.HashSet;

import antlr4.*;

import intermediate.symtab.*;
import intermediate.symtab.SymtabEntry.Kind;
import intermediate.type.*;
import intermediate.type.Typespec.*;
import intermediate.util.*;

import static frontend.SemanticErrorHandler.Code.*;
import static intermediate.symtab.SymtabEntry.Kind.*;
import static intermediate.symtab.SymtabEntry.Routine.*;
import static intermediate.type.Typespec.Form.*;
import static intermediate.util.BackendMode.*;

/**
 * Semantic operations.
 * Perform type checking and create symbol tables.
 */
public class Semantics extends SubCBaseVisitor<Object>
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
        else if (type == Predefined.charType)    return Character.valueOf('#');
        else /* string */                        return String.valueOf("#");
    }

    @Override 
    public Object visitProgram(SubCParser.ProgramContext ctx) 
    { 
    	System.out.println("visited program");
        visit(ctx.functionDefinitions());
        visit(ctx.mainProgram().compoundStatement());
        // Print the cross-reference table.
//        CrossReferencer crossReferencer = new CrossReferencer();
//        crossReferencer.print(symtabStack);

        return null;
    }
    
//    @Override 
////    TODO make this into main function
//    public Object visitProgramHeader(SubCParser.ProgramHeaderContext ctx) 
//    { 
//        SubCParser.ProgramIdentifierContext idCtx = ctx.programIdentifier();
//        String programName = idCtx.IDENTIFIER().getText();  // don't shift case
//        
//        programId = symtabStack.enterLocal(programName, PROGRAM);
//        programId.setRoutineSymtab(symtabStack.push());
//        
//        symtabStack.setProgramId(programId);
//        symtabStack.getLocalSymtab().setOwner(programId);
//        
//        idCtx.entry = programId;
//        return null;
//    }
    
    @Override 
    public Object visitDeclarationStatement(
                                SubCParser.DeclarationStatementContext ctx) 
    { 
    	//TODO
    	System.out.println("visited declaration statement");
            int lineNumber = ctx.getStart().getLine();      
            SubCParser.VariableContext var = ctx.variable();
            String variableName = var.variableIdentifier().IDENTIFIER().getText().toLowerCase();
            String s = ctx.TYPE.getText();
            if(var.modifier().size() == 0) {
            	var.type = getType(s);
            }
            else {
//            	Form.ARRAY;
            }
            
            SymtabEntry variableId = symtabStack.lookupLocal(variableName);
            
            if (variableId == null)
            {
                variableId = symtabStack.enterLocal(variableName, VARIABLE);
                variableId.setType(var.type);
                
                // Assign slot numbers to local variables.
                Symtab symtab = variableId.getSymtab();
                if (symtab.getNestingLevel() > 1)
                {
                    variableId.setSlotNumber(symtab.nextSlotNumber());
                }
                
                var.variableIdentifier().entry = variableId;
            }
            else
            {
                error.flag(REDECLARED_IDENTIFIER, ctx);
            }
            
            variableId.appendLineNumber(lineNumber);   
            
        
        return null;
    }
  

    @Override 
    public Object visitConstant(SubCParser.ConstantContext ctx) 
    {
    	//TODO
    	System.out.println("visited constant");
        if (ctx.IDENTIFIER() != null)
        {
            String constantName = ctx.IDENTIFIER().getText().toLowerCase();
            SymtabEntry constantId = symtabStack.lookup(constantName);
            
            if (constantId != null)
            {
                Kind kind = constantId.getKind();
                if ((kind != CONSTANT))
                {
                    error.flag(INVALID_CONSTANT, ctx);
                }
                
                ctx.type  = constantId.getType();
                ctx.value = constantId.getValue();
                
                constantId.appendLineNumber(ctx.getStart().getLine());
            }
            else
            {
                error.flag(UNDECLARED_IDENTIFIER, ctx);
                
                ctx.type = Predefined.integerType;
                ctx.value = 0;
            }
        }
        else if (ctx.characterConstant() != null)
        {
            ctx.type  = Predefined.charType;
            ctx.value = (char) ctx.getText().charAt(1);
        }
        else if (ctx.stringConstant() != null)
        {
            String pascalString = ctx.stringConstant().STR().getText();
            String unquoted = pascalString.substring(1, pascalString.length()-1);
            ctx.type  = Predefined.stringType;            
            //TODO change the value of string to match C instead of Pascal (quotes)
            ctx.value = unquoted.replace("''", "'").replace("\"", "\\\"");
        }
        else  // number
        {
            if (ctx.unsignedNumber().integerConstant() != null)
            {
                ctx.type  = Predefined.integerType;
                ctx.value = Integer.parseInt(ctx.getText());
            }
            else
            {
                ctx.type  = Predefined.realType;
                ctx.value = Float.parseFloat(ctx.getText());
            }
        }
        
        return ctx.value;
    }

 
//    @Override 
//    public Object visitArrayTypespec(SubCParser.ArrayTypespecContext ctx) 
//    { 
//        Typespec arrayType = new Typespec(ARRAY);
//        SubCParser.ArrayTypeContext arrayCtx = ctx.arrayType();
//        SubCParser.ArrayDimensionListContext listCtx = 
//                                                arrayCtx.arrayDimensionList();
//        
//        ctx.type = arrayType;
//        
//        // Loop over the array dimensions.
//        int count = listCtx.simpleType().size();
//        for (int i = 0; i < count; i++)
//        {
//            SubCParser.SimpleTypeContext simpleCtx = 
//                                                    listCtx.simpleType().get(i);
//            visit(simpleCtx);
//            arrayType.setArrayIndexType(simpleCtx.type);
//            arrayType.setArrayElementCount(typeCount(simpleCtx.type));
//            
//            if (i < count-1) 
//            {
//                Typespec elmtType = new Typespec(ARRAY);
//                arrayType.setArrayElementType(elmtType);
//                arrayType = elmtType;
//            }
//        }
//        
//        visit(arrayCtx.typeSpecification());
//        Typespec elmtType = arrayCtx.typeSpecification().type;
//        arrayType.setArrayElementType(elmtType);
//        
//        return null;
//    }

    
    @Override 
    @SuppressWarnings("unchecked")
    public Object visitFunctionDefinition(
                                    SubCParser.FunctionDefinitionContext ctx) 
    {
    	System.out.println("visited Function Definition");
        Typespec returnType = getType(ctx.TYPE.getText());
        SubCParser.FunctionNameContext idCtx = ctx.functionName();
        SubCParser.ParameterListContext parameters = ctx.parameterList();
        
        
        String routineName = ctx.functionName().IDENTIFIER().getText();

        SymtabEntry routineId = symtabStack.lookupLocal(routineName);
        
        if (routineId != null)
        {
            error.flag(REDECLARED_IDENTIFIER, 
                       ctx.getStart().getLine(), routineName);
            return null;
        }
        
        
        routineId = symtabStack.enterLocal(routineName, FUNCTION);
        routineId.setRoutineCode(DECLARED);
        idCtx.entry = routineId;

////        // Append to the parent routine's list of subroutines.
//        SymtabEntry parentId = symtabStack.getLocalSymtab().getOwner();
//        parentId.appendSubroutine(routineId);

        routineId.setRoutineSymtab(symtabStack.push());
        idCtx.entry = routineId;

        Symtab symtab = symtabStack.getLocalSymtab();
        symtab.setOwner(routineId);
  
        if (parameters != null)
        {
            ArrayList<SymtabEntry> parameterIds = (ArrayList<SymtabEntry>) 
                               							visit(parameters);
            routineId.setRoutineParameters(parameterIds);
            
            for (SymtabEntry parmId : parameterIds)
            {
                parmId.setSlotNumber(symtab.nextSlotNumber());
            }
        }
        
            
        if (returnType.getForm() != SCALAR)
        {
            error.flag(INVALID_RETURN_TYPE, ctx);
            returnType = Predefined.integerType;
        }
        
        routineId.setType(returnType);
        idCtx.type = returnType;


        SymtabEntry assocVarId = 
                            symtabStack.enterLocal(routineName, VARIABLE);
        assocVarId.setSlotNumber(symtab.nextSlotNumber());
        assocVarId.setType(returnType);

        visit(ctx.compoundStatement());
        routineId.setExecutable(ctx.compoundStatement());

        symtabStack.pop();
        return null;
    }

    @Override 
    @SuppressWarnings("unchecked")
    public Object visitParameterList(
                            SubCParser.ParameterListContext ctx)
    {
    	System.out.println("visited Parameter List");
        ArrayList<SymtabEntry> parameterList = new ArrayList<>();
        
        // Loop over the parameter declarations.
        for (SubCParser.ParameterContext dclCtx : 
                                                    ctx.parameter())
        {
            ArrayList<SymtabEntry> parameterSublist = 
                                        (ArrayList<SymtabEntry>) visit(dclCtx);
            parameterList.addAll(parameterSublist);
        }
        
        return parameterList;
    }

    @Override 
    public Object visitParameter(
                                SubCParser.ParameterContext ctx) 
    {
    	System.out.println("visited Parameter");
        Kind kind = VALUE_PARAMETER; 
//        SubCParser.TypeIdentifierContext typeCtx = ctx.typeIdentifier();
//        
//        visit(typeCtx);
        Typespec parmType = getType(ctx.TYPE.getText());
        
        ArrayList<SymtabEntry> parameterSublist = new ArrayList<>();
        
        
        SubCParser.ParameterIdentifierContext parmIdCtx = 
                                            	ctx.parameterIdentifier();

        int lineNumber = parmIdCtx.getStart().getLine();   
        String parmName = parmIdCtx.IDENTIFIER().getText().toLowerCase();
        
        SymtabEntry parmId = symtabStack.lookupLocal(parmName);
        
        if (parmId == null)
        {
            parmId = symtabStack.enterLocal(parmName, kind);
            parmId.setType(parmType);
        }
        else
        {
            error.flag(REDECLARED_IDENTIFIER, ctx);
        }
        
        parmIdCtx.entry = parmId;
        parmIdCtx.type  = parmType;
            
        parameterSublist.add(parmId);
        parmId.appendLineNumber(lineNumber);    
    
        return parameterSublist;
    }
    
    @Override 
    public Object visitAssignmentStatement(
                                    SubCParser.AssignmentStatementContext ctx) 
    {
    	//TODO
    	System.out.println("visited assignment statement");
        SubCParser.LhsContext lhsCtx = ctx.lhs();
        SubCParser.RhsContext rhsCtx = ctx.rhs();
        
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
    public Object visitLhs(SubCParser.LhsContext ctx) 
    {
    	//TODO
    	System.out.println("visited LHS");
        SubCParser.VariableContext varCtx = ctx.variable();
        visit(varCtx);
        ctx.type = varCtx.type;
        
        return null;
    }

    @Override 
    public Object visitIfStatement(SubCParser.IfStatementContext ctx) 
    {
        SubCParser.ExpressionContext     exprCtx  = ctx.expression();
        SubCParser.TrueStatementContext  trueCtx  = ctx.trueStatement();
        SubCParser.FalseStatementContext falseCtx = ctx.falseStatement();
        
        visit(exprCtx);        
        
        visit(trueCtx);
        if (falseCtx != null) visit(falseCtx);
        
        return null;
    }

//    @Override 
//    public Object visitCaseStatement(SubCParser.CaseStatementContext ctx) 
//    {
//        SubCParser.ExpressionContext exprCtx = ctx.expression();
//        visit(exprCtx);
//        Typespec exprType = exprCtx.type;
//        Form exprTypeForm = exprType.getForm();
//        
//        if (   (   (exprTypeForm != SCALAR) 
//                && (exprTypeForm != ENUMERATION) 
//                && (exprTypeForm != SUBRANGE))
//            || (exprType == Predefined.realType)
//            || (exprType == Predefined.stringType))
//        {
//            error.flag(TYPE_MISMATCH, exprCtx);
//            exprType = Predefined.integerType;
//        }
//        
//        HashSet<Integer> constants = new HashSet<>();
//        SubCParser.CaseBranchListContext branchListCtx = ctx.caseBranchList();
//        
//        // Loop over the CASE branches.
//        for (SubCParser.CaseBranchContext branchCtx : 
//                                                    branchListCtx.caseBranch())
//        {
//            SubCParser.CaseConstantListContext constListCtx = 
//                                                    branchCtx.caseConstantList();
//            SubCParser.StatementContext stmtCtx = branchCtx.statement();
//            
//            if (constListCtx != null)
//            {
//                // Loop over the CASE constants in each branch.
//                for (SubCParser.CaseConstantContext caseConstCtx : 
//                                                    constListCtx.caseConstant())
//                {
//                    SubCParser.ConstantContext constCtx = 
//                                                        caseConstCtx.constant();
//                    Object constValue = visit(constCtx);
//                    
//                    caseConstCtx.type  = constCtx.type;
//                    caseConstCtx.value = 0;
//                    
//                    if (constCtx.type != exprType)
//                    {
//                        error.flag(TYPE_MISMATCH, constCtx);
//                    }
//                    else if (   (constCtx.type == Predefined.integerType)
//                             || (constCtx.type.getForm() == ENUMERATION))
//                    {
//                        caseConstCtx.value = (Integer) constValue;
//                    }
//                    else if (constCtx.type == Predefined.charType)
//                    {
//                        caseConstCtx.value = (Character) constValue;
//                    }
//                    
//                    if (constants.contains(caseConstCtx.value))
//                    {
//                        error.flag(DUPLICATE_CASE_CONSTANT, constCtx);
//                    }
//                    else
//                    {
//                        constants.add(caseConstCtx.value);
//                    }
//                }
//            }
//            
//            if (stmtCtx != null) visit(stmtCtx);
//        }
//        
//        return null;
//    }


    @Override 
    public Object visitWhileStatement(SubCParser.WhileStatementContext ctx) 
    {
        SubCParser.ExpressionContext exprCtx = ctx.expression();
        visit(exprCtx);
        Typespec exprType = exprCtx.type;
        
        if (!TypeChecker.isBoolean(exprType))
        {
            error.flag(TYPE_MUST_BE_BOOLEAN, exprCtx);
        }
        
        visit(ctx.statement());
        return null;
    }

//    @Override 
//    public Object visitForStatement(SubCParser.ForStatementContext ctx) 
//    {
//        SubCParser.VariableContext varCtx = ctx.variable();
//        visit(varCtx);
//        
//        String controlName = varCtx.variableIdentifier().getText().toLowerCase();
//        Typespec controlType = Predefined.integerType;
//        
//        if (varCtx.entry != null)
//        {
//            controlType = varCtx.type;
//            
//            if (   (controlType.getForm() != SCALAR )
//                || (controlType == Predefined.realType)
//                || (controlType == Predefined.stringType)
//                || (varCtx.modifier().size() != 0))
//            {
//                error.flag(INVALID_CONTROL_VARIABLE, varCtx);
//            }
//        }
//        else
//        {
//            error.flag(UNDECLARED_IDENTIFIER, ctx.getStart().getLine(), 
//                       controlName);
//        }
//        
//        SubCParser.ExpressionContext startCtx = ctx.expression().get(0);
//        SubCParser.ExpressionContext endCtx   = ctx.expression().get(1);
//        
//        visit(startCtx);
//        visit(endCtx);
//        
//        if (startCtx.type != controlType) error.flag(TYPE_MISMATCH, startCtx);
//        if (startCtx.type != endCtx.type) error.flag(TYPE_MISMATCH, endCtx);
//        
//        visit(ctx.statement());
//        return null;
//    }

//    @Override 
//    public Object visitProcedureCallStatement(
//                                SubCParser.ProcedureCallStatementContext ctx) 
//    {
//        SubCParser.ProcedureNameContext nameCtx = ctx.procedureName();
//        SubCParser.ArgumentListContext listCtx = ctx.argumentList();
//        String name = ctx.procedureName().getText().toLowerCase();
//        SymtabEntry procedureId = symtabStack.lookup(name);
//        boolean badName = false;
//        
//        if (procedureId == null)
//        {
//            error.flag(UNDECLARED_IDENTIFIER, nameCtx);
//            badName = true;
//        }
//        else if (procedureId.getKind() != PROCEDURE)
//        {
//            error.flag(NAME_MUST_BE_PROCEDURE, nameCtx);
//            badName = true;
//        }
//        
//        // Bad procedure name. Do a simple arguments check and then leave.
//        if (badName)
//        {
//            for (SubCParser.ArgumentContext exprCtx : listCtx.argument())
//            {
//                visit(exprCtx);
//            }
//        }
//        
//        // Good procedure name.
//        else
//        {
//            ArrayList<SymtabEntry> parms = procedureId.getRoutineParameters();
//            checkCallArguments(listCtx, parms);
//        }
//        
//        nameCtx.entry = procedureId;
//        return null;
//    }

    @Override 
    public Object visitFunctionCallFactor(
                                    SubCParser.FunctionCallFactorContext ctx) 
    {
        SubCParser.FunctionCallContext callCtx = ctx.functionCall();
        SubCParser.FunctionNameContext nameCtx = callCtx.functionName();
        SubCParser.ArgumentListContext listCtx = callCtx.argumentList();
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
            for (SubCParser.ArgumentContext exprCtx : listCtx.argument())
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
//        nameCtx.type  = ctx.type;

        return null;
    }
    
    /**
     * Perform semantic operations on procedure and function call arguments.
     * @param listCtx the ArgumentListContext.
     * @param parameters the arraylist of parameters to fill.
     */
    private void checkCallArguments(SubCParser.ArgumentListContext listCtx,
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
            SubCParser.ArgumentContext argCtx = listCtx.argument().get(i);
            SubCParser.ExpressionContext exprCtx = argCtx.expression();
            visit(exprCtx);
            
            SymtabEntry parmId = parameters.get(i);
            Typespec parmType = parmId.getType();
            Typespec argType  = exprCtx.type;
            
//            // For a VAR parameter, the argument must be a variable
//            // with the same datatype.
//            if (parmId.getKind() == REFERENCE_PARAMETER)
//            {
//                if (expressionIsVariable(exprCtx))
//                {
//                    if (parmType != argType)
//                    {
//                        error.flag(TYPE_MISMATCH, exprCtx);
//                    }
//                }
//                else
//                {
//                    error.flag(ARGUMENT_MUST_BE_VARIABLE, exprCtx);
//                }
//            }
            
            // For a value parameter, the argument type must be
            // assignment compatible with the parameter type.
            if (!TypeChecker.areAssignmentCompatible(parmType, argType))
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
    private boolean expressionIsVariable(SubCParser.ExpressionContext exprCtx)
    {
    	//TODO
    	System.out.println("visited expression is variable");
        // Only a single simple expression?
        if (exprCtx.simpleExpression().size() == 1)
        {
            SubCParser.SimpleExpressionContext simpleCtx = 
                                              exprCtx.simpleExpression().get(0);
            // Only a single term?
            if (simpleCtx.term().size() == 1)
            {
                SubCParser.TermContext termCtx = simpleCtx.term().get(0);
                
                // Only a single factor?
                if (termCtx.factor().size() == 1)
                {
                    return termCtx.factor().get(0) instanceof 
                                            SubCParser.VariableFactorContext;
                }
            }
        }
        
        return false;
    }

    @Override 
    public Object visitExpression(SubCParser.ExpressionContext ctx) 
    {
    	//TODO
    	System.out.println("visited expression");
        SubCParser.SimpleExpressionContext simpleCtx1 =
                                                ctx.simpleExpression().get(0);

        // First simple expression.
        visit(simpleCtx1);
        
        Typespec simpleType1 = simpleCtx1.type;
        ctx.type = simpleType1;
        
        
        SubCParser.RelOpContext relOpCtx = ctx.relOp();
        
        // Second simple expression?
        if (relOpCtx != null)
        {
            SubCParser.SimpleExpressionContext simpleCtx2 = 
                                                ctx.simpleExpression().get(1);
            visit(simpleCtx2);
            
            Typespec simpleType2 = simpleCtx2.type;
            if (!TypeChecker.areComparisonCompatible(simpleType1, simpleType2))
            {
                error.flag(INCOMPATIBLE_COMPARISON, ctx);
            }
            
//            ctx.type = Predefined.booleanType;
        }
        
        return null;
    }

    @Override 
    public Object visitSimpleExpression(SubCParser.SimpleExpressionContext ctx) 
    {
    	//TODO
    	System.out.println("visited simple expression");
        int count = ctx.term().size();
        SubCParser.SignContext signCtx = ctx.sign();
        Boolean hasSign = signCtx != null;
        SubCParser.TermContext termCtx1 = ctx.term().get(0);
        
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
            SubCParser.TermContext termCtx2 = ctx.term().get(i);
            visit(termCtx2);
            Typespec termType2 = termCtx2.type;
            
            // Both operands boolean ==> boolean result. Else type mismatch.
            if (op.equals("or"))
            {
//                if (!TypeChecker.isBoolean(termType1)) 
//                {
//                    error.flag(TYPE_MUST_BE_BOOLEAN, termCtx1);
//                }
//                if (!TypeChecker.isBoolean(termType2)) 
//                {
//                    error.flag(TYPE_MUST_BE_BOOLEAN, termCtx2);
//                }
//                if (hasSign)
//                {
//                    error.flag(INVALID_SIGN, signCtx);
//                }
//                
//                termType2 = Predefined.booleanType;
            }
            else if (op.equals("+"))
            {
                // Both operands integer ==> integer result
//                if (TypeChecker.areBothInteger(termType1, termType2)) 
//                {
//                    termType2 = Predefined.integerType;
//                }
//
//                // Both real operands ==> real result 
//                // One real and one integer operand ==> real result
//                else if (TypeChecker.isAtLeastOneReal(termType1, termType2)) 
//                {
//                    termType2 = Predefined.realType;
//                }
//                
//                // Both operands string ==> string result
//                else if (TypeChecker.areBothString(termType1, termType2))
//                {
//                    if (hasSign) error.flag(INVALID_SIGN, signCtx);                    
//                    termType2 = Predefined.stringType;
//                }
//
//                // Type mismatch.
//                else
//                {
//                    if (!TypeChecker.isIntegerOrReal(termType1))
//                    {
//                        error.flag(TYPE_MUST_BE_NUMERIC, termCtx1);
//                        termType2 = Predefined.integerType;
//                    }
//                    if (!TypeChecker.isIntegerOrReal(termType2))
//                    {
//                        error.flag(TYPE_MUST_BE_NUMERIC, termCtx2);
//                        termType2 = Predefined.integerType;
//                    }
//                }
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
//                else if (TypeChecker.isAtLeastOneReal(termType1, termType2)) 
//                {
//                    termType2 = Predefined.realType;
//                }
//                
//                // Type mismatch.
//                else
//                {
//                    if (!TypeChecker.isIntegerOrReal(termType1))
//                    {
//                        error.flag(TYPE_MUST_BE_NUMERIC, termCtx1);
//                        termType2 = Predefined.integerType;
//                    }
//                    if (!TypeChecker.isIntegerOrReal(termType2))
//                    {
//                        error.flag(TYPE_MUST_BE_NUMERIC, termCtx2);
//                        termType2 = Predefined.integerType;
//                    }
//                }
            }
            
            termType1 = termType2;
        }
        
        ctx.type = termType1;
        return null;
    }

    @Override 
    public Object visitTerm(SubCParser.TermContext ctx) 
    {
    	//TODO
    	System.out.println("visited term");
        int count = ctx.factor().size();
        SubCParser.FactorContext factorCtx1 = ctx.factor().get(0);
        
        // First factor.
        visit(factorCtx1);
        Typespec factorType1 = factorCtx1.type; 
        
        // Loop over any subsequent factors.
        for (int i = 1; i < count; i++)
        {
            String op = ctx.mulOp().get(i-1).getText().toLowerCase();
            SubCParser.FactorContext factorCtx2 = ctx.factor().get(i);
            visit(factorCtx2);
            Typespec factorType2 = factorCtx2.type;
            
            if(op.equals("*"))
            {
                // Both operands integer  ==> integer result
                if (TypeChecker.areBothInteger(factorType1, factorType2)) 
                {
                    factorType2 = Predefined.integerType;
                }

//                 Both real operands ==> real result 
//                 One real and one integer operand ==> real result
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
//                // All integer and real operand combinations ==> real result
                if (   TypeChecker.areBothInteger(factorType1, factorType2)
                    || TypeChecker.isAtLeastOneReal(factorType1, factorType2))
                {
                    factorType2 = Predefined.realType;
                }
//                
//                // Type mismatch.
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
//            else if (op.equals("and"))
//            {
////                // Both operands boolean ==> boolean result. Else type mismatch.
//                if (!TypeChecker.isBoolean(factorType1))
//                {
//                    error.flag(TYPE_MUST_BE_BOOLEAN, factorCtx1);
//                    factorType2 = Predefined.booleanType;
//                }
//                if (!TypeChecker.isBoolean(factorType2))
//                {
//                    error.flag(TYPE_MUST_BE_BOOLEAN, factorCtx2);
//                    factorType2 = Predefined.booleanType;
//                }
//            }
            
            factorType1 = factorType2;
        }

        ctx.type = factorType1;
        return null;
    }

    @Override 
    public Object visitVariableFactor(SubCParser.VariableFactorContext ctx) 
    {
    	//TODO
    	System.out.println("visited variable factor");
        SubCParser.VariableContext varCtx = ctx.variable();
        visit(varCtx);        
        ctx.type  = varCtx.type;
        
        return null;
    }

    @Override 
    public Object visitVariable(SubCParser.VariableContext ctx) 
    {
    	//TODO
    	System.out.println("visited variable");
        SubCParser.VariableIdentifierContext varIdCtx = 
                                                    ctx.variableIdentifier();
        
        
        visit(varIdCtx);
        ctx.entry = varIdCtx.entry;
//        ctx.type  = variableDatatype(ctx, varIdCtx.type);
        ctx.type = varIdCtx.type;

        return null;
    }

    @Override 
    public Object visitVariableIdentifier(
                                    SubCParser.VariableIdentifierContext ctx) 
    {
    	//TODO
    	System.out.println("visited Variable Identifier");
        String variableName = ctx.IDENTIFIER().getText().toLowerCase();
        SymtabEntry variableId = symtabStack.lookup(variableName);
        
        if (variableId != null)
        {
            int lineNumber = ctx.getStart().getLine();
            System.out.println();
            ctx.type = variableId.getType();
            ctx.entry = variableId;
            variableId.appendLineNumber(lineNumber);
            
            Kind kind = variableId.getKind();
            switch (kind)
            {
                case TYPE:
                case PROGRAM_PARAMETER:
                case FUNCTION:
                case UNDEFINED:
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
//    private Typespec variableDatatype(
//                        SubCParser.VariableContext varCtx, Typespec varType)
//    {
//        Typespec type = varType;
//        
//        // Loop over the modifiers.
//        for (SubCParser.ModifierContext modCtx : varCtx.modifier())
//        {
//            if (modCtx.index() != null)
//            {
//            	
//                if (type.getForm() == ARRAY)
//                {
//                    Typespec indexType = type.getArrayIndexType();
//                    SubCParser.ExpressionContext exprCtx = 
//                                                    indexCtx.expression();
//                    visit(exprCtx);
//                    
//                    if (indexType.baseType() != exprCtx.type.baseType())
//                    {
//                        error.flag(TYPE_MISMATCH, exprCtx);
//                    }
//                    
//                    // Datatype of the next dimension.
//                    type = type.getArrayElementType();
//                }
//                else
//                {
//                    error.flag(TOO_MANY_SUBSCRIPTS, indexCtx);
//                }
//            }
//            else  // Record field.
//            {
//                if (type.getForm() == RECORD)
//                {
//                    Symtab symtab = type.getRecordSymtab();
//                    SubCParser.FieldContext fieldCtx = modCtx.field();
//                    String fieldName = 
//                                fieldCtx.IDENTIFIER().getText().toLowerCase();
//                    SymtabEntry fieldId = symtab.lookup(fieldName);
//
//                    // Field of the record type?
//                    if (fieldId != null) 
//                    {
//                        type = fieldId.getType();
//                        fieldCtx.entry = fieldId;
//                        fieldCtx.type = type;
//                        fieldId.appendLineNumber(modCtx.getStart().getLine());
//                    }
//                    else 
//                    {
//                        error.flag(INVALID_FIELD, modCtx);
//                    }
//                }
//                
//                // Not a record variable.
//                else 
//                {
//                    error.flag(INVALID_FIELD, modCtx);
//                }
//            }
//        }
//        
//        return type;
//    }
    
    @Override 
    public Object visitNumberFactor(SubCParser.NumberFactorContext ctx) 
    {
    	//TODO
    	System.out.println("visited number");
        SubCParser.NumberContext          numberCtx   = ctx.number();
        SubCParser.UnsignedNumberContext  unsignedCtx = numberCtx.unsignedNumber();
        SubCParser.IntegerConstantContext integerCtx  = unsignedCtx.integerConstant();

        ctx.type = (integerCtx != null) ? Predefined.integerType
                                        : Predefined.realType;
        
        return null;
    }

    @Override 
    public Object visitCharacterFactor(
                                    SubCParser.CharacterFactorContext ctx) 
    {
    	//TODO
    	System.out.println("visited character");
        ctx.type = Predefined.charType;
        return null;
    }

    @Override 
    public Object visitStringFactor(SubCParser.StringFactorContext ctx) 
    {
    	//TODO
    	System.out.println("visited String");
        ctx.type = Predefined.stringType;
        return null;
    }

//    @Override 
//    public Object visitNotFactor(SubCParser.NotFactorContext ctx) 
//    {
//        SubCParser.FactorContext factorCtx = ctx.factor();
//        visit(factorCtx);
//        
//        if (factorCtx.type != Predefined.booleanType)
//        {
//            error.flag(TYPE_MUST_BE_BOOLEAN, factorCtx);
//        }
//        
//        ctx.type = Predefined.booleanType;
//        return null;
//    }

    @Override 
    public Object visitParenthesizedFactor(
                                    SubCParser.ParenthesizedFactorContext ctx) 
    {
        SubCParser.ExpressionContext exprCtx = ctx.expression();
        visit(exprCtx);
        ctx.type = exprCtx.type;

        return null;
    }
    
    private Typespec getType(String type) 
    {
        switch(type) 
        {
        	case "int":
        		return Predefined.integerType;
        		
        	case "char":
        		return Predefined.charType;
        		
        	case "string":
        		return Predefined.stringType;
        		
        	case "double":
        		return Predefined.realType;
        		
        	case "void":
        		return Predefined.voidType;
        	       		
    		default:
				return Predefined.undefinedType;
        }
    
    }
}
