package com.lisantra.arabicbasic;

// import static org.graalvm.compiler.nodeinfo.InputType.Value;

// TOSO abstract this and make concrete subclasses: Array | ContainerVariable, SimpleVariable

public class Variable {
  private final Symbol symbol;
  private Value value;

  /**
   * @param symbol
   * @param value
   */
  public Variable(Symbol symbol, Value value) {
    this.symbol = symbol;
    this.value = value;
  }

  /**
   * @return
   */
  public Symbol getSymbol() {
    return symbol;
  }

  /**
   * @return
   */
  public Value<?> getValue() {
    return value;
  }

  /**
   * @param value
   */
  public void setValue(Value value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value.getVal().toString();
  }
}
