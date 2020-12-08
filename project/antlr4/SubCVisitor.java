// Generated from C:/Users/Neil Majumdar/Downloads/Final\SubC.g4 by ANTLR 4.8

    package antlr4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link antlr4.SubCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SubCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(antlr4.SubCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#programHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramHeader(antlr4.SubCParser.ProgramHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#programIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramIdentifier(antlr4.SubCParser.ProgramIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#mainProgram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainProgram(antlr4.SubCParser.MainProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(antlr4.SubCParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#functionDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinitions(antlr4.SubCParser.FunctionDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(antlr4.SubCParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(antlr4.SubCParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(antlr4.SubCParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#parameterIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterIdentifier(antlr4.SubCParser.ParameterIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#functionCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatement(antlr4.SubCParser.FunctionCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(antlr4.SubCParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#randomCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandomCall(antlr4.SubCParser.RandomCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(antlr4.SubCParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(antlr4.SubCParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(antlr4.SubCParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(antlr4.SubCParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(antlr4.SubCParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(antlr4.SubCParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#declarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(antlr4.SubCParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(antlr4.SubCParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhs(antlr4.SubCParser.LhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRhs(antlr4.SubCParser.RhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(antlr4.SubCParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#trueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueStatement(antlr4.SubCParser.TrueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#falseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseStatement(antlr4.SubCParser.FalseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(antlr4.SubCParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#switchBranchList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBranchList(antlr4.SubCParser.SwitchBranchListContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#caseBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBranch(antlr4.SubCParser.CaseBranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#caseConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseConstantList(antlr4.SubCParser.CaseConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#caseCompound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseCompound(antlr4.SubCParser.CaseCompoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#defaultBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultBranch(antlr4.SubCParser.DefaultBranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#caseConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseConstant(antlr4.SubCParser.CaseConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(antlr4.SubCParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(antlr4.SubCParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#forInitialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitialization(antlr4.SubCParser.ForInitializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(antlr4.SubCParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#forIncrementStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForIncrementStatement(antlr4.SubCParser.ForIncrementStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(antlr4.SubCParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#formatString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatString(antlr4.SubCParser.FormatStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#writeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteArguments(antlr4.SubCParser.WriteArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#writeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteArgument(antlr4.SubCParser.WriteArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(antlr4.SubCParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(antlr4.SubCParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(antlr4.SubCParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableFactor}
	 * labeled alternative in {@link antlr4.SubCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableFactor(antlr4.SubCParser.VariableFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link antlr4.SubCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberFactor(antlr4.SubCParser.NumberFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code characterFactor}
	 * labeled alternative in {@link antlr4.SubCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterFactor(antlr4.SubCParser.CharacterFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringFactor}
	 * labeled alternative in {@link antlr4.SubCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringFactor(antlr4.SubCParser.StringFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallFactor}
	 * labeled alternative in {@link antlr4.SubCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallFactor(antlr4.SubCParser.FunctionCallFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code randomCallFactor}
	 * labeled alternative in {@link antlr4.SubCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandomCallFactor(antlr4.SubCParser.RandomCallFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notFactor}
	 * labeled alternative in {@link antlr4.SubCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotFactor(antlr4.SubCParser.NotFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedFactor}
	 * labeled alternative in {@link antlr4.SubCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedFactor(antlr4.SubCParser.ParenthesizedFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#variableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableIdentifier(antlr4.SubCParser.VariableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(antlr4.SubCParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(antlr4.SubCParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(antlr4.SubCParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(antlr4.SubCParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(antlr4.SubCParser.UnsignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#integerConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerConstant(antlr4.SubCParser.IntegerConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#realConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealConstant(antlr4.SubCParser.RealConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#characterConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterConstant(antlr4.SubCParser.CharacterConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#stringConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConstant(antlr4.SubCParser.StringConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#relOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOp(antlr4.SubCParser.RelOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(antlr4.SubCParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr4.SubCParser#mulOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOp(SubCParser.MulOpContext ctx);
}