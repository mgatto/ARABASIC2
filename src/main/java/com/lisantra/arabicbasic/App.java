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

  @Override
  public Integer call() throws Exception { // your business logic goes here...
    // create an input stream from the string
    ArabicBASICLexer lexer = new ArabicBASICLexer(CharStreams.fromPath(file.toPath()));
    //    CommonTokenStream tokens = new CommonTokenStream(lexer);
    ArabicBASICParser parser = new ArabicBASICParser(new CommonTokenStream(lexer));
    ParseTree programTree = parser.program();

    Map<String, Value<?>> symbolTable = new LinkedHashMap<>();

    CustomVisitor interpreter = new CustomVisitor(symbolTable, showDebug);
    interpreter.visit(programTree);
    /*
    try {
    } catch (IOException e) {
        e.printStackTrace();
        return;
    }*/

    if (showDebug) System.out.println(symbolTable);
    System.out.println("Ran ArabicBASIC script");
    return 0;
  }

  public static void main(String... args) {
    int exitCode = new CommandLine(new App()).execute(args);
    System.exit(exitCode);
  }
}
