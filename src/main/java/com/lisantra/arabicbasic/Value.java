package com.lisantra.arabicbasic;

public class Value<T> {
  private T val; // we need to mutate it for unary expressions!
  final String originalType;

  public Value(T val, String originalType) {
    this.val = val;
    this.originalType = originalType; // TODO this really should be an enum
  }

  public T getVal() {
    return val;
  }

  public void setVal(T val) {
    this.val = val;
  }

  // TODO this will be useful for formatting printing
  public String getOriginalType() {
    return originalType;
  }

  @Override
  public String toString() {
    return "Value{"
        // + "val="
        + val
        // + ", type='"
        // + originalType
        // + '\''
        // + ", attributes="
        // + attributes
        + '}';
  }
}
