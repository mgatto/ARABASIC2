package com.lisantra.arabicbasic;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.Collections;
import java.util.List;

public class BASICErrorListener extends BaseErrorListener {
  @Override
  public void syntaxError(
      Recognizer<?, ?> recognizer,
      Object offendingSymbol,
      int line,
      int column,
      String message,
      RecognitionException re) {

    List<String> stack = ((Parser) recognizer).getRuleInvocationStack();
    Collections.reverse(stack);

    System.err.println("rule stack: " + stack);
    System.err.println("line " + line + ": " + column + " at " + offendingSymbol + ": " + message);
  }
}
