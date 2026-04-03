package com.lisantra.arabicbasic;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/** Represents a variable whose value is a stack container. */
public class StackVariable extends Variable {

  public StackVariable(Symbol symbol, Value value) {
    super(symbol, value);
  }

  public StackVariable(Symbol symbol, Value value, DeclarationSite sourceWriteSite) {
    super(symbol, value, sourceWriteSite);
  }

  @SuppressWarnings("unchecked")
  public Deque<Value> stack() {
    Object raw = getValue().getVal();

    if (raw instanceof Deque) {
      return (Deque<Value>) raw;
    }

    if (raw instanceof List<?> list) {
      ArrayDeque<Value> converted = new ArrayDeque<>();
      for (Object e : list) {
        if (e instanceof Value v) {
          converted.addLast(v);
        }
      }

      return converted;
    }
    throw new IllegalStateException("StackVariable requires Deque<Value> backing content");
  }
}
