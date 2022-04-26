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
  public static final int RULE_program = 0,
      RULE_statement = 1,
      RULE_assignment = 2,
      RULE_blank = 3,
      RULE_expression = 4,
      RULE_array_size = 5,
      RULE_array_creation = 6,
      RULE_array_expression = 7,
      RULE_array_access = 8,
      RULE_block = 9,
      RULE_variable = 10,
      RULE_number = 11;

  private static String[] makeRuleNames() {
    return new String[] {
      "program",
      "statement",
      "assignment",
      "blank",
      "expression",
      "array_size",
      "array_creation",
      "array_expression",
      "array_access",
      "block",
      "variable",
      "number"
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
    public BlockContext block() {
      return getRuleContext(BlockContext.class, 0);
    }

    public TerminalNode EOF() {
      return getToken(ArabicBASICParser.EOF, 0);
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
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(24);
        block();
        setState(25);
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
    public TerminalNode COMMENT() {
      return getToken(ArabicBASICParser.COMMENT, 0);
    }

    public BlankContext blank() {
      return getRuleContext(BlankContext.class, 0);
    }

    public AssignmentContext assignment() {
      return getRuleContext(AssignmentContext.class, 0);
    }

    public Array_creationContext array_creation() {
      return getRuleContext(Array_creationContext.class, 0);
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
      setState(31);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case COMMENT:
          enterOuterAlt(_localctx, 1);
          {
            setState(27);
            match(COMMENT);
          }
          break;
        case EOL:
        case WS:
          enterOuterAlt(_localctx, 2);
          {
            setState(28);
            blank();
          }
          break;
        case T__0:
          enterOuterAlt(_localctx, 3);
          {
            setState(29);
            assignment();
          }
          break;
        case T__9:
          enterOuterAlt(_localctx, 4);
          {
            setState(30);
            array_creation();
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
    public TerminalNode IDENTIFIER() {
      return getToken(ArabicBASICParser.IDENTIFIER, 0);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
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
        setState(33);
        match(T__0);
        setState(34);
        match(IDENTIFIER);
        setState(35);
        match(T__1);
        setState(36);
        expression(0);
        setState(37);
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
        setState(42);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == WS) {
          {
            {
              setState(39);
              match(WS);
            }
          }
          setState(44);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(45);
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

  public static class ExpressionContext extends ParserRuleContext {
    public ExpressionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_expression;
    }

    public ExpressionContext() {}

    public void copyFrom(ExpressionContext ctx) {
      super.copyFrom(ctx);
    }
  }

  public static class ArrayCreateContext extends ExpressionContext {
    public Array_expressionContext array_expression() {
      return getRuleContext(Array_expressionContext.class, 0);
    }

    public ArrayCreateContext(ExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).enterArrayCreate(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).exitArrayCreate(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitArrayCreate(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class AddsubContext extends ExpressionContext {
    public Token op;

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public AddsubContext(ExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).enterAddsub(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).exitAddsub(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitAddsub(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class TermContext extends ExpressionContext {
    public VariableContext variable() {
      return getRuleContext(VariableContext.class, 0);
    }

    public TermContext(ExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener) ((ArabicBASICListener) listener).enterTerm(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener) ((ArabicBASICListener) listener).exitTerm(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitTerm(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ArrayAccessContext extends ExpressionContext {
    public Array_accessContext array_access() {
      return getRuleContext(Array_accessContext.class, 0);
    }

    public ArrayAccessContext(ExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).enterArrayAccess(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).exitArrayAccess(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitArrayAccess(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class UnaryContext extends ExpressionContext {
    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public UnaryContext(ExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).enterUnary(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener) ((ArabicBASICListener) listener).exitUnary(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitUnary(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class NestedContext extends ExpressionContext {
    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public NestedContext(ExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).enterNested(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).exitNested(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitNested(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ExponentationContext extends ExpressionContext {
    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public ExponentationContext(ExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).enterExponentation(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).exitExponentation(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitExponentation(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class MuldivContext extends ExpressionContext {
    public Token op;

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public MuldivContext(ExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).enterMuldiv(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).exitMuldiv(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitMuldiv(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ExpressionContext expression() throws RecognitionException {
    return expression(0);
  }

  private ExpressionContext expression(int _p) throws RecognitionException {
    ParserRuleContext _parentctx = _ctx;
    int _parentState = getState();
    ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
    ExpressionContext _prevctx = _localctx;
    int _startState = 8;
    enterRecursionRule(_localctx, 8, RULE_expression, _p);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(57);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
          case 1:
            {
              _localctx = new ArrayCreateContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;

              setState(48);
              array_expression();
            }
            break;
          case 2:
            {
              _localctx = new ArrayAccessContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(49);
              array_access();
            }
            break;
          case 3:
            {
              _localctx = new UnaryContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(50);
              match(T__2);
              setState(51);
              expression(6);
            }
            break;
          case 4:
            {
              _localctx = new TermContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(52);
              variable();
            }
            break;
          case 5:
            {
              _localctx = new NestedContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(53);
              match(T__7);
              setState(54);
              expression(0);
              setState(55);
              match(T__8);
            }
            break;
        }
        _ctx.stop = _input.LT(-1);
        setState(70);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            if (_parseListeners != null) triggerExitRuleEvent();
            _prevctx = _localctx;
            {
              setState(68);
              _errHandler.sync(this);
              switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                case 1:
                  {
                    _localctx =
                        new ExponentationContext(new ExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(59);
                    if (!(precpred(_ctx, 5)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                    setState(60);
                    match(T__3);
                    setState(61);
                    expression(6);
                  }
                  break;
                case 2:
                  {
                    _localctx = new MuldivContext(new ExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(62);
                    if (!(precpred(_ctx, 4)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                    setState(63);
                    ((MuldivContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == T__4 || _la == T__5)) {
                      ((MuldivContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(64);
                    expression(5);
                  }
                  break;
                case 3:
                  {
                    _localctx = new AddsubContext(new ExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(65);
                    if (!(precpred(_ctx, 3)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                    setState(66);
                    ((AddsubContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == T__2 || _la == T__6)) {
                      ((AddsubContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(67);
                    expression(4);
                  }
                  break;
              }
            }
          }
          setState(72);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      unrollRecursionContexts(_parentctx);
    }
    return _localctx;
  }

  public static class Array_sizeContext extends ParserRuleContext {
    public Array_sizeContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_array_size;
    }

    public Array_sizeContext() {}

    public void copyFrom(Array_sizeContext ctx) {
      super.copyFrom(ctx);
    }
  }

  public static class SizeContext extends Array_sizeContext {
    public TerminalNode INTEGER() {
      return getToken(ArabicBASICParser.INTEGER, 0);
    }

    public SizeContext(Array_sizeContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener) ((ArabicBASICListener) listener).enterSize(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener) ((ArabicBASICListener) listener).exitSize(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitSize(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Array_sizeContext array_size() throws RecognitionException {
    Array_sizeContext _localctx = new Array_sizeContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_array_size);
    try {
      _localctx = new SizeContext(_localctx);
      enterOuterAlt(_localctx, 1);
      {
        setState(73);
        match(INTEGER);
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

  public static class Array_creationContext extends ParserRuleContext {
    public TerminalNode IDENTIFIER() {
      return getToken(ArabicBASICParser.IDENTIFIER, 0);
    }

    public Array_sizeContext array_size() {
      return getRuleContext(Array_sizeContext.class, 0);
    }

    public Array_creationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_array_creation;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).enterArray_creation(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).exitArray_creation(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitArray_creation(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Array_creationContext array_creation() throws RecognitionException {
    Array_creationContext _localctx = new Array_creationContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_array_creation);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(75);
        match(T__9);
        setState(76);
        match(IDENTIFIER);
        setState(77);
        match(T__7);
        setState(78);
        array_size();
        setState(79);
        match(T__8);
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

  public static class Array_expressionContext extends ParserRuleContext {
    public Array_sizeContext array_size() {
      return getRuleContext(Array_sizeContext.class, 0);
    }

    public Array_expressionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_array_expression;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).enterArray_expression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).exitArray_expression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitArray_expression(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Array_expressionContext array_expression() throws RecognitionException {
    Array_expressionContext _localctx = new Array_expressionContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_array_expression);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(81);
        match(T__10);
        setState(82);
        match(T__7);
        setState(83);
        array_size();
        setState(84);
        match(T__8);
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

  public static class Array_accessContext extends ParserRuleContext {
    public TerminalNode IDENTIFIER() {
      return getToken(ArabicBASICParser.IDENTIFIER, 0);
    }

    public TerminalNode INTEGER() {
      return getToken(ArabicBASICParser.INTEGER, 0);
    }

    public Array_accessContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_array_access;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).enterArray_access(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).exitArray_access(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitArray_access(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Array_accessContext array_access() throws RecognitionException {
    Array_accessContext _localctx = new Array_accessContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_array_access);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(86);
        match(IDENTIFIER);
        setState(87);
        match(T__7);
        setState(88);
        match(INTEGER);
        setState(89);
        match(T__8);
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

  public static class BlockContext extends ParserRuleContext {
    public List<StatementContext> statement() {
      return getRuleContexts(StatementContext.class);
    }

    public StatementContext statement(int i) {
      return getRuleContext(StatementContext.class, i);
    }

    public BlockContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_block;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).enterBlock(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener) ((ArabicBASICListener) listener).exitBlock(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitBlock(this);
      else return visitor.visitChildren(this);
    }
  }

  public final BlockContext block() throws RecognitionException {
    BlockContext _localctx = new BlockContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_block);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(94);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while ((((_la) & ~0x3f) == 0
            && ((1L << _la)
                    & ((1L << T__0) | (1L << T__9) | (1L << COMMENT) | (1L << EOL) | (1L << WS)))
                != 0)) {
          {
            {
              setState(91);
              statement();
            }
          }
          setState(96);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
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
    public TerminalNode IDENTIFIER() {
      return getToken(ArabicBASICParser.IDENTIFIER, 0);
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

  public static class NumericContext extends VariableContext {
    public NumberContext number() {
      return getRuleContext(NumberContext.class, 0);
    }

    public NumericContext(VariableContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).enterNumeric(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).exitNumeric(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitNumeric(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class TextContext extends VariableContext {
    public TerminalNode STRING() {
      return getToken(ArabicBASICParser.STRING, 0);
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

  public final VariableContext variable() throws RecognitionException {
    VariableContext _localctx = new VariableContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_variable);
    try {
      setState(100);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case IDENTIFIER:
          _localctx = new NameContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(97);
            match(IDENTIFIER);
          }
          break;
        case INTEGER:
        case REAL:
          _localctx = new NumericContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(98);
            number();
          }
          break;
        case STRING:
          _localctx = new TextContext(_localctx);
          enterOuterAlt(_localctx, 3);
          {
            setState(99);
            match(STRING);
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

  public static class NumberContext extends ParserRuleContext {
    public TerminalNode INTEGER() {
      return getToken(ArabicBASICParser.INTEGER, 0);
    }

    public TerminalNode REAL() {
      return getToken(ArabicBASICParser.REAL, 0);
    }

    public NumberContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_number;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).enterNumber(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof ArabicBASICListener)
        ((ArabicBASICListener) listener).exitNumber(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitNumber(this);
      else return visitor.visitChildren(this);
    }
  }

  public final NumberContext number() throws RecognitionException {
    NumberContext _localctx = new NumberContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_number);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(102);
        _la = _input.LA(1);
        if (!(_la == INTEGER || _la == REAL)) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
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

  public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
    switch (ruleIndex) {
      case 4:
        return expression_sempred((ExpressionContext) _localctx, predIndex);
    }
    return true;
  }

  private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
    switch (predIndex) {
      case 0:
        return precpred(_ctx, 5);
      case 1:
        return precpred(_ctx, 4);
      case 2:
        return precpred(_ctx, 3);
    }
    return true;
  }

  public static final String _serializedATN =
      "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24k\4\2\t\2\4\3\t"
          + "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"
          + "\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\"\n\3\3\4\3\4\3\4\3\4\3"
          + "\4\3\4\3\5\7\5+\n\5\f\5\16\5.\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"
          + "\3\6\3\6\3\6\5\6<\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6G\n\6\f\6"
          + "\16\6J\13\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3"
          + "\n\3\n\3\n\3\n\3\13\7\13_\n\13\f\13\16\13b\13\13\3\f\3\f\3\f\5\fg\n\f"
          + "\3\r\3\r\3\r\2\3\n\16\2\4\6\b\n\f\16\20\22\24\26\30\2\5\3\2\7\b\4\2\5"
          + "\5\t\t\3\2\21\22\2l\2\32\3\2\2\2\4!\3\2\2\2\6#\3\2\2\2\b,\3\2\2\2\n;\3"
          + "\2\2\2\fK\3\2\2\2\16M\3\2\2\2\20S\3\2\2\2\22X\3\2\2\2\24`\3\2\2\2\26f"
          + "\3\2\2\2\30h\3\2\2\2\32\33\5\24\13\2\33\34\7\2\2\3\34\3\3\2\2\2\35\"\7"
          + "\16\2\2\36\"\5\b\5\2\37\"\5\6\4\2 \"\5\16\b\2!\35\3\2\2\2!\36\3\2\2\2"
          + "!\37\3\2\2\2! \3\2\2\2\"\5\3\2\2\2#$\7\3\2\2$%\7\17\2\2%&\7\4\2\2&\'\5"
          + "\n\6\2\'(\7\23\2\2(\7\3\2\2\2)+\7\24\2\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2"
          + ",-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\7\23\2\2\60\t\3\2\2\2\61\62\b\6\1\2"
          + "\62<\5\20\t\2\63<\5\22\n\2\64\65\7\5\2\2\65<\5\n\6\b\66<\5\26\f\2\678"
          + "\7\n\2\289\5\n\6\29:\7\13\2\2:<\3\2\2\2;\61\3\2\2\2;\63\3\2\2\2;\64\3"
          + "\2\2\2;\66\3\2\2\2;\67\3\2\2\2<H\3\2\2\2=>\f\7\2\2>?\7\6\2\2?G\5\n\6\b"
          + "@A\f\6\2\2AB\t\2\2\2BG\5\n\6\7CD\f\5\2\2DE\t\3\2\2EG\5\n\6\6F=\3\2\2\2"
          + "F@\3\2\2\2FC\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\13\3\2\2\2JH\3\2\2"
          + "\2KL\7\21\2\2L\r\3\2\2\2MN\7\f\2\2NO\7\17\2\2OP\7\n\2\2PQ\5\f\7\2QR\7"
          + "\13\2\2R\17\3\2\2\2ST\7\r\2\2TU\7\n\2\2UV\5\f\7\2VW\7\13\2\2W\21\3\2\2"
          + "\2XY\7\17\2\2YZ\7\n\2\2Z[\7\21\2\2[\\\7\13\2\2\\\23\3\2\2\2]_\5\4\3\2"
          + "^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\25\3\2\2\2b`\3\2\2\2cg\7\17"
          + "\2\2dg\5\30\r\2eg\7\20\2\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\27\3\2\2\2h"
          + "i\t\4\2\2i\31\3\2\2\2\t!,;FH`f";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
