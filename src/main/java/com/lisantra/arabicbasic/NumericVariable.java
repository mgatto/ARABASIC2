package com.lisantra.arabicbasic;

/** Represents a variable whose value is either an INTEGER or REAL. A subclass of Variable. */
public class NumericVariable extends Variable {

  /**
   * Constructor.
   *
   * @param symbol The variable's name.
   * @param value The variable's content.
   */
  public NumericVariable(Symbol symbol, Value value) {
    super(symbol, value);
  }
}
