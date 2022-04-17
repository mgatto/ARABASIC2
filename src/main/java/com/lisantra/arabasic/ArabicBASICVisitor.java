package com.lisantra.arabasic; // Generated from
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
   * Visit a parse tree produced by {@link ArabicBASICParser#start}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitStart(ArabicBASICParser.StartContext ctx);
  /**
   * Visit a parse tree produced by {@link ArabicBASICParser#statement}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitStatement(ArabicBASICParser.StatementContext ctx);
  /**
   * Visit a parse tree produced by {@link ArabicBASICParser#null_statement}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitNull_statement(ArabicBASICParser.Null_statementContext ctx);
  /**
   * Visit a parse tree produced by {@link ArabicBASICParser#assignment}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitAssignment(ArabicBASICParser.AssignmentContext ctx);
  /**
   * Visit a parse tree produced by {@link ArabicBASICParser#comment}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitComment(ArabicBASICParser.CommentContext ctx);
}
