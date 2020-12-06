// Generated from C:/Users/Neil Majumdar/Downloads/Final\project.g4 by ANTLR 4.8

    package antlr4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link projectParser}.
 */
public interface projectListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link projectParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(projectParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(projectParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#programHeader}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeader(projectParser.ProgramHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#programHeader}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeader(projectParser.ProgramHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#programIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterProgramIdentifier(projectParser.ProgramIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#programIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitProgramIdentifier(projectParser.ProgramIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#mainProgram}.
	 * @param ctx the parse tree
	 */
	void enterMainProgram(projectParser.MainProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#mainProgram}.
	 * @param ctx the parse tree
	 */
	void exitMainProgram(projectParser.MainProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(projectParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(projectParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#functionDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinitions(projectParser.FunctionDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#functionDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinitions(projectParser.FunctionDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(projectParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(projectParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(projectParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(projectParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(projectParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(projectParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement(projectParser.FunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement(projectParser.FunctionCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(projectParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(projectParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(projectParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(projectParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(projectParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(projectParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(projectParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(projectParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(projectParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(projectParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(projectParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(projectParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(projectParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(projectParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(projectParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(projectParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(projectParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(projectParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterLhs(projectParser.LhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitLhs(projectParser.LhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#rhs}.
	 * @param ctx the parse tree
	 */
	void enterRhs(projectParser.RhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#rhs}.
	 * @param ctx the parse tree
	 */
	void exitRhs(projectParser.RhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(projectParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(projectParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#trueStatement}.
	 * @param ctx the parse tree
	 */
	void enterTrueStatement(projectParser.TrueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#trueStatement}.
	 * @param ctx the parse tree
	 */
	void exitTrueStatement(projectParser.TrueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#falseStatement}.
	 * @param ctx the parse tree
	 */
	void enterFalseStatement(projectParser.FalseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#falseStatement}.
	 * @param ctx the parse tree
	 */
	void exitFalseStatement(projectParser.FalseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(projectParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(projectParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#switchBranchList}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBranchList(projectParser.SwitchBranchListContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#switchBranchList}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBranchList(projectParser.SwitchBranchListContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#caseBranch}.
	 * @param ctx the parse tree
	 */
	void enterCaseBranch(projectParser.CaseBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#caseBranch}.
	 * @param ctx the parse tree
	 */
	void exitCaseBranch(projectParser.CaseBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#caseConstantList}.
	 * @param ctx the parse tree
	 */
	void enterCaseConstantList(projectParser.CaseConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#caseConstantList}.
	 * @param ctx the parse tree
	 */
	void exitCaseConstantList(projectParser.CaseConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#caseCompound}.
	 * @param ctx the parse tree
	 */
	void enterCaseCompound(projectParser.CaseCompoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#caseCompound}.
	 * @param ctx the parse tree
	 */
	void exitCaseCompound(projectParser.CaseCompoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#defaultBranch}.
	 * @param ctx the parse tree
	 */
	void enterDefaultBranch(projectParser.DefaultBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#defaultBranch}.
	 * @param ctx the parse tree
	 */
	void exitDefaultBranch(projectParser.DefaultBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#caseConstant}.
	 * @param ctx the parse tree
	 */
	void enterCaseConstant(projectParser.CaseConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#caseConstant}.
	 * @param ctx the parse tree
	 */
	void exitCaseConstant(projectParser.CaseConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(projectParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(projectParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(projectParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(projectParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#forInitialization}.
	 * @param ctx the parse tree
	 */
	void enterForInitialization(projectParser.ForInitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#forInitialization}.
	 * @param ctx the parse tree
	 */
	void exitForInitialization(projectParser.ForInitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(projectParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(projectParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#forIncrementStatement}.
	 * @param ctx the parse tree
	 */
	void enterForIncrementStatement(projectParser.ForIncrementStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#forIncrementStatement}.
	 * @param ctx the parse tree
	 */
	void exitForIncrementStatement(projectParser.ForIncrementStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(projectParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(projectParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#formatString}.
	 * @param ctx the parse tree
	 */
	void enterFormatString(projectParser.FormatStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#formatString}.
	 * @param ctx the parse tree
	 */
	void exitFormatString(projectParser.FormatStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#writeArguments}.
	 * @param ctx the parse tree
	 */
	void enterWriteArguments(projectParser.WriteArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#writeArguments}.
	 * @param ctx the parse tree
	 */
	void exitWriteArguments(projectParser.WriteArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#writeArgument}.
	 * @param ctx the parse tree
	 */
	void enterWriteArgument(projectParser.WriteArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#writeArgument}.
	 * @param ctx the parse tree
	 */
	void exitWriteArgument(projectParser.WriteArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(projectParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(projectParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(projectParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(projectParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(projectParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(projectParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableFactor}
	 * labeled alternative in {@link projectParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterVariableFactor(projectParser.VariableFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableFactor}
	 * labeled alternative in {@link projectParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitVariableFactor(projectParser.VariableFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link projectParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumberFactor(projectParser.NumberFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link projectParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumberFactor(projectParser.NumberFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code characterFactor}
	 * labeled alternative in {@link projectParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterCharacterFactor(projectParser.CharacterFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code characterFactor}
	 * labeled alternative in {@link projectParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitCharacterFactor(projectParser.CharacterFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringFactor}
	 * labeled alternative in {@link projectParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterStringFactor(projectParser.StringFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringFactor}
	 * labeled alternative in {@link projectParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitStringFactor(projectParser.StringFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallFactor}
	 * labeled alternative in {@link projectParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallFactor(projectParser.FunctionCallFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallFactor}
	 * labeled alternative in {@link projectParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallFactor(projectParser.FunctionCallFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notFactor}
	 * labeled alternative in {@link projectParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNotFactor(projectParser.NotFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notFactor}
	 * labeled alternative in {@link projectParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNotFactor(projectParser.NotFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedFactor}
	 * labeled alternative in {@link projectParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedFactor(projectParser.ParenthesizedFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedFactor}
	 * labeled alternative in {@link projectParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedFactor(projectParser.ParenthesizedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(projectParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(projectParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(projectParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(projectParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(projectParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(projectParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(projectParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(projectParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(projectParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(projectParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(projectParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(projectParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(projectParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(projectParser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#integerConstant}.
	 * @param ctx the parse tree
	 */
	void enterIntegerConstant(projectParser.IntegerConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#integerConstant}.
	 * @param ctx the parse tree
	 */
	void exitIntegerConstant(projectParser.IntegerConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#realConstant}.
	 * @param ctx the parse tree
	 */
	void enterRealConstant(projectParser.RealConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#realConstant}.
	 * @param ctx the parse tree
	 */
	void exitRealConstant(projectParser.RealConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#characterConstant}.
	 * @param ctx the parse tree
	 */
	void enterCharacterConstant(projectParser.CharacterConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#characterConstant}.
	 * @param ctx the parse tree
	 */
	void exitCharacterConstant(projectParser.CharacterConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void enterStringConstant(projectParser.StringConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void exitStringConstant(projectParser.StringConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#relOp}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(projectParser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#relOp}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(projectParser.RelOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(projectParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(projectParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link projectParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void enterMulOp(projectParser.MulOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link projectParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void exitMulOp(projectParser.MulOpContext ctx);
}