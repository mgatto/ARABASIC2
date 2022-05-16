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
      T__7 = 8,
      T__8 = 9,
      T__9 = 10,
      T__10 = 11,
      T__11 = 12,
      T__12 = 13,
      T__13 = 14,
      T__14 = 15,
      T__15 = 16,
      T__16 = 17,
      T__17 = 18,
      T__18 = 19,
      T__19 = 20,
      T__20 = 21,
      T__21 = 22,
      T__22 = 23,
      T__23 = 24,
      T__24 = 25,
      T__25 = 26,
      T__26 = 27,
      T__27 = 28,
      T__28 = 29,
      T__29 = 30,
      T__30 = 31,
      T__31 = 32,
      T__32 = 33,
      T__33 = 34,
      T__34 = 35,
      T__35 = 36,
      T__36 = 37,
      COMMENT = 38,
      IDENTIFIER = 39,
      STRING = 40,
      INTEGER = 41,
      REAL = 42,
      EOL = 43,
      WS = 44;
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
      "T__11",
      "T__12",
      "T__13",
      "T__14",
      "T__15",
      "T__16",
      "T__17",
      "T__18",
      "T__19",
      "T__20",
      "T__21",
      "T__22",
      "T__23",
      "T__24",
      "T__25",
      "T__26",
      "T__27",
      "T__28",
      "T__29",
      "T__30",
      "T__31",
      "T__32",
      "T__33",
      "T__34",
      "T__35",
      "T__36",
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
      null,
      "'LET'",
      "'='",
      "'('",
      "')'",
      "'DIM'",
      "'IF'",
      "'THEN'",
      "'ELSE IF'",
      "'ELSE'",
      "'END IF'",
      "'FOR'",
      "'TO'",
      "'STEP'",
      "'NEXT'",
      "'WHILE'",
      "'END WHILE'",
      "'WEND'",
      "'DEF'",
      "'FN'",
      "'CALL'",
      "'PRINT'",
      "','",
      "';'",
      "'INPUT'",
      "'-'",
      "'^'",
      "'*'",
      "'/'",
      "'+'",
      "'>'",
      "'<'",
      "'<='",
      "'>='",
      "'<>'",
      "'NOT'",
      "'AND'",
      "'OR'"
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
      "\u0004\u0000,\u0132\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"
          + "\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"
          + "\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"
          + "\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"
          + "\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"
          + "\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"
          + "\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"
          + "\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"
          + "\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"
          + "\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"
          + "\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"
          + "!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"
          + "&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"
          + "+\u0002,\u0007,\u0002-\u0007-\u0001\u0000\u0001\u0000\u0001\u0000\u0001"
          + "\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001"
          + "\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"
          + "\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"
          + "\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"
          + "\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"
          + "\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"
          + "\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"
          + "\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"
          + "\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"
          + "\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"
          + "\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"
          + "\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"
          + "\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"
          + "\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"
          + "\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"
          + "\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"
          + "\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001"
          + "\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001"
          + "\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"
          + " \u0001 \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"
          + "#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001"
          + "%\u0001%\u0003%\u00f1\b%\u0001%\u0005%\u00f4\b%\n%\f%\u00f7\t%\u0001%"
          + "\u0001%\u0001%\u0001%\u0001&\u0004&\u00fe\b&\u000b&\f&\u00ff\u0001&\u0005"
          + "&\u0103\b&\n&\f&\u0106\t&\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u010c"
          + "\b\'\n\'\f\'\u010f\t\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0005(\u0116"
          + "\b(\n(\f(\u0119\t(\u0003(\u011b\b(\u0001)\u0001)\u0001)\u0004)\u0120\b"
          + ")\u000b)\f)\u0121\u0001*\u0003*\u0125\b*\u0001*\u0001*\u0003*\u0129\b"
          + "*\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0000\u0000"
          + ".\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"
          + "\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"
          + "\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"
          + "/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%"
          + "K&M\'O(Q)S*U+W,Y\u0000[\u0000\u0001\u0000\b\u0002\u0000\n\n\r\r\u0001"
          + "\u0000AZ\u0003\u000009AZ__\u0001\u0000\"\"\u0001\u000019\u0002\u0000\t"
          + "\t  \u0001\u000009\u0002\u0000AZaz\u013a\u0000\u0001\u0001\u0000\u0000"
          + "\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"
          + "\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"
          + "\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"
          + "\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"
          + "\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"
          + "\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"
          + "\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"
          + "\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"
          + "\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"
          + "\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"
          + "\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"
          + "\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000"
          + "\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000"
          + "\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?"
          + "\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000"
          + "\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000"
          + "\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M"
          + "\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000"
          + "\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000"
          + "\u0000W\u0001\u0000\u0000\u0000\u0001]\u0001\u0000\u0000\u0000\u0003a"
          + "\u0001\u0000\u0000\u0000\u0005c\u0001\u0000\u0000\u0000\u0007e\u0001\u0000"
          + "\u0000\u0000\tg\u0001\u0000\u0000\u0000\u000bk\u0001\u0000\u0000\u0000"
          + "\rn\u0001\u0000\u0000\u0000\u000fs\u0001\u0000\u0000\u0000\u0011{\u0001"
          + "\u0000\u0000\u0000\u0013\u0080\u0001\u0000\u0000\u0000\u0015\u0087\u0001"
          + "\u0000\u0000\u0000\u0017\u008b\u0001\u0000\u0000\u0000\u0019\u008e\u0001"
          + "\u0000\u0000\u0000\u001b\u0093\u0001\u0000\u0000\u0000\u001d\u0098\u0001"
          + "\u0000\u0000\u0000\u001f\u009e\u0001\u0000\u0000\u0000!\u00a8\u0001\u0000"
          + "\u0000\u0000#\u00ad\u0001\u0000\u0000\u0000%\u00b1\u0001\u0000\u0000\u0000"
          + "\'\u00b4\u0001\u0000\u0000\u0000)\u00b9\u0001\u0000\u0000\u0000+\u00bf"
          + "\u0001\u0000\u0000\u0000-\u00c1\u0001\u0000\u0000\u0000/\u00c3\u0001\u0000"
          + "\u0000\u00001\u00c9\u0001\u0000\u0000\u00003\u00cb\u0001\u0000\u0000\u0000"
          + "5\u00cd\u0001\u0000\u0000\u00007\u00cf\u0001\u0000\u0000\u00009\u00d1"
          + "\u0001\u0000\u0000\u0000;\u00d3\u0001\u0000\u0000\u0000=\u00d5\u0001\u0000"
          + "\u0000\u0000?\u00d7\u0001\u0000\u0000\u0000A\u00da\u0001\u0000\u0000\u0000"
          + "C\u00dd\u0001\u0000\u0000\u0000E\u00e0\u0001\u0000\u0000\u0000G\u00e4"
          + "\u0001\u0000\u0000\u0000I\u00e8\u0001\u0000\u0000\u0000K\u00f0\u0001\u0000"
          + "\u0000\u0000M\u00fd\u0001\u0000\u0000\u0000O\u0107\u0001\u0000\u0000\u0000"
          + "Q\u011a\u0001\u0000\u0000\u0000S\u011c\u0001\u0000\u0000\u0000U\u0128"
          + "\u0001\u0000\u0000\u0000W\u012a\u0001\u0000\u0000\u0000Y\u012e\u0001\u0000"
          + "\u0000\u0000[\u0130\u0001\u0000\u0000\u0000]^\u0005L\u0000\u0000^_\u0005"
          + "E\u0000\u0000_`\u0005T\u0000\u0000`\u0002\u0001\u0000\u0000\u0000ab\u0005"
          + "=\u0000\u0000b\u0004\u0001\u0000\u0000\u0000cd\u0005(\u0000\u0000d\u0006"
          + "\u0001\u0000\u0000\u0000ef\u0005)\u0000\u0000f\b\u0001\u0000\u0000\u0000"
          + "gh\u0005D\u0000\u0000hi\u0005I\u0000\u0000ij\u0005M\u0000\u0000j\n\u0001"
          + "\u0000\u0000\u0000kl\u0005I\u0000\u0000lm\u0005F\u0000\u0000m\f\u0001"
          + "\u0000\u0000\u0000no\u0005T\u0000\u0000op\u0005H\u0000\u0000pq\u0005E"
          + "\u0000\u0000qr\u0005N\u0000\u0000r\u000e\u0001\u0000\u0000\u0000st\u0005"
          + "E\u0000\u0000tu\u0005L\u0000\u0000uv\u0005S\u0000\u0000vw\u0005E\u0000"
          + "\u0000wx\u0005 \u0000\u0000xy\u0005I\u0000\u0000yz\u0005F\u0000\u0000"
          + "z\u0010\u0001\u0000\u0000\u0000{|\u0005E\u0000\u0000|}\u0005L\u0000\u0000"
          + "}~\u0005S\u0000\u0000~\u007f\u0005E\u0000\u0000\u007f\u0012\u0001\u0000"
          + "\u0000\u0000\u0080\u0081\u0005E\u0000\u0000\u0081\u0082\u0005N\u0000\u0000"
          + "\u0082\u0083\u0005D\u0000\u0000\u0083\u0084\u0005 \u0000\u0000\u0084\u0085"
          + "\u0005I\u0000\u0000\u0085\u0086\u0005F\u0000\u0000\u0086\u0014\u0001\u0000"
          + "\u0000\u0000\u0087\u0088\u0005F\u0000\u0000\u0088\u0089\u0005O\u0000\u0000"
          + "\u0089\u008a\u0005R\u0000\u0000\u008a\u0016\u0001\u0000\u0000\u0000\u008b"
          + "\u008c\u0005T\u0000\u0000\u008c\u008d\u0005O\u0000\u0000\u008d\u0018\u0001"
          + "\u0000\u0000\u0000\u008e\u008f\u0005S\u0000\u0000\u008f\u0090\u0005T\u0000"
          + "\u0000\u0090\u0091\u0005E\u0000\u0000\u0091\u0092\u0005P\u0000\u0000\u0092"
          + "\u001a\u0001\u0000\u0000\u0000\u0093\u0094\u0005N\u0000\u0000\u0094\u0095"
          + "\u0005E\u0000\u0000\u0095\u0096\u0005X\u0000\u0000\u0096\u0097\u0005T"
          + "\u0000\u0000\u0097\u001c\u0001\u0000\u0000\u0000\u0098\u0099\u0005W\u0000"
          + "\u0000\u0099\u009a\u0005H\u0000\u0000\u009a\u009b\u0005I\u0000\u0000\u009b"
          + "\u009c\u0005L\u0000\u0000\u009c\u009d\u0005E\u0000\u0000\u009d\u001e\u0001"
          + "\u0000\u0000\u0000\u009e\u009f\u0005E\u0000\u0000\u009f\u00a0\u0005N\u0000"
          + "\u0000\u00a0\u00a1\u0005D\u0000\u0000\u00a1\u00a2\u0005 \u0000\u0000\u00a2"
          + "\u00a3\u0005W\u0000\u0000\u00a3\u00a4\u0005H\u0000\u0000\u00a4\u00a5\u0005"
          + "I\u0000\u0000\u00a5\u00a6\u0005L\u0000\u0000\u00a6\u00a7\u0005E\u0000"
          + "\u0000\u00a7 \u0001\u0000\u0000\u0000\u00a8\u00a9\u0005W\u0000\u0000\u00a9"
          + "\u00aa\u0005E\u0000\u0000\u00aa\u00ab\u0005N\u0000\u0000\u00ab\u00ac\u0005"
          + "D\u0000\u0000\u00ac\"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005D\u0000"
          + "\u0000\u00ae\u00af\u0005E\u0000\u0000\u00af\u00b0\u0005F\u0000\u0000\u00b0"
          + "$\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005F\u0000\u0000\u00b2\u00b3\u0005"
          + "N\u0000\u0000\u00b3&\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005C\u0000"
          + "\u0000\u00b5\u00b6\u0005A\u0000\u0000\u00b6\u00b7\u0005L\u0000\u0000\u00b7"
          + "\u00b8\u0005L\u0000\u0000\u00b8(\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005"
          + "P\u0000\u0000\u00ba\u00bb\u0005R\u0000\u0000\u00bb\u00bc\u0005I\u0000"
          + "\u0000\u00bc\u00bd\u0005N\u0000\u0000\u00bd\u00be\u0005T\u0000\u0000\u00be"
          + "*\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005,\u0000\u0000\u00c0,\u0001"
          + "\u0000\u0000\u0000\u00c1\u00c2\u0005;\u0000\u0000\u00c2.\u0001\u0000\u0000"
          + "\u0000\u00c3\u00c4\u0005I\u0000\u0000\u00c4\u00c5\u0005N\u0000\u0000\u00c5"
          + "\u00c6\u0005P\u0000\u0000\u00c6\u00c7\u0005U\u0000\u0000\u00c7\u00c8\u0005"
          + "T\u0000\u0000\u00c80\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005-\u0000"
          + "\u0000\u00ca2\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005^\u0000\u0000\u00cc"
          + "4\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005*\u0000\u0000\u00ce6\u0001"
          + "\u0000\u0000\u0000\u00cf\u00d0\u0005/\u0000\u0000\u00d08\u0001\u0000\u0000"
          + "\u0000\u00d1\u00d2\u0005+\u0000\u0000\u00d2:\u0001\u0000\u0000\u0000\u00d3"
          + "\u00d4\u0005>\u0000\u0000\u00d4<\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005"
          + "<\u0000\u0000\u00d6>\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005<\u0000"
          + "\u0000\u00d8\u00d9\u0005=\u0000\u0000\u00d9@\u0001\u0000\u0000\u0000\u00da"
          + "\u00db\u0005>\u0000\u0000\u00db\u00dc\u0005=\u0000\u0000\u00dcB\u0001"
          + "\u0000\u0000\u0000\u00dd\u00de\u0005<\u0000\u0000\u00de\u00df\u0005>\u0000"
          + "\u0000\u00dfD\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005N\u0000\u0000\u00e1"
          + "\u00e2\u0005O\u0000\u0000\u00e2\u00e3\u0005T\u0000\u0000\u00e3F\u0001"
          + "\u0000\u0000\u0000\u00e4\u00e5\u0005A\u0000\u0000\u00e5\u00e6\u0005N\u0000"
          + "\u0000\u00e6\u00e7\u0005D\u0000\u0000\u00e7H\u0001\u0000\u0000\u0000\u00e8"
          + "\u00e9\u0005O\u0000\u0000\u00e9\u00ea\u0005R\u0000\u0000\u00eaJ\u0001"
          + "\u0000\u0000\u0000\u00eb\u00ec\u0005/\u0000\u0000\u00ec\u00f1\u0005/\u0000"
          + "\u0000\u00ed\u00ee\u0005R\u0000\u0000\u00ee\u00ef\u0005E\u0000\u0000\u00ef"
          + "\u00f1\u0005M\u0000\u0000\u00f0\u00eb\u0001\u0000\u0000\u0000\u00f0\u00ed"
          + "\u0001\u0000\u0000\u0000\u00f1\u00f5\u0001\u0000\u0000\u0000\u00f2\u00f4"
          + "\b\u0000\u0000\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001"
          + "\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001"
          + "\u0000\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001"
          + "\u0000\u0000\u0000\u00f8\u00f9\u0003U*\u0000\u00f9\u00fa\u0001\u0000\u0000"
          + "\u0000\u00fa\u00fb\u0006%\u0000\u0000\u00fbL\u0001\u0000\u0000\u0000\u00fc"
          + "\u00fe\u0007\u0001\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe"
          + "\u00ff\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff"
          + "\u0100\u0001\u0000\u0000\u0000\u0100\u0104\u0001\u0000\u0000\u0000\u0101"
          + "\u0103\u0007\u0002\u0000\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0103"
          + "\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104"
          + "\u0105\u0001\u0000\u0000\u0000\u0105N\u0001\u0000\u0000\u0000\u0106\u0104"
          + "\u0001\u0000\u0000\u0000\u0107\u010d\u0005\"\u0000\u0000\u0108\u010c\b"
          + "\u0003\u0000\u0000\u0109\u010a\u0005\\\u0000\u0000\u010a\u010c\u0005\""
          + "\u0000\u0000\u010b\u0108\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000"
          + "\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000"
          + "\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0110\u0001\u0000"
          + "\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110\u0111\u0005\"\u0000"
          + "\u0000\u0111P\u0001\u0000\u0000\u0000\u0112\u011b\u00050\u0000\u0000\u0113"
          + "\u0117\u0007\u0004\u0000\u0000\u0114\u0116\u0003Y,\u0000\u0115\u0114\u0001"
          + "\u0000\u0000\u0000\u0116\u0119\u0001\u0000\u0000\u0000\u0117\u0115\u0001"
          + "\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u011b\u0001"
          + "\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u011a\u0112\u0001"
          + "\u0000\u0000\u0000\u011a\u0113\u0001\u0000\u0000\u0000\u011bR\u0001\u0000"
          + "\u0000\u0000\u011c\u011d\u0003Y,\u0000\u011d\u011f\u0005.\u0000\u0000"
          + "\u011e\u0120\u0003Y,\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120\u0121"
          + "\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122"
          + "\u0001\u0000\u0000\u0000\u0122T\u0001\u0000\u0000\u0000\u0123\u0125\u0005"
          + "\r\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000"
          + "\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0129\u0005\n\u0000"
          + "\u0000\u0127\u0129\u0005\u2028\u0000\u0000\u0128\u0124\u0001\u0000\u0000"
          + "\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0129V\u0001\u0000\u0000\u0000"
          + "\u012a\u012b\u0007\u0005\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000"
          + "\u012c\u012d\u0006+\u0001\u0000\u012dX\u0001\u0000\u0000\u0000\u012e\u012f"
          + "\u0007\u0006\u0000\u0000\u012fZ\u0001\u0000\u0000\u0000\u0130\u0131\u0007"
          + "\u0007\u0000\u0000\u0131\\\u0001\u0000\u0000\u0000\f\u0000\u00f0\u00f5"
          + "\u00ff\u0104\u010b\u010d\u0117\u011a\u0121\u0124\u0128\u0002\u0000\u0001"
          + "\u0000\u0006\u0000\u0000";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
