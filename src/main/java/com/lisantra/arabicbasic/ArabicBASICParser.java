package com.lisantra.arabicbasic; // Generated from
// /Users/mgatto/Development/cs-361/ARABASIC2/src/main/antlr4/ArabicBASIC.g4 by ANTLR 4.9.2

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArabicBASICParser extends Parser {
  static {
    RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION);
  }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
  public static final int T__0 = 1,
      T__1 = 2,
      Comment = 3,
      Identifier = 4,
      String = 5,
      Integer = 6,
      Real = 7,
      EOL = 8,
      WS = 9;
  public static final int RULE_program = 0,
      RULE_statement = 1,
      RULE_assignment = 2,
      RULE_blank = 3,
      RULE_variable = 4;

  private static String[] makeRuleNames() {
    return new String[] {"program", "statement", "assignment", "blank", "variable"};
  }

  public static final String[] ruleNames = makeRuleNames();

  private static String[] makeLiteralNames() {
    return new String[] {null, "'LET'", "'='"};
  }

  private static final String[] _LITERAL_NAMES = makeLiteralNames();

  private static String[] makeSymbolicNames() {
    return new String[] {
      null, null, null, "Comment", "Identifier", "String", "Integer", "Real", "EOL", "WS"
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
  public ATN getATN() {
    return _ATN;
  }

  public ArabicBASICParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
  }

  public static class ProgramContext extends ParserRuleContext {
    public TerminalNode EOF() {
      return getToken(ArabicBASICParser.EOF, 0);
    }

    public List<StatementContext> statement() {
      return getRuleContexts(StatementContext.class);
    }

    public StatementContext statement(int i) {
      return getRuleContext(StatementContext.class, i);
    }

    public ProgramContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_program;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).enterProgram(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).exitProgram(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitProgram(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ProgramContext program() throws RecognitionException {
    ProgramContext _localctx = new ProgramContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_program);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(11);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(10);
              statement();
            }
          }
          setState(13);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ((((_la) & ~0x3f) == 0
            && ((1L << _la) & ((1L << T__0) | (1L << Comment) | (1L << EOL) | (1L << WS))) != 0));
        setState(15);
        match(EOF);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class StatementContext extends ParserRuleContext {
    public AssignmentContext assignment() {
      return getRuleContext(AssignmentContext.class, 0);
    }

    public TerminalNode Comment() {
      return getToken(ArabicBASICParser.Comment, 0);
    }

    public BlankContext blank() {
      return getRuleContext(BlankContext.class, 0);
    }

    public StatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_statement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).enterStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).exitStatement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitStatement(this);
      else return visitor.visitChildren(this);
    }
  }

  public final StatementContext statement() throws RecognitionException {
    StatementContext _localctx = new StatementContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_statement);
    try {
      setState(20);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case T__0:
          enterOuterAlt(_localctx, 1);
          {
            setState(17);
            assignment();
          }
          break;
        case Comment:
          enterOuterAlt(_localctx, 2);
          {
            setState(18);
            match(Comment);
          }
          break;
        case EOL:
        case WS:
          enterOuterAlt(_localctx, 3);
          {
            setState(19);
            blank();
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class AssignmentContext extends ParserRuleContext {
    public TerminalNode Identifier() {
      return getToken(ArabicBASICParser.Identifier, 0);
    }

    public VariableContext variable() {
      return getRuleContext(VariableContext.class, 0);
    }

    public TerminalNode EOL() {
      return getToken(ArabicBASICParser.EOL, 0);
    }

    public AssignmentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_assignment;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).enterAssignment(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).exitAssignment(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitAssignment(this);
      else return visitor.visitChildren(this);
    }
  }

  public final AssignmentContext assignment() throws RecognitionException {
    AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_assignment);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(22);
        match(T__0);
        setState(23);
        match(Identifier);
        setState(24);
        match(T__1);
        setState(25);
        variable();
        setState(26);
        match(EOL);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class BlankContext extends ParserRuleContext {
    public TerminalNode EOL() {
      return getToken(ArabicBASICParser.EOL, 0);
    }

    public List<TerminalNode> WS() {
      return getTokens(ArabicBASICParser.WS);
    }

    public TerminalNode WS(int i) {
      return getToken(ArabicBASICParser.WS, i);
    }

    public BlankContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_blank;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).enterBlank(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener) ((ArabicBASICListener) listener).exitBlank(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitBlank(this);
      else return visitor.visitChildren(this);
    }
  }

  public final BlankContext blank() throws RecognitionException {
    BlankContext _localctx = new BlankContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_blank);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(31);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == WS) {
          {
            {
              setState(28);
              match(WS);
            }
          }
          setState(33);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(34);
        match(EOL);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class VariableContext extends ParserRuleContext {
    public VariableContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_variable;
    }

    public VariableContext() {}

    public void copyFrom(VariableContext ctx) {
      super.copyFrom(ctx);
    }
  }

  public static class NameContext extends VariableContext {
    public TerminalNode Identifier() {
      return getToken(ArabicBASICParser.Identifier, 0);
    }

    public NameContext(VariableContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener) ((ArabicBASICListener) listener).enterName(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener) ((ArabicBASICListener) listener).exitName(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitName(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class TextContext extends VariableContext {
    public TerminalNode String() {
      return getToken(ArabicBASICParser.String, 0);
    }

    public TextContext(VariableContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener) ((ArabicBASICListener) listener).enterText(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener) ((ArabicBASICListener) listener).exitText(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitText(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class FloatContext extends VariableContext {
    public TerminalNode Real() {
      return getToken(ArabicBASICParser.Real, 0);
    }

    public FloatContext(VariableContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).enterFloat(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener) ((ArabicBASICListener) listener).exitFloat(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitFloat(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class IntContext extends VariableContext {
    public TerminalNode Integer() {
      return getToken(ArabicBASICParser.Integer, 0);
    }

    public IntContext(VariableContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener) ((ArabicBASICListener) listener).enterInt(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener) ((ArabicBASICListener) listener).exitInt(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitInt(this);
      else return visitor.visitChildren(this);
    }
  }

  public final VariableContext variable() throws RecognitionException {
    VariableContext _localctx = new VariableContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_variable);
    try {
      setState(40);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case Identifier:
          _localctx = new NameContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(36);
            match(Identifier);
          }
          break;
        case Integer:
          _localctx = new IntContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(37);
            match(Integer);
          }
          break;
        case String:
          _localctx = new TextContext(_localctx);
          enterOuterAlt(_localctx, 3);
          {
            setState(38);
            match(String);
          }
          break;
        case Real:
          _localctx = new FloatContext(_localctx);
          enterOuterAlt(_localctx, 4);
          {
            setState(39);
            match(Real);
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static final String _serializedATN =
      "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13-\4\2\t\2\4\3\t"
          + "\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\2\3\2\3\3\3\3"
          + "\3\3\5\3\27\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\7\5 \n\5\f\5\16\5#\13\5\3"
          + "\5\3\5\3\6\3\6\3\6\3\6\5\6+\n\6\3\6\2\2\7\2\4\6\b\n\2\2\2.\2\r\3\2\2\2"
          + "\4\26\3\2\2\2\6\30\3\2\2\2\b!\3\2\2\2\n*\3\2\2\2\f\16\5\4\3\2\r\f\3\2"
          + "\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\21\3\2\2\2\21\22\7\2"
          + "\2\3\22\3\3\2\2\2\23\27\5\6\4\2\24\27\7\5\2\2\25\27\5\b\5\2\26\23\3\2"
          + "\2\2\26\24\3\2\2\2\26\25\3\2\2\2\27\5\3\2\2\2\30\31\7\3\2\2\31\32\7\6"
          + "\2\2\32\33\7\4\2\2\33\34\5\n\6\2\34\35\7\n\2\2\35\7\3\2\2\2\36 \7\13\2"
          + "\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2"
          + "$%\7\n\2\2%\t\3\2\2\2&+\7\6\2\2\'+\7\b\2\2(+\7\7\2\2)+\7\t\2\2*&\3\2\2"
          + "\2*\'\3\2\2\2*(\3\2\2\2*)\3\2\2\2+\13\3\2\2\2\6\17\26!*";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
