package com.lisantra.arabicbasic;

public abstract class Symbol {
  private final String name;

  public Symbol(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Symbol{" + "name='" + name + '\'' + ", type=" + this.getClass() + '}';
  }
}
