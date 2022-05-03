package com.lisantra.arabicbasic;

/** Super type for all symbols in the ArabicBASIC language. */
public abstract class Symbol {
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
