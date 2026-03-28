package com.lisantra.arabicbasic;

import java.util.Objects;

/** Represents a variable whose value is a String. A subclass of Variable. */
public class StringVariable extends Variable {

  /**
   * Constructor.
   *
   * @param symbol The variable's name.
   * @param value The variable's content; {@link Value#getVal()} must be a non-null {@link String}.
   */
  public StringVariable(Symbol symbol, Value value) {
    super(symbol, Objects.requireNonNull(value, "value"));
    validatedStringLength(value);
  }

  /**
   * @return the length of the current string in {@link #getValue()} (same rules as construction)
   */
  public int getLength() {
    return validatedStringLength(getValue());
  }

  private static int validatedStringLength(Value value) {
    Objects.requireNonNull(value, "value");
    Object raw = value.getVal();
    if (raw == null) {
      throw new IllegalArgumentException("StringVariable requires a non-null string (getVal() was null)");
    }
    if (!(raw instanceof String)) {
      throw new IllegalArgumentException(
          "StringVariable requires String content, got "
              + raw.getClass().getName()
              + " (originalType="
              + value.getOriginalType()
              + ")");
    }
    return ((String) raw).length();
  }
}
