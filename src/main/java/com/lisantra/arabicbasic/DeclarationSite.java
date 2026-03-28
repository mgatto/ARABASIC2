package com.lisantra.arabicbasic;

import org.antlr.v4.runtime.Token;

/**
 * Source position where a name was introduced (ANTLR: 1-based line, 0-based column).
 *
 * <p>Use {@link #UNKNOWN} when there is no corresponding source token (e.g. a synthetic binding).
 */
public record DeclarationSite(int line, int charPositionInLine) {

  /** Placeholder when the symbol is not tied to a lexer token in the current file. */
  public static final DeclarationSite UNKNOWN = new DeclarationSite(-1, -1);

  public static DeclarationSite from(Token token) {
    return new DeclarationSite(token.getLine(), token.getCharPositionInLine());
  }

  public boolean isUnknown() {
    return line < 0;
  }
}
