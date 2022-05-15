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
      T__27 = 28,
      T__28 = 29,
      T__29 = 30,
      T__30 = 31,
      T__31 = 32,
      T__32 = 33,
      T__33 = 34,
      COMMENT = 35,
      IDENTIFIER = 36,
      STRING = 37,
      INTEGER = 38,
      REAL = 39,
      EOL = 40,
      WS = 41;
  public static final int RULE_program = 0,
      RULE_block = 1,
      RULE_statement = 2,
      RULE_simpleAssignment = 3,
      RULE_arrayAssignment = 4,
      RULE_arrayCreation = 5,
      RULE_conditionalBlock = 6,
      RULE_forLoop = 7,
      RULE_whileLoop = 8,
      RULE_print = 9,
      RULE_input = 10,
      RULE_blank = 11,
      RULE_expression = 12,
      RULE_subscript = 13,
      RULE_arraySize = 14,
      RULE_booleanExpression = 15,
      RULE_variable = 16;

  private static String[] makeRuleNames() {
    return new String[] {
      "program",
      "block",
      "statement",
      "simpleAssignment",
      "arrayAssignment",
      "arrayCreation",
      "conditionalBlock",
      "forLoop",
      "whileLoop",
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
      "'FOR'",
      "'TO'",
      "'STEP'",
      "'NEXT'",
      "'WHILE'",
      "'END WHILE'",
      "'WEND'",
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
        setState(34);
        block();
        setState(35);
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
        setState(40);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while ((((_la) & ~0x3f) == 0
            && ((1L << _la)
                    & ((1L << T__0)
                        | (1L << T__4)
                        | (1L << T__5)
                        | (1L << T__10)
                        | (1L << T__14)
                        | (1L << T__17)
                        | (1L << T__20)
                        | (1L << COMMENT)
                        | (1L << IDENTIFIER)
                        | (1L << EOL)
                        | (1L << WS)))
                != 0)) {
          {
            {
              setState(37);
              statement();
            }
          }
          setState(42);
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

    public ForLoopContext forLoop() {
      return getRuleContext(ForLoopContext.class, 0);
    }

    public WhileLoopContext whileLoop() {
      return getRuleContext(WhileLoopContext.class, 0);
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
      setState(69);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case COMMENT:
          enterOuterAlt(_localctx, 1);
          {
            setState(43);
            match(COMMENT);
          }
          break;
        case EOL:
        case WS:
          enterOuterAlt(_localctx, 2);
          {
            setState(44);
            blank();
          }
          break;
        case T__0:
          enterOuterAlt(_localctx, 3);
          {
            setState(45);
            simpleAssignment();
            setState(46);
            match(EOL);
          }
          break;
        case IDENTIFIER:
          enterOuterAlt(_localctx, 4);
          {
            setState(48);
            arrayAssignment();
            setState(49);
            match(EOL);
          }
          break;
        case T__4:
          enterOuterAlt(_localctx, 5);
          {
            setState(51);
            arrayCreation();
            setState(52);
            match(EOL);
          }
          break;
        case T__5:
          enterOuterAlt(_localctx, 6);
          {
            setState(54);
            conditionalBlock();
            setState(55);
            match(EOL);
          }
          break;
        case T__10:
          enterOuterAlt(_localctx, 7);
          {
            setState(57);
            forLoop();
            setState(58);
            match(EOL);
          }
          break;
        case T__14:
          enterOuterAlt(_localctx, 8);
          {
            setState(60);
            whileLoop();
            setState(61);
            match(EOL);
          }
          break;
        case T__17:
          enterOuterAlt(_localctx, 9);
          {
            setState(63);
            print();
            setState(64);
            match(EOL);
          }
          break;
        case T__20:
          enterOuterAlt(_localctx, 10);
          {
            setState(66);
            input();
            setState(67);
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
        setState(71);
        match(T__0);
        setState(72);
        match(IDENTIFIER);
        setState(73);
        match(T__1);
        setState(74);
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
        setState(76);
        match(IDENTIFIER);
        setState(77);
        match(T__2);
        setState(78);
        subscript();
        setState(79);
        match(T__3);
        setState(80);
        match(T__1);
        setState(81);
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
        setState(83);
        match(T__4);
        setState(84);
        match(IDENTIFIER);
        setState(85);
        match(T__2);
        setState(86);
        arraySize();
        setState(87);
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
        setState(89);
        match(T__5);
        setState(90);
        ((ConditionalBlockContext) _localctx).booleanExpression = booleanExpression(0);
        ((ConditionalBlockContext) _localctx)
            .tests.add(((ConditionalBlockContext) _localctx).booleanExpression);
        setState(91);
        match(T__6);
        setState(92);
        match(EOL);
        setState(93);
        block();
        setState(102);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == T__7) {
          {
            {
              setState(94);
              match(T__7);
              setState(95);
              ((ConditionalBlockContext) _localctx).booleanExpression = booleanExpression(0);
              ((ConditionalBlockContext) _localctx)
                  .tests.add(((ConditionalBlockContext) _localctx).booleanExpression);
              setState(96);
              match(T__6);
              setState(97);
              match(EOL);
              setState(98);
              block();
            }
          }
          setState(104);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(108);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == T__8) {
          {
            setState(105);
            match(T__8);
            setState(106);
            match(EOL);
            setState(107);
            block();
          }
        }

        setState(110);
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

  public static class ForLoopContext extends ParserRuleContext {
    public Token control;
    public Token lower;
    public Token upper;
    public Token step;

    public TerminalNode EOL() {
      return getToken(ArabicBASICParser.EOL, 0);
    }

    public BlockContext block() {
      return getRuleContext(BlockContext.class, 0);
    }

    public TerminalNode IDENTIFIER() {
      return getToken(ArabicBASICParser.IDENTIFIER, 0);
    }

    public List<TerminalNode> INTEGER() {
      return getTokens(ArabicBASICParser.INTEGER);
    }

    public TerminalNode INTEGER(int i) {
      return getToken(ArabicBASICParser.INTEGER, i);
    }

    public ForLoopContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_forLoop;
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitForLoop(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ForLoopContext forLoop() throws RecognitionException {
    ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_forLoop);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(112);
        match(T__10);
        setState(113);
        ((ForLoopContext) _localctx).control = match(IDENTIFIER);
        setState(114);
        match(T__1);
        setState(115);
        ((ForLoopContext) _localctx).lower = match(INTEGER);
        setState(116);
        match(T__11);
        setState(117);
        ((ForLoopContext) _localctx).upper = match(INTEGER);
        setState(121);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == T__12) {
          {
            setState(118);
            match(T__12);
            setState(119);
            match(T__1);
            setState(120);
            ((ForLoopContext) _localctx).step = match(INTEGER);
          }
        }

        setState(123);
        match(EOL);
        setState(124);
        block();
        setState(125);
        match(T__13);
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

  public static class WhileLoopContext extends ParserRuleContext {
    public BooleanExpressionContext test;

    public TerminalNode EOL() {
      return getToken(ArabicBASICParser.EOL, 0);
    }

    public BlockContext block() {
      return getRuleContext(BlockContext.class, 0);
    }

    public BooleanExpressionContext booleanExpression() {
      return getRuleContext(BooleanExpressionContext.class, 0);
    }

    public WhileLoopContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_whileLoop;
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitWhileLoop(this);
      else return visitor.visitChildren(this);
    }
  }

  public final WhileLoopContext whileLoop() throws RecognitionException {
    WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_whileLoop);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(127);
        match(T__14);
        setState(128);
        ((WhileLoopContext) _localctx).test = booleanExpression(0);
        setState(129);
        match(EOL);
        setState(130);
        block();
        setState(131);
        _la = _input.LA(1);
        if (!(_la == T__15 || _la == T__16)) {
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

  public static class PrintContext extends ParserRuleContext {
    public Token s19;
    public List<Token> spacer = new ArrayList<Token>();
    public Token s20;
    public Token _tset246;

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
    enterRule(_localctx, 18, RULE_print);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(133);
        match(T__17);
        setState(134);
        expression(0);
        setState(139);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == T__18 || _la == T__19) {
          {
            {
              setState(135);
              ((PrintContext) _localctx)._tset246 = _input.LT(1);
              _la = _input.LA(1);
              if (!(_la == T__18 || _la == T__19)) {
                ((PrintContext) _localctx)._tset246 = (Token) _errHandler.recoverInline(this);
              } else {
                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                _errHandler.reportMatch(this);
                consume();
              }
              ((PrintContext) _localctx).spacer.add(((PrintContext) _localctx)._tset246);
              setState(136);
              expression(0);
            }
          }
          setState(141);
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
    enterRule(_localctx, 20, RULE_input);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(142);
        match(T__20);
        setState(145);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == STRING) {
          {
            setState(143);
            ((InputContext) _localctx).prompt = match(STRING);
            {
              setState(144);
              ((InputContext) _localctx).spacer = _input.LT(1);
              _la = _input.LA(1);
              if (!(_la == T__18 || _la == T__19)) {
                ((InputContext) _localctx).spacer = (Token) _errHandler.recoverInline(this);
              } else {
                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                _errHandler.reportMatch(this);
                consume();
              }
            }
          }
        }

        setState(147);
        ((InputContext) _localctx).IDENTIFIER = match(IDENTIFIER);
        ((InputContext) _localctx).var.add(((InputContext) _localctx).IDENTIFIER);
        setState(152);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == T__18) {
          {
            {
              setState(148);
              match(T__18);
              setState(149);
              ((InputContext) _localctx).IDENTIFIER = match(IDENTIFIER);
              ((InputContext) _localctx).var.add(((InputContext) _localctx).IDENTIFIER);
            }
          }
          setState(154);
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
    enterRule(_localctx, 22, RULE_blank);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(158);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == WS) {
          {
            {
              setState(155);
              match(WS);
            }
          }
          setState(160);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(161);
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
    int _startState = 24;
    enterRecursionRule(_localctx, 24, RULE_expression, _p);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(176);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 9, _ctx)) {
          case 1:
            {
              _localctx = new ArrayAccessContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;

              setState(164);
              match(IDENTIFIER);
              setState(165);
              match(T__2);
              setState(166);
              subscript();
              setState(167);
              match(T__3);
            }
            break;
          case 2:
            {
              _localctx = new UnaryContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(169);
              match(T__21);
              setState(170);
              expression(6);
            }
            break;
          case 3:
            {
              _localctx = new TermContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(171);
              variable();
            }
            break;
          case 4:
            {
              _localctx = new NestedContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(172);
              match(T__2);
              setState(173);
              expression(0);
              setState(174);
              match(T__3);
            }
            break;
        }
        _ctx.stop = _input.LT(-1);
        setState(189);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            if (_parseListeners != null) triggerExitRuleEvent();
            _prevctx = _localctx;
            {
              setState(187);
              _errHandler.sync(this);
              switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
                case 1:
                  {
                    _localctx =
                        new ExponentationContext(new ExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(178);
                    if (!(precpred(_ctx, 5)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                    setState(179);
                    match(T__22);
                    setState(180);
                    expression(5);
                  }
                  break;
                case 2:
                  {
                    _localctx = new MulDivContext(new ExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(181);
                    if (!(precpred(_ctx, 4)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                    setState(182);
                    ((MulDivContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == T__23 || _la == T__24)) {
                      ((MulDivContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(183);
                    expression(5);
                  }
                  break;
                case 3:
                  {
                    _localctx = new AddSubContext(new ExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(184);
                    if (!(precpred(_ctx, 3)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                    setState(185);
                    ((AddSubContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == T__21 || _la == T__25)) {
                      ((AddSubContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(186);
                    expression(4);
                  }
                  break;
              }
            }
          }
          setState(191);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
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
    enterRule(_localctx, 26, RULE_subscript);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(192);
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
    enterRule(_localctx, 28, RULE_arraySize);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(194);
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
    int _startState = 30;
    enterRecursionRule(_localctx, 30, RULE_booleanExpression, _p);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(204);
        _errHandler.sync(this);
        switch (_input.LA(1)) {
          case T__31:
            {
              _localctx = new NegatingBooleanContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;

              setState(197);
              match(T__31);
              setState(198);
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
              setState(199);
              variable();
            }
            break;
          case T__2:
            {
              _localctx = new NestedBooleanContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(200);
              match(T__2);
              setState(201);
              booleanExpression(0);
              setState(202);
              match(T__3);
            }
            break;
          default:
            throw new NoViableAltException(this);
        }
        _ctx.stop = _input.LT(-1);
        setState(217);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            if (_parseListeners != null) triggerExitRuleEvent();
            _prevctx = _localctx;
            {
              setState(215);
              _errHandler.sync(this);
              switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
                case 1:
                  {
                    _localctx =
                        new ComparitiveBooleanContext(
                            new BooleanExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
                    setState(206);
                    if (!(precpred(_ctx, 6)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                    setState(207);
                    ((ComparitiveBooleanContext) _localctx).comp = _input.LT(1);
                    _la = _input.LA(1);
                    if (!((((_la) & ~0x3f) == 0
                        && ((1L << _la)
                                & ((1L << T__1)
                                    | (1L << T__26)
                                    | (1L << T__27)
                                    | (1L << T__28)
                                    | (1L << T__29)
                                    | (1L << T__30)))
                            != 0))) {
                      ((ComparitiveBooleanContext) _localctx).comp =
                          (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(208);
                    booleanExpression(7);
                  }
                  break;
                case 2:
                  {
                    _localctx =
                        new LogicalAndContext(
                            new BooleanExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
                    setState(209);
                    if (!(precpred(_ctx, 4)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                    setState(210);
                    match(T__32);
                    setState(211);
                    booleanExpression(5);
                  }
                  break;
                case 3:
                  {
                    _localctx =
                        new LogicalOrContext(
                            new BooleanExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
                    setState(212);
                    if (!(precpred(_ctx, 3)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                    setState(213);
                    match(T__33);
                    setState(214);
                    booleanExpression(4);
                  }
                  break;
              }
            }
          }
          setState(219);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
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
    enterRule(_localctx, 32, RULE_variable);
    int _la;
    try {
      setState(223);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case IDENTIFIER:
          _localctx = new NameContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(220);
            match(IDENTIFIER);
          }
          break;
        case INTEGER:
        case REAL:
          _localctx = new NumericContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(221);
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
            setState(222);
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
      case 12:
        return expression_sempred((ExpressionContext) _localctx, predIndex);
      case 15:
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
      "\u0004\u0001)\u00e2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"
          + "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"
          + "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"
          + "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"
          + "\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"
          + "\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"
          + "\u0005\u0001\'\b\u0001\n\u0001\f\u0001*\t\u0001\u0001\u0002\u0001\u0002"
          + "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"
          + "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"
          + "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"
          + "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"
          + "\u0003\u0002F\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"
          + "\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"
          + "\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"
          + "\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"
          + "\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"
          + "\u0001\u0006\u0005\u0006e\b\u0006\n\u0006\f\u0006h\t\u0006\u0001\u0006"
          + "\u0001\u0006\u0001\u0006\u0003\u0006m\b\u0006\u0001\u0006\u0001\u0006"
          + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
          + "\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007z\b\u0007\u0001\u0007"
          + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"
          + "\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u008a\b\t\n\t\f\t\u008d"
          + "\t\t\u0001\n\u0001\n\u0001\n\u0003\n\u0092\b\n\u0001\n\u0001\n\u0001\n"
          + "\u0005\n\u0097\b\n\n\n\f\n\u009a\t\n\u0001\u000b\u0005\u000b\u009d\b\u000b"
          + "\n\u000b\f\u000b\u00a0\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"
          + "\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"
          + "\f\u0001\f\u0001\f\u0003\f\u00b1\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"
          + "\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00bc\b\f\n\f\f\f\u00bf\t\f"
          + "\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"
          + "\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"
          + "\u000f\u00cd\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"
          + "\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00d8"
          + "\b\u000f\n\u000f\f\u000f\u00db\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010"
          + "\u0003\u0010\u00e0\b\u0010\u0001\u0010\u0000\u0002\u0018\u001e\u0011\u0000"
          + "\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"
          + "\u001e \u0000\u0007\u0001\u0000\u0010\u0011\u0001\u0000\u0013\u0014\u0001"
          + "\u0000\u0018\u0019\u0002\u0000\u0016\u0016\u001a\u001a\u0002\u0000$$&"
          + "&\u0002\u0000\u0002\u0002\u001b\u001f\u0001\u0000&\'\u00ee\u0000\"\u0001"
          + "\u0000\u0000\u0000\u0002(\u0001\u0000\u0000\u0000\u0004E\u0001\u0000\u0000"
          + "\u0000\u0006G\u0001\u0000\u0000\u0000\bL\u0001\u0000\u0000\u0000\nS\u0001"
          + "\u0000\u0000\u0000\fY\u0001\u0000\u0000\u0000\u000ep\u0001\u0000\u0000"
          + "\u0000\u0010\u007f\u0001\u0000\u0000\u0000\u0012\u0085\u0001\u0000\u0000"
          + "\u0000\u0014\u008e\u0001\u0000\u0000\u0000\u0016\u009e\u0001\u0000\u0000"
          + "\u0000\u0018\u00b0\u0001\u0000\u0000\u0000\u001a\u00c0\u0001\u0000\u0000"
          + "\u0000\u001c\u00c2\u0001\u0000\u0000\u0000\u001e\u00cc\u0001\u0000\u0000"
          + "\u0000 \u00df\u0001\u0000\u0000\u0000\"#\u0003\u0002\u0001\u0000#$\u0005"
          + "\u0000\u0000\u0001$\u0001\u0001\u0000\u0000\u0000%\'\u0003\u0004\u0002"
          + "\u0000&%\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000"
          + "\u0000\u0000()\u0001\u0000\u0000\u0000)\u0003\u0001\u0000\u0000\u0000"
          + "*(\u0001\u0000\u0000\u0000+F\u0005#\u0000\u0000,F\u0003\u0016\u000b\u0000"
          + "-.\u0003\u0006\u0003\u0000./\u0005(\u0000\u0000/F\u0001\u0000\u0000\u0000"
          + "01\u0003\b\u0004\u000012\u0005(\u0000\u00002F\u0001\u0000\u0000\u0000"
          + "34\u0003\n\u0005\u000045\u0005(\u0000\u00005F\u0001\u0000\u0000\u0000"
          + "67\u0003\f\u0006\u000078\u0005(\u0000\u00008F\u0001\u0000\u0000\u0000"
          + "9:\u0003\u000e\u0007\u0000:;\u0005(\u0000\u0000;F\u0001\u0000\u0000\u0000"
          + "<=\u0003\u0010\b\u0000=>\u0005(\u0000\u0000>F\u0001\u0000\u0000\u0000"
          + "?@\u0003\u0012\t\u0000@A\u0005(\u0000\u0000AF\u0001\u0000\u0000\u0000"
          + "BC\u0003\u0014\n\u0000CD\u0005(\u0000\u0000DF\u0001\u0000\u0000\u0000"
          + "E+\u0001\u0000\u0000\u0000E,\u0001\u0000\u0000\u0000E-\u0001\u0000\u0000"
          + "\u0000E0\u0001\u0000\u0000\u0000E3\u0001\u0000\u0000\u0000E6\u0001\u0000"
          + "\u0000\u0000E9\u0001\u0000\u0000\u0000E<\u0001\u0000\u0000\u0000E?\u0001"
          + "\u0000\u0000\u0000EB\u0001\u0000\u0000\u0000F\u0005\u0001\u0000\u0000"
          + "\u0000GH\u0005\u0001\u0000\u0000HI\u0005$\u0000\u0000IJ\u0005\u0002\u0000"
          + "\u0000JK\u0003\u0018\f\u0000K\u0007\u0001\u0000\u0000\u0000LM\u0005$\u0000"
          + "\u0000MN\u0005\u0003\u0000\u0000NO\u0003\u001a\r\u0000OP\u0005\u0004\u0000"
          + "\u0000PQ\u0005\u0002\u0000\u0000QR\u0003\u0018\f\u0000R\t\u0001\u0000"
          + "\u0000\u0000ST\u0005\u0005\u0000\u0000TU\u0005$\u0000\u0000UV\u0005\u0003"
          + "\u0000\u0000VW\u0003\u001c\u000e\u0000WX\u0005\u0004\u0000\u0000X\u000b"
          + "\u0001\u0000\u0000\u0000YZ\u0005\u0006\u0000\u0000Z[\u0003\u001e\u000f"
          + "\u0000[\\\u0005\u0007\u0000\u0000\\]\u0005(\u0000\u0000]f\u0003\u0002"
          + "\u0001\u0000^_\u0005\b\u0000\u0000_`\u0003\u001e\u000f\u0000`a\u0005\u0007"
          + "\u0000\u0000ab\u0005(\u0000\u0000bc\u0003\u0002\u0001\u0000ce\u0001\u0000"
          + "\u0000\u0000d^\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001"
          + "\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gl\u0001\u0000\u0000\u0000"
          + "hf\u0001\u0000\u0000\u0000ij\u0005\t\u0000\u0000jk\u0005(\u0000\u0000"
          + "km\u0003\u0002\u0001\u0000li\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"
          + "\u0000mn\u0001\u0000\u0000\u0000no\u0005\n\u0000\u0000o\r\u0001\u0000"
          + "\u0000\u0000pq\u0005\u000b\u0000\u0000qr\u0005$\u0000\u0000rs\u0005\u0002"
          + "\u0000\u0000st\u0005&\u0000\u0000tu\u0005\f\u0000\u0000uy\u0005&\u0000"
          + "\u0000vw\u0005\r\u0000\u0000wx\u0005\u0002\u0000\u0000xz\u0005&\u0000"
          + "\u0000yv\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0001\u0000"
          + "\u0000\u0000{|\u0005(\u0000\u0000|}\u0003\u0002\u0001\u0000}~\u0005\u000e"
          + "\u0000\u0000~\u000f\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u000f\u0000"
          + "\u0000\u0080\u0081\u0003\u001e\u000f\u0000\u0081\u0082\u0005(\u0000\u0000"
          + "\u0082\u0083\u0003\u0002\u0001\u0000\u0083\u0084\u0007\u0000\u0000\u0000"
          + "\u0084\u0011\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0012\u0000\u0000"
          + "\u0086\u008b\u0003\u0018\f\u0000\u0087\u0088\u0007\u0001\u0000\u0000\u0088"
          + "\u008a\u0003\u0018\f\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008d"
          + "\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c"
          + "\u0001\u0000\u0000\u0000\u008c\u0013\u0001\u0000\u0000\u0000\u008d\u008b"
          + "\u0001\u0000\u0000\u0000\u008e\u0091\u0005\u0015\u0000\u0000\u008f\u0090"
          + "\u0005%\u0000\u0000\u0090\u0092\u0007\u0001\u0000\u0000\u0091\u008f\u0001"
          + "\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0001"
          + "\u0000\u0000\u0000\u0093\u0098\u0005$\u0000\u0000\u0094\u0095\u0005\u0013"
          + "\u0000\u0000\u0095\u0097\u0005$\u0000\u0000\u0096\u0094\u0001\u0000\u0000"
          + "\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000"
          + "\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u0015\u0001\u0000\u0000"
          + "\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009d\u0005)\u0000\u0000"
          + "\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000"
          + "\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000"
          + "\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000"
          + "\u00a1\u00a2\u0005(\u0000\u0000\u00a2\u0017\u0001\u0000\u0000\u0000\u00a3"
          + "\u00a4\u0006\f\uffff\uffff\u0000\u00a4\u00a5\u0005$\u0000\u0000\u00a5"
          + "\u00a6\u0005\u0003\u0000\u0000\u00a6\u00a7\u0003\u001a\r\u0000\u00a7\u00a8"
          + "\u0005\u0004\u0000\u0000\u00a8\u00b1\u0001\u0000\u0000\u0000\u00a9\u00aa"
          + "\u0005\u0016\u0000\u0000\u00aa\u00b1\u0003\u0018\f\u0006\u00ab\u00b1\u0003"
          + " \u0010\u0000\u00ac\u00ad\u0005\u0003\u0000\u0000\u00ad\u00ae\u0003\u0018"
          + "\f\u0000\u00ae\u00af\u0005\u0004\u0000\u0000\u00af\u00b1\u0001\u0000\u0000"
          + "\u0000\u00b0\u00a3\u0001\u0000\u0000\u0000\u00b0\u00a9\u0001\u0000\u0000"
          + "\u0000\u00b0\u00ab\u0001\u0000\u0000\u0000\u00b0\u00ac\u0001\u0000\u0000"
          + "\u0000\u00b1\u00bd\u0001\u0000\u0000\u0000\u00b2\u00b3\n\u0005\u0000\u0000"
          + "\u00b3\u00b4\u0005\u0017\u0000\u0000\u00b4\u00bc\u0003\u0018\f\u0005\u00b5"
          + "\u00b6\n\u0004\u0000\u0000\u00b6\u00b7\u0007\u0002\u0000\u0000\u00b7\u00bc"
          + "\u0003\u0018\f\u0005\u00b8\u00b9\n\u0003\u0000\u0000\u00b9\u00ba\u0007"
          + "\u0003\u0000\u0000\u00ba\u00bc\u0003\u0018\f\u0004\u00bb\u00b2\u0001\u0000"
          + "\u0000\u0000\u00bb\u00b5\u0001\u0000\u0000\u0000\u00bb\u00b8\u0001\u0000"
          + "\u0000\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000"
          + "\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u0019\u0001\u0000"
          + "\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c1\u0007\u0004"
          + "\u0000\u0000\u00c1\u001b\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005&\u0000"
          + "\u0000\u00c3\u001d\u0001\u0000\u0000\u0000\u00c4\u00c5\u0006\u000f\uffff"
          + "\uffff\u0000\u00c5\u00c6\u0005 \u0000\u0000\u00c6\u00cd\u0003\u001e\u000f"
          + "\u0005\u00c7\u00cd\u0003 \u0010\u0000\u00c8\u00c9\u0005\u0003\u0000\u0000"
          + "\u00c9\u00ca\u0003\u001e\u000f\u0000\u00ca\u00cb\u0005\u0004\u0000\u0000"
          + "\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00c4\u0001\u0000\u0000\u0000"
          + "\u00cc\u00c7\u0001\u0000\u0000\u0000\u00cc\u00c8\u0001\u0000\u0000\u0000"
          + "\u00cd\u00d9\u0001\u0000\u0000\u0000\u00ce\u00cf\n\u0006\u0000\u0000\u00cf"
          + "\u00d0\u0007\u0005\u0000\u0000\u00d0\u00d8\u0003\u001e\u000f\u0007\u00d1"
          + "\u00d2\n\u0004\u0000\u0000\u00d2\u00d3\u0005!\u0000\u0000\u00d3\u00d8"
          + "\u0003\u001e\u000f\u0005\u00d4\u00d5\n\u0003\u0000\u0000\u00d5\u00d6\u0005"
          + "\"\u0000\u0000\u00d6\u00d8\u0003\u001e\u000f\u0004\u00d7\u00ce\u0001\u0000"
          + "\u0000\u0000\u00d7\u00d1\u0001\u0000\u0000\u0000\u00d7\u00d4\u0001\u0000"
          + "\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000"
          + "\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u001f\u0001\u0000"
          + "\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00e0\u0005$\u0000"
          + "\u0000\u00dd\u00e0\u0007\u0006\u0000\u0000\u00de\u00e0\u0005%\u0000\u0000"
          + "\u00df\u00dc\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000"
          + "\u00df\u00de\u0001\u0000\u0000\u0000\u00e0!\u0001\u0000\u0000\u0000\u0010"
          + "(Efly\u008b\u0091\u0098\u009e\u00b0\u00bb\u00bd\u00cc\u00d7\u00d9\u00df";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
