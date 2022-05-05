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
    version = "0.2",
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
   * @return
   * @throws Exception
   */
  @Override
  public Integer call() throws Exception { // your business logic goes here...
    Map<String, Variable> symbolTable = new LinkedHashMap<>();
    // TODO rename to (Global?)Scope ?

    // create an input stream from the string
    ArabicBASICLexer lexer = new ArabicBASICLexer(CharStreams.fromPath(file.toPath()));
    ArabicBASICParser parser = new ArabicBASICParser(new CommonTokenStream(lexer));
    parser.setErrorHandler(new HaltErrorStrategy());

    ParseTree programTree = parser.program();

    CustomVisitor interpreter = new CustomVisitor(symbolTable, showDebug);
    interpreter.visit(programTree);

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
