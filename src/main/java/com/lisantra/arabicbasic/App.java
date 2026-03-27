package com.lisantra.arabicbasic;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTree;
import picocli.CommandLine;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

@CommandLine.Command(
    name = "run",
    mixinStandardHelpOptions = true,
    version = "0.3",
    resourceBundle = "Messages",
    description = "")
public class App implements Callable<Integer> {
  @CommandLine.Parameters(index = "0", descriptionKey = "fileParam")
  private File file;

  @CommandLine.Option(
      names = {"-d", "--debug"},
      descriptionKey = "debug"
      //    description = "Print out the symbol table after running an ArabicBASIC script"
      )
  private boolean showDebug = false;

  /**
   * Runs the main interpreter from the command line.
   *
   * @return A system exit code
   * @throws Exception
   */
  @Override
  public Integer call() throws Exception {
    /* u-nu-Arab is required for arabic digits */
    Locale arabicLocale =
        new Locale.Builder()
            .setLanguage("ar")
            .setExtension(Locale.UNICODE_LOCALE_EXTENSION, "nu-arab")
            .build();

    Locale.setDefault(arabicLocale);

    /* we need separate tables: one for symbols and the other for variable states only = scope */
    /* since BASIC scope is global, we don't need a stack, and a HashMap is great for fast lookup */
    Map<String, Variable> globalScope = new LinkedHashMap<>();
    // TODO wrap in a class: Scope {}? and provide methods like resolve() and define()?
    // If so, then remember that Scope has one Symbol table.

    /* create an input stream from the string */
    ArabicBASICLexer lexer = new ArabicBASICLexer(CharStreams.fromPath(file.toPath()));
    ArabicBASICParser parser = new ArabicBASICParser(new CommonTokenStream(lexer));

    /* my custom error listener is needed for cleaner, and Arabic error messages.
     * However, TODO it throws a cancellation exception even on resolved ambiguities which is
     *           obviously not desirable. */
    //    lexer.removeErrorListeners();
    //    lexer.addErrorListener(BASICErrorListener.INSTANCE);
    //    parser.removeErrorListeners();
    //    parser.addErrorListener(BASICErrorListener.INSTANCE);

    /* listen and warn for ambiguous grammar, but recover and continue if possible */
    if (showDebug) {
      parser.addErrorListener(new DiagnosticErrorListener());
      parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
    }

    try {
      /* Instantiate the parse tree */
      ParseTree programTree = parser.program();

      /* Instantiate my visitor class, which is the actual interpreter */
      InterpreterVisitor interpreter = new InterpreterVisitor(arabicLocale, globalScope, showDebug);

      /* Walk the interpreter through the parse tree */
      interpreter.visit(programTree);
    } catch (Exception e) {
      System.err.println(e.getMessage());
      if (showDebug) e.printStackTrace();
      return 1;
    }

    if (showDebug) System.out.println(globalScope);
    if (showDebug) System.out.println("Finished running ArabicBASIC script");

    /* Be a good Unix system citizen and return a numerical exit code */
    return 0;
  }

  /**
   * Main entry point.
   *
   * @param args Array of command-line arguments
   */
  public static void main(String... args) {
    CommandLine interpreter = new CommandLine(new App());

    // alternate way to add resource bundles
    // interpreter.setResourceBundle(ResourceBundle.getBundle("Messages"));

    int exitCode = interpreter.execute(args);
    System.exit(exitCode);
  }
}
