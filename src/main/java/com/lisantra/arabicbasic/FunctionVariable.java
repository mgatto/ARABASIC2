package com.lisantra.arabicbasic;

// TODO maybe THIS should be parameterized with the type of the Value's val or type of it's
// elements if ArrayList
public class FunctionVariable extends Variable {
  private String argSymbol = null;
  private ArabicBASICParser.ExpressionContext body = null;

  public FunctionVariable(
      Symbol symbol, Value value, String argSymbol, ArabicBASICParser.ExpressionContext body) {
    super(symbol, value);
    this.body = body;
    this.argSymbol = argSymbol;
  }

  public ArabicBASICParser.ExpressionContext getbody() {
    return body;
  }

  public void setBody(ArabicBASICParser.ExpressionContext body) {
    this.body = body;
  }

  public String getArg() {
    return argSymbol;
  }

  public void setArg(String arg) {
    this.argSymbol = arg;
  }

  /**
   * @return function name, parameter, and body as source text (not parse-tree internals).
   */
  @Override
  public String toString() {
    String fn = getSymbol() != null ? getSymbol().getName() : "?";
    String arg = getArg() != null ? getArg() : "?";
    String expr = body != null ? body.getText() : "?";
    return "["
        + getSymbol().getClass().getSimpleName()
        + " "
        + fn
        + "] arg '"
        + arg
        + "' -> "
        + expr;
  }
}
