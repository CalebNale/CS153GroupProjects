package backend.interpreter;

import java.awt.List;
import antlr4.*;
import intermediate.symtab.Symtab;
import intermediate.symtab.SymtabEntry;

public class Executor extends Pcl4BaseVisitor<Object>
{
    Symtab symtab = new Symtab();

    public Object visitProgram(Pcl4Parser.ProgramContext ctx) {
        //System.out.println("Visiting program");
        return visit(ctx.block());
    }

    public Object visitStatement(Pcl4Parser.StatementContext ctx) {
        //System.out.print("Line " + ctx.getStart().getLine() + ": ");
        return visitChildren(ctx);
    }

    public Object visitStatementList(Pcl4Parser.StatementListContext ctx) {
        //System.out.println("Visiting statement list");

        for (Pcl4Parser.StatementContext stmtCtx : ctx.statement()) {
            visit(stmtCtx);
        }

        return null;
    }

    public Object visitCompoundStatement(Pcl4Parser.CompoundStatementContext ctx) {
        //System.out.println("Visiting compound statement");
        return visit(ctx.statementList());
    }

    public Object visitAssignmentStatement(Pcl4Parser.AssignmentStatementContext ctx) {
        //System.out.println("Visiting assignment statement");
        String variableName = ctx.lhs().variable().getText();
        SymtabEntry entry;
        if(symtab.lookup(variableName) == null)
            entry = symtab.enter(variableName);
        else
            entry = symtab.lookup(variableName);
        visit(ctx.lhs());
        Object value = visit(ctx.rhs());
        entry.setValue((Double)value);
        //System.out.println("Will assign value " + (Double) value +
        //      " to variable " + variableName);
        return null;
    }

    public Object visitRepeatStatement(Pcl4Parser.RepeatStatementContext ctx) {
        //System.out.println("Visiting REPEAT statement");
        boolean testCondition;
        do
        {
            visit(ctx.statementList());
            testCondition = (Boolean)visit(ctx.expression());
        }while(!testCondition);

        return null;
    }

    public Object visitWriteStatement(Pcl4Parser.WriteStatementContext ctx) {
        //System.out.println("Visiting WRITE statement");
        visit(ctx.writeArgumentsOn());
        return null;
    }

    public Object visitWriteArgumentsOn(Pcl4Parser.WriteArgumentsOnContext ctx)
    {
        visit(ctx.writeArgumentListOn());
        return null;
    }

    public Object visitWriteArgumentListOn(Pcl4Parser.WriteArgumentListOnContext ctx)
    {
        visit(ctx.writeArgumentList());
        return null;
    }

    public Object visitWriteArgumentList(Pcl4Parser.WriteArgumentListContext ctx)
    {
        for(Pcl4Parser.WriteArgumentContext argCtx : ctx.writeArgument())
        {
            visit(argCtx);
        }

        return null;
    }

    public Object visitWriteArgument(Pcl4Parser.WriteArgumentContext ctx)
    {
        Object value = visit(ctx.expression());
        System.out.print(value);
        return null;
    }



public Object visitWritelnStatement(Pcl4Parser.WritelnStatementContext ctx) {
        if(ctx.children.size() > 0) {
            WriteArgumentsLnContext wl = ctx.writeArgumentsLn();
            if(wl != null) visit(ctx.writeArgumentsLn());
        }
        System.out.println();
        return null;
    }

    public Object visitWriteArgumentsLn(Pcl4Parser.WriteArgumentsLnContext ctx)
    {
        visit(ctx.writeArgumentListLn());
        return null;
    }

    public Object visitWriteArgumentListLn(Pcl4Parser.WriteArgumentListLnContext ctx)
    {
        visit(ctx.writeArgumentList());
        return null;
    }


    public Object visitExpression(Pcl4Parser.ExpressionContext ctx) {
        //System.out.println("Visiting expression");
        if(ctx.children.size() == 1)
            return visit(ctx.simpleExpression(0));
        else
        {
            double left = (Double)visit(ctx.simpleExpression(0));
            double right = (Double)visit(ctx.simpleExpression(1));
            String relOp = (String)visit(ctx.relOp());
            boolean value = false;
            switch(relOp)
            {
                case "=" : value = left == right; break;
                case "<>": value = left != right; break;
                case "<" : value = left < right;  break;
                case "<=": value = left <= right; break;
                case ">" : value = left > right;  break;
                case ">=": value = left >= right; break;
                default : return null;
            }

            return value;
        }


    }

    public Object visitSimpleExpression(Pcl4Parser.SimpleExpressionContext ctx) {
        //System.out.println("Visiting simple expression");
        boolean negative = false;

        if(ctx.sign() != null)
        {
            String sign = (String)visitSign(ctx.sign());
            if(sign.equals("-"));
            negative = true;
        }
        if (ctx.term().size() == 1)
        {
            if(negative)
                return (Double)visit(ctx.term(0)) * -1;
            return visit(ctx.term(0));
        }


        else {
            double left = (Double) visit(ctx.term(0));
            double right = (Double) visit(ctx.term(1));
            String addOp = (String) visit(ctx.addOp(0));
            double value = 0;
            switch (addOp) {
                case "+":
                    value = left + right;
                    break;
                case "-":
                    value = left - right;
                    break;

            }
            if(negative)
                return value * -1;
            return value;


        }

    }

    public Object visitSign(Pcl4Parser.SignContext ctx)
    {
        return ctx.getText();
    }



    public Object visitTerm(Pcl4Parser.TermContext ctx)
    {
        //System.out.println("Visiting term");
        return visitChildren(ctx);
    }

    public Object visitVariable(Pcl4Parser.VariableContext ctx) {
        //System.out.print("Visiting variable ");
        String variableName = ctx.getText();
        //System.out.println(variableName);

        return variableName;  // should return the variable's value!
    }

    public Object visitVariableExpression(Pcl4Parser.VariableExpressionContext ctx)
    {
        //System.out.println("Visiting variable expression");
        String variableName = (String)visit(ctx.variable());
        SymtabEntry entry = symtab.lookup(variableName);
        return entry.getValue();
    }

    public Object visitNumber(Pcl4Parser.NumberContext ctx) {
        // System.out.print("Visiting number: got value ");
        String text;
        boolean negative = false;
        if(ctx.sign() != null)
        {
            String sign = (String)visit(ctx.sign());
            if(sign.equals("-"))
                negative = true;
        }
        if(ctx.unsignedNumber().integerConstant() != null) {
            text = ctx.unsignedNumber().integerConstant()
                    .INTEGER().getText();
            Integer value = Integer.valueOf(text);
            //System.out.println(value);
            if(negative)
                value *= -1;
            return Double.valueOf(value);
        }
        else
        {
            text = ctx.unsignedNumber().realConstant().REAL().getText();
            Double value = Double.valueOf(text);
            //System.out.println(value);
            if(negative)
                value *= -1;
            return Double.valueOf(value);
        }



    }


    public Object visitNumberExpression(Pcl4Parser.NumberExpressionContext ctx)
    {
        //System.out.println("Visit number expression");
        return visit(ctx.number());
    }

    public Object visitCharacterConstant(Pcl4Parser.CharacterConstantContext ctx)
    {
        //System.out.print("Visiting character: got value ");
        String text = ctx.CHARACTER().getText();
        //System.out.println(text);
        return text;
    }

    public Object visitCharacterFactor(Pcl4Parser.CharacterFactorContext ctx)
    {
        //System.out.println("Visiting character factor");
        return visit(ctx.characterConstant());
    }

    public Object visitStringConstant(Pcl4Parser.StringConstantContext ctx)
    {
        System.out.print("Visiting string: got value");
        String text = ctx.getText();
        System.out.println(text);
        return text;
    }

    public Object visitStringFactor(Pcl4Parser.StringFactorContext ctx)
    {
        //System.out.println("Visiting string factor");
        return visit(ctx.stringConstant());
    }

    public Object visitLhs(Pcl4Parser.LhsContext ctx)
    {
        //System.out.println("Visiting lhs");
        String variable = (String)visit(ctx.variable());
        return variable;

    }

    public Object visitRhs(Pcl4Parser.RhsContext ctx)
    {
        //System.out.println("Visiting rhs");
        return visit(ctx.expression());
    }

    public Object visitRelOp(Pcl4Parser.RelOpContext ctx)
    {
        return ctx.getText();
    }

    public Object visitAddOp(Pcl4Parser.AddOpContext ctx)
    {
        return ctx.getText();
    }

    public Object visitMulOp(Pcl4Parser.MulOpContext ctx)
    {
        return ctx.getText();
    }

    public Object visitWhileStatement(Pcl4Parser.WhileStatementContext ctx)
    {
        //System.out.println("Visiting while statement");
        boolean testCondition = (Boolean)visit(ctx.expression());
        while(testCondition)
        {
            visit(ctx.statement());
            testCondition = (Boolean)visit(ctx.expression());
        }

        return null;
    }
  public Object visitIfStatement(Pcl4Parser.IfStatementContext ctx)
    {

       
        boolean b = (Boolean) visit(ctx.children.get(1));
        if (b)   {
        	;
        
        	return visit(ctx.children.get(3));
        }
        else if (ctx.children.get(5)  != null) {
        	
        	return visit( ctx.children.get(5) );
        }
        
        return null;
    }
	
	    public Object visitCaseStatement(Pcl4Parser.CaseStatementContext ctx)
    {
    	
    	java.util.List<ExpressionContext> values = ctx.expression();
    	java.util.List<StatementListContext> statements = ctx.statementList();
    	Object value = visit(values.get(0)); // initial value to be checked against
    	boolean expressionFlag = false;
    	boolean statement = false;
    	int expressionCounter = 1;
    	int statementCounter = 0;
    	for (int i = 3; i < ctx.getChildCount(); i++) // for each child
    	{
    		if (ctx.getChild(i).getText().contentEquals(","))
    		{
    			// if comma, do nothing
    		}
    		else if (ctx.getChild(i).getText().contentEquals(":"))
    		{
    			statement = true; // next child is a statement
    		}
    		else if (statement) // current child is statement
    		{
    			if (expressionFlag) // visit statement
    			{
    				visit(statements.get(statementCounter));				
    				expressionFlag = false;
    			}
    			statementCounter++;
    			statement = false;
    		}
    		else if(ctx.getChild(i).equals(ctx.END()))
    		{
    			return null;
    		}
    		else 
    		{
    			if (visit(values.get(expressionCounter)).equals(value))
    			{
    				expressionFlag = true; // if true, expression == value, and so execute next statement
    			}
    			expressionCounter++;	
    		}	
    	}
    	return null;
    }
public Object visitForStatement(Pcl4Parser.ForStatementContext ctx ) {
        int startVal = ((Double) visit(ctx.assignmentStatement().rhs())).intValue();
        int to = ctx.TO() != null ? 1 : 0;
        int endVal = ((Double) visit(ctx.expression())).intValue();
        if(to == 1) {
            for(; startVal <= endVal; startVal++) {
                 visit(ctx.statement());
            }
        }

        else {
            for(; startVal >= endVal; startVal--) {
                visit(ctx.statement());
            }
        }

        return null;
    }

}
