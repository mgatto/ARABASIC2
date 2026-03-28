package com.lisantra.arabicbasic;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

/**
 * Source position where a name was introduced (ANTLR: 1-based line, 0-based column index).
 *
 * <p>Use {@link #UNKNOWN} when there is no corresponding source token (e.g. a synthetic binding).
 */
public record DeclarationSite(int line, int charPositionInLine) {

  /** Placeholder when the symbol is not tied to a lexer token in the current file. */
  public static final DeclarationSite UNKNOWN = new DeclarationSite(-1, -1);

  public static DeclarationSite from(Token token) {
    return new DeclarationSite(token.getLine(), token.getCharPositionInLine());
  }

  /**
   * Best-effort site from a parse-tree node (uses the node's start token).
   *
   * @return {@link #UNKNOWN} if {@code ctx} or its start token is null.
   */
  public static DeclarationSite from(ParserRuleContext ctx) {
    if (ctx == null) {
      return UNKNOWN;
    }
    Token t = ctx.getStart();
    return t == null ? UNKNOWN : from(t);
  }

  public boolean isUnknown() {
    return line < 0;
  }

  /**
   * Prefix for user-facing diagnostics ({@code ""} when unknown). Column is 1-based for humans.
   */
  public String formatPrefix() {
    if (isUnknown()) {
      return "";
    }
    return "line "
        + line
        + ", column "
        + (charPositionInLine + 1)
        + ": ";
  }
}
