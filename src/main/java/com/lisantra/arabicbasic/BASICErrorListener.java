package com.lisantra.arabicbasic;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class BASICErrorListener extends BaseErrorListener {
  @Override
  public void syntaxError(
      Recognizer<?, ?> recognizer,
      Object offendingSymbol,
      int line,
      int column,
      String message,
      RecognitionException re) {}
}
