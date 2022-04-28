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
   * Visit a parse tree produced by {@link ArabicBASICParser#statement}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitStatement(ArabicBASICParser.StatementContext ctx);
  /**
   * Visit a parse tree produced by {@link ArabicBASICParser#assignment}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitAssignment(ArabicBASICParser.AssignmentContext ctx);
  /**
   * Visit a parse tree produced by {@link ArabicBASICParser#blank}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitBlank(ArabicBASICParser.BlankContext ctx);
  /**
   * Visit a parse tree produced by the {@code arrayCreate} labeled alternative in {@link
   * ArabicBASICParser#expression}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitArrayCreate(ArabicBASICParser.ArrayCreateContext ctx);
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
   * Visit a parse tree produced by the {@code size} labeled alternative in {@link
   * ArabicBASICParser#array_size}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitSize(ArabicBASICParser.SizeContext ctx);
  /**
   * Visit a parse tree produced by {@link ArabicBASICParser#array_creation}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitArray_creation(ArabicBASICParser.Array_creationContext ctx);
  /**
   * Visit a parse tree produced by {@link ArabicBASICParser#array_expression}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitArray_expression(ArabicBASICParser.Array_expressionContext ctx);
  /**
   * Visit a parse tree produced by {@link ArabicBASICParser#array_access}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitArray_access(ArabicBASICParser.Array_accessContext ctx);
  /**
   * Visit a parse tree produced by {@link ArabicBASICParser#block}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitBlock(ArabicBASICParser.BlockContext ctx);
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
  /**
   * Visit a parse tree produced by {@link ArabicBASICParser#number}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitNumber(ArabicBASICParser.NumberContext ctx);
}
