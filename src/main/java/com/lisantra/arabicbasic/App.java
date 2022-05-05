package com.lisantra.arabicbasic;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import picocli.CommandLine;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;

@CommandLine.Command(
    name = "run",
    mixinStandardHelpOptions = true,
    version = "0.3",
    description =
        "Runs a script written in ArabicBASIC and prints results of computations to STDOUT.")
public class App implements Callable<Integer> {
  @CommandLine.Parameters(
      index = "0",
      description = "The file containing ArabicBASIC lines of code.")
  private File file;

  @CommandLine.Option(
      names = {"-w", "--writing-system"},
      description = "Arabic or Latin")
  private String writingSystem = "Arabic";
  // or Latin for later expansion to alternative Arabic writing systems

  @CommandLine.Option(
      names = {"-m", "--mode"},
      description = "interpret or compile (LLVM's IR, .NET IR, Java bytecode, WASM)")
  private String mode = "interpret";

  // valid only for compile
  private String output = "";

  @CommandLine.Option(
      names = {"-d", "--debug"},
      description = "Print out the symbol table after running an ArabicBASIC script")
  private boolean showDebug = false;

  /**
   * Runs the main interpreter from the command line.
   *
   * @return A system exit code
   * @throws Exception
   */
  @Override
  public Integer call() throws Exception {
    Map<String, Variable> symbolTable = new LinkedHashMap<>();
    // TODO rename to (Global?)Scope ? NO, actually it needs to be separate! A symbol table with ALL
    // symbols
    // and a scope table for holding current state of all variables!

    // create an input stream from the string
    ArabicBASICLexer lexer = new ArabicBASICLexer(CharStreams.fromPath(file.toPath()));
    ArabicBASICParser parser = new ArabicBASICParser(new CommonTokenStream(lexer));

    lexer.removeErrorListeners();
    lexer.addErrorListener(BASICErrorListener.INSTANCE);
    parser.removeErrorListeners();
    parser.addErrorListener(BASICErrorListener.INSTANCE);
    //    parser.setErrorHandler(new BailErrorStrategy());
    //    parser.setErrorHandler(new HaltErrorStrategy());

    try {
      /* Instantiate the parse tree */
      ParseTree programTree = parser.program();

      /* Instantiate my visitor class, which is the actual interpreter */
      CustomVisitor interpreter = new CustomVisitor(symbolTable, showDebug);

      /* Cause the interpreter to walk the parse tree */
      interpreter.visit(programTree);
    } catch (Exception e) {
      System.err.println(e.getMessage());
      return 1;
    }

    if (showDebug) System.out.println(symbolTable);
    if (showDebug) System.out.println("Finished running ArabicBASIC script");

    return 0;
  }

  /**
   * Main entry point.
   *
   * @param args Array of command-line arguments
   */
  public static void main(String... args) {
    int exitCode = new CommandLine(new App()).execute(args);
    System.exit(exitCode);
  }
}
