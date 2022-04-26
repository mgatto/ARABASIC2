package com.lisantra.arabicbasic; // Generated from
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
      T__4 = 5,
      T__5 = 6,
      T__6 = 7,
      T__7 = 8,
      T__8 = 9,
      T__9 = 10,
      T__10 = 11,
      COMMENT = 12,
      IDENTIFIER = 13,
      STRING = 14,
      INTEGER = 15,
      REAL = 16,
      EOL = 17,
      WS = 18;
  public static String[] channelNames = {"DEFAULT_TOKEN_CHANNEL", "HIDDEN"};

  public static String[] modeNames = {"DEFAULT_MODE"};

  private static String[] makeRuleNames() {
    return new String[] {
      "T__0",
      "T__1",
      "T__2",
      "T__3",
      "T__4",
      "T__5",
      "T__6",
      "T__7",
      "T__8",
      "T__9",
      "T__10",
      "COMMENT",
      "IDENTIFIER",
      "STRING",
      "INTEGER",
      "REAL",
      "EOL",
      "WS",
      "DIGIT",
      "LETTER"
    };
  }

  public static final String[] ruleNames = makeRuleNames();

  private static String[] makeLiteralNames() {
    return new String[] {
      null, "'LET'", "'='", "'-'", "'^'", "'*'", "'/'", "'+'", "'('", "')'", "'DIM'", "'ARRAY'"
    };
  }

  private static final String[] _LITERAL_NAMES = makeLiteralNames();

  private static String[] makeSymbolicNames() {
    return new String[] {
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      "COMMENT",
      "IDENTIFIER",
      "STRING",
      "INTEGER",
      "REAL",
      "EOL",
      "WS"
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
      "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u008c\b\1\4\2"
          + "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"
          + "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"
          + "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3"
          + "\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f"
          + "\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\rO\n\r\3\r\7\rR\n\r\f\r\16"
          + "\rU\13\r\3\r\3\r\3\16\6\16Z\n\16\r\16\16\16[\3\16\7\16_\n\16\f\16\16\16"
          + "b\13\16\3\17\3\17\7\17f\n\17\f\17\16\17i\13\17\3\17\3\17\3\20\3\20\3\20"
          + "\7\20p\n\20\f\20\16\20s\13\20\5\20u\n\20\3\21\3\21\3\21\6\21z\n\21\r\21"
          + "\16\21{\3\22\5\22\177\n\22\3\22\3\22\5\22\u0083\n\22\3\23\3\23\3\23\3"
          + "\23\3\24\3\24\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"
          + "\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)\2\3\2\n\4\2\f\f\17"
          + "\17\3\2C\\\5\2\62;C\\aa\5\2\"\"C\\c|\3\2\63;\4\2\13\13\"\"\3\2\62;\4\2"
          + "C\\c|\2\u0093\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"
          + "\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"
          + "\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"
          + "\2\2\2#\3\2\2\2\2%\3\2\2\2\3+\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2"
          + "\2\2\13\65\3\2\2\2\r\67\3\2\2\2\179\3\2\2\2\21;\3\2\2\2\23=\3\2\2\2\25"
          + "?\3\2\2\2\27C\3\2\2\2\31N\3\2\2\2\33Y\3\2\2\2\35c\3\2\2\2\37t\3\2\2\2"
          + "!v\3\2\2\2#\u0082\3\2\2\2%\u0084\3\2\2\2\'\u0088\3\2\2\2)\u008a\3\2\2"
          + "\2+,\7N\2\2,-\7G\2\2-.\7V\2\2.\4\3\2\2\2/\60\7?\2\2\60\6\3\2\2\2\61\62"
          + "\7/\2\2\62\b\3\2\2\2\63\64\7`\2\2\64\n\3\2\2\2\65\66\7,\2\2\66\f\3\2\2"
          + "\2\678\7\61\2\28\16\3\2\2\29:\7-\2\2:\20\3\2\2\2;<\7*\2\2<\22\3\2\2\2"
          + "=>\7+\2\2>\24\3\2\2\2?@\7F\2\2@A\7K\2\2AB\7O\2\2B\26\3\2\2\2CD\7C\2\2"
          + "DE\7T\2\2EF\7T\2\2FG\7C\2\2GH\7[\2\2H\30\3\2\2\2IJ\7\61\2\2JO\7\61\2\2"
          + "KL\7T\2\2LM\7G\2\2MO\7O\2\2NI\3\2\2\2NK\3\2\2\2OS\3\2\2\2PR\n\2\2\2QP"
          + "\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\5#\22\2W"
          + "\32\3\2\2\2XZ\t\3\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\`\3\2"
          + "\2\2]_\t\4\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\34\3\2\2\2b`\3"
          + "\2\2\2cg\7$\2\2df\t\5\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3"
          + "\2\2\2ig\3\2\2\2jk\7$\2\2k\36\3\2\2\2lu\7\62\2\2mq\t\6\2\2np\5\'\24\2"
          + "on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2sq\3\2\2\2tl\3\2\2\2"
          + "tm\3\2\2\2u \3\2\2\2vw\5\'\24\2wy\7\60\2\2xz\5\'\24\2yx\3\2\2\2z{\3\2"
          + "\2\2{y\3\2\2\2{|\3\2\2\2|\"\3\2\2\2}\177\7\17\2\2~}\3\2\2\2~\177\3\2\2"
          + "\2\177\u0080\3\2\2\2\u0080\u0083\7\f\2\2\u0081\u0083\7\u202a\2\2\u0082"
          + "~\3\2\2\2\u0082\u0081\3\2\2\2\u0083$\3\2\2\2\u0084\u0085\t\7\2\2\u0085"
          + "\u0086\3\2\2\2\u0086\u0087\b\23\2\2\u0087&\3\2\2\2\u0088\u0089\t\b\2\2"
          + "\u0089(\3\2\2\2\u008a\u008b\t\t\2\2\u008b*\3\2\2\2\r\2NS[`gqt{~\u0082"
          + "\3\b\2\2";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
