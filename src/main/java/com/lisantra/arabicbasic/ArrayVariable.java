package com.lisantra.arabicbasic;

// TODO maybe THIS should be parameterized with the type of the Value's val or type of it's
// elements if ArrayList
public class ArrayVariable extends Variable {
  private final int lowerBound = 0;
  private int upperBound;

  /**
   * Constructor
   *
   * @param symbol Name of the array.
   * @param value Content of the array.
   */
  public ArrayVariable(Symbol symbol, Value value) {
    super(symbol, value);
  }

  /**
   * @return int the max index of the array
   */
  public int getUpperBound() {
    return upperBound;
  }

  /**
   *
   * @param upperBound
   */
  public void setUpperBound(int upperBound) {
    this.upperBound = upperBound;
  }

  /**
   * @return A printout of the array's name and its capacity.
   */
  @Override
  public String toString() {
    // TODO replace with just symbol and it's new toString() method is automatically called in a

    String symbolType = this.getSymbol().getClass().getSimpleName();

    StringBuilder sb = new StringBuilder("[" + symbolType);
    if (symbolType == "ArraySymbol") {
      sb.append("of capacity: " + (getUpperBound() - 1));
    }
    sb.append("] having " + this.getValue().getVal());

    return sb.toString();
  }
}
