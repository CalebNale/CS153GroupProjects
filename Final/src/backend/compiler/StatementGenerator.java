package backend.compiler;

import antlr4.projectParser;
import intermediate.symtab.Predefined;
import intermediate.symtab.SymtabEntry;
import intermediate.type.TypeChecker;
import intermediate.type.Typespec;
import intermediate.type.Typespec.Form;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static backend.compiler.Instruction.*;
import static intermediate.type.Typespec.Form.ENUMERATION;
import static intermediate.type.Typespec.Form.SCALAR;

/**
 * <h1>StatementGenerator</h1>
 *
 * <p>Emit code for executable statements.</p>
 *
 * <p>Copyright (c) 2020 by Ronald Mak</p>
 * <p>For instructional purposes only.  No warranties.</p>
 */
public class StatementGenerator extends CodeGenerator
{
    /**
     * Constructor.
     * @param parent the parent generator.
     * @param compiler the compiler to use.
     */
    public StatementGenerator(CodeGenerator parent, Compiler compiler)
    {
        super(parent, compiler);
    }

    /**
     * Emit code for an assignment statement.
     * @param ctx the AssignmentStatementContext.
     */
    public void emitAssignment(projectParser.AssignmentStatementContext ctx)
    {
        projectParser.VariableContext   varCtx  = ctx.lhs().variable();
        projectParser.ExpressionContext exprCtx = ctx.rhs().expression();
        SymtabEntry varId = varCtx.entry;
        Typespec varType  = varCtx.type;
        Typespec exprType = exprCtx.type;

        // The last modifier, if any, is the variable's last subscript or field.
        int modifierCount = varCtx.modifier().size();
        projectParser.ModifierContext lastModCtx = modifierCount == 0
                            ? null : varCtx.modifier().get(modifierCount - 1);

        // The target variable has subscripts and/or fields.
        if (modifierCount > 0) 
        {
            lastModCtx = varCtx.modifier().get(modifierCount - 1);
            compiler.visit(varCtx);
        }
        
        // Emit code to evaluate the expression.
        compiler.visit(exprCtx);
        
        // float variable := integer constant
        if (   (varType == Predefined.realType)
            && (exprType.baseType() == Predefined.integerType)) emit(I2F);
        
        // Emit code to store the expression value into the target variable.
        // The target variable has no subscripts or fields.
        if (lastModCtx == null) emitStoreValue(varId, varId.getType());


        // The target variable is an array element.
        else
        {
            emitStoreValue(null, varType);
        }
    }

    /**
     * Emit code for an IF statement.
     * @param ctx the IfStatementContext.
     */
    public void emitIf(projectParser.IfStatementContext ctx)
    {
        boolean elseExists = ctx.falseStatement() != null;
        Label nextLabel = new Label();
        Label falseLabel = new Label();

        compiler.visit(ctx.expression());
        if(elseExists)
            emit(IFEQ, falseLabel);
        else
            emit(IFEQ, nextLabel);

        compiler.visit(ctx.trueStatement());


        if(elseExists)
        {
            emit(GOTO, nextLabel);
            emitLabel(falseLabel);
            compiler.visit(ctx.falseStatement());
        }

        emitLabel(nextLabel);

    }
    
    /**
     * Emit code for a CASE statement.
     * @param ctx the CaseStatementContext.
     */
    public void emitCase(projectParser.SwitchStatementContext ctx)
    {
        compiler.visit(ctx.expression());
        emit(LOOKUPSWITCH);
        ArrayList<Integer> caseConsts = new ArrayList<>();
        HashMap<Integer, Label> cases = new HashMap<>();
        HashMap<Label, projectParser.CaseBranchContext> branches = new HashMap<>();
        for(projectParser.CaseBranchContext branch : ctx.switchBranchList().caseBranch()){
            if(branch.caseConstantList() != null){
                Label newLabel = new Label();
                for(projectParser.CaseConstantContext constant:  branch.caseConstantList().caseConstant())
                {
                    caseConsts.add(constant.value);
                    cases.put(constant.value,newLabel);
                }
                branches.put(newLabel, branch);
            }
        }

        Label defaultLabel = new Label();
        Collections.sort(caseConsts);
        for(Integer x: caseConsts){
            emitLabel(x,cases.get(x));
        }
        emitLabel("default", defaultLabel);

        for(Map.Entry<Label, projectParser.CaseBranchContext> entry : branches.entrySet()){
            emitLabel(entry.getKey());
            compiler.visit(entry.getValue());
            emit(GOTO, defaultLabel);
        }

        emitLabel(defaultLabel);
    }

    
    /**
     * Emit code for a WHILE statement.
     * @param ctx the WhileStatementContext.
     */
    public void emitWhile(projectParser.WhileStatementContext ctx)
    {
        Label loopTopLabel = new Label();
        Label loopExitLabel = new Label();

        emitLabel(loopTopLabel);
        compiler.visit(ctx.expression());
        emit(IFEQ, loopExitLabel);
        compiler.visit(ctx.compoundStatement());
        emit(GOTO, loopTopLabel);
        emitLabel(loopExitLabel);
    }
    
    /**
     * Emit code for a FOR statement.
     * @param ctx the ForStatementContext.
     */
    public void emitFor(projectParser.ForStatementContext ctx)
    {
        Instruction pop = POP;// instuction to incriment the top value on stack
        Instruction ldc = LDC;// instuction to incriment the top value on stack
        Instruction add = IADD;// instuction to incriment the top value on stack
        boolean incriment = ctx.forIncrementStatement().getText() == "++"; // are we counting up or down?
        projectParser.VariableContext varCtx = ctx.forInitialization().assignmentStatement().lhs().variable();
        SymtabEntry entry = varCtx.entry;
        Label loopTopLabel  = new Label(); // label at the beginning
        Label loopExitLabel = new Label();// label to jump out from
        emitComment("A for loop is starting here");
        compiler.visit(ctx.forInitialization().assignmentStatement().rhs().expression()); // get the first part of the expression, the assignment statement
        emitStoreValue(entry, entry.getType());
        emitLabel(loopTopLabel); // print out the first loop lable
        compiler.visit(ctx.forControl().expression()); // get the first part of the expression, the assignment statement
        emitLoadValue(entry);
        if(incriment)
            emit(IF_ICMPLT, loopExitLabel);// check to see if the variables are equal. if they are, then jump out of the loop
        else
            emit(IF_ICMPGT, loopExitLabel);


        compiler.visit(ctx.compoundStatement()); // if we are still going, visit the context
        if(incriment == true) { // if not, inciment or decrement the number
            //emit(pop); // get the compare value off of the stack
            emit(ldc,1); // add a i to the stack
            emitLoadValue(entry);
            emit(add); // add the values
            emitStoreValue(entry, entry.getType());
        }
        else {
            //emit(pop);
            emit(ldc,-1); // use -1 if decrimenting
            emitLoadValue(entry);
            emit(add);
            emitStoreValue(entry, entry.getType());
        }
        emit(GOTO, loopTopLabel); // then jump back up to the loop

        emitLabel(loopExitLabel); // jump here to exit the loop
        emitComment("The for loop is ending here");
    }
    
    /**
     * Emit code for a procedure call statement.
     * @param ctx the ProcedureCallStatementContext.
     */
    public void emitFunctionCall(projectParser.FunctionCallStatementContext ctx)
    {
        String argTypes = "";
        SymtabEntry routineId = ctx.functionCall().functionName().entry;
        ArrayList<SymtabEntry> paramIds = routineId.getRoutineParameters();
        int i = 0;
        if(ctx.functionCall().argumentList() != null)
        {
            for(SymtabEntry param : paramIds)
            {
                argTypes += typeDescriptor(param);


            }

            for (projectParser.ArgumentContext argCtx : ctx.functionCall().argumentList().argument())
            {
                projectParser.ExpressionContext exprCtx = argCtx.expression();
                compiler.visit(exprCtx);
                if(typeDescriptor(paramIds.get(i)).equals("F") && TypeChecker.isInteger(exprCtx.type))
                    emit(I2F);
                i++;
            }


        }

        String returnType = typeDescriptor(routineId);

        emit(INVOKESTATIC, programName + "/" + ctx.functionCall().functionName().IDENTIFIER().getText() + "("
                       + argTypes + ")" + returnType);

    }


    /**
     * Emit code for a WRITE statement.
     * @param ctx the WriteStatementContext.
     */
    public void emitWrite(projectParser.PrintStatementContext ctx) {
        emitWrite(ctx.writeArguments(), false);
    }

    /**
     * Emit code for a call to WRITE or WRITELN.
     * @param argsCtx the WriteArgumentsContext.
     * @param needLF true if need a line feed.
     */
    private void emitWrite(projectParser.WriteArgumentsContext argsCtx,
                           boolean needLF)
    {
        emit(GETSTATIC, "java/lang/System/out", "Ljava/io/PrintStream;");

        // WRITELN with no arguments.
        if (argsCtx == null) 
        {
            emit(INVOKEVIRTUAL, "java/io/PrintStream.println()V");
            localStack.decrease(1);
        }
            
        // Generate code for the arguments.
        else
        {
            StringBuffer format = new StringBuffer();
            int exprCount = createWriteFormat(argsCtx, format, needLF);
            
            // Load the format string.
            emit(LDC, format.toString());
            
            // Emit the arguments array.
            if (exprCount > 0)
            {
                emitArgumentsArray(argsCtx, exprCount);

                emit(INVOKEVIRTUAL,
                     "java/io/PrintStream/printf(Ljava/lang/String;[Ljava/lang/Object;)" +
                     "Ljava/io/PrintStream;");
                localStack.decrease(2);
                emit(POP);
            }
            else
            {
                emit(INVOKEVIRTUAL,
                     "java/io/PrintStream/print(Ljava/lang/String;)V");
                localStack.decrease(2);
            }
        }
    }
    
    /**
     * Create the printf format string.
     * @param argsCtx the WriteArgumentsContext.
     * @param format the format string to create.
     * @return the count of expression arguments.
     */
    private int createWriteFormat(projectParser.WriteArgumentsContext argsCtx,
                                  StringBuffer format, boolean needLF)
    {
        int exprCount = 0;
        format.append("\"");
        
        // Loop over the write arguments.
        for (projectParser.WriteArgumentContext argCtx : argsCtx.writeArgument())
        {
            Typespec type = argCtx.expression().type;
            String argText = argCtx.getText();
            
            // Append any literal strings.
            if (argText.charAt(0) == '\'') 
            {
                format.append(convertString(argText));
            }
            

        }
        
        format.append(needLF ? "\\n\"" : "\"");
 
        return exprCount;
    }
    
    /**
     * Emit the printf arguments array.
     * @param argsCtx
     * @param exprCount
     */
    private void emitArgumentsArray(projectParser.WriteArgumentsContext argsCtx,
                                    int exprCount)
    {
        // Create the arguments array.
        emitLoadConstant(exprCount);
        emit(ANEWARRAY, "java/lang/Object");

        int index = 0;

        // Loop over the write arguments to fill the arguments array.
        for (projectParser.WriteArgumentContext argCtx :
                                                    argsCtx.writeArgument())
        {
            String argText = argCtx.getText();
            projectParser.ExpressionContext exprCtx = argCtx.expression();
            Typespec type = exprCtx.type.baseType();
            
            // Skip string constants, which were made part of
            // the format string.
            if (argText.charAt(0) != '\'') 
            {
                emit(DUP);
                emitLoadConstant(index++);

                compiler.visit(exprCtx);

                Form form = type.getForm();
                if (    ((form == SCALAR) || (form == ENUMERATION))
                     && (type != Predefined.stringType))
                {
                    emit(INVOKESTATIC, valueOfSignature(type));
                }

                // Store the value into the array.
                emit(AASTORE);
            }
        }
    }

}