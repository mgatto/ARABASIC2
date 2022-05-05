package com.lisantra.arabicbasic;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class BASICErrorListener extends BaseErrorListener {
  public static final BASICErrorListener INSTANCE = new BASICErrorListener();

  @Override
  public void syntaxError(
      Recognizer<?, ?> recognizer,
      Object offendingSymbol,
      int line,
      int column,
      String message,
      RecognitionException re)
      throws ParseCancellationException {

    String sourceName = recognizer.getInputStream().getSourceName();
    //    re.getCtx().getText(); seems to be null often...
    // From docs: "The RecognitionException is non-null for all syntax errors except when we
    // discover mismatched token errors that we can recover from in-line, without returning from the
    // surrounding rule (via the single token insertion and deletion mechanism)."

    if (!sourceName.isEmpty()) {
      sourceName =
          String.format(
              "Error in BASIC file %s on line %d at character %d:", sourceName, line, column);
    }

    throw new ParseCancellationException(sourceName + " " + message + ".");
    /*
    List<String> stack = ((Parser) recognizer).getRuleInvocationStack();
    Collections.reverse(stack);
     */
  }
}
