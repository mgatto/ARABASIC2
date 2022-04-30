package com.lisantra.arabicbasic;

import java.util.Map;

public class Value<T> {
  private T val; // we need to mutate it for unary expressions!
  final String originalType;

  private Map<String, String> valueAttr; // not final

  public Value(T val, String type) {
    this.val = val;
    this.originalType = type; // TODO this really should be an enum
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

  // TODO should probably abstract attr out into it's own class
  public String getValueAttribute(String key) {
    // TODO check that key exists?
    return valueAttr.get(key);
  }

  public void addAttrForValue(String key, String value) {
    valueAttr.put(key, value);
  }

  public void resetAttrForValue(String key, String value) {
    valueAttr.put(key, value);
  }

  public void removeAttrFromValue(String key) {
    valueAttr.remove(key);
  }

  public void clearAllValueAttrs() {
    valueAttr.clear();
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
