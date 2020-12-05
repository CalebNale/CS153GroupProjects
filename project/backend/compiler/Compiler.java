package backend.compiler;

import antlr4.*;
import antlr4.subCParser.ArgumentContext;
import intermediate.symtab.*;
import intermediate.symtab.Predefined;

/**
 * Compile Pascal to Jasmin assembly language.
 */
public class Compiler extends subCBaseVisitor<Object>
{
    private SymtabEntry programId;  // symbol table entry of the program name
    private String programName;     // the program name
    
    private CodeGenerator       code;            // base code generator
    private ProgramGenerator    programCode;     // program code generator
    private StatementGenerator  statementCode;   // statement code generator
    private ExpressionGenerator expressionCode;  // expression code generator
    
    /**
     * Constructor for the base compiler.
     * @param programId the symtab entry for the program name.
     */
    public Compiler(SymtabEntry programId)
    {
        this.programId = programId;        
        programName = programId.getName();
        
        code = new CodeGenerator(programName, "j", this);
    }
    
    /**
     * Constructor for child compilers of procedures and functions.
     * @param parent the parent compiler.
     */
    public Compiler(Compiler parent)
    {
        this.code        = parent.code;
        this.programCode = parent.programCode;
        this.programId   = parent.programId;
        this.programName = parent.programName;
    }
    
    
    /**
     * Create new child code generators.
     * @param parentGenerator the parent code generator.
     */
    private void createNewGenerators(CodeGenerator parentGenerator)
    {
        programCode    = new ProgramGenerator(parentGenerator, this);
        statementCode  = new StatementGenerator(programCode, this);
        expressionCode = new ExpressionGenerator(programCode, this);
    }

    /**
     * Get the name of the object (Jasmin) file.
     * @return the name.
     */
    public String getObjectFileName() { return code.getObjectFileName(); }
    

    @Override 
    public Object visitFunctionDefinition(
                                    subCParser.FunctionDefinitionContext ctx) 
    {
        createNewGenerators(programCode);
        programCode.emitFunction(ctx);
        return null;
    }
    
    @Override 
    public Object visitStatement(subCParser.StatementContext ctx) 
    {
        if (   (ctx.compoundStatement() == null) )
        {
            statementCode.emitComment(ctx);
        }
        
        return visitChildren(ctx);
    }

    @Override 
    public Object visitAssignmentStatement(
                                    subCParser.AssignmentStatementContext ctx) 
    {
        statementCode.emitAssignment(ctx);
        return null;
    }

    @Override 
    public Object visitIfStatement(subCParser.IfStatementContext ctx) 
    {
        statementCode.emitIf(ctx);
        return null;
    }

    @Override 
    public Object visitSwitchStatement(subCParser.SwitchStatementContext ctx) 
    {
        statementCode.emitSwitch(ctx);
        return null;
    }

//    @Override 
//    public Object visitRepeatStatement(subCParser.RepeatStatementContext ctx) 
//    {
//        statementCode.emitRepeat(ctx);
//        return null;
//    }

    @Override 
    public Object visitWhileStatement(subCParser.WhileStatementContext ctx) 
    {
        statementCode.emitWhile(ctx);
        return null;
    }

    @Override 
    public Object visitForStatement(subCParser.ForStatementContext ctx) 
    {
        statementCode.emitFor(ctx);
        return null;
    }

    @Override 
    public Object visitFunctionCallStatement(
                                subCParser.FunctionCallStatementContext ctx) 
    {
        statementCode.emitFunctionCall(ctx);
        return null;
    }

    @Override 
    public Object visitExpression(subCParser.ExpressionContext ctx) 
    {
        expressionCode.emitExpression(ctx);
        return null;
    }

    @Override 
    public Object visitVariableFactor(subCParser.VariableFactorContext ctx) 
    {
        expressionCode.emitLoadValue(ctx.variable());
        return null;
    }

    @Override 
    public Object visitVariable(subCParser.VariableContext ctx) 
    {
        expressionCode.emitLoadVariable(ctx);        
        return null;
    }

    @Override 
    public Object visitNumberFactor(subCParser.NumberFactorContext ctx) 
    {
        if (ctx.type == Predefined.integerType) 
        {
            expressionCode.emitLoadIntegerConstant(ctx.number());
        }
        else
        {
            expressionCode.emitLoadRealConstant(ctx.number());
        }
        
        return null;
    }

    @Override 
    public Object visitCharacterFactor(subCParser.CharacterFactorContext ctx) 
    {
        char ch = ctx.getText().charAt(1);
        expressionCode.emitLoadConstant(ch);

        return null;
    }

    @Override 
    public Object visitStringFactor(subCParser.StringFactorContext ctx) 
    {
        String jasminString = convertString(ctx.getText());
        expressionCode.emitLoadConstant(jasminString);
        
        return null;
    }
    
    /**
     * Convert a Pascal string to a Java string.
     * @param pascalString the Pascal string.
     * @return the Java string.
     */
    String convertString(String pascalString)
    {
        String unquoted = pascalString.substring(1, pascalString.length()-1);
        return unquoted.replace("''", "'").replace("\"", "\\\"");
    }

    @Override 
    public Object visitFunctionCallFactor(
                                    subCParser.FunctionCallFactorContext ctx) 
    {
        statementCode.emitFunctionCall(ctx.functionCall());
        return null;
    }

    @Override 
    public Object visitNotFactor(subCParser.NotFactorContext ctx) 
    {
        expressionCode.emitNotFactor(ctx);
        return null;
    }

    @Override 
    public Object visitParenthesizedFactor(
                                    subCParser.ParenthesizedFactorContext ctx) 
    {
        return visit(ctx.expression());
    }

    @Override 
    public Object visitPrintStatement(subCParser.PrintStatementContext ctx) 
    {
        statementCode.emitPrint(ctx);
        return null;
    }

}
