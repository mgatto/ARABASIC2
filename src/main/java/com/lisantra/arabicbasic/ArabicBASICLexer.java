package com.lisantra.arabicbasic; // Generated from
                                  // /Users/mgatto/Development/cs-361/ARABASIC2/src/main/antlr4/ArabicBASIC.g4 by ANTLR 4.10.1

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArabicBASICLexer extends Lexer {
  static {
    RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION);
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
      COMMENT = 8,
      IDENTIFIER = 9,
      STRING = 10,
      INTEGER = 11,
      REAL = 12,
      MUL = 13,
      DIV = 14,
      ADD = 15,
      SUB = 16,
      EOL = 17,
      WS = 18;
  public static String[] channelNames = {"DEFAULT_TOKEN_CHANNEL", "HIDDEN"};

  public static String[] modeNames = {"DEFAULT_MODE"};

  private static String[] makeRuleNames() {
    return new String[] {
      "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "COMMENT", "IDENTIFIER",
      "STRING", "INTEGER", "REAL", "MUL", "DIV", "ADD", "SUB", "EOL", "WS",
      "DIGIT", "LETTER"
    };
  }

  public static final String[] ruleNames = makeRuleNames();

  private static String[] makeLiteralNames() {
    return new String[] {
      null, "'LET'", "'='", "'^'", "'('", "')'", "'DIM'", "'ARRAY'", null, null, null, null, null,
      "'*'", "'/'", "'+'", "'-'"
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
      "COMMENT",
      "IDENTIFIER",
      "STRING",
      "INTEGER",
      "REAL",
      "MUL",
      "DIV",
      "ADD",
      "SUB",
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
      "\u0004\u0000\u0012\u008a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"
          + "\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"
          + "\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"
          + "\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"
          + "\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"
          + "\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"
          + "\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"
          + "\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"
          + "\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"
          + "\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"
          + "\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
          + "\u0001\u0007\u0003\u0007E\b\u0007\u0001\u0007\u0005\u0007H\b\u0007\n\u0007"
          + "\f\u0007K\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0004\bP\b\b\u000b\b"
          + "\f\bQ\u0001\b\u0005\bU\b\b\n\b\f\bX\t\b\u0001\t\u0001\t\u0005\t\\\b\t"
          + "\n\t\f\t_\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\nf\b\n\n\n"
          + "\f\ni\t\n\u0003\nk\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b"
          + "p\b\u000b\u000b\u000b\f\u000bq\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"
          + "\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0003\u0010}\b\u0010"
          + "\u0001\u0010\u0001\u0010\u0003\u0010\u0081\b\u0010\u0001\u0011\u0001\u0011"
          + "\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"
          + "\u0000\u0000\u0014\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"
          + "\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"
          + "\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0000\'\u0000\u0001"
          + "\u0000\b\u0002\u0000\n\n\r\r\u0001\u0000AZ\u0003\u000009AZ__\u0003\u0000"
          + "  AZaz\u0001\u000019\u0002\u0000\t\t  \u0001\u000009\u0002\u0000AZaz\u0091"
          + "\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"
          + "\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"
          + "\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"
          + "\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"
          + "\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"
          + "\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"
          + "\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"
          + "\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"
          + "\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001)\u0001\u0000\u0000"
          + "\u0000\u0003-\u0001\u0000\u0000\u0000\u0005/\u0001\u0000\u0000\u0000\u0007"
          + "1\u0001\u0000\u0000\u0000\t3\u0001\u0000\u0000\u0000\u000b5\u0001\u0000"
          + "\u0000\u0000\r9\u0001\u0000\u0000\u0000\u000fD\u0001\u0000\u0000\u0000"
          + "\u0011O\u0001\u0000\u0000\u0000\u0013Y\u0001\u0000\u0000\u0000\u0015j"
          + "\u0001\u0000\u0000\u0000\u0017l\u0001\u0000\u0000\u0000\u0019s\u0001\u0000"
          + "\u0000\u0000\u001bu\u0001\u0000\u0000\u0000\u001dw\u0001\u0000\u0000\u0000"
          + "\u001fy\u0001\u0000\u0000\u0000!\u0080\u0001\u0000\u0000\u0000#\u0082"
          + "\u0001\u0000\u0000\u0000%\u0086\u0001\u0000\u0000\u0000\'\u0088\u0001"
          + "\u0000\u0000\u0000)*\u0005L\u0000\u0000*+\u0005E\u0000\u0000+,\u0005T"
          + "\u0000\u0000,\u0002\u0001\u0000\u0000\u0000-.\u0005=\u0000\u0000.\u0004"
          + "\u0001\u0000\u0000\u0000/0\u0005^\u0000\u00000\u0006\u0001\u0000\u0000"
          + "\u000012\u0005(\u0000\u00002\b\u0001\u0000\u0000\u000034\u0005)\u0000"
          + "\u00004\n\u0001\u0000\u0000\u000056\u0005D\u0000\u000067\u0005I\u0000"
          + "\u000078\u0005M\u0000\u00008\f\u0001\u0000\u0000\u00009:\u0005A\u0000"
          + "\u0000:;\u0005R\u0000\u0000;<\u0005R\u0000\u0000<=\u0005A\u0000\u0000"
          + "=>\u0005Y\u0000\u0000>\u000e\u0001\u0000\u0000\u0000?@\u0005/\u0000\u0000"
          + "@E\u0005/\u0000\u0000AB\u0005R\u0000\u0000BC\u0005E\u0000\u0000CE\u0005"
          + "M\u0000\u0000D?\u0001\u0000\u0000\u0000DA\u0001\u0000\u0000\u0000EI\u0001"
          + "\u0000\u0000\u0000FH\b\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000HK\u0001"
          + "\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"
          + "JL\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LM\u0003!\u0010\u0000"
          + "M\u0010\u0001\u0000\u0000\u0000NP\u0007\u0001\u0000\u0000ON\u0001\u0000"
          + "\u0000\u0000PQ\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001"
          + "\u0000\u0000\u0000RV\u0001\u0000\u0000\u0000SU\u0007\u0002\u0000\u0000"
          + "TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000"
          + "\u0000VW\u0001\u0000\u0000\u0000W\u0012\u0001\u0000\u0000\u0000XV\u0001"
          + "\u0000\u0000\u0000Y]\u0005\"\u0000\u0000Z\\\u0007\u0003\u0000\u0000[Z"
          + "\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"
          + "\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000_]\u0001\u0000"
          + "\u0000\u0000`a\u0005\"\u0000\u0000a\u0014\u0001\u0000\u0000\u0000bk\u0005"
          + "0\u0000\u0000cg\u0007\u0004\u0000\u0000df\u0003%\u0012\u0000ed\u0001\u0000"
          + "\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001"
          + "\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000"
          + "jb\u0001\u0000\u0000\u0000jc\u0001\u0000\u0000\u0000k\u0016\u0001\u0000"
          + "\u0000\u0000lm\u0003%\u0012\u0000mo\u0005.\u0000\u0000np\u0003%\u0012"
          + "\u0000on\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001\u0000"
          + "\u0000\u0000qr\u0001\u0000\u0000\u0000r\u0018\u0001\u0000\u0000\u0000"
          + "st\u0005*\u0000\u0000t\u001a\u0001\u0000\u0000\u0000uv\u0005/\u0000\u0000"
          + "v\u001c\u0001\u0000\u0000\u0000wx\u0005+\u0000\u0000x\u001e\u0001\u0000"
          + "\u0000\u0000yz\u0005-\u0000\u0000z \u0001\u0000\u0000\u0000{}\u0005\r"
          + "\u0000\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001"
          + "\u0000\u0000\u0000~\u0081\u0005\n\u0000\u0000\u007f\u0081\u0005\u2028"
          + "\u0000\u0000\u0080|\u0001\u0000\u0000\u0000\u0080\u007f\u0001\u0000\u0000"
          + "\u0000\u0081\"\u0001\u0000\u0000\u0000\u0082\u0083\u0007\u0005\u0000\u0000"
          + "\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0006\u0011\u0000\u0000"
          + "\u0085$\u0001\u0000\u0000\u0000\u0086\u0087\u0007\u0006\u0000\u0000\u0087"
          + "&\u0001\u0000\u0000\u0000\u0088\u0089\u0007\u0007\u0000\u0000\u0089(\u0001"
          + "\u0000\u0000\u0000\u000b\u0000DIQV]gjq|\u0080\u0001\u0006\u0000\u0000";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
