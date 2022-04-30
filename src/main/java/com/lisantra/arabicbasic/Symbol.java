package com.lisantra.arabicbasic;

import java.util.HashMap;

public abstract class Symbol {
  private final String name;
  public HashMap<String, String> attributes;

  //  public static final int VARIABLE = 0, CONTAINER = 1, FUNCTION = 2;

  public Symbol(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void addAttrForSymbol(String key, String value) {
    attributes.put(key, value);
  }

  public void resetAttrForSymbol(String key, String value) {
    attributes.put(key, value);
  }

  public String getSymbolAttribute(String key) {
    // TODO check that key exists?
    return attributes.get(key);
  }

  public void removeAttrFromSymbol(String key) {
    attributes.remove(key);
  }

  public void clearAllSymbolAttrs() {
    attributes.clear();
  }

  @Override
  public String toString() {
    return "Symbol{"
        + "name='"
        + name
        + '\''
        + ", type="
        + this.getClass()
        + ", attributes="
        + attributes
        + '}';
  }
}
