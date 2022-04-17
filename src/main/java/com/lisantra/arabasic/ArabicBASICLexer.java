package com.lisantra.arabasic; // Generated from
                               // /Users/mgatto/Development/cs-361/ARABASIC2/src/main/antlr4/ArabicBASIC.g4 by ANTLR 4.9.2

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArabicBASICLexer extends Lexer {
  static {
    RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION);
  }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
  public static final int T__0 = 1,
      T__1 = 2,
      T__2 = 3,
      T__3 = 4,
      ID = 5,
      VAR = 6,
      STRING = 7,
      INT = 8,
      REAL = 9,
      NEWLINE = 10,
      WS = 11;
  public static String[] channelNames = {"DEFAULT_TOKEN_CHANNEL", "HIDDEN"};

  public static String[] modeNames = {"DEFAULT_MODE"};

  private static String[] makeRuleNames() {
    return new String[] {
      "T__0", "T__1", "T__2", "T__3", "ID", "VAR", "STRING", "INT", "REAL", "NEWLINE", "WS"
    };
  }

  public static final String[] ruleNames = makeRuleNames();

  private static String[] makeLiteralNames() {
    return new String[] {null, "'LET'", "'let'", "'='", "'#'"};
  }

  private static final String[] _LITERAL_NAMES = makeLiteralNames();

  private static String[] makeSymbolicNames() {
    return new String[] {
      null, null, null, null, null, "ID", "VAR", "STRING", "INT", "REAL", "NEWLINE", "WS"
    };
  }

  private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
  public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

  /**
   * @deprecated Use {@link #VOCABULARY} instead.
   */
  @Deprecated public static final String[] tokenNames;

  static {
    tokenNames = new String[_SYMBOLIC_NAMES.length];
    for (int i = 0; i < tokenNames.length; i++) {
      tokenNames[i] = VOCABULARY.getLiteralName(i);
      if (tokenNames[i] == null) {
        tokenNames[i] = VOCABULARY.getSymbolicName(i);
      }

      if (tokenNames[i] == null) {
        tokenNames[i] = "<INVALID>";
      }
    }
  }

  @Override
  @Deprecated
  public String[] getTokenNames() {
    return tokenNames;
  }

  @Override
  public Vocabulary getVocabulary() {
    return VOCABULARY;
  }

  public ArabicBASICLexer(CharStream input) {
    super(input);
    _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
  }

  @Override
  public String getGrammarFileName() {
    return "ArabicBASIC.g4";
  }

  @Override
  public String[] getRuleNames() {
    return ruleNames;
  }

  @Override
  public String getSerializedATN() {
    return _serializedATN;
  }

  @Override
  public String[] getChannelNames() {
    return channelNames;
  }

  @Override
  public String[] getModeNames() {
    return modeNames;
  }

  @Override
  public ATN getATN() {
    return _ATN;
  }

  public static final String _serializedATN =
      "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\rU\b\1\4\2\t\2\4"
          + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
          + "\13\4\f\t\f\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\6\6\'"
          + "\n\6\r\6\16\6(\3\6\7\6,\n\6\f\6\16\6/\13\6\3\7\3\7\5\7\63\n\7\3\b\3\b"
          + "\3\b\3\b\3\t\5\t:\n\t\3\t\6\t=\n\t\r\t\16\t>\3\t\7\tB\n\t\f\t\16\tE\13"
          + "\t\3\n\3\n\3\n\3\n\3\13\5\13L\n\13\3\13\3\13\5\13P\n\13\3\f\3\f\3\f\3"
          + "\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2\b\3\2"
          + "C\\\5\2\62;C\\aa\7\2\"\"//C\\aac|\3\2\63;\3\2\62;\4\2\13\13\"\"\2\\\2"
          + "\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"
          + "\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3"
          + "\31\3\2\2\2\5\35\3\2\2\2\7!\3\2\2\2\t#\3\2\2\2\13&\3\2\2\2\r\62\3\2\2"
          + "\2\17\64\3\2\2\2\219\3\2\2\2\23F\3\2\2\2\25O\3\2\2\2\27Q\3\2\2\2\31\32"
          + "\7N\2\2\32\33\7G\2\2\33\34\7V\2\2\34\4\3\2\2\2\35\36\7n\2\2\36\37\7g\2"
          + "\2\37 \7v\2\2 \6\3\2\2\2!\"\7?\2\2\"\b\3\2\2\2#$\7%\2\2$\n\3\2\2\2%\'"
          + "\t\2\2\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)-\3\2\2\2*,\t\3\2\2"
          + "+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\f\3\2\2\2/-\3\2\2\2\60\63\5"
          + "\21\t\2\61\63\5\17\b\2\62\60\3\2\2\2\62\61\3\2\2\2\63\16\3\2\2\2\64\65"
          + "\7$\2\2\65\66\t\4\2\2\66\67\7$\2\2\67\20\3\2\2\28:\7/\2\298\3\2\2\29:"
          + "\3\2\2\2:<\3\2\2\2;=\t\5\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?"
          + "C\3\2\2\2@B\t\6\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\22\3\2\2"
          + "\2EC\3\2\2\2FG\5\21\t\2GH\7\60\2\2HI\5\21\t\2I\24\3\2\2\2JL\7\17\2\2K"
          + "J\3\2\2\2KL\3\2\2\2LM\3\2\2\2MP\7\f\2\2NP\7\u202a\2\2OK\3\2\2\2ON\3\2"
          + "\2\2P\26\3\2\2\2QR\t\7\2\2RS\3\2\2\2ST\b\f\2\2T\30\3\2\2\2\13\2(-\629"
          + ">CKO\3\b\2\2";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
