package com.lisantra.arabicbasic; // Generated from
                                  // /Users/mgatto/Development/cs-361/ARABASIC2/src/main/antlr4/ArabicBASIC.g4 by ANTLR 4.10.1

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced by {@link
 * ArabicBASICParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for operations with no return
 *     type.
 */
public interface ArabicBASICVisitor<T> extends ParseTreeVisitor<T> {
  /**
   * Visit a parse tree produced by {@link ArabicBASICParser#program}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitProgram(ArabicBASICParser.ProgramContext ctx);
  /**
   * Visit a parse tree produced by {@link ArabicBASICParser#block}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitBlock(ArabicBASICParser.BlockContext ctx);
  /**
   * Visit a parse tree produced by {@link ArabicBASICParser#statement}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitStatement(ArabicBASICParser.StatementContext ctx);
  /**
   * Visit a parse tree produced by {@link ArabicBASICParser#simpleAssignment}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSimpleAssignment(ArabicBASICParser.SimpleAssignmentContext ctx);
  /**
   * Visit a parse tree produced by {@link ArabicBASICParser#arrayAssignment}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitArrayAssignment(ArabicBASICParser.ArrayAssignmentContext ctx);
  /**
   * Visit a parse tree produced by {@link ArabicBASICParser#arrayCreation}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitArrayCreation(ArabicBASICParser.ArrayCreationContext ctx);
  /**
   * Visit a parse tree produced by {@link ArabicBASICParser#conditionalBlock}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitConditionalBlock(ArabicBASICParser.ConditionalBlockContext ctx);
  /**
   * Visit a parse tree produced by {@link ArabicBASICParser#forLoop}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitForLoop(ArabicBASICParser.ForLoopContext ctx);
  /**
   * Visit a parse tree produced by {@link ArabicBASICParser#print}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitPrint(ArabicBASICParser.PrintContext ctx);
  /**
   * Visit a parse tree produced by {@link ArabicBASICParser#input}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitInput(ArabicBASICParser.InputContext ctx);
  /**
   * Visit a parse tree produced by {@link ArabicBASICParser#blank}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitBlank(ArabicBASICParser.BlankContext ctx);
  /**
   * Visit a parse tree produced by the {@code term} labeled alternative in {@link
   * ArabicBASICParser#expression}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitTerm(ArabicBASICParser.TermContext ctx);
  /**
   * Visit a parse tree produced by the {@code addSub} labeled alternative in {@link
   * ArabicBASICParser#expression}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitAddSub(ArabicBASICParser.AddSubContext ctx);
  /**
   * Visit a parse tree produced by the {@code arrayAccess} labeled alternative in {@link
   * ArabicBASICParser#expression}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitArrayAccess(ArabicBASICParser.ArrayAccessContext ctx);
  /**
   * Visit a parse tree produced by the {@code unary} labeled alternative in {@link
   * ArabicBASICParser#expression}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitUnary(ArabicBASICParser.UnaryContext ctx);
  /**
   * Visit a parse tree produced by the {@code nested} labeled alternative in {@link
   * ArabicBASICParser#expression}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitNested(ArabicBASICParser.NestedContext ctx);
  /**
   * Visit a parse tree produced by the {@code exponentation} labeled alternative in {@link
   * ArabicBASICParser#expression}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitExponentation(ArabicBASICParser.ExponentationContext ctx);
  /**
   * Visit a parse tree produced by the {@code mulDiv} labeled alternative in {@link
   * ArabicBASICParser#expression}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitMulDiv(ArabicBASICParser.MulDivContext ctx);
  /**
   * Visit a parse tree produced by {@link ArabicBASICParser#subscript}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSubscript(ArabicBASICParser.SubscriptContext ctx);
  /**
   * Visit a parse tree produced by {@link ArabicBASICParser#arraySize}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitArraySize(ArabicBASICParser.ArraySizeContext ctx);
  /**
   * Visit a parse tree produced by the {@code atomicBoolean} labeled alternative in {@link
   * ArabicBASICParser#booleanExpression}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitAtomicBoolean(ArabicBASICParser.AtomicBooleanContext ctx);
  /**
   * Visit a parse tree produced by the {@code logicalAnd} labeled alternative in {@link
   * ArabicBASICParser#booleanExpression}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitLogicalAnd(ArabicBASICParser.LogicalAndContext ctx);
  /**
   * Visit a parse tree produced by the {@code comparitiveBoolean} labeled alternative in {@link
   * ArabicBASICParser#booleanExpression}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitComparitiveBoolean(ArabicBASICParser.ComparitiveBooleanContext ctx);
  /**
   * Visit a parse tree produced by the {@code logicalOr} labeled alternative in {@link
   * ArabicBASICParser#booleanExpression}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitLogicalOr(ArabicBASICParser.LogicalOrContext ctx);
  /**
   * Visit a parse tree produced by the {@code negatingBoolean} labeled alternative in {@link
   * ArabicBASICParser#booleanExpression}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitNegatingBoolean(ArabicBASICParser.NegatingBooleanContext ctx);
  /**
   * Visit a parse tree produced by the {@code nestedBoolean} labeled alternative in {@link
   * ArabicBASICParser#booleanExpression}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitNestedBoolean(ArabicBASICParser.NestedBooleanContext ctx);
  /**
   * Visit a parse tree produced by the {@code name} labeled alternative in {@link
   * ArabicBASICParser#variable}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitName(ArabicBASICParser.NameContext ctx);
  /**
   * Visit a parse tree produced by the {@code numeric} labeled alternative in {@link
   * ArabicBASICParser#variable}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitNumeric(ArabicBASICParser.NumericContext ctx);
  /**
   * Visit a parse tree produced by the {@code text} labeled alternative in {@link
   * ArabicBASICParser#variable}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitText(ArabicBASICParser.TextContext ctx);
}
