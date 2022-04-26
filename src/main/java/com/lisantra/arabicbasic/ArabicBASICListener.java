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
   * Enter a parse tree produced by the {@code arrayCreate} labeled alternative in {@link
   * ArabicBASICParser#expression}.
   *
   * @param ctx the parse tree
   */
  void enterArrayCreate(ArabicBASICParser.ArrayCreateContext ctx);
  /**
   * Exit a parse tree produced by the {@code arrayCreate} labeled alternative in {@link
   * ArabicBASICParser#expression}.
   *
   * @param ctx the parse tree
   */
  void exitArrayCreate(ArabicBASICParser.ArrayCreateContext ctx);
  /**
   * Enter a parse tree produced by the {@code addsub} labeled alternative in {@link
   * ArabicBASICParser#expression}.
   *
   * @param ctx the parse tree
   */
  void enterAddsub(ArabicBASICParser.AddsubContext ctx);
  /**
   * Exit a parse tree produced by the {@code addsub} labeled alternative in {@link
   * ArabicBASICParser#expression}.
   *
   * @param ctx the parse tree
   */
  void exitAddsub(ArabicBASICParser.AddsubContext ctx);
  /**
   * Enter a parse tree produced by the {@code term} labeled alternative in {@link
   * ArabicBASICParser#expression}.
   *
   * @param ctx the parse tree
   */
  void enterTerm(ArabicBASICParser.TermContext ctx);
  /**
   * Exit a parse tree produced by the {@code term} labeled alternative in {@link
   * ArabicBASICParser#expression}.
   *
   * @param ctx the parse tree
   */
  void exitTerm(ArabicBASICParser.TermContext ctx);
  /**
   * Enter a parse tree produced by the {@code arrayAccess} labeled alternative in {@link
   * ArabicBASICParser#expression}.
   *
   * @param ctx the parse tree
   */
  void enterArrayAccess(ArabicBASICParser.ArrayAccessContext ctx);
  /**
   * Exit a parse tree produced by the {@code arrayAccess} labeled alternative in {@link
   * ArabicBASICParser#expression}.
   *
   * @param ctx the parse tree
   */
  void exitArrayAccess(ArabicBASICParser.ArrayAccessContext ctx);
  /**
   * Enter a parse tree produced by the {@code unary} labeled alternative in {@link
   * ArabicBASICParser#expression}.
   *
   * @param ctx the parse tree
   */
  void enterUnary(ArabicBASICParser.UnaryContext ctx);
  /**
   * Exit a parse tree produced by the {@code unary} labeled alternative in {@link
   * ArabicBASICParser#expression}.
   *
   * @param ctx the parse tree
   */
  void exitUnary(ArabicBASICParser.UnaryContext ctx);
  /**
   * Enter a parse tree produced by the {@code nested} labeled alternative in {@link
   * ArabicBASICParser#expression}.
   *
   * @param ctx the parse tree
   */
  void enterNested(ArabicBASICParser.NestedContext ctx);
  /**
   * Exit a parse tree produced by the {@code nested} labeled alternative in {@link
   * ArabicBASICParser#expression}.
   *
   * @param ctx the parse tree
   */
  void exitNested(ArabicBASICParser.NestedContext ctx);
  /**
   * Enter a parse tree produced by the {@code exponentation} labeled alternative in {@link
   * ArabicBASICParser#expression}.
   *
   * @param ctx the parse tree
   */
  void enterExponentation(ArabicBASICParser.ExponentationContext ctx);
  /**
   * Exit a parse tree produced by the {@code exponentation} labeled alternative in {@link
   * ArabicBASICParser#expression}.
   *
   * @param ctx the parse tree
   */
  void exitExponentation(ArabicBASICParser.ExponentationContext ctx);
  /**
   * Enter a parse tree produced by the {@code muldiv} labeled alternative in {@link
   * ArabicBASICParser#expression}.
   *
   * @param ctx the parse tree
   */
  void enterMuldiv(ArabicBASICParser.MuldivContext ctx);
  /**
   * Exit a parse tree produced by the {@code muldiv} labeled alternative in {@link
   * ArabicBASICParser#expression}.
   *
   * @param ctx the parse tree
   */
  void exitMuldiv(ArabicBASICParser.MuldivContext ctx);
  /**
   * Enter a parse tree produced by the {@code size} labeled alternative in {@link
   * ArabicBASICParser#array_size}.
   *
   * @param ctx the parse tree
   */
  void enterSize(ArabicBASICParser.SizeContext ctx);
  /**
   * Exit a parse tree produced by the {@code size} labeled alternative in {@link
   * ArabicBASICParser#array_size}.
   *
   * @param ctx the parse tree
   */
  void exitSize(ArabicBASICParser.SizeContext ctx);
  /**
   * Enter a parse tree produced by {@link ArabicBASICParser#array_creation}.
   *
   * @param ctx the parse tree
   */
  void enterArray_creation(ArabicBASICParser.Array_creationContext ctx);
  /**
   * Exit a parse tree produced by {@link ArabicBASICParser#array_creation}.
   *
   * @param ctx the parse tree
   */
  void exitArray_creation(ArabicBASICParser.Array_creationContext ctx);
  /**
   * Enter a parse tree produced by {@link ArabicBASICParser#array_expression}.
   *
   * @param ctx the parse tree
   */
  void enterArray_expression(ArabicBASICParser.Array_expressionContext ctx);
  /**
   * Exit a parse tree produced by {@link ArabicBASICParser#array_expression}.
   *
   * @param ctx the parse tree
   */
  void exitArray_expression(ArabicBASICParser.Array_expressionContext ctx);
  /**
   * Enter a parse tree produced by {@link ArabicBASICParser#array_access}.
   *
   * @param ctx the parse tree
   */
  void enterArray_access(ArabicBASICParser.Array_accessContext ctx);
  /**
   * Exit a parse tree produced by {@link ArabicBASICParser#array_access}.
   *
   * @param ctx the parse tree
   */
  void exitArray_access(ArabicBASICParser.Array_accessContext ctx);
  /**
   * Enter a parse tree produced by {@link ArabicBASICParser#block}.
   *
   * @param ctx the parse tree
   */
  void enterBlock(ArabicBASICParser.BlockContext ctx);
  /**
   * Exit a parse tree produced by {@link ArabicBASICParser#block}.
   *
   * @param ctx the parse tree
   */
  void exitBlock(ArabicBASICParser.BlockContext ctx);
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
   * Enter a parse tree produced by the {@code numeric} labeled alternative in {@link
   * ArabicBASICParser#variable}.
   *
   * @param ctx the parse tree
   */
  void enterNumeric(ArabicBASICParser.NumericContext ctx);
  /**
   * Exit a parse tree produced by the {@code numeric} labeled alternative in {@link
   * ArabicBASICParser#variable}.
   *
   * @param ctx the parse tree
   */
  void exitNumeric(ArabicBASICParser.NumericContext ctx);
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
   * Enter a parse tree produced by {@link ArabicBASICParser#number}.
   *
   * @param ctx the parse tree
   */
  void enterNumber(ArabicBASICParser.NumberContext ctx);
  /**
   * Exit a parse tree produced by {@link ArabicBASICParser#number}.
   *
   * @param ctx the parse tree
   */
  void exitNumber(ArabicBASICParser.NumberContext ctx);
}
