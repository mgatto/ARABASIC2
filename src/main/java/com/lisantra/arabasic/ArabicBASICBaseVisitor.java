package com.lisantra.arabasic; // Generated from
                               // /Users/mgatto/Development/cs-361/ARABASIC2/src/main/antlr4/ArabicBASIC.g4 by ANTLR 4.9.2

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link ArabicBASICVisitor}, which can be extended
 * to create a visitor which only needs to handle a subset of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for operations with no return
 *     type.
 */
public class ArabicBASICBaseVisitor<T> extends AbstractParseTreeVisitor<T>
    implements ArabicBASICVisitor<T> {
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
   * ctx}.
   */
  @Override
  public T visitStart(ArabicBASICParser.StartContext ctx) {
    return visitChildren(ctx);
  }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
   * ctx}.
   */
  @Override
  public T visitStatement(ArabicBASICParser.StatementContext ctx) {
    return visitChildren(ctx);
  }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
   * ctx}.
   */
  @Override
  public T visitNull_statement(ArabicBASICParser.Null_statementContext ctx) {
    return visitChildren(ctx);
  }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
   * ctx}.
   */
  @Override
  public T visitAssignment(ArabicBASICParser.AssignmentContext ctx) {
    return visitChildren(ctx);
  }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
   * ctx}.
   */
  @Override
  public T visitComment(ArabicBASICParser.CommentContext ctx) {
    return visitChildren(ctx);
  }
}
