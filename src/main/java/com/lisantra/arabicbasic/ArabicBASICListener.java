package com.lisantra.arabicbasic; // Generated from
// /Users/mgatto/Development/cs-361/ARABASIC2/src/main/antlr4/ArabicBASIC.g4 by ANTLR 4.9.2

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by {@link
 * ArabicBASICParser}.
 */
public interface ArabicBASICListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link ArabicBASICParser#program}.
   *
   * @param ctx the parse tree
   */
  void enterProgram(ArabicBASICParser.ProgramContext ctx);
  /**
   * Exit a parse tree produced by {@link ArabicBASICParser#program}.
   *
   * @param ctx the parse tree
   */
  void exitProgram(ArabicBASICParser.ProgramContext ctx);
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
   * Enter a parse tree produced by {@link ArabicBASICParser#blank}.
   *
   * @param ctx the parse tree
   */
  void enterBlank(ArabicBASICParser.BlankContext ctx);
  /**
   * Exit a parse tree produced by {@link ArabicBASICParser#blank}.
   *
   * @param ctx the parse tree
   */
  void exitBlank(ArabicBASICParser.BlankContext ctx);
  /**
   * Enter a parse tree produced by the {@code name} labeled alternative in {@link
   * ArabicBASICParser#variable}.
   *
   * @param ctx the parse tree
   */
  void enterName(ArabicBASICParser.NameContext ctx);
  /**
   * Exit a parse tree produced by the {@code name} labeled alternative in {@link
   * ArabicBASICParser#variable}.
   *
   * @param ctx the parse tree
   */
  void exitName(ArabicBASICParser.NameContext ctx);
  /**
   * Enter a parse tree produced by the {@code int} labeled alternative in {@link
   * ArabicBASICParser#variable}.
   *
   * @param ctx the parse tree
   */
  void enterInt(ArabicBASICParser.IntContext ctx);
  /**
   * Exit a parse tree produced by the {@code int} labeled alternative in {@link
   * ArabicBASICParser#variable}.
   *
   * @param ctx the parse tree
   */
  void exitInt(ArabicBASICParser.IntContext ctx);
  /**
   * Enter a parse tree produced by the {@code text} labeled alternative in {@link
   * ArabicBASICParser#variable}.
   *
   * @param ctx the parse tree
   */
  void enterText(ArabicBASICParser.TextContext ctx);
  /**
   * Exit a parse tree produced by the {@code text} labeled alternative in {@link
   * ArabicBASICParser#variable}.
   *
   * @param ctx the parse tree
   */
  void exitText(ArabicBASICParser.TextContext ctx);
  /**
   * Enter a parse tree produced by the {@code float} labeled alternative in {@link
   * ArabicBASICParser#variable}.
   *
   * @param ctx the parse tree
   */
  void enterFloat(ArabicBASICParser.FloatContext ctx);
  /**
   * Exit a parse tree produced by the {@code float} labeled alternative in {@link
   * ArabicBASICParser#variable}.
   *
   * @param ctx the parse tree
   */
  void exitFloat(ArabicBASICParser.FloatContext ctx);
}
