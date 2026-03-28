package com.lisantra.arabicbasic;

import java.util.Objects;

/**
 * Symbol for a variable name, including where that name was introduced in source when known.
 */
public final class VariableSymbol extends Symbol {

  private final DeclarationSite declarationSite;

  /**
   * @param name Name of the string or numeric variable's symbol.
   * @param declarationSite Source position of the introducing identifier, or {@link
   *     DeclarationSite#UNKNOWN}.
   */
  public VariableSymbol(String name, DeclarationSite declarationSite) {
    super(name);
    this.declarationSite = Objects.requireNonNull(declarationSite);
  }

  public DeclarationSite getDeclarationSite() {
    return declarationSite;
  }

  @Override
  public String toString() {
    if (declarationSite.isUnknown()) {
      return super.toString();
    }
    return "VariableSymbol{name='"
        + getName()
        + '\''
        + ", declarationSite="
        + declarationSite
        + '}';
  }
}
