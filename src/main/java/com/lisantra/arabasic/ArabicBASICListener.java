package com.lisantra.arabasic; // Generated from
                               // /Users/mgatto/Development/cs-361/ARABASIC2/src/main/antlr4/ArabicBASIC.g4 by ANTLR 4.9.2

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by {@link
 * ArabicBASICParser}.
 */
public interface ArabicBASICListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link ArabicBASICParser#start}.
   *
   * @param ctx the parse tree
   */
  void enterStart(ArabicBASICParser.StartContext ctx);
  /**
   * Exit a parse tree produced by {@link ArabicBASICParser#start}.
   *
   * @param ctx the parse tree
   */
  void exitStart(ArabicBASICParser.StartContext ctx);
  /**
   * Enter a parse tree produced by {@link ArabicBASICParser#statement}.
   *
   * @param ctx the parse tree
   */
  void enterStatement(ArabicBASICParser.StatementContext ctx);
  /**
   * Exit a parse tree produced by {@link ArabicBASICParser#statement}.
   *
   * @param ctx the parse tree
   */
  void exitStatement(ArabicBASICParser.StatementContext ctx);
  /**
   * Enter a parse tree produced by {@link ArabicBASICParser#null_statement}.
   *
   * @param ctx the parse tree
   */
  void enterNull_statement(ArabicBASICParser.Null_statementContext ctx);
  /**
   * Exit a parse tree produced by {@link ArabicBASICParser#null_statement}.
   *
   * @param ctx the parse tree
   */
  void exitNull_statement(ArabicBASICParser.Null_statementContext ctx);
  /**
   * Enter a parse tree produced by {@link ArabicBASICParser#assignment}.
   *
   * @param ctx the parse tree
   */
  void enterAssignment(ArabicBASICParser.AssignmentContext ctx);
  /**
   * Exit a parse tree produced by {@link ArabicBASICParser#assignment}.
   *
   * @param ctx the parse tree
   */
  void exitAssignment(ArabicBASICParser.AssignmentContext ctx);
  /**
   * Enter a parse tree produced by {@link ArabicBASICParser#comment}.
   *
   * @param ctx the parse tree
   */
  void enterComment(ArabicBASICParser.CommentContext ctx);
  /**
   * Exit a parse tree produced by {@link ArabicBASICParser#comment}.
   *
   * @param ctx the parse tree
   */
  void exitComment(ArabicBASICParser.CommentContext ctx);
}
