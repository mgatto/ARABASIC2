package com.lisantra.arabasic;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class App {
  public static final String input = "LET A = 1";

  public static void main(String[] args) {
    // TODO create an input stream from the string

    ArabicBASICLexer lexer = new ArabicBASICLexer(CharStreams.fromString(input));
    ArabicBASICParser parser = new ArabicBASICParser(new CommonTokenStream(lexer));

    ArabicBASICParser.StartContext program = parser.start();

    /*try {
    } catch (IOException e) {
        e.printStackTrace();
        return;
    }*/
  }
}
