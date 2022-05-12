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

import java.util.ArrayList;
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
      COMMENT = 28,
      IDENTIFIER = 29,
      STRING = 30,
      INTEGER = 31,
      REAL = 32,
      EOL = 33,
      WS = 34;
  public static final int RULE_program = 0,
      RULE_block = 1,
      RULE_statement = 2,
      RULE_simpleAssignment = 3,
      RULE_arrayAssignment = 4,
      RULE_arrayCreation = 5,
      RULE_conditionalBlock = 6,
      RULE_print = 7,
      RULE_input = 8,
      RULE_blank = 9,
      RULE_expression = 10,
      RULE_subscript = 11,
      RULE_arraySize = 12,
      RULE_booleanExpression = 13,
      RULE_variable = 14;

  private static String[] makeRuleNames() {
    return new String[] {
      "program",
      "block",
      "statement",
      "simpleAssignment",
      "arrayAssignment",
      "arrayCreation",
      "conditionalBlock",
      "print",
      "input",
      "blank",
      "expression",
      "subscript",
      "arraySize",
      "booleanExpression",
      "variable"
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
        setState(30);
        block();
        setState(31);
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
        setState(36);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while ((((_la) & ~0x3f) == 0
            && ((1L << _la)
                    & ((1L << T__0)
                        | (1L << T__4)
                        | (1L << T__5)
                        | (1L << T__10)
                        | (1L << T__13)
                        | (1L << COMMENT)
                        | (1L << IDENTIFIER)
                        | (1L << EOL)
                        | (1L << WS)))
                != 0)) {
          {
            {
              setState(33);
              statement();
            }
          }
          setState(38);
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

    public TerminalNode EOL() {
      return getToken(ArabicBASICParser.EOL, 0);
    }

    public ArrayAssignmentContext arrayAssignment() {
      return getRuleContext(ArrayAssignmentContext.class, 0);
    }

    public ArrayCreationContext arrayCreation() {
      return getRuleContext(ArrayCreationContext.class, 0);
    }

    public ConditionalBlockContext conditionalBlock() {
      return getRuleContext(ConditionalBlockContext.class, 0);
    }

    public PrintContext print() {
      return getRuleContext(PrintContext.class, 0);
    }

    public InputContext input() {
      return getRuleContext(InputContext.class, 0);
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
      setState(59);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case COMMENT:
          enterOuterAlt(_localctx, 1);
          {
            setState(39);
            match(COMMENT);
          }
          break;
        case EOL:
        case WS:
          enterOuterAlt(_localctx, 2);
          {
            setState(40);
            blank();
          }
          break;
        case T__0:
          enterOuterAlt(_localctx, 3);
          {
            setState(41);
            simpleAssignment();
            setState(42);
            match(EOL);
          }
          break;
        case IDENTIFIER:
          enterOuterAlt(_localctx, 4);
          {
            setState(44);
            arrayAssignment();
            setState(45);
            match(EOL);
          }
          break;
        case T__4:
          enterOuterAlt(_localctx, 5);
          {
            setState(47);
            arrayCreation();
            setState(48);
            match(EOL);
          }
          break;
        case T__5:
          enterOuterAlt(_localctx, 6);
          {
            setState(50);
            conditionalBlock();
            setState(51);
            match(EOL);
          }
          break;
        case T__10:
          enterOuterAlt(_localctx, 7);
          {
            setState(53);
            print();
            setState(54);
            match(EOL);
          }
          break;
        case T__13:
          enterOuterAlt(_localctx, 8);
          {
            setState(56);
            input();
            setState(57);
            match(EOL);
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
        setState(61);
        match(T__0);
        setState(62);
        match(IDENTIFIER);
        setState(63);
        match(T__1);
        setState(64);
        expression(0);
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

    public SubscriptContext subscript() {
      return getRuleContext(SubscriptContext.class, 0);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
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
        setState(66);
        match(IDENTIFIER);
        setState(67);
        match(T__2);
        setState(68);
        subscript();
        setState(69);
        match(T__3);
        setState(70);
        match(T__1);
        setState(71);
        expression(0);
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
        setState(73);
        match(T__4);
        setState(74);
        match(IDENTIFIER);
        setState(75);
        match(T__2);
        setState(76);
        arraySize();
        setState(77);
        match(T__3);
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

  public static class ConditionalBlockContext extends ParserRuleContext {
    public BooleanExpressionContext booleanExpression;
    public List<BooleanExpressionContext> tests = new ArrayList<BooleanExpressionContext>();

    public List<TerminalNode> EOL() {
      return getTokens(ArabicBASICParser.EOL);
    }

    public TerminalNode EOL(int i) {
      return getToken(ArabicBASICParser.EOL, i);
    }

    public List<BlockContext> block() {
      return getRuleContexts(BlockContext.class);
    }

    public BlockContext block(int i) {
      return getRuleContext(BlockContext.class, i);
    }

    public List<BooleanExpressionContext> booleanExpression() {
      return getRuleContexts(BooleanExpressionContext.class);
    }

    public BooleanExpressionContext booleanExpression(int i) {
      return getRuleContext(BooleanExpressionContext.class, i);
    }

    public ConditionalBlockContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_conditionalBlock;
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitConditionalBlock(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ConditionalBlockContext conditionalBlock() throws RecognitionException {
    ConditionalBlockContext _localctx = new ConditionalBlockContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_conditionalBlock);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(79);
        match(T__5);
        setState(80);
        ((ConditionalBlockContext) _localctx).booleanExpression = booleanExpression(0);
        ((ConditionalBlockContext) _localctx)
            .tests.add(((ConditionalBlockContext) _localctx).booleanExpression);
        setState(81);
        match(T__6);
        setState(82);
        match(EOL);
        setState(83);
        block();
        setState(92);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == T__7) {
          {
            {
              setState(84);
              match(T__7);
              setState(85);
              ((ConditionalBlockContext) _localctx).booleanExpression = booleanExpression(0);
              ((ConditionalBlockContext) _localctx)
                  .tests.add(((ConditionalBlockContext) _localctx).booleanExpression);
              setState(86);
              match(T__6);
              setState(87);
              match(EOL);
              setState(88);
              block();
            }
          }
          setState(94);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(98);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == T__8) {
          {
            setState(95);
            match(T__8);
            setState(96);
            match(EOL);
            setState(97);
            block();
          }
        }

        setState(100);
        match(T__9);
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

  public static class PrintContext extends ParserRuleContext {
    public Token s12;
    public List<Token> spacer = new ArrayList<Token>();
    public Token s13;
    public Token _tset171;

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public PrintContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_print;
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitPrint(this);
      else return visitor.visitChildren(this);
    }
  }

  public final PrintContext print() throws RecognitionException {
    PrintContext _localctx = new PrintContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_print);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(102);
        match(T__10);
        setState(103);
        expression(0);
        setState(108);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == T__11 || _la == T__12) {
          {
            {
              setState(104);
              ((PrintContext) _localctx)._tset171 = _input.LT(1);
              _la = _input.LA(1);
              if (!(_la == T__11 || _la == T__12)) {
                ((PrintContext) _localctx)._tset171 = (Token) _errHandler.recoverInline(this);
              } else {
                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                _errHandler.reportMatch(this);
                consume();
              }
              ((PrintContext) _localctx).spacer.add(((PrintContext) _localctx)._tset171);
              setState(105);
              expression(0);
            }
          }
          setState(110);
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

  public static class InputContext extends ParserRuleContext {
    public Token prompt;
    public Token spacer;
    public Token IDENTIFIER;
    public List<Token> var = new ArrayList<Token>();

    public List<TerminalNode> IDENTIFIER() {
      return getTokens(ArabicBASICParser.IDENTIFIER);
    }

    public TerminalNode IDENTIFIER(int i) {
      return getToken(ArabicBASICParser.IDENTIFIER, i);
    }

    public TerminalNode STRING() {
      return getToken(ArabicBASICParser.STRING, 0);
    }

    public InputContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_input;
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitInput(this);
      else return visitor.visitChildren(this);
    }
  }

  public final InputContext input() throws RecognitionException {
    InputContext _localctx = new InputContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_input);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(111);
        match(T__13);
        setState(114);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == STRING) {
          {
            setState(112);
            ((InputContext) _localctx).prompt = match(STRING);
            {
              setState(113);
              ((InputContext) _localctx).spacer = _input.LT(1);
              _la = _input.LA(1);
              if (!(_la == T__11 || _la == T__12)) {
                ((InputContext) _localctx).spacer = (Token) _errHandler.recoverInline(this);
              } else {
                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                _errHandler.reportMatch(this);
                consume();
              }
            }
          }
        }

        setState(116);
        ((InputContext) _localctx).IDENTIFIER = match(IDENTIFIER);
        ((InputContext) _localctx).var.add(((InputContext) _localctx).IDENTIFIER);
        setState(121);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == T__11) {
          {
            {
              setState(117);
              match(T__11);
              setState(118);
              ((InputContext) _localctx).IDENTIFIER = match(IDENTIFIER);
              ((InputContext) _localctx).var.add(((InputContext) _localctx).IDENTIFIER);
            }
          }
          setState(123);
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
    enterRule(_localctx, 18, RULE_blank);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(127);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == WS) {
          {
            {
              setState(124);
              match(WS);
            }
          }
          setState(129);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(130);
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

    public SubscriptContext subscript() {
      return getRuleContext(SubscriptContext.class, 0);
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
    int _startState = 20;
    enterRecursionRule(_localctx, 20, RULE_expression, _p);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(145);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
          case 1:
            {
              _localctx = new ArrayAccessContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;

              setState(133);
              match(IDENTIFIER);
              setState(134);
              match(T__2);
              setState(135);
              subscript();
              setState(136);
              match(T__3);
            }
            break;
          case 2:
            {
              _localctx = new UnaryContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(138);
              match(T__14);
              setState(139);
              expression(6);
            }
            break;
          case 3:
            {
              _localctx = new TermContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(140);
              variable();
            }
            break;
          case 4:
            {
              _localctx = new NestedContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(141);
              match(T__2);
              setState(142);
              expression(0);
              setState(143);
              match(T__3);
            }
            break;
        }
        _ctx.stop = _input.LT(-1);
        setState(158);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 10, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            if (_parseListeners != null) triggerExitRuleEvent();
            _prevctx = _localctx;
            {
              setState(156);
              _errHandler.sync(this);
              switch (getInterpreter().adaptivePredict(_input, 9, _ctx)) {
                case 1:
                  {
                    _localctx =
                        new ExponentationContext(new ExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(147);
                    if (!(precpred(_ctx, 5)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                    setState(148);
                    match(T__15);
                    setState(149);
                    expression(5);
                  }
                  break;
                case 2:
                  {
                    _localctx = new MulDivContext(new ExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(150);
                    if (!(precpred(_ctx, 4)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                    setState(151);
                    ((MulDivContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == T__16 || _la == T__17)) {
                      ((MulDivContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(152);
                    expression(5);
                  }
                  break;
                case 3:
                  {
                    _localctx = new AddSubContext(new ExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(153);
                    if (!(precpred(_ctx, 3)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                    setState(154);
                    ((AddSubContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == T__14 || _la == T__18)) {
                      ((AddSubContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(155);
                    expression(4);
                  }
                  break;
              }
            }
          }
          setState(160);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 10, _ctx);
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

  public static class SubscriptContext extends ParserRuleContext {
    public TerminalNode INTEGER() {
      return getToken(ArabicBASICParser.INTEGER, 0);
    }

    public TerminalNode IDENTIFIER() {
      return getToken(ArabicBASICParser.IDENTIFIER, 0);
    }

    public SubscriptContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_subscript;
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitSubscript(this);
      else return visitor.visitChildren(this);
    }
  }

  public final SubscriptContext subscript() throws RecognitionException {
    SubscriptContext _localctx = new SubscriptContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_subscript);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(161);
        _la = _input.LA(1);
        if (!(_la == IDENTIFIER || _la == INTEGER)) {
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
    enterRule(_localctx, 24, RULE_arraySize);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(163);
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

  public static class BooleanExpressionContext extends ParserRuleContext {
    public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_booleanExpression;
    }

    public BooleanExpressionContext() {}

    public void copyFrom(BooleanExpressionContext ctx) {
      super.copyFrom(ctx);
    }
  }

  public static class AtomicBooleanContext extends BooleanExpressionContext {
    public VariableContext variable() {
      return getRuleContext(VariableContext.class, 0);
    }

    public AtomicBooleanContext(BooleanExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitAtomicBoolean(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class LogicalAndContext extends BooleanExpressionContext {
    public List<BooleanExpressionContext> booleanExpression() {
      return getRuleContexts(BooleanExpressionContext.class);
    }

    public BooleanExpressionContext booleanExpression(int i) {
      return getRuleContext(BooleanExpressionContext.class, i);
    }

    public LogicalAndContext(BooleanExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitLogicalAnd(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ComparitiveBooleanContext extends BooleanExpressionContext {
    public Token comp;

    public List<BooleanExpressionContext> booleanExpression() {
      return getRuleContexts(BooleanExpressionContext.class);
    }

    public BooleanExpressionContext booleanExpression(int i) {
      return getRuleContext(BooleanExpressionContext.class, i);
    }

    public ComparitiveBooleanContext(BooleanExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitComparitiveBoolean(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class LogicalOrContext extends BooleanExpressionContext {
    public List<BooleanExpressionContext> booleanExpression() {
      return getRuleContexts(BooleanExpressionContext.class);
    }

    public BooleanExpressionContext booleanExpression(int i) {
      return getRuleContext(BooleanExpressionContext.class, i);
    }

    public LogicalOrContext(BooleanExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitLogicalOr(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class NegatingBooleanContext extends BooleanExpressionContext {
    public BooleanExpressionContext booleanExpression() {
      return getRuleContext(BooleanExpressionContext.class, 0);
    }

    public NegatingBooleanContext(BooleanExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitNegatingBoolean(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class NestedBooleanContext extends BooleanExpressionContext {
    public BooleanExpressionContext booleanExpression() {
      return getRuleContext(BooleanExpressionContext.class, 0);
    }

    public NestedBooleanContext(BooleanExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitNestedBoolean(this);
      else return visitor.visitChildren(this);
    }
  }

  public final BooleanExpressionContext booleanExpression() throws RecognitionException {
    return booleanExpression(0);
  }

  private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
    ParserRuleContext _parentctx = _ctx;
    int _parentState = getState();
    BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
    BooleanExpressionContext _prevctx = _localctx;
    int _startState = 26;
    enterRecursionRule(_localctx, 26, RULE_booleanExpression, _p);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(173);
        _errHandler.sync(this);
        switch (_input.LA(1)) {
          case T__24:
            {
              _localctx = new NegatingBooleanContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;

              setState(166);
              match(T__24);
              setState(167);
              booleanExpression(5);
            }
            break;
          case IDENTIFIER:
          case STRING:
          case INTEGER:
          case REAL:
            {
              _localctx = new AtomicBooleanContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(168);
              variable();
            }
            break;
          case T__2:
            {
              _localctx = new NestedBooleanContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(169);
              match(T__2);
              setState(170);
              booleanExpression(0);
              setState(171);
              match(T__3);
            }
            break;
          default:
            throw new NoViableAltException(this);
        }
        _ctx.stop = _input.LT(-1);
        setState(186);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            if (_parseListeners != null) triggerExitRuleEvent();
            _prevctx = _localctx;
            {
              setState(184);
              _errHandler.sync(this);
              switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
                case 1:
                  {
                    _localctx =
                        new ComparitiveBooleanContext(
                            new BooleanExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
                    setState(175);
                    if (!(precpred(_ctx, 6)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                    setState(176);
                    ((ComparitiveBooleanContext) _localctx).comp = _input.LT(1);
                    _la = _input.LA(1);
                    if (!((((_la) & ~0x3f) == 0
                        && ((1L << _la)
                                & ((1L << T__1)
                                    | (1L << T__19)
                                    | (1L << T__20)
                                    | (1L << T__21)
                                    | (1L << T__22)
                                    | (1L << T__23)))
                            != 0))) {
                      ((ComparitiveBooleanContext) _localctx).comp =
                          (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(177);
                    booleanExpression(7);
                  }
                  break;
                case 2:
                  {
                    _localctx =
                        new LogicalAndContext(
                            new BooleanExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
                    setState(178);
                    if (!(precpred(_ctx, 4)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                    setState(179);
                    match(T__25);
                    setState(180);
                    booleanExpression(5);
                  }
                  break;
                case 3:
                  {
                    _localctx =
                        new LogicalOrContext(
                            new BooleanExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
                    setState(181);
                    if (!(precpred(_ctx, 3)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                    setState(182);
                    match(T__26);
                    setState(183);
                    booleanExpression(4);
                  }
                  break;
              }
            }
          }
          setState(188);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
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
    enterRule(_localctx, 28, RULE_variable);
    int _la;
    try {
      setState(192);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case IDENTIFIER:
          _localctx = new NameContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(189);
            match(IDENTIFIER);
          }
          break;
        case INTEGER:
        case REAL:
          _localctx = new NumericContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(190);
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
            setState(191);
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
      case 10:
        return expression_sempred((ExpressionContext) _localctx, predIndex);
      case 13:
        return booleanExpression_sempred((BooleanExpressionContext) _localctx, predIndex);
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

  private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
    switch (predIndex) {
      case 3:
        return precpred(_ctx, 6);
      case 4:
        return precpred(_ctx, 4);
      case 5:
        return precpred(_ctx, 3);
    }
    return true;
  }

  public static final String _serializedATN =
      "\u0004\u0001\"\u00c3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"
          + "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"
          + "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"
          + "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"
          + "\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"
          + "\u0001\u0000\u0001\u0001\u0005\u0001#\b\u0001\n\u0001\f\u0001&\t\u0001"
          + "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"
          + "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"
          + "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"
          + "\u0001\u0002\u0001\u0002\u0003\u0002<\b\u0002\u0001\u0003\u0001\u0003"
          + "\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"
          + "\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"
          + "\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"
          + "\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"
          + "\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006[\b\u0006\n\u0006\f\u0006"
          + "^\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006c\b\u0006\u0001"
          + "\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"
          + "\u0007k\b\u0007\n\u0007\f\u0007n\t\u0007\u0001\b\u0001\b\u0001\b\u0003"
          + "\bs\b\b\u0001\b\u0001\b\u0001\b\u0005\bx\b\b\n\b\f\b{\t\b\u0001\t\u0005"
          + "\t~\b\t\n\t\f\t\u0081\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"
          + "\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"
          + "\n\u0003\n\u0092\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"
          + "\n\u0001\n\u0001\n\u0005\n\u009d\b\n\n\n\f\n\u00a0\t\n\u0001\u000b\u0001"
          + "\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"
          + "\u0001\r\u0001\r\u0003\r\u00ae\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"
          + "\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00b9\b\r\n\r\f\r\u00bc\t\r"
          + "\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00c1\b\u000e\u0001\u000e"
          + "\u0000\u0002\u0014\u001a\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"
          + "\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0006\u0001\u0000\f\r\u0001"
          + "\u0000\u0011\u0012\u0002\u0000\u000f\u000f\u0013\u0013\u0002\u0000\u001d"
          + "\u001d\u001f\u001f\u0002\u0000\u0002\u0002\u0014\u0018\u0001\u0000\u001f"
          + " \u00ce\u0000\u001e\u0001\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000"
          + "\u0004;\u0001\u0000\u0000\u0000\u0006=\u0001\u0000\u0000\u0000\bB\u0001"
          + "\u0000\u0000\u0000\nI\u0001\u0000\u0000\u0000\fO\u0001\u0000\u0000\u0000"
          + "\u000ef\u0001\u0000\u0000\u0000\u0010o\u0001\u0000\u0000\u0000\u0012\u007f"
          + "\u0001\u0000\u0000\u0000\u0014\u0091\u0001\u0000\u0000\u0000\u0016\u00a1"
          + "\u0001\u0000\u0000\u0000\u0018\u00a3\u0001\u0000\u0000\u0000\u001a\u00ad"
          + "\u0001\u0000\u0000\u0000\u001c\u00c0\u0001\u0000\u0000\u0000\u001e\u001f"
          + "\u0003\u0002\u0001\u0000\u001f \u0005\u0000\u0000\u0001 \u0001\u0001\u0000"
          + "\u0000\u0000!#\u0003\u0004\u0002\u0000\"!\u0001\u0000\u0000\u0000#&\u0001"
          + "\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000"
          + "%\u0003\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\'<\u0005\u001c"
          + "\u0000\u0000(<\u0003\u0012\t\u0000)*\u0003\u0006\u0003\u0000*+\u0005!"
          + "\u0000\u0000+<\u0001\u0000\u0000\u0000,-\u0003\b\u0004\u0000-.\u0005!"
          + "\u0000\u0000.<\u0001\u0000\u0000\u0000/0\u0003\n\u0005\u000001\u0005!"
          + "\u0000\u00001<\u0001\u0000\u0000\u000023\u0003\f\u0006\u000034\u0005!"
          + "\u0000\u00004<\u0001\u0000\u0000\u000056\u0003\u000e\u0007\u000067\u0005"
          + "!\u0000\u00007<\u0001\u0000\u0000\u000089\u0003\u0010\b\u00009:\u0005"
          + "!\u0000\u0000:<\u0001\u0000\u0000\u0000;\'\u0001\u0000\u0000\u0000;(\u0001"
          + "\u0000\u0000\u0000;)\u0001\u0000\u0000\u0000;,\u0001\u0000\u0000\u0000"
          + ";/\u0001\u0000\u0000\u0000;2\u0001\u0000\u0000\u0000;5\u0001\u0000\u0000"
          + "\u0000;8\u0001\u0000\u0000\u0000<\u0005\u0001\u0000\u0000\u0000=>\u0005"
          + "\u0001\u0000\u0000>?\u0005\u001d\u0000\u0000?@\u0005\u0002\u0000\u0000"
          + "@A\u0003\u0014\n\u0000A\u0007\u0001\u0000\u0000\u0000BC\u0005\u001d\u0000"
          + "\u0000CD\u0005\u0003\u0000\u0000DE\u0003\u0016\u000b\u0000EF\u0005\u0004"
          + "\u0000\u0000FG\u0005\u0002\u0000\u0000GH\u0003\u0014\n\u0000H\t\u0001"
          + "\u0000\u0000\u0000IJ\u0005\u0005\u0000\u0000JK\u0005\u001d\u0000\u0000"
          + "KL\u0005\u0003\u0000\u0000LM\u0003\u0018\f\u0000MN\u0005\u0004\u0000\u0000"
          + "N\u000b\u0001\u0000\u0000\u0000OP\u0005\u0006\u0000\u0000PQ\u0003\u001a"
          + "\r\u0000QR\u0005\u0007\u0000\u0000RS\u0005!\u0000\u0000S\\\u0003\u0002"
          + "\u0001\u0000TU\u0005\b\u0000\u0000UV\u0003\u001a\r\u0000VW\u0005\u0007"
          + "\u0000\u0000WX\u0005!\u0000\u0000XY\u0003\u0002\u0001\u0000Y[\u0001\u0000"
          + "\u0000\u0000ZT\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001"
          + "\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]b\u0001\u0000\u0000\u0000"
          + "^\\\u0001\u0000\u0000\u0000_`\u0005\t\u0000\u0000`a\u0005!\u0000\u0000"
          + "ac\u0003\u0002\u0001\u0000b_\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"
          + "\u0000cd\u0001\u0000\u0000\u0000de\u0005\n\u0000\u0000e\r\u0001\u0000"
          + "\u0000\u0000fg\u0005\u000b\u0000\u0000gl\u0003\u0014\n\u0000hi\u0007\u0000"
          + "\u0000\u0000ik\u0003\u0014\n\u0000jh\u0001\u0000\u0000\u0000kn\u0001\u0000"
          + "\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\u000f"
          + "\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000or\u0005\u000e\u0000"
          + "\u0000pq\u0005\u001e\u0000\u0000qs\u0007\u0000\u0000\u0000rp\u0001\u0000"
          + "\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000ty\u0005"
          + "\u001d\u0000\u0000uv\u0005\f\u0000\u0000vx\u0005\u001d\u0000\u0000wu\u0001"
          + "\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000"
          + "yz\u0001\u0000\u0000\u0000z\u0011\u0001\u0000\u0000\u0000{y\u0001\u0000"
          + "\u0000\u0000|~\u0005\"\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0081\u0001"
          + "\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000"
          + "\u0000\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000"
          + "\u0000\u0000\u0082\u0083\u0005!\u0000\u0000\u0083\u0013\u0001\u0000\u0000"
          + "\u0000\u0084\u0085\u0006\n\uffff\uffff\u0000\u0085\u0086\u0005\u001d\u0000"
          + "\u0000\u0086\u0087\u0005\u0003\u0000\u0000\u0087\u0088\u0003\u0016\u000b"
          + "\u0000\u0088\u0089\u0005\u0004\u0000\u0000\u0089\u0092\u0001\u0000\u0000"
          + "\u0000\u008a\u008b\u0005\u000f\u0000\u0000\u008b\u0092\u0003\u0014\n\u0006"
          + "\u008c\u0092\u0003\u001c\u000e\u0000\u008d\u008e\u0005\u0003\u0000\u0000"
          + "\u008e\u008f\u0003\u0014\n\u0000\u008f\u0090\u0005\u0004\u0000\u0000\u0090"
          + "\u0092\u0001\u0000\u0000\u0000\u0091\u0084\u0001\u0000\u0000\u0000\u0091"
          + "\u008a\u0001\u0000\u0000\u0000\u0091\u008c\u0001\u0000\u0000\u0000\u0091"
          + "\u008d\u0001\u0000\u0000\u0000\u0092\u009e\u0001\u0000\u0000\u0000\u0093"
          + "\u0094\n\u0005\u0000\u0000\u0094\u0095\u0005\u0010\u0000\u0000\u0095\u009d"
          + "\u0003\u0014\n\u0005\u0096\u0097\n\u0004\u0000\u0000\u0097\u0098\u0007"
          + "\u0001\u0000\u0000\u0098\u009d\u0003\u0014\n\u0005\u0099\u009a\n\u0003"
          + "\u0000\u0000\u009a\u009b\u0007\u0002\u0000\u0000\u009b\u009d\u0003\u0014"
          + "\n\u0004\u009c\u0093\u0001\u0000\u0000\u0000\u009c\u0096\u0001\u0000\u0000"
          + "\u0000\u009c\u0099\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000"
          + "\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000"
          + "\u0000\u009f\u0015\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000"
          + "\u0000\u00a1\u00a2\u0007\u0003\u0000\u0000\u00a2\u0017\u0001\u0000\u0000"
          + "\u0000\u00a3\u00a4\u0005\u001f\u0000\u0000\u00a4\u0019\u0001\u0000\u0000"
          + "\u0000\u00a5\u00a6\u0006\r\uffff\uffff\u0000\u00a6\u00a7\u0005\u0019\u0000"
          + "\u0000\u00a7\u00ae\u0003\u001a\r\u0005\u00a8\u00ae\u0003\u001c\u000e\u0000"
          + "\u00a9\u00aa\u0005\u0003\u0000\u0000\u00aa\u00ab\u0003\u001a\r\u0000\u00ab"
          + "\u00ac\u0005\u0004\u0000\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad"
          + "\u00a5\u0001\u0000\u0000\u0000\u00ad\u00a8\u0001\u0000\u0000\u0000\u00ad"
          + "\u00a9\u0001\u0000\u0000\u0000\u00ae\u00ba\u0001\u0000\u0000\u0000\u00af"
          + "\u00b0\n\u0006\u0000\u0000\u00b0\u00b1\u0007\u0004\u0000\u0000\u00b1\u00b9"
          + "\u0003\u001a\r\u0007\u00b2\u00b3\n\u0004\u0000\u0000\u00b3\u00b4\u0005"
          + "\u001a\u0000\u0000\u00b4\u00b9\u0003\u001a\r\u0005\u00b5\u00b6\n\u0003"
          + "\u0000\u0000\u00b6\u00b7\u0005\u001b\u0000\u0000\u00b7\u00b9\u0003\u001a"
          + "\r\u0004\u00b8\u00af\u0001\u0000\u0000\u0000\u00b8\u00b2\u0001\u0000\u0000"
          + "\u0000\u00b8\u00b5\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000"
          + "\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000"
          + "\u0000\u00bb\u001b\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000"
          + "\u0000\u00bd\u00c1\u0005\u001d\u0000\u0000\u00be\u00c1\u0007\u0005\u0000"
          + "\u0000\u00bf\u00c1\u0005\u001e\u0000\u0000\u00c0\u00bd\u0001\u0000\u0000"
          + "\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000"
          + "\u0000\u00c1\u001d\u0001\u0000\u0000\u0000\u000f$;\\blry\u007f\u0091\u009c"
          + "\u009e\u00ad\u00b8\u00ba\u00c0";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
