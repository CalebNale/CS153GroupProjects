// Generated from C:/Users/Neil Majumdar/Downloads/Final\project.g4 by ANTLR 4.8

    package antlr4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link projectParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface projectVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link projectParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(projectParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#programHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramHeader(projectParser.ProgramHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#programIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramIdentifier(projectParser.ProgramIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#mainProgram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainProgram(projectParser.MainProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(projectParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#functionDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinitions(projectParser.FunctionDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(projectParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(projectParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(projectParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#functionCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatement(projectParser.FunctionCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(projectParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(projectParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(projectParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(projectParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(projectParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(projectParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(projectParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#declarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(projectParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(projectParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhs(projectParser.LhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRhs(projectParser.RhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(projectParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#trueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueStatement(projectParser.TrueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#falseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseStatement(projectParser.FalseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(projectParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#switchBranchList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBranchList(projectParser.SwitchBranchListContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#caseBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBranch(projectParser.CaseBranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#caseConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseConstantList(projectParser.CaseConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#caseCompound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseCompound(projectParser.CaseCompoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#defaultBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultBranch(projectParser.DefaultBranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#caseConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseConstant(projectParser.CaseConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(projectParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(projectParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#forInitialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitialization(projectParser.ForInitializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(projectParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#forIncrementStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForIncrementStatement(projectParser.ForIncrementStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(projectParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#formatString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatString(projectParser.FormatStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#writeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteArguments(projectParser.WriteArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#writeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteArgument(projectParser.WriteArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(projectParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(projectParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(projectParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableFactor}
	 * labeled alternative in {@link projectParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableFactor(projectParser.VariableFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link projectParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberFactor(projectParser.NumberFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code characterFactor}
	 * labeled alternative in {@link projectParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterFactor(projectParser.CharacterFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringFactor}
	 * labeled alternative in {@link projectParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringFactor(projectParser.StringFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallFactor}
	 * labeled alternative in {@link projectParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallFactor(projectParser.FunctionCallFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notFactor}
	 * labeled alternative in {@link projectParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotFactor(projectParser.NotFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedFactor}
	 * labeled alternative in {@link projectParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedFactor(projectParser.ParenthesizedFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(projectParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(projectParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(projectParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(projectParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(projectParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(projectParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(projectParser.UnsignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#integerConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerConstant(projectParser.IntegerConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#realConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealConstant(projectParser.RealConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#characterConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterConstant(projectParser.CharacterConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#stringConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConstant(projectParser.StringConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#relOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOp(projectParser.RelOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(projectParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link projectParser#mulOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOp(projectParser.MulOpContext ctx);
}