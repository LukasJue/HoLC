// Generated from C:/Users/juene/Git/hopperlang/Hopperlang/src/main/res\Hopperlang.g4 by ANTLR 4.6
package de.htwb.hopperlang.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HopperlangParser}.
 */
public interface HopperlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HopperlangParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(HopperlangParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HopperlangParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(HopperlangParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HopperlangParser#empty_lines}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_lines(HopperlangParser.Empty_linesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HopperlangParser#empty_lines}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_lines(HopperlangParser.Empty_linesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HopperlangParser#signal_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSignal_declaration(HopperlangParser.Signal_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HopperlangParser#signal_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSignal_declaration(HopperlangParser.Signal_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HopperlangParser#signal_modifier}.
	 * @param ctx the parse tree
	 */
	void enterSignal_modifier(HopperlangParser.Signal_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HopperlangParser#signal_modifier}.
	 * @param ctx the parse tree
	 */
	void exitSignal_modifier(HopperlangParser.Signal_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HopperlangParser#signal_value_list}.
	 * @param ctx the parse tree
	 */
	void enterSignal_value_list(HopperlangParser.Signal_value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link HopperlangParser#signal_value_list}.
	 * @param ctx the parse tree
	 */
	void exitSignal_value_list(HopperlangParser.Signal_value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link HopperlangParser#signal_value}.
	 * @param ctx the parse tree
	 */
	void enterSignal_value(HopperlangParser.Signal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HopperlangParser#signal_value}.
	 * @param ctx the parse tree
	 */
	void exitSignal_value(HopperlangParser.Signal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HopperlangParser#automat_block}.
	 * @param ctx the parse tree
	 */
	void enterAutomat_block(HopperlangParser.Automat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HopperlangParser#automat_block}.
	 * @param ctx the parse tree
	 */
	void exitAutomat_block(HopperlangParser.Automat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HopperlangParser#state_block_list}.
	 * @param ctx the parse tree
	 */
	void enterState_block_list(HopperlangParser.State_block_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link HopperlangParser#state_block_list}.
	 * @param ctx the parse tree
	 */
	void exitState_block_list(HopperlangParser.State_block_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link HopperlangParser#state_block}.
	 * @param ctx the parse tree
	 */
	void enterState_block(HopperlangParser.State_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HopperlangParser#state_block}.
	 * @param ctx the parse tree
	 */
	void exitState_block(HopperlangParser.State_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HopperlangParser#state_body}.
	 * @param ctx the parse tree
	 */
	void enterState_body(HopperlangParser.State_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HopperlangParser#state_body}.
	 * @param ctx the parse tree
	 */
	void exitState_body(HopperlangParser.State_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HopperlangParser#state_body_element}.
	 * @param ctx the parse tree
	 */
	void enterState_body_element(HopperlangParser.State_body_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HopperlangParser#state_body_element}.
	 * @param ctx the parse tree
	 */
	void exitState_body_element(HopperlangParser.State_body_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HopperlangParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(HopperlangParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HopperlangParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(HopperlangParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HopperlangParser#transition_block}.
	 * @param ctx the parse tree
	 */
	void enterTransition_block(HopperlangParser.Transition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HopperlangParser#transition_block}.
	 * @param ctx the parse tree
	 */
	void exitTransition_block(HopperlangParser.Transition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HopperlangParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(HopperlangParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HopperlangParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(HopperlangParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HopperlangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(HopperlangParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HopperlangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(HopperlangParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HopperlangParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(HopperlangParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HopperlangParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(HopperlangParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HopperlangParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_expression(HopperlangParser.Boolean_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HopperlangParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_expression(HopperlangParser.Boolean_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HopperlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(HopperlangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HopperlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(HopperlangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HopperlangParser#assignment_left}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_left(HopperlangParser.Assignment_leftContext ctx);
	/**
	 * Exit a parse tree produced by {@link HopperlangParser#assignment_left}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_left(HopperlangParser.Assignment_leftContext ctx);
	/**
	 * Enter a parse tree produced by {@link HopperlangParser#assignment_right}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_right(HopperlangParser.Assignment_rightContext ctx);
	/**
	 * Exit a parse tree produced by {@link HopperlangParser#assignment_right}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_right(HopperlangParser.Assignment_rightContext ctx);
	/**
	 * Enter a parse tree produced by {@link HopperlangParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(HopperlangParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HopperlangParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(HopperlangParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HopperlangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(HopperlangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HopperlangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(HopperlangParser.TypeContext ctx);
}