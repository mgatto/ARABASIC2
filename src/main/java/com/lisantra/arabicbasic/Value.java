package com.lisantra.arabicbasic;

import java.util.Map;

public class Value<T> {
  private T val; // we need to mutate it for unary expressions!
  final String originalType;

  private Map<String, String> attributes; // not final

  public Value(T val, String type) {
    this.val = val;
    this.originalType = type;
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

  public String getAttribute(String key) {
    // TODO check that key exists?
    return attributes.get(key);
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
