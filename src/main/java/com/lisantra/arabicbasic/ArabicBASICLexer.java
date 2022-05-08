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
      COMMENT = 23,
      IDENTIFIER = 24,
      STRING = 25,
      INTEGER = 26,
      REAL = 27,
      EOL = 28,
      WS = 29;
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
      "'ELSE'",
      "'END IF'",
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
      "\u0004\u0000\u001d\u00c8\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"
          + "\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"
          + "\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"
          + "\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"
          + "\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"
          + "\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"
          + "\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"
          + "\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"
          + "\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"
          + "\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"
          + "\u0002\u001e\u0007\u001e\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"
          + "\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"
          + "\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"
          + "\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"
          + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"
          + "\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"
          + "\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"
          + "\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"
          + "\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"
          + "\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"
          + "\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"
          + "\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0089\b\u0016"
          + "\u0001\u0016\u0005\u0016\u008c\b\u0016\n\u0016\f\u0016\u008f\t\u0016\u0001"
          + "\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0004\u0017\u0096"
          + "\b\u0017\u000b\u0017\f\u0017\u0097\u0001\u0017\u0005\u0017\u009b\b\u0017"
          + "\n\u0017\f\u0017\u009e\t\u0017\u0001\u0018\u0001\u0018\u0005\u0018\u00a2"
          + "\b\u0018\n\u0018\f\u0018\u00a5\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019"
          + "\u0001\u0019\u0001\u0019\u0005\u0019\u00ac\b\u0019\n\u0019\f\u0019\u00af"
          + "\t\u0019\u0003\u0019\u00b1\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"
          + "\u0004\u001a\u00b6\b\u001a\u000b\u001a\f\u001a\u00b7\u0001\u001b\u0003"
          + "\u001b\u00bb\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u00bf\b\u001b"
          + "\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"
          + "\u0001\u001e\u0001\u001e\u0000\u0000\u001f\u0001\u0001\u0003\u0002\u0005"
          + "\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"
          + "\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"
          + "#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"
          + "7\u001c9\u001d;\u0000=\u0000\u0001\u0000\b\u0002\u0000\n\n\r\r\u0001\u0000"
          + "AZ\u0003\u000009AZ__\u0003\u0000  AZaz\u0001\u000019\u0002\u0000\t\t "
          + " \u0001\u000009\u0002\u0000AZaz\u00cf\u0000\u0001\u0001\u0000\u0000\u0000"
          + "\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"
          + "\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"
          + "\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"
          + "\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"
          + "\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"
          + "\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"
          + "\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"
          + "\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"
          + "\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"
          + "\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"
          + "-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"
          + "\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"
          + "\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0001"
          + "?\u0001\u0000\u0000\u0000\u0003C\u0001\u0000\u0000\u0000\u0005E\u0001"
          + "\u0000\u0000\u0000\u0007G\u0001\u0000\u0000\u0000\tI\u0001\u0000\u0000"
          + "\u0000\u000bM\u0001\u0000\u0000\u0000\rP\u0001\u0000\u0000\u0000\u000f"
          + "U\u0001\u0000\u0000\u0000\u0011Z\u0001\u0000\u0000\u0000\u0013a\u0001"
          + "\u0000\u0000\u0000\u0015c\u0001\u0000\u0000\u0000\u0017e\u0001\u0000\u0000"
          + "\u0000\u0019g\u0001\u0000\u0000\u0000\u001bi\u0001\u0000\u0000\u0000\u001d"
          + "k\u0001\u0000\u0000\u0000\u001fm\u0001\u0000\u0000\u0000!o\u0001\u0000"
          + "\u0000\u0000#r\u0001\u0000\u0000\u0000%u\u0001\u0000\u0000\u0000\'x\u0001"
          + "\u0000\u0000\u0000)|\u0001\u0000\u0000\u0000+\u0080\u0001\u0000\u0000"
          + "\u0000-\u0088\u0001\u0000\u0000\u0000/\u0095\u0001\u0000\u0000\u00001"
          + "\u009f\u0001\u0000\u0000\u00003\u00b0\u0001\u0000\u0000\u00005\u00b2\u0001"
          + "\u0000\u0000\u00007\u00be\u0001\u0000\u0000\u00009\u00c0\u0001\u0000\u0000"
          + "\u0000;\u00c4\u0001\u0000\u0000\u0000=\u00c6\u0001\u0000\u0000\u0000?"
          + "@\u0005L\u0000\u0000@A\u0005E\u0000\u0000AB\u0005T\u0000\u0000B\u0002"
          + "\u0001\u0000\u0000\u0000CD\u0005=\u0000\u0000D\u0004\u0001\u0000\u0000"
          + "\u0000EF\u0005(\u0000\u0000F\u0006\u0001\u0000\u0000\u0000GH\u0005)\u0000"
          + "\u0000H\b\u0001\u0000\u0000\u0000IJ\u0005D\u0000\u0000JK\u0005I\u0000"
          + "\u0000KL\u0005M\u0000\u0000L\n\u0001\u0000\u0000\u0000MN\u0005I\u0000"
          + "\u0000NO\u0005F\u0000\u0000O\f\u0001\u0000\u0000\u0000PQ\u0005T\u0000"
          + "\u0000QR\u0005H\u0000\u0000RS\u0005E\u0000\u0000ST\u0005N\u0000\u0000"
          + "T\u000e\u0001\u0000\u0000\u0000UV\u0005E\u0000\u0000VW\u0005L\u0000\u0000"
          + "WX\u0005S\u0000\u0000XY\u0005E\u0000\u0000Y\u0010\u0001\u0000\u0000\u0000"
          + "Z[\u0005E\u0000\u0000[\\\u0005N\u0000\u0000\\]\u0005D\u0000\u0000]^\u0005"
          + " \u0000\u0000^_\u0005I\u0000\u0000_`\u0005F\u0000\u0000`\u0012\u0001\u0000"
          + "\u0000\u0000ab\u0005-\u0000\u0000b\u0014\u0001\u0000\u0000\u0000cd\u0005"
          + "^\u0000\u0000d\u0016\u0001\u0000\u0000\u0000ef\u0005*\u0000\u0000f\u0018"
          + "\u0001\u0000\u0000\u0000gh\u0005/\u0000\u0000h\u001a\u0001\u0000\u0000"
          + "\u0000ij\u0005+\u0000\u0000j\u001c\u0001\u0000\u0000\u0000kl\u0005>\u0000"
          + "\u0000l\u001e\u0001\u0000\u0000\u0000mn\u0005<\u0000\u0000n \u0001\u0000"
          + "\u0000\u0000op\u0005<\u0000\u0000pq\u0005=\u0000\u0000q\"\u0001\u0000"
          + "\u0000\u0000rs\u0005>\u0000\u0000st\u0005=\u0000\u0000t$\u0001\u0000\u0000"
          + "\u0000uv\u0005<\u0000\u0000vw\u0005>\u0000\u0000w&\u0001\u0000\u0000\u0000"
          + "xy\u0005N\u0000\u0000yz\u0005O\u0000\u0000z{\u0005T\u0000\u0000{(\u0001"
          + "\u0000\u0000\u0000|}\u0005A\u0000\u0000}~\u0005N\u0000\u0000~\u007f\u0005"
          + "D\u0000\u0000\u007f*\u0001\u0000\u0000\u0000\u0080\u0081\u0005O\u0000"
          + "\u0000\u0081\u0082\u0005R\u0000\u0000\u0082,\u0001\u0000\u0000\u0000\u0083"
          + "\u0084\u0005/\u0000\u0000\u0084\u0089\u0005/\u0000\u0000\u0085\u0086\u0005"
          + "R\u0000\u0000\u0086\u0087\u0005E\u0000\u0000\u0087\u0089\u0005M\u0000"
          + "\u0000\u0088\u0083\u0001\u0000\u0000\u0000\u0088\u0085\u0001\u0000\u0000"
          + "\u0000\u0089\u008d\u0001\u0000\u0000\u0000\u008a\u008c\b\u0000\u0000\u0000"
          + "\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000"
          + "\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"
          + "\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"
          + "\u0090\u0091\u00037\u001b\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092"
          + "\u0093\u0006\u0016\u0000\u0000\u0093.\u0001\u0000\u0000\u0000\u0094\u0096"
          + "\u0007\u0001\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0097"
          + "\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098"
          + "\u0001\u0000\u0000\u0000\u0098\u009c\u0001\u0000\u0000\u0000\u0099\u009b"
          + "\u0007\u0002\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009e"
          + "\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d"
          + "\u0001\u0000\u0000\u0000\u009d0\u0001\u0000\u0000\u0000\u009e\u009c\u0001"
          + "\u0000\u0000\u0000\u009f\u00a3\u0005\"\u0000\u0000\u00a0\u00a2\u0007\u0003"
          + "\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000"
          + "\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000"
          + "\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000"
          + "\u0000\u0000\u00a6\u00a7\u0005\"\u0000\u0000\u00a72\u0001\u0000\u0000"
          + "\u0000\u00a8\u00b1\u00050\u0000\u0000\u00a9\u00ad\u0007\u0004\u0000\u0000"
          + "\u00aa\u00ac\u0003;\u001d\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac"
          + "\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad"
          + "\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af"
          + "\u00ad\u0001\u0000\u0000\u0000\u00b0\u00a8\u0001\u0000\u0000\u0000\u00b0"
          + "\u00a9\u0001\u0000\u0000\u0000\u00b14\u0001\u0000\u0000\u0000\u00b2\u00b3"
          + "\u0003;\u001d\u0000\u00b3\u00b5\u0005.\u0000\u0000\u00b4\u00b6\u0003;"
          + "\u001d\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000"
          + "\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"
          + "\u0000\u0000\u00b86\u0001\u0000\u0000\u0000\u00b9\u00bb\u0005\r\u0000"
          + "\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000"
          + "\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bf\u0005\n\u0000\u0000"
          + "\u00bd\u00bf\u0005\u2028\u0000\u0000\u00be\u00ba\u0001\u0000\u0000\u0000"
          + "\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf8\u0001\u0000\u0000\u0000\u00c0"
          + "\u00c1\u0007\u0005\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2"
          + "\u00c3\u0006\u001c\u0001\u0000\u00c3:\u0001\u0000\u0000\u0000\u00c4\u00c5"
          + "\u0007\u0006\u0000\u0000\u00c5<\u0001\u0000\u0000\u0000\u00c6\u00c7\u0007"
          + "\u0007\u0000\u0000\u00c7>\u0001\u0000\u0000\u0000\u000b\u0000\u0088\u008d"
          + "\u0097\u009c\u00a3\u00ad\u00b0\u00b7\u00ba\u00be\u0002\u0000\u0001\u0000"
          + "\u0006\u0000\u0000";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
