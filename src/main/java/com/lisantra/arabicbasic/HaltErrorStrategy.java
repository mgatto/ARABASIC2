package com.lisantra.arabicbasic;

import org.antlr.v4.runtime.*;

public class HaltErrorStrategy extends DefaultErrorStrategy {
  @Override
  public void recover(Parser recognizer, RecognitionException re) {
    throw new RuntimeException(re);
  }

  @Override
  public Token recoverInline(Parser recognizer) throws RecognitionException {
    throw new RuntimeException(new InputMismatchException(recognizer));
  }

  @Override
  public void sync(Parser recognizer) {
    // do nothing
  }
}
