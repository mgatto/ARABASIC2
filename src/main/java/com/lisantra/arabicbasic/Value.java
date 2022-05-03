package com.lisantra.arabicbasic;

/**
 * @param <T>
 */
public class Value<T> {
  private T val;
  final String originalType;

  /**
   * Constructor.
   *
   * @param val
   * @param originalType
   */
  public Value(T val, String originalType) {
    this.val = val;
    this.originalType = originalType; // TODO this really should be an enum
  }

  /**
   * @return
   */
  public T getVal() {
    return val;
  }

  /**
   * @param val
   */
  public void setVal(T val) {
    this.val = val;
  }

  /**
   * will be useful for formatting printing
   *
   * @return
   */
  public String getOriginalType() {
    return originalType;
  }

  /**
   * @return
   */
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
