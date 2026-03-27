package com.lisantra.arabicbasic;

/** Types a variable's symbol as being a function. */
public class FunctionSymbol extends Symbol {

  /**
   * Constructor.
   *
   * @param name The name of the function, whether user defined or built-in to the language.
   */
  public FunctionSymbol(String name) {
    super(name);
  }
}
