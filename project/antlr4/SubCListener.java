// Generated from SubC.g4 by ANTLR 4.8

    package antlr4;
    import java.util.HashMap;
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SubCParser}.
 */
public interface SubCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SubCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SubCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SubCParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#programHeader}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeader(SubCParser.ProgramHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#programHeader}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeader(SubCParser.ProgramHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#programIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterProgramIdentifier(SubCParser.ProgramIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#programIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitProgramIdentifier(SubCParser.ProgramIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#mainProgram}.
	 * @param ctx the parse tree
	 */
	void enterMainProgram(SubCParser.MainProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#mainProgram}.
	 * @param ctx the parse tree
	 */
	void exitMainProgram(SubCParser.MainProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(SubCParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(SubCParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#functionDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinitions(SubCParser.FunctionDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#functionDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinitions(SubCParser.FunctionDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(SubCParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(SubCParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(SubCParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(SubCParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(SubCParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(SubCParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#parameterIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterParameterIdentifier(SubCParser.ParameterIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#parameterIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitParameterIdentifier(SubCParser.ParameterIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement(SubCParser.FunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement(SubCParser.FunctionCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SubCParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SubCParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(SubCParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(SubCParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(SubCParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(SubCParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(SubCParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(SubCParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SubCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SubCParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(SubCParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(SubCParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(SubCParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(SubCParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(SubCParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(SubCParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(SubCParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(SubCParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterLhs(SubCParser.LhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitLhs(SubCParser.LhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#rhs}.
	 * @param ctx the parse tree
	 */
	void enterRhs(SubCParser.RhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#rhs}.
	 * @param ctx the parse tree
	 */
	void exitRhs(SubCParser.RhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SubCParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SubCParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#trueStatement}.
	 * @param ctx the parse tree
	 */
	void enterTrueStatement(SubCParser.TrueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#trueStatement}.
	 * @param ctx the parse tree
	 */
	void exitTrueStatement(SubCParser.TrueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#falseStatement}.
	 * @param ctx the parse tree
	 */
	void enterFalseStatement(SubCParser.FalseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#falseStatement}.
	 * @param ctx the parse tree
	 */
	void exitFalseStatement(SubCParser.FalseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(SubCParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(SubCParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#switchBranchList}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBranchList(SubCParser.SwitchBranchListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#switchBranchList}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBranchList(SubCParser.SwitchBranchListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#caseBranch}.
	 * @param ctx the parse tree
	 */
	void enterCaseBranch(SubCParser.CaseBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#caseBranch}.
	 * @param ctx the parse tree
	 */
	void exitCaseBranch(SubCParser.CaseBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#caseConstantList}.
	 * @param ctx the parse tree
	 */
	void enterCaseConstantList(SubCParser.CaseConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#caseConstantList}.
	 * @param ctx the parse tree
	 */
	void exitCaseConstantList(SubCParser.CaseConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#caseCompound}.
	 * @param ctx the parse tree
	 */
	void enterCaseCompound(SubCParser.CaseCompoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#caseCompound}.
	 * @param ctx the parse tree
	 */
	void exitCaseCompound(SubCParser.CaseCompoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#defaultBranch}.
	 * @param ctx the parse tree
	 */
	void enterDefaultBranch(SubCParser.DefaultBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#defaultBranch}.
	 * @param ctx the parse tree
	 */
	void exitDefaultBranch(SubCParser.DefaultBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#caseConstant}.
	 * @param ctx the parse tree
	 */
	void enterCaseConstant(SubCParser.CaseConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#caseConstant}.
	 * @param ctx the parse tree
	 */
	void exitCaseConstant(SubCParser.CaseConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(SubCParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(SubCParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(SubCParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(SubCParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#forInitialization}.
	 * @param ctx the parse tree
	 */
	void enterForInitialization(SubCParser.ForInitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#forInitialization}.
	 * @param ctx the parse tree
	 */
	void exitForInitialization(SubCParser.ForInitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(SubCParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(SubCParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#forIncrementStatement}.
	 * @param ctx the parse tree
	 */
	void enterForIncrementStatement(SubCParser.ForIncrementStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#forIncrementStatement}.
	 * @param ctx the parse tree
	 */
	void exitForIncrementStatement(SubCParser.ForIncrementStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(SubCParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(SubCParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#formatString}.
	 * @param ctx the parse tree
	 */
	void enterFormatString(SubCParser.FormatStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#formatString}.
	 * @param ctx the parse tree
	 */
	void exitFormatString(SubCParser.FormatStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#writeArguments}.
	 * @param ctx the parse tree
	 */
	void enterWriteArguments(SubCParser.WriteArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#writeArguments}.
	 * @param ctx the parse tree
	 */
	void exitWriteArguments(SubCParser.WriteArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#writeArgument}.
	 * @param ctx the parse tree
	 */
	void enterWriteArgument(SubCParser.WriteArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#writeArgument}.
	 * @param ctx the parse tree
	 */
	void exitWriteArgument(SubCParser.WriteArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SubCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SubCParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(SubCParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(SubCParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SubCParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SubCParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableFactor}
	 * labeled alternative in {@link SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterVariableFactor(SubCParser.VariableFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableFactor}
	 * labeled alternative in {@link SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitVariableFactor(SubCParser.VariableFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumberFactor(SubCParser.NumberFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberFactor}
	 * labeled alternative in {@link SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumberFactor(SubCParser.NumberFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code characterFactor}
	 * labeled alternative in {@link SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterCharacterFactor(SubCParser.CharacterFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code characterFactor}
	 * labeled alternative in {@link SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitCharacterFactor(SubCParser.CharacterFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringFactor}
	 * labeled alternative in {@link SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterStringFactor(SubCParser.StringFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringFactor}
	 * labeled alternative in {@link SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitStringFactor(SubCParser.StringFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallFactor}
	 * labeled alternative in {@link SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallFactor(SubCParser.FunctionCallFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallFactor}
	 * labeled alternative in {@link SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallFactor(SubCParser.FunctionCallFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notFactor}
	 * labeled alternative in {@link SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNotFactor(SubCParser.NotFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notFactor}
	 * labeled alternative in {@link SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNotFactor(SubCParser.NotFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedFactor}
	 * labeled alternative in {@link SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedFactor(SubCParser.ParenthesizedFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedFactor}
	 * labeled alternative in {@link SubCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedFactor(SubCParser.ParenthesizedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#variableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableIdentifier(SubCParser.VariableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#variableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableIdentifier(SubCParser.VariableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SubCParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SubCParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(SubCParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(SubCParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(SubCParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(SubCParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(SubCParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(SubCParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(SubCParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(SubCParser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#integerConstant}.
	 * @param ctx the parse tree
	 */
	void enterIntegerConstant(SubCParser.IntegerConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#integerConstant}.
	 * @param ctx the parse tree
	 */
	void exitIntegerConstant(SubCParser.IntegerConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#realConstant}.
	 * @param ctx the parse tree
	 */
	void enterRealConstant(SubCParser.RealConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#realConstant}.
	 * @param ctx the parse tree
	 */
	void exitRealConstant(SubCParser.RealConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#characterConstant}.
	 * @param ctx the parse tree
	 */
	void enterCharacterConstant(SubCParser.CharacterConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#characterConstant}.
	 * @param ctx the parse tree
	 */
	void exitCharacterConstant(SubCParser.CharacterConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void enterStringConstant(SubCParser.StringConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void exitStringConstant(SubCParser.StringConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#relOp}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(SubCParser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#relOp}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(SubCParser.RelOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(SubCParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(SubCParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SubCParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void enterMulOp(SubCParser.MulOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SubCParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void exitMulOp(SubCParser.MulOpContext ctx);
}