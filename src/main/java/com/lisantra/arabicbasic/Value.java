package com.lisantra.arabicbasic;

/** */
public class Value {
  private Object val;
  private String originalType;

  /**
   * Constructor.
   *
   * @param val
   * @param originalType
   */
  public Value(Object val, String originalType) {
    this.val = val;
    this.originalType = originalType; // TODO this really should be an enum
  }

  /**
   * @return
   */
  public Object getVal() {
    //  if it's a string, strip the quotes
    if (val instanceof String) {
      return ((String) val).replaceAll("^\"|\"$", "");
    }

    return val;
  }

  /**
   * @param val
   */
  public void setVal(Object val) {
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
   * Needed for updating an Array's element type
   *
   * @return
   */
  public void setOriginalType(String type) {
    originalType = type;
  }

  /**
   * @return
   */
  @Override
  public String toString() {
    return "Value{type=<" + originalType + ">, val=<" + val + ">}";
  }
}
