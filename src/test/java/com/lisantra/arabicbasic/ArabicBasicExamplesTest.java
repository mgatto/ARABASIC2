package com.lisantra.arabicbasic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

/** Smoke tests for Arabic-syntax programs under {@code examples/} (run from module root). */
class ArabicBasicExamplesTest {

  private static Path example(String name) {
    return Paths.get(System.getProperty("user.dir")).resolve("examples").resolve(name);
  }

  private static String runCapturingStdout(Path script, boolean debug, InputStream stdin) {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    PrintStream outPrev = System.out;
    InputStream inPrev = System.in;
    try {
      System.setOut(new PrintStream(out, true, StandardCharsets.UTF_8));
      System.setIn(stdin);
      int code = App.runScript(script, debug);
      assertEquals(0, code, "script: " + script);
      return out.toString(StandardCharsets.UTF_8);
    } finally {
      System.setOut(outPrev);
      System.setIn(inPrev);
    }
  }

  @Test
  void conditionalAr_printsAffirmation() {
    Path script = example("CONDITIONAL_Ar.bas");
    assumeTrue(Files.isRegularFile(script), "missing " + script);
    String output = runCapturingStdout(script, false, InputStream.nullInputStream());
    assertTrue(output.contains("نعم"), () -> "stdout: " + output);
  }

  @Test
  void loopAr_printsTenLines() {
    Path script = example("LOOP_Ar.bas");
    assumeTrue(Files.isRegularFile(script), "missing " + script);
    String output = runCapturingStdout(script, false, InputStream.nullInputStream());
    assertTrue(output.lines().count() >= 10, () -> "stdout: " + output);
  }

  @Test
  void inputAr_runsWithStdin() {
    Path script = example("INPUT_Ar.bas");
    assumeTrue(Files.isRegularFile(script), "missing " + script);
    InputStream in =
        new ByteArrayInputStream("4\n".getBytes(StandardCharsets.UTF_8));
    String output = runCapturingStdout(script, false, in);
    assertTrue(output.length() > 0, () -> "stdout: " + output);
  }
}
