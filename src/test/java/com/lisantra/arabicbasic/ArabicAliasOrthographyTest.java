package com.lisantra.arabicbasic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.Test;

class ArabicAliasOrthographyTest {

  private static Locale arabicLocale() {
    return new Locale.Builder()
        .setLanguage("ar")
        .setExtension(Locale.UNICODE_LOCALE_EXTENSION, "nu-arab")
        .build();
  }

  private static Map<String, Variable> interpret(String source) {
    Map<String, Variable> globalScope = new LinkedHashMap<>();
    ArabicBASICLexer lexer = new ArabicBASICLexer(CharStreams.fromString(source, "<test>"));
    ArabicBASICParser parser = new ArabicBASICParser(new CommonTokenStream(lexer));
    InterpreterVisitor visitor =
        new InterpreterVisitor(arabicLocale(), Locale.ENGLISH, globalScope, false);
    visitor.visit(parser.program());
    return globalScope;
  }

  private static void assertParses(String source) {
    ArabicBASICLexer lexer = new ArabicBASICLexer(CharStreams.fromString(source, "<test>"));
    ArabicBASICParser parser = new ArabicBASICParser(new CommonTokenStream(lexer));
    parser.program();
    assertEquals(0, parser.getNumberOfSyntaxErrors(), source);
  }

  @Test
  void conditionAndOrAliases_areAcceptedAndExecuted() {
    String source =
        """
        صار س = ٠
        إذا صحيح ثم
        صار س = ١
        ختام اذا
        إذا خطأ أو صحيح ثم
        صار س = ٢
        ختام اذا
        """;
    Map<String, Variable> scope = interpret(source);
    assertEquals(2, ((Double) scope.get("س").getValue().getVal()).intValue());
  }

  @Test
  void logicalOr_noHamzaAlias_au_isAccepted() {
    String source =
        """
        صار س = ٠
        إذا خطأ او صحيح ثم
        صار س = ١
        ختام اذا
        """;
    Map<String, Variable> scope = interpret(source);
    assertEquals(1, ((Double) scope.get("س").getValue().getVal()).intValue());
  }

  @Test
  void functionDefineAndCallAliases_areAccepted() {
    String source =
        """
        دالة ت(س) = س^2
        صار ن = إجري ت(٣)
        """;
    Map<String, Variable> scope = interpret(source);
    assertEquals(9, ((Double) scope.get("ن").getValue().getVal()).intValue());
  }

  @Test
  void stackImperativeAliases_areAcceptedAndExecuted() {
    String source =
        """
        صار س = مكدس()
        صار أ = إدفع(س, ١)
        صار ب = إسحب(س)
        صار ج = أنظر(س)
        """;
    Map<String, Variable> scope = interpret(source);
    assertEquals(1, ((Double) scope.get("أ").getValue().getVal()).intValue());
    assertEquals(1, ((Double) scope.get("ب").getValue().getVal()).intValue());
    assertTrue(scope.get("ج").getValue().getVal() == null);
  }

  @Test
  void arrayFactorySpellingAlias_isAccepted() {
    String source =
        """
        صار م = مصفوفه(٢)
        م[٠] = ٧
        """;
    Map<String, Variable> scope = interpret(source);
    assertTrue(scope.get("م").getValue().getVal() instanceof java.util.List<?>);
  }

  @Test
  void inputAndPrintAliases_parseSuccessfully() {
    String source =
        """
        أدخل "اسمك", س
        إطبع س
        """;
    assertParses(source);
  }

  @Test
  void mixedCanonicalAndAliasForms_parseAndRun() {
    String source =
        """
        دالّة ت(س) = س + ١
        صار م = مصفوفة(٢)
        صار ن = إجري ت(١)
        إذا ن = ٢ ام صحيح ثم
        إطبع ن
        ختام اذا
        """;
    Map<String, Variable> scope = interpret(source);
    assertEquals(2, ((Double) scope.get("ن").getValue().getVal()).intValue());
  }
}
