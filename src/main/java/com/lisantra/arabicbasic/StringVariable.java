package com.lisantra.arabicbasic;

/** Represents a variable whose value is a String. A subclass of Variable. */
public class StringVariable extends Variable {
  /** A proxy for java.lang.String.length. Intended */
  private int length = 0;

  /**
   * Constructor.
   *
   * @param symbol The variable's name.
   * @param value The variable's content.
   */
  public StringVariable(Symbol symbol, Value value) {
    super(symbol, value);
    /* visitText() ensures the value is only a String */
    length = ((String) value.getVal()).length();
  }

  /**
   * Accessor for the String value.
   *
   * @return int The length of the string.
   */
  public int getLength() {
    return length;
  }
}
