package com.lisantra.arabicbasic; // Generated from
                                  // /Users/mgatto/Development/cs-361/ARABASIC2/src/main/antlr4/ArabicBASIC.g4 by ANTLR 4.10.1

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArabicBASICParser extends Parser {
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
  public static final int RULE_program = 0,
      RULE_block = 1,
      RULE_statement = 2,
      RULE_simpleAssignment = 3,
      RULE_arrayAssignment = 4,
      RULE_arrayCreation = 5,
      RULE_blank = 6,
      RULE_expression = 7,
      RULE_arrayIndex = 8,
      RULE_arraySize = 9,
      RULE_variable = 10;

  private static String[] makeRuleNames() {
    return new String[] {
      "program",
      "block",
      "statement",
      "simpleAssignment",
      "arrayAssignment",
      "arrayCreation",
      "blank",
      "expression",
      "arrayIndex",
      "arraySize",
      "variable"
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
        setState(22);
        block();
        setState(23);
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
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitBlock(this);
      else return visitor.visitChildren(this);
    }
  }

  public final BlockContext block() throws RecognitionException {
    BlockContext _localctx = new BlockContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_block);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(28);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while ((((_la) & ~0x3f) == 0
            && ((1L << _la)
                    & ((1L << T__0)
                        | (1L << T__4)
                        | (1L << COMMENT)
                        | (1L << IDENTIFIER)
                        | (1L << EOL)
                        | (1L << WS)))
                != 0)) {
          {
            {
              setState(25);
              statement();
            }
          }
          setState(30);
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

  public static class StatementContext extends ParserRuleContext {
    public TerminalNode COMMENT() {
      return getToken(ArabicBASICParser.COMMENT, 0);
    }

    public BlankContext blank() {
      return getRuleContext(BlankContext.class, 0);
    }

    public SimpleAssignmentContext simpleAssignment() {
      return getRuleContext(SimpleAssignmentContext.class, 0);
    }

    public ArrayAssignmentContext arrayAssignment() {
      return getRuleContext(ArrayAssignmentContext.class, 0);
    }

    public ArrayCreationContext arrayCreation() {
      return getRuleContext(ArrayCreationContext.class, 0);
    }

    public StatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_statement;
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
    enterRule(_localctx, 4, RULE_statement);
    try {
      setState(36);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case COMMENT:
          enterOuterAlt(_localctx, 1);
          {
            setState(31);
            match(COMMENT);
          }
          break;
        case EOL:
        case WS:
          enterOuterAlt(_localctx, 2);
          {
            setState(32);
            blank();
          }
          break;
        case T__0:
          enterOuterAlt(_localctx, 3);
          {
            setState(33);
            simpleAssignment();
          }
          break;
        case IDENTIFIER:
          enterOuterAlt(_localctx, 4);
          {
            setState(34);
            arrayAssignment();
          }
          break;
        case T__4:
          enterOuterAlt(_localctx, 5);
          {
            setState(35);
            arrayCreation();
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

  public static class SimpleAssignmentContext extends ParserRuleContext {
    public TerminalNode IDENTIFIER() {
      return getToken(ArabicBASICParser.IDENTIFIER, 0);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public TerminalNode EOL() {
      return getToken(ArabicBASICParser.EOL, 0);
    }

    public SimpleAssignmentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_simpleAssignment;
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitSimpleAssignment(this);
      else return visitor.visitChildren(this);
    }
  }

  public final SimpleAssignmentContext simpleAssignment() throws RecognitionException {
    SimpleAssignmentContext _localctx = new SimpleAssignmentContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_simpleAssignment);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(38);
        match(T__0);
        setState(39);
        match(IDENTIFIER);
        setState(40);
        match(T__1);
        setState(41);
        expression(0);
        setState(42);
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

  public static class ArrayAssignmentContext extends ParserRuleContext {
    public TerminalNode IDENTIFIER() {
      return getToken(ArabicBASICParser.IDENTIFIER, 0);
    }

    public ArrayIndexContext arrayIndex() {
      return getRuleContext(ArrayIndexContext.class, 0);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public TerminalNode EOL() {
      return getToken(ArabicBASICParser.EOL, 0);
    }

    public ArrayAssignmentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_arrayAssignment;
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitArrayAssignment(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ArrayAssignmentContext arrayAssignment() throws RecognitionException {
    ArrayAssignmentContext _localctx = new ArrayAssignmentContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_arrayAssignment);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(44);
        match(IDENTIFIER);
        setState(45);
        match(T__2);
        setState(46);
        arrayIndex();
        setState(47);
        match(T__3);
        setState(48);
        match(T__1);
        setState(49);
        expression(0);
        setState(50);
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

  public static class ArrayCreationContext extends ParserRuleContext {
    public TerminalNode IDENTIFIER() {
      return getToken(ArabicBASICParser.IDENTIFIER, 0);
    }

    public ArraySizeContext arraySize() {
      return getRuleContext(ArraySizeContext.class, 0);
    }

    public TerminalNode EOL() {
      return getToken(ArabicBASICParser.EOL, 0);
    }

    public ArrayCreationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_arrayCreation;
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitArrayCreation(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ArrayCreationContext arrayCreation() throws RecognitionException {
    ArrayCreationContext _localctx = new ArrayCreationContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_arrayCreation);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(52);
        match(T__4);
        setState(53);
        match(IDENTIFIER);
        setState(54);
        match(T__2);
        setState(55);
        arraySize();
        setState(56);
        match(T__3);
        setState(57);
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
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitBlank(this);
      else return visitor.visitChildren(this);
    }
  }

  public final BlankContext blank() throws RecognitionException {
    BlankContext _localctx = new BlankContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_blank);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(62);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == WS) {
          {
            {
              setState(59);
              match(WS);
            }
          }
          setState(64);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(65);
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

  public static class TermContext extends ExpressionContext {
    public VariableContext variable() {
      return getRuleContext(VariableContext.class, 0);
    }

    public TermContext(ExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitTerm(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class AddSubContext extends ExpressionContext {
    public Token op;

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public TerminalNode ADD() {
      return getToken(ArabicBASICParser.ADD, 0);
    }

    public TerminalNode SUB() {
      return getToken(ArabicBASICParser.SUB, 0);
    }

    public AddSubContext(ExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitAddSub(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ArrayAccessContext extends ExpressionContext {
    public TerminalNode IDENTIFIER() {
      return getToken(ArabicBASICParser.IDENTIFIER, 0);
    }

    public TerminalNode INTEGER() {
      return getToken(ArabicBASICParser.INTEGER, 0);
    }

    public ArrayAccessContext(ExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitArrayAccess(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class UnaryContext extends ExpressionContext {
    public TerminalNode SUB() {
      return getToken(ArabicBASICParser.SUB, 0);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public UnaryContext(ExpressionContext ctx) {
      copyFrom(ctx);
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
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitExponentation(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class MulDivContext extends ExpressionContext {
    public Token op;

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public TerminalNode MUL() {
      return getToken(ArabicBASICParser.MUL, 0);
    }

    public TerminalNode DIV() {
      return getToken(ArabicBASICParser.DIV, 0);
    }

    public MulDivContext(ExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitMulDiv(this);
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
    int _startState = 14;
    enterRecursionRule(_localctx, 14, RULE_expression, _p);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(79);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
          case 1:
            {
              _localctx = new ArrayAccessContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;

              setState(68);
              match(IDENTIFIER);
              setState(69);
              match(T__2);
              setState(70);
              match(INTEGER);
              setState(71);
              match(T__3);
            }
            break;
          case 2:
            {
              _localctx = new UnaryContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(72);
              match(SUB);
              setState(73);
              expression(6);
            }
            break;
          case 3:
            {
              _localctx = new TermContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(74);
              variable();
            }
            break;
          case 4:
            {
              _localctx = new NestedContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(75);
              match(T__2);
              setState(76);
              expression(0);
              setState(77);
              match(T__3);
            }
            break;
        }
        _ctx.stop = _input.LT(-1);
        setState(92);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            if (_parseListeners != null) triggerExitRuleEvent();
            _prevctx = _localctx;
            {
              setState(90);
              _errHandler.sync(this);
              switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
                case 1:
                  {
                    _localctx =
                        new ExponentationContext(new ExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(81);
                    if (!(precpred(_ctx, 5)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                    setState(82);
                    match(T__5);
                    setState(83);
                    expression(5);
                  }
                  break;
                case 2:
                  {
                    _localctx = new MulDivContext(new ExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(84);
                    if (!(precpred(_ctx, 4)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                    setState(85);
                    ((MulDivContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == MUL || _la == DIV)) {
                      ((MulDivContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(86);
                    expression(5);
                  }
                  break;
                case 3:
                  {
                    _localctx = new AddSubContext(new ExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(87);
                    if (!(precpred(_ctx, 3)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                    setState(88);
                    ((AddSubContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == ADD || _la == SUB)) {
                      ((AddSubContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(89);
                    expression(4);
                  }
                  break;
              }
            }
          }
          setState(94);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
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

  public static class ArrayIndexContext extends ParserRuleContext {
    public TerminalNode INTEGER() {
      return getToken(ArabicBASICParser.INTEGER, 0);
    }

    public ArrayIndexContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_arrayIndex;
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitArrayIndex(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ArrayIndexContext arrayIndex() throws RecognitionException {
    ArrayIndexContext _localctx = new ArrayIndexContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_arrayIndex);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(95);
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

  public static class ArraySizeContext extends ParserRuleContext {
    public TerminalNode INTEGER() {
      return getToken(ArabicBASICParser.INTEGER, 0);
    }

    public ArraySizeContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_arraySize;
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitArraySize(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ArraySizeContext arraySize() throws RecognitionException {
    ArraySizeContext _localctx = new ArraySizeContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_arraySize);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(97);
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
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitName(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class NumericContext extends VariableContext {
    public TerminalNode INTEGER() {
      return getToken(ArabicBASICParser.INTEGER, 0);
    }

    public TerminalNode REAL() {
      return getToken(ArabicBASICParser.REAL, 0);
    }

    public NumericContext(VariableContext ctx) {
      copyFrom(ctx);
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
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitText(this);
      else return visitor.visitChildren(this);
    }
  }

  public final VariableContext variable() throws RecognitionException {
    VariableContext _localctx = new VariableContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_variable);
    int _la;
    try {
      setState(102);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case IDENTIFIER:
          _localctx = new NameContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(99);
            match(IDENTIFIER);
          }
          break;
        case INTEGER:
        case REAL:
          _localctx = new NumericContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(100);
            _la = _input.LA(1);
            if (!(_la == INTEGER || _la == REAL)) {
              _errHandler.recoverInline(this);
            } else {
              if (_input.LA(1) == Token.EOF) matchedEOF = true;
              _errHandler.reportMatch(this);
              consume();
            }
          }
          break;
        case STRING:
          _localctx = new TextContext(_localctx);
          enterOuterAlt(_localctx, 3);
          {
            setState(101);
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

  public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
    switch (ruleIndex) {
      case 7:
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
      "\u0004\u0001\u0011i\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"
          + "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"
          + "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"
          + "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"
          + "\u0000\u0001\u0001\u0005\u0001\u001b\b\u0001\n\u0001\f\u0001\u001e\t\u0001"
          + "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"
          + "%\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"
          + "\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"
          + "\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"
          + "\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0005\u0006"
          + "=\b\u0006\n\u0006\f\u0006@\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"
          + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
          + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"
          + "P\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
          + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007[\b\u0007"
          + "\n\u0007\f\u0007^\t\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"
          + "\n\u0001\n\u0003\ng\b\n\u0001\n\u0000\u0001\u000e\u000b\u0000\u0002\u0004"
          + "\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0003\u0001\u0000\f\r\u0001"
          + "\u0000\u000e\u000f\u0001\u0000\n\u000bk\u0000\u0016\u0001\u0000\u0000"
          + "\u0000\u0002\u001c\u0001\u0000\u0000\u0000\u0004$\u0001\u0000\u0000\u0000"
          + "\u0006&\u0001\u0000\u0000\u0000\b,\u0001\u0000\u0000\u0000\n4\u0001\u0000"
          + "\u0000\u0000\f>\u0001\u0000\u0000\u0000\u000eO\u0001\u0000\u0000\u0000"
          + "\u0010_\u0001\u0000\u0000\u0000\u0012a\u0001\u0000\u0000\u0000\u0014f"
          + "\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0002\u0001\u0000\u0017\u0018"
          + "\u0005\u0000\u0000\u0001\u0018\u0001\u0001\u0000\u0000\u0000\u0019\u001b"
          + "\u0003\u0004\u0002\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u001e"
          + "\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001d"
          + "\u0001\u0000\u0000\u0000\u001d\u0003\u0001\u0000\u0000\u0000\u001e\u001c"
          + "\u0001\u0000\u0000\u0000\u001f%\u0005\u0007\u0000\u0000 %\u0003\f\u0006"
          + "\u0000!%\u0003\u0006\u0003\u0000\"%\u0003\b\u0004\u0000#%\u0003\n\u0005"
          + "\u0000$\u001f\u0001\u0000\u0000\u0000$ \u0001\u0000\u0000\u0000$!\u0001"
          + "\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000"
          + "%\u0005\u0001\u0000\u0000\u0000&\'\u0005\u0001\u0000\u0000\'(\u0005\b"
          + "\u0000\u0000()\u0005\u0002\u0000\u0000)*\u0003\u000e\u0007\u0000*+\u0005"
          + "\u0010\u0000\u0000+\u0007\u0001\u0000\u0000\u0000,-\u0005\b\u0000\u0000"
          + "-.\u0005\u0003\u0000\u0000./\u0003\u0010\b\u0000/0\u0005\u0004\u0000\u0000"
          + "01\u0005\u0002\u0000\u000012\u0003\u000e\u0007\u000023\u0005\u0010\u0000"
          + "\u00003\t\u0001\u0000\u0000\u000045\u0005\u0005\u0000\u000056\u0005\b"
          + "\u0000\u000067\u0005\u0003\u0000\u000078\u0003\u0012\t\u000089\u0005\u0004"
          + "\u0000\u00009:\u0005\u0010\u0000\u0000:\u000b\u0001\u0000\u0000\u0000"
          + ";=\u0005\u0011\u0000\u0000<;\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000"
          + "\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?A\u0001\u0000"
          + "\u0000\u0000@>\u0001\u0000\u0000\u0000AB\u0005\u0010\u0000\u0000B\r\u0001"
          + "\u0000\u0000\u0000CD\u0006\u0007\uffff\uffff\u0000DE\u0005\b\u0000\u0000"
          + "EF\u0005\u0003\u0000\u0000FG\u0005\n\u0000\u0000GP\u0005\u0004\u0000\u0000"
          + "HI\u0005\u000f\u0000\u0000IP\u0003\u000e\u0007\u0006JP\u0003\u0014\n\u0000"
          + "KL\u0005\u0003\u0000\u0000LM\u0003\u000e\u0007\u0000MN\u0005\u0004\u0000"
          + "\u0000NP\u0001\u0000\u0000\u0000OC\u0001\u0000\u0000\u0000OH\u0001\u0000"
          + "\u0000\u0000OJ\u0001\u0000\u0000\u0000OK\u0001\u0000\u0000\u0000P\\\u0001"
          + "\u0000\u0000\u0000QR\n\u0005\u0000\u0000RS\u0005\u0006\u0000\u0000S[\u0003"
          + "\u000e\u0007\u0005TU\n\u0004\u0000\u0000UV\u0007\u0000\u0000\u0000V[\u0003"
          + "\u000e\u0007\u0005WX\n\u0003\u0000\u0000XY\u0007\u0001\u0000\u0000Y[\u0003"
          + "\u000e\u0007\u0004ZQ\u0001\u0000\u0000\u0000ZT\u0001\u0000\u0000\u0000"
          + "ZW\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"
          + "\u0000\\]\u0001\u0000\u0000\u0000]\u000f\u0001\u0000\u0000\u0000^\\\u0001"
          + "\u0000\u0000\u0000_`\u0005\n\u0000\u0000`\u0011\u0001\u0000\u0000\u0000"
          + "ab\u0005\n\u0000\u0000b\u0013\u0001\u0000\u0000\u0000cg\u0005\b\u0000"
          + "\u0000dg\u0007\u0002\u0000\u0000eg\u0005\t\u0000\u0000fc\u0001\u0000\u0000"
          + "\u0000fd\u0001\u0000\u0000\u0000fe\u0001\u0000\u0000\u0000g\u0015\u0001"
          + "\u0000\u0000\u0000\u0007\u001c$>OZ\\f";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
