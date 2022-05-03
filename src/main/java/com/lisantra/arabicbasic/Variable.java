package com.lisantra.arabicbasic;

/** */
public class Variable {
  /**
   *
   */
  private final Symbol symbol;

  /**
   *
   */
  private Value value;

  /**
   * @param symbol
   * @param value
   */
  public Variable(Symbol symbol, Value value) {
    this.symbol = symbol;
    this.value = value;
  }

  /**
   * @return
   */
  public Symbol getSymbol() {
    return symbol;
  }

  /**
   * @return
   */
  public Value<?> getValue() {
    return value;
  }

  /**
   * @param value
   */
  public void setValue(Value value) {
    this.value = value;
  }

  /**
   * @return
   */
  @Override
  public String toString() {
    return value.getVal().toString();
  }
}
