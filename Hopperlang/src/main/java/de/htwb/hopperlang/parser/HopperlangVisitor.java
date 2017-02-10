// Generated from /home/laokoon/Git/hopperlang/Hopperlang/src/main/res/Hopperlang.g4 by ANTLR 4.6
package de.htwb.hopperlang.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HopperlangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HopperlangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HopperlangParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(HopperlangParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HopperlangParser#empty_lines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_lines(HopperlangParser.Empty_linesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HopperlangParser#signal_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal_declaration(HopperlangParser.Signal_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HopperlangParser#signal_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal_modifier(HopperlangParser.Signal_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HopperlangParser#signal_value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal_value_list(HopperlangParser.Signal_value_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link HopperlangParser#signal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal_value(HopperlangParser.Signal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HopperlangParser#automat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutomat_block(HopperlangParser.Automat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HopperlangParser#state_block_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_block_list(HopperlangParser.State_block_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link HopperlangParser#state_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_block(HopperlangParser.State_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HopperlangParser#state_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_body(HopperlangParser.State_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HopperlangParser#state_body_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_body_element(HopperlangParser.State_body_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HopperlangParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(HopperlangParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HopperlangParser#transition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransition_block(HopperlangParser.Transition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HopperlangParser#transition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransition(HopperlangParser.TransitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HopperlangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(HopperlangParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HopperlangParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(HopperlangParser.ConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HopperlangParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_expression(HopperlangParser.Boolean_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HopperlangParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(HopperlangParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link HopperlangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(HopperlangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HopperlangParser#assignment_left}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_left(HopperlangParser.Assignment_leftContext ctx);
	/**
	 * Visit a parse tree produced by {@link HopperlangParser#assignment_right}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_right(HopperlangParser.Assignment_rightContext ctx);
	/**
	 * Visit a parse tree produced by {@link HopperlangParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(HopperlangParser.Assignment_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HopperlangParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(HopperlangParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HopperlangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(HopperlangParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HopperlangParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(HopperlangParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link HopperlangParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(HopperlangParser.NameContext ctx);
}