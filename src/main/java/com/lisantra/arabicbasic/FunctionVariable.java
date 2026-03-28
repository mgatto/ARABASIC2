package com.lisantra.arabicbasic;

import java.util.Objects;

// TODO maybe THIS should be parameterized with the type of the Value's val or type of its elements if ArrayList
public class FunctionVariable extends Variable {
  private final String argSymbol;
  private final ArabicBASICParser.ExpressionContext body;

  public FunctionVariable(
      Symbol symbol, Value value, String argSymbol, ArabicBASICParser.ExpressionContext body) {
    super(Objects.requireNonNull(symbol, "symbol"), Objects.requireNonNull(value, "value"));
    String arg = Objects.requireNonNull(argSymbol, "argSymbol");
    if (arg.isBlank()) {
      throw new IllegalArgumentException("argSymbol must not be blank");
    }
    this.argSymbol = arg;
    this.body = Objects.requireNonNull(body, "body");
  }

  public ArabicBASICParser.ExpressionContext getBody() {
    return body;
  }

  public String getArg() {
    return argSymbol;
  }

  /**
   * @return function name, parameter, and body as source text (not parse-tree internals).
   */
  @Override
  public String toString() {
    return "["
        + getSymbol().getClass().getSimpleName()
        + " "
        + getSymbol().getName()
        + "] arg '"
        + argSymbol
        + "' -> "
        + body.getText();
  }
}
