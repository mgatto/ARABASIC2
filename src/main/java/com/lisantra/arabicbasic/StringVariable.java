package com.lisantra.arabicbasic;

public class StringVariable extends Variable {
  private int length = 0;
  /**
   * @param symbol
   * @param value
   */
  public StringVariable(Symbol symbol, Value value) {
    super(symbol, value);
    length = ((String) value.getVal()).length();
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }
}
