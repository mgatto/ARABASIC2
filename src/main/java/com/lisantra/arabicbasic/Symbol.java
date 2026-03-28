package com.lisantra.arabicbasic;

/**
 * Super type for all symbols in the ArabicBASIC language.
 *
 * <p>Sealed so all symbol kinds are known at compile time; add new kinds by extending this type
 * and listing them in {@code permits}, then handle them in any exhaustive {@code switch} on
 * {@code Symbol}.
 */
public sealed abstract class Symbol permits VariableSymbol, FunctionSymbol, LabelSymbol {
  /** */
  private final String name;

  /**
   * @param name
   */
  public Symbol(String name) {
    this.name = name;
  }

  /**
   * @return
   */
  public String getName() {
    return name;
  }

  /**
   * @return
   */
  @Override
  public String toString() {
    return "Symbol{" + "name='" + name + '\'' + ", type=" + this.getClass() + '}';
  }
}
