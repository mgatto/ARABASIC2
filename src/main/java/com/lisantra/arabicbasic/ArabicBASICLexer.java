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
      COMMENT = 7,
      IDENTIFIER = 8,
      STRING = 9,
      INTEGER = 10,
      REAL = 11,
      MUL = 12,
      DIV = 13,
      ADD = 14,
      SUB = 15,
      EOL = 16,
      WS = 17;
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
      "WS",
      "DIGIT",
      "LETTER"
    };
  }

  public static final String[] ruleNames = makeRuleNames();

  private static String[] makeLiteralNames() {
    return new String[] {
      null, "'LET'", "'='", "'('", "')'", "'DIM'", "'^'", null, null, null, null, null, "'*'",
      "'/'", "'+'", "'-'"
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
      "\u0004\u0000\u0011\u0082\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"
          + "\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"
          + "\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"
          + "\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"
          + "\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"
          + "\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"
          + "\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"
          + "\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"
          + "\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"
          + "\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"
          + "=\b\u0006\u0001\u0006\u0005\u0006@\b\u0006\n\u0006\f\u0006C\t\u0006\u0001"
          + "\u0006\u0001\u0006\u0001\u0007\u0004\u0007H\b\u0007\u000b\u0007\f\u0007"
          + "I\u0001\u0007\u0005\u0007M\b\u0007\n\u0007\f\u0007P\t\u0007\u0001\b\u0001"
          + "\b\u0005\bT\b\b\n\b\f\bW\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005"
          + "\t^\b\t\n\t\f\ta\t\t\u0003\tc\b\t\u0001\n\u0001\n\u0001\n\u0004\nh\b\n"
          + "\u000b\n\f\ni\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r"
          + "\u0001\u000e\u0001\u000e\u0001\u000f\u0003\u000fu\b\u000f\u0001\u000f"
          + "\u0001\u000f\u0003\u000fy\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"
          + "\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0000\u0000"
          + "\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"
          + "\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"
          + "\u001d\u000f\u001f\u0010!\u0011#\u0000%\u0000\u0001\u0000\b\u0002\u0000"
          + "\n\n\r\r\u0001\u0000AZ\u0003\u000009AZ__\u0003\u0000  AZaz\u0001\u0000"
          + "19\u0002\u0000\t\t  \u0001\u000009\u0002\u0000AZaz\u0089\u0000\u0001\u0001"
          + "\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"
          + "\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"
          + "\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"
          + "\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"
          + "\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"
          + "\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"
          + "\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"
          + "\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"
          + "\u0001\'\u0001\u0000\u0000\u0000\u0003+\u0001\u0000\u0000\u0000\u0005"
          + "-\u0001\u0000\u0000\u0000\u0007/\u0001\u0000\u0000\u0000\t1\u0001\u0000"
          + "\u0000\u0000\u000b5\u0001\u0000\u0000\u0000\r<\u0001\u0000\u0000\u0000"
          + "\u000fG\u0001\u0000\u0000\u0000\u0011Q\u0001\u0000\u0000\u0000\u0013b"
          + "\u0001\u0000\u0000\u0000\u0015d\u0001\u0000\u0000\u0000\u0017k\u0001\u0000"
          + "\u0000\u0000\u0019m\u0001\u0000\u0000\u0000\u001bo\u0001\u0000\u0000\u0000"
          + "\u001dq\u0001\u0000\u0000\u0000\u001fx\u0001\u0000\u0000\u0000!z\u0001"
          + "\u0000\u0000\u0000#~\u0001\u0000\u0000\u0000%\u0080\u0001\u0000\u0000"
          + "\u0000\'(\u0005L\u0000\u0000()\u0005E\u0000\u0000)*\u0005T\u0000\u0000"
          + "*\u0002\u0001\u0000\u0000\u0000+,\u0005=\u0000\u0000,\u0004\u0001\u0000"
          + "\u0000\u0000-.\u0005(\u0000\u0000.\u0006\u0001\u0000\u0000\u0000/0\u0005"
          + ")\u0000\u00000\b\u0001\u0000\u0000\u000012\u0005D\u0000\u000023\u0005"
          + "I\u0000\u000034\u0005M\u0000\u00004\n\u0001\u0000\u0000\u000056\u0005"
          + "^\u0000\u00006\f\u0001\u0000\u0000\u000078\u0005/\u0000\u00008=\u0005"
          + "/\u0000\u00009:\u0005R\u0000\u0000:;\u0005E\u0000\u0000;=\u0005M\u0000"
          + "\u0000<7\u0001\u0000\u0000\u0000<9\u0001\u0000\u0000\u0000=A\u0001\u0000"
          + "\u0000\u0000>@\b\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@C\u0001\u0000"
          + "\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001"
          + "\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DE\u0003\u001f\u000f\u0000"
          + "E\u000e\u0001\u0000\u0000\u0000FH\u0007\u0001\u0000\u0000GF\u0001\u0000"
          + "\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001"
          + "\u0000\u0000\u0000JN\u0001\u0000\u0000\u0000KM\u0007\u0002\u0000\u0000"
          + "LK\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000"
          + "\u0000NO\u0001\u0000\u0000\u0000O\u0010\u0001\u0000\u0000\u0000PN\u0001"
          + "\u0000\u0000\u0000QU\u0005\"\u0000\u0000RT\u0007\u0003\u0000\u0000SR\u0001"
          + "\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"
          + "UV\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000"
          + "\u0000XY\u0005\"\u0000\u0000Y\u0012\u0001\u0000\u0000\u0000Zc\u00050\u0000"
          + "\u0000[_\u0007\u0004\u0000\u0000\\^\u0003#\u0011\u0000]\\\u0001\u0000"
          + "\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001"
          + "\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"
          + "bZ\u0001\u0000\u0000\u0000b[\u0001\u0000\u0000\u0000c\u0014\u0001\u0000"
          + "\u0000\u0000de\u0003#\u0011\u0000eg\u0005.\u0000\u0000fh\u0003#\u0011"
          + "\u0000gf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ig\u0001\u0000"
          + "\u0000\u0000ij\u0001\u0000\u0000\u0000j\u0016\u0001\u0000\u0000\u0000"
          + "kl\u0005*\u0000\u0000l\u0018\u0001\u0000\u0000\u0000mn\u0005/\u0000\u0000"
          + "n\u001a\u0001\u0000\u0000\u0000op\u0005+\u0000\u0000p\u001c\u0001\u0000"
          + "\u0000\u0000qr\u0005-\u0000\u0000r\u001e\u0001\u0000\u0000\u0000su\u0005"
          + "\r\u0000\u0000ts\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0001"
          + "\u0000\u0000\u0000vy\u0005\n\u0000\u0000wy\u0005\u2028\u0000\u0000xt\u0001"
          + "\u0000\u0000\u0000xw\u0001\u0000\u0000\u0000y \u0001\u0000\u0000\u0000"
          + "z{\u0007\u0005\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0006\u0010\u0000"
          + "\u0000}\"\u0001\u0000\u0000\u0000~\u007f\u0007\u0006\u0000\u0000\u007f"
          + "$\u0001\u0000\u0000\u0000\u0080\u0081\u0007\u0007\u0000\u0000\u0081&\u0001"
          + "\u0000\u0000\u0000\u000b\u0000<AINU_bitx\u0001\u0006\u0000\u0000";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
