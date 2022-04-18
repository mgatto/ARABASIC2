package com.lisantra.arabicbasic; // Generated from
// /Users/mgatto/Development/cs-361/ARABASIC2/src/main/antlr4/ArabicBASIC.g4 by ANTLR 4.9.2

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
   * Visit a parse tree produced by the {@code name} labeled alternative in {@link
   * ArabicBASICParser#variable}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitName(ArabicBASICParser.NameContext ctx);
  /**
   * Visit a parse tree produced by the {@code int} labeled alternative in {@link
   * ArabicBASICParser#variable}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitInt(ArabicBASICParser.IntContext ctx);
  /**
   * Visit a parse tree produced by the {@code text} labeled alternative in {@link
   * ArabicBASICParser#variable}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitText(ArabicBASICParser.TextContext ctx);
  /**
   * Visit a parse tree produced by the {@code float} labeled alternative in {@link
   * ArabicBASICParser#variable}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitFloat(ArabicBASICParser.FloatContext ctx);
}
