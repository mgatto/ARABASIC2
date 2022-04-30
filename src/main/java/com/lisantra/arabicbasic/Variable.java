package com.lisantra.arabicbasic;

// import static org.graalvm.compiler.nodeinfo.InputType.Value;

// TOSO abstract this and make concrete subclasses: Array | ContainerVariable, SimpleVariable

public class Variable<T> {
  private final Symbol symbol;
  private Value<T> value;

  /**
   * @param symbol
   * @param value
   */
  public Variable(Symbol symbol, Value<T> value) {
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
  public Value<T> getValue() {
    return value;
  }

  /**
   * @param value
   */
  public void setValue(Value<T> value) {
    this.value = value;
  }

  @Override
  public String toString() {
    // TODO replace with just symbol and it's new toString() method is automatically called in a
    // String context
    return " [is a " + symbol.getClass().getSimpleName() + "] having " + value.getVal();
  }
}
