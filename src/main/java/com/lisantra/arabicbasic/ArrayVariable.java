package com.lisantra.arabicbasic;

import java.util.List;

// TODO maybe THIS should be parameterized with the type of the Value's val or type of it's
// elements if ArrayList
public class ArrayVariable extends Variable {
  /** Inclusive minimum index; ArabicBASIC arrays are currently zero-based. */
  private final int lowerBound = 0;

  /** Inclusive maximum valid index (aligned with {@code InterpreterVisitor#visitArrayCreation}). */
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

  public int getLowerBound() {
    return lowerBound;
  }

  /**
   * @return inclusive max index of the array
   */
  public int getUpperBound() {
    return upperBound;
  }

  /**
   * @param upperBound inclusive max index (for {@code n} elements, use {@code n - 1}, or {@code 0}
   *     when empty)
   */
  public void setUpperBound(int upperBound) {
    this.upperBound = upperBound;
  }

  /**
   * Number of element slots in the backing list. Prefer list size when present so it stays correct
   * even if bounds were not yet set.
   */
  public int getCapacity() {
    Object v = getValue().getVal();

    if (v instanceof List) {
      return ((List<?>) v).size();
    }

    if (upperBound >= lowerBound) {
      return upperBound - lowerBound + 1;
    }

    return 0;
  }

  /**
   * @return A printout of the array's name and its capacity.
   */
  @Override
  public String toString() {
    // TODO replace with just symbol and it's new toString() method is automatically called in a

    String symbolType = this.getSymbol().getClass().getSimpleName();

    StringBuilder sb = new StringBuilder("[" + symbolType);
    sb.append(" of capacity: ").append(getCapacity());
    sb.append("] having ").append(this.getValue().getVal());

    return sb.toString();
  }
}
