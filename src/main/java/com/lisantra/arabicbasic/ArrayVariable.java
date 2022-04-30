package com.lisantra.arabicbasic;

import java.util.ArrayList;

// TODO maybe THIS should be parameterized with the type of the Value's val or type of it's
// elements if ArrayList
public class ArrayVariable extends Variable {
  private final int lowerBound = 0;
  private int upperBound;

  /**
   * @param symbol
   * @param value
   */
  public ArrayVariable(Symbol symbol, Value value) {
    super(symbol, value);
    this.upperBound = ((ArrayList<?>) value.getVal()).size() - 1;
  }

  /**
   * @return
   */
  public int getUpperBound() {
    return upperBound;
  }

  public void setUpperBound(int upperBound) {
    this.upperBound = upperBound;
  }

  @Override
  public String toString() {
    // TODO replace with just symbol and it's new toString() method is automatically called in a
    // String context

    String symbolType = this.getSymbol().getClass().getSimpleName();

    StringBuilder sb = new StringBuilder("[" + symbolType);
    if (symbolType == "ArraySymbol") {
      sb.append("of capacity: " + (getUpperBound() - 1));
    }
    sb.append("] having \" + value.getVal()");

    return sb.toString();
  }
}
