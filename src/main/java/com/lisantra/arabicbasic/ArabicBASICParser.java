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
      T__34 = 35,
      T__35 = 36,
      T__36 = 37,
      T__37 = 38,
      T__38 = 39,
      T__39 = 40,
      T__40 = 41,
      T__41 = 42,
      T__42 = 43,
      T__43 = 44,
      T__44 = 45,
      T__45 = 46,
      T__46 = 47,
      T__47 = 48,
      T__48 = 49,
      T__49 = 50,
      T__50 = 51,
      T__51 = 52,
      COMMENT = 53,
      STRING = 54,
      IDENTIFIER = 55,
      REAL = 56,
      INTEGER = 57,
      EOL = 58,
      WS = 59;
  public static final int RULE_program = 0,
      RULE_block = 1,
      RULE_statement = 2,
      RULE_simpleAssignment = 3,
      RULE_arrayAssignment = 4,
      RULE_arrayCreation = 5,
      RULE_conditionalBlock = 6,
      RULE_singleLineConditional = 7,
      RULE_forLoop = 8,
      RULE_whileLoop = 9,
      RULE_defineSingleLineFunction = 10,
      RULE_callFunction = 11,
      RULE_print = 12,
      RULE_input = 13,
      RULE_blank = 14,
      RULE_expression = 15,
      RULE_subscript = 16,
      RULE_arraySize = 17,
      RULE_booleanExpression = 18,
      RULE_variable = 19;

  private static String[] makeRuleNames() {
    return new String[] {
      "program",
      "block",
      "statement",
      "simpleAssignment",
      "arrayAssignment",
      "arrayCreation",
      "conditionalBlock",
      "singleLineConditional",
      "forLoop",
      "whileLoop",
      "defineSingleLineFunction",
      "callFunction",
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
      "'DEF'",
      "'FN'",
      "'CALL'",
      "'PRINT'",
      "','",
      "';'",
      "'INPUT'",
      "'ABS'",
      "'COS'",
      "'SIN'",
      "'TAN'",
      "'LOG'",
      "'EXP'",
      "'INT'",
      "'SQR'",
      "'RND'",
      "'LEFT'",
      "'RIGHT'",
      "'MID'",
      "'LEN'",
      "'CHR'",
      "'ORD'",
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
      "STRING",
      "IDENTIFIER",
      "REAL",
      "INTEGER",
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
        setState(40);
        block();
        setState(41);
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
        setState(46);
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
                        | (1L << T__19)
                        | (1L << T__20)
                        | (1L << T__23)
                        | (1L << COMMENT)
                        | (1L << IDENTIFIER)
                        | (1L << EOL)
                        | (1L << WS)))
                != 0)) {
          {
            {
              setState(43);
              statement();
            }
          }
          setState(48);
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

    public SingleLineConditionalContext singleLineConditional() {
      return getRuleContext(SingleLineConditionalContext.class, 0);
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

    public DefineSingleLineFunctionContext defineSingleLineFunction() {
      return getRuleContext(DefineSingleLineFunctionContext.class, 0);
    }

    public CallFunctionContext callFunction() {
      return getRuleContext(CallFunctionContext.class, 0);
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
      setState(82);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(49);
            match(COMMENT);
          }
          break;
        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(50);
            blank();
          }
          break;
        case 3:
          enterOuterAlt(_localctx, 3);
          {
            setState(51);
            simpleAssignment();
            setState(52);
            match(EOL);
          }
          break;
        case 4:
          enterOuterAlt(_localctx, 4);
          {
            setState(54);
            arrayAssignment();
            setState(55);
            match(EOL);
          }
          break;
        case 5:
          enterOuterAlt(_localctx, 5);
          {
            setState(57);
            arrayCreation();
            setState(58);
            match(EOL);
          }
          break;
        case 6:
          enterOuterAlt(_localctx, 6);
          {
            setState(60);
            singleLineConditional();
          }
          break;
        case 7:
          enterOuterAlt(_localctx, 7);
          {
            setState(61);
            conditionalBlock();
            setState(62);
            match(EOL);
          }
          break;
        case 8:
          enterOuterAlt(_localctx, 8);
          {
            setState(64);
            forLoop();
            setState(65);
            match(EOL);
          }
          break;
        case 9:
          enterOuterAlt(_localctx, 9);
          {
            setState(67);
            whileLoop();
            setState(68);
            match(EOL);
          }
          break;
        case 10:
          enterOuterAlt(_localctx, 10);
          {
            setState(70);
            defineSingleLineFunction();
            setState(71);
            match(EOL);
          }
          break;
        case 11:
          enterOuterAlt(_localctx, 11);
          {
            setState(73);
            callFunction();
            setState(74);
            match(EOL);
          }
          break;
        case 12:
          enterOuterAlt(_localctx, 12);
          {
            setState(76);
            print();
            setState(77);
            match(EOL);
          }
          break;
        case 13:
          enterOuterAlt(_localctx, 13);
          {
            setState(79);
            input();
            setState(80);
            match(EOL);
          }
          break;
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
        setState(84);
        match(T__0);
        setState(85);
        match(IDENTIFIER);
        setState(86);
        match(T__1);
        setState(87);
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
        setState(89);
        match(IDENTIFIER);
        setState(90);
        match(T__2);
        setState(91);
        subscript();
        setState(92);
        match(T__3);
        setState(93);
        match(T__1);
        setState(94);
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
        setState(96);
        match(T__4);
        setState(97);
        match(IDENTIFIER);
        setState(98);
        match(T__2);
        setState(99);
        arraySize();
        setState(100);
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
        setState(102);
        match(T__5);
        setState(103);
        ((ConditionalBlockContext) _localctx).booleanExpression = booleanExpression(0);
        ((ConditionalBlockContext) _localctx)
            .tests.add(((ConditionalBlockContext) _localctx).booleanExpression);
        setState(104);
        match(T__6);
        setState(105);
        match(EOL);
        setState(106);
        block();
        setState(115);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == T__7) {
          {
            {
              setState(107);
              match(T__7);
              setState(108);
              ((ConditionalBlockContext) _localctx).booleanExpression = booleanExpression(0);
              ((ConditionalBlockContext) _localctx)
                  .tests.add(((ConditionalBlockContext) _localctx).booleanExpression);
              setState(109);
              match(T__6);
              setState(110);
              match(EOL);
              setState(111);
              block();
            }
          }
          setState(117);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(121);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == T__8) {
          {
            setState(118);
            match(T__8);
            setState(119);
            match(EOL);
            setState(120);
            block();
          }
        }

        setState(123);
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

  public static class SingleLineConditionalContext extends ParserRuleContext {
    public BooleanExpressionContext booleanExpression() {
      return getRuleContext(BooleanExpressionContext.class, 0);
    }

    public StatementContext statement() {
      return getRuleContext(StatementContext.class, 0);
    }

    public SingleLineConditionalContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_singleLineConditional;
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitSingleLineConditional(this);
      else return visitor.visitChildren(this);
    }
  }

  public final SingleLineConditionalContext singleLineConditional() throws RecognitionException {
    SingleLineConditionalContext _localctx = new SingleLineConditionalContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_singleLineConditional);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(125);
        match(T__5);
        setState(126);
        booleanExpression(0);
        setState(127);
        match(T__6);
        setState(128);
        statement();
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
    enterRule(_localctx, 16, RULE_forLoop);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(130);
        match(T__10);
        setState(131);
        ((ForLoopContext) _localctx).control = match(IDENTIFIER);
        setState(132);
        match(T__1);
        setState(133);
        ((ForLoopContext) _localctx).lower = match(INTEGER);
        setState(134);
        match(T__11);
        setState(135);
        ((ForLoopContext) _localctx).upper = match(INTEGER);
        setState(139);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == T__12) {
          {
            setState(136);
            match(T__12);
            setState(137);
            match(T__1);
            setState(138);
            ((ForLoopContext) _localctx).step = match(INTEGER);
          }
        }

        setState(141);
        match(EOL);
        setState(142);
        block();
        setState(143);
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
    enterRule(_localctx, 18, RULE_whileLoop);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(145);
        match(T__14);
        setState(146);
        ((WhileLoopContext) _localctx).test = booleanExpression(0);
        setState(147);
        match(EOL);
        setState(148);
        block();
        setState(149);
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

  public static class DefineSingleLineFunctionContext extends ParserRuleContext {
    public Token funcName;
    public VariableContext arg;

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public TerminalNode IDENTIFIER() {
      return getToken(ArabicBASICParser.IDENTIFIER, 0);
    }

    public VariableContext variable() {
      return getRuleContext(VariableContext.class, 0);
    }

    public DefineSingleLineFunctionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_defineSingleLineFunction;
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitDefineSingleLineFunction(this);
      else return visitor.visitChildren(this);
    }
  }

  public final DefineSingleLineFunctionContext defineSingleLineFunction()
      throws RecognitionException {
    DefineSingleLineFunctionContext _localctx =
        new DefineSingleLineFunctionContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_defineSingleLineFunction);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(151);
        match(T__17);
        setState(152);
        match(T__18);
        setState(153);
        ((DefineSingleLineFunctionContext) _localctx).funcName = match(IDENTIFIER);
        setState(154);
        match(T__2);
        setState(155);
        ((DefineSingleLineFunctionContext) _localctx).arg = variable();
        setState(156);
        match(T__3);
        setState(157);
        match(T__1);
        setState(158);
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

  public static class CallFunctionContext extends ParserRuleContext {
    public Token funcName;

    public VariableContext variable() {
      return getRuleContext(VariableContext.class, 0);
    }

    public TerminalNode IDENTIFIER() {
      return getToken(ArabicBASICParser.IDENTIFIER, 0);
    }

    public CallFunctionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_callFunction;
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitCallFunction(this);
      else return visitor.visitChildren(this);
    }
  }

  public final CallFunctionContext callFunction() throws RecognitionException {
    CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_callFunction);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(160);
        match(T__19);
        setState(161);
        ((CallFunctionContext) _localctx).funcName = match(IDENTIFIER);
        setState(162);
        match(T__2);
        setState(163);
        variable();
        setState(164);
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

  public static class PrintContext extends ParserRuleContext {
    public Token s22;
    public List<Token> spacer = new ArrayList<Token>();
    public Token s23;
    public Token _tset323;

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
    enterRule(_localctx, 24, RULE_print);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(166);
        match(T__20);
        setState(167);
        expression(0);
        setState(172);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == T__21 || _la == T__22) {
          {
            {
              setState(168);
              ((PrintContext) _localctx)._tset323 = _input.LT(1);
              _la = _input.LA(1);
              if (!(_la == T__21 || _la == T__22)) {
                ((PrintContext) _localctx)._tset323 = (Token) _errHandler.recoverInline(this);
              } else {
                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                _errHandler.reportMatch(this);
                consume();
              }
              ((PrintContext) _localctx).spacer.add(((PrintContext) _localctx)._tset323);
              setState(169);
              expression(0);
            }
          }
          setState(174);
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
    enterRule(_localctx, 26, RULE_input);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(175);
        match(T__23);
        setState(178);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == STRING) {
          {
            setState(176);
            ((InputContext) _localctx).prompt = match(STRING);
            {
              setState(177);
              ((InputContext) _localctx).spacer = _input.LT(1);
              _la = _input.LA(1);
              if (!(_la == T__21 || _la == T__22)) {
                ((InputContext) _localctx).spacer = (Token) _errHandler.recoverInline(this);
              } else {
                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                _errHandler.reportMatch(this);
                consume();
              }
            }
          }
        }

        setState(180);
        ((InputContext) _localctx).IDENTIFIER = match(IDENTIFIER);
        ((InputContext) _localctx).var.add(((InputContext) _localctx).IDENTIFIER);
        setState(185);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == T__21) {
          {
            {
              setState(181);
              match(T__21);
              setState(182);
              ((InputContext) _localctx).IDENTIFIER = match(IDENTIFIER);
              ((InputContext) _localctx).var.add(((InputContext) _localctx).IDENTIFIER);
            }
          }
          setState(187);
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
    enterRule(_localctx, 28, RULE_blank);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(191);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == WS) {
          {
            {
              setState(188);
              match(WS);
            }
          }
          setState(193);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(194);
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

  public static class StringFunctionContext extends ExpressionContext {
    public Token name;
    public VariableContext variable;
    public List<VariableContext> arg = new ArrayList<VariableContext>();

    public List<VariableContext> variable() {
      return getRuleContexts(VariableContext.class);
    }

    public VariableContext variable(int i) {
      return getRuleContext(VariableContext.class, i);
    }

    public StringFunctionContext(ExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitStringFunction(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class FunctionCallContext extends ExpressionContext {
    public CallFunctionContext callFunction() {
      return getRuleContext(CallFunctionContext.class, 0);
    }

    public FunctionCallContext(ExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitFunctionCall(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class MathFunctionContext extends ExpressionContext {
    public Token name;

    public VariableContext variable() {
      return getRuleContext(VariableContext.class, 0);
    }

    public MathFunctionContext(ExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ArabicBASICVisitor)
        return ((ArabicBASICVisitor<? extends T>) visitor).visitMathFunction(this);
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
    int _startState = 30;
    enterRecursionRule(_localctx, 30, RULE_expression, _p);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(225);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
          case 1:
            {
              _localctx = new MathFunctionContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;

              setState(197);
              ((MathFunctionContext) _localctx).name = _input.LT(1);
              _la = _input.LA(1);
              if (!((((_la) & ~0x3f) == 0
                  && ((1L << _la)
                          & ((1L << T__24)
                              | (1L << T__25)
                              | (1L << T__26)
                              | (1L << T__27)
                              | (1L << T__28)
                              | (1L << T__29)
                              | (1L << T__30)
                              | (1L << T__31)
                              | (1L << T__32)))
                      != 0))) {
                ((MathFunctionContext) _localctx).name = (Token) _errHandler.recoverInline(this);
              } else {
                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                _errHandler.reportMatch(this);
                consume();
              }
              setState(198);
              match(T__2);
              setState(200);
              _errHandler.sync(this);
              _la = _input.LA(1);
              if ((((_la) & ~0x3f) == 0
                  && ((1L << _la)
                          & ((1L << STRING) | (1L << IDENTIFIER) | (1L << REAL) | (1L << INTEGER)))
                      != 0)) {
                {
                  setState(199);
                  variable();
                }
              }

              setState(202);
              match(T__3);
            }
            break;
          case 2:
            {
              _localctx = new StringFunctionContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(203);
              ((StringFunctionContext) _localctx).name = _input.LT(1);
              _la = _input.LA(1);
              if (!((((_la) & ~0x3f) == 0
                  && ((1L << _la)
                          & ((1L << T__33)
                              | (1L << T__34)
                              | (1L << T__35)
                              | (1L << T__36)
                              | (1L << T__37)
                              | (1L << T__38)))
                      != 0))) {
                ((StringFunctionContext) _localctx).name = (Token) _errHandler.recoverInline(this);
              } else {
                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                _errHandler.reportMatch(this);
                consume();
              }
              setState(204);
              match(T__2);
              setState(205);
              ((StringFunctionContext) _localctx).variable = variable();
              ((StringFunctionContext) _localctx)
                  .arg.add(((StringFunctionContext) _localctx).variable);
              setState(208);
              _errHandler.sync(this);
              _la = _input.LA(1);
              if (_la == T__21) {
                {
                  setState(206);
                  match(T__21);
                  setState(207);
                  ((StringFunctionContext) _localctx).variable = variable();
                  ((StringFunctionContext) _localctx)
                      .arg.add(((StringFunctionContext) _localctx).variable);
                }
              }

              setState(210);
              match(T__3);
            }
            break;
          case 3:
            {
              _localctx = new ArrayAccessContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(212);
              match(IDENTIFIER);
              setState(213);
              match(T__2);
              setState(214);
              subscript();
              setState(215);
              match(T__3);
            }
            break;
          case 4:
            {
              _localctx = new UnaryContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(217);
              match(T__39);
              setState(218);
              expression(7);
            }
            break;
          case 5:
            {
              _localctx = new FunctionCallContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(219);
              callFunction();
            }
            break;
          case 6:
            {
              _localctx = new TermContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(220);
              variable();
            }
            break;
          case 7:
            {
              _localctx = new NestedContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(221);
              match(T__2);
              setState(222);
              expression(0);
              setState(223);
              match(T__3);
            }
            break;
        }
        _ctx.stop = _input.LT(-1);
        setState(238);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            if (_parseListeners != null) triggerExitRuleEvent();
            _prevctx = _localctx;
            {
              setState(236);
              _errHandler.sync(this);
              switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
                case 1:
                  {
                    _localctx =
                        new ExponentationContext(new ExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(227);
                    if (!(precpred(_ctx, 6)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                    setState(228);
                    match(T__40);
                    setState(229);
                    expression(6);
                  }
                  break;
                case 2:
                  {
                    _localctx = new MulDivContext(new ExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(230);
                    if (!(precpred(_ctx, 5)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                    setState(231);
                    ((MulDivContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == T__41 || _la == T__42)) {
                      ((MulDivContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(232);
                    expression(6);
                  }
                  break;
                case 3:
                  {
                    _localctx = new AddSubContext(new ExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(233);
                    if (!(precpred(_ctx, 4)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                    setState(234);
                    ((AddSubContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == T__39 || _la == T__43)) {
                      ((AddSubContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(235);
                    expression(5);
                  }
                  break;
              }
            }
          }
          setState(240);
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
    enterRule(_localctx, 32, RULE_subscript);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(241);
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
    enterRule(_localctx, 34, RULE_arraySize);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(243);
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
    int _startState = 36;
    enterRecursionRule(_localctx, 36, RULE_booleanExpression, _p);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(253);
        _errHandler.sync(this);
        switch (_input.LA(1)) {
          case T__49:
            {
              _localctx = new NegatingBooleanContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;

              setState(246);
              match(T__49);
              setState(247);
              booleanExpression(5);
            }
            break;
          case STRING:
          case IDENTIFIER:
          case REAL:
          case INTEGER:
            {
              _localctx = new AtomicBooleanContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(248);
              variable();
            }
            break;
          case T__2:
            {
              _localctx = new NestedBooleanContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(249);
              match(T__2);
              setState(250);
              booleanExpression(0);
              setState(251);
              match(T__3);
            }
            break;
          default:
            throw new NoViableAltException(this);
        }
        _ctx.stop = _input.LT(-1);
        setState(266);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            if (_parseListeners != null) triggerExitRuleEvent();
            _prevctx = _localctx;
            {
              setState(264);
              _errHandler.sync(this);
              switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
                case 1:
                  {
                    _localctx =
                        new ComparitiveBooleanContext(
                            new BooleanExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
                    setState(255);
                    if (!(precpred(_ctx, 6)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                    setState(256);
                    ((ComparitiveBooleanContext) _localctx).comp = _input.LT(1);
                    _la = _input.LA(1);
                    if (!((((_la) & ~0x3f) == 0
                        && ((1L << _la)
                                & ((1L << T__1)
                                    | (1L << T__44)
                                    | (1L << T__45)
                                    | (1L << T__46)
                                    | (1L << T__47)
                                    | (1L << T__48)))
                            != 0))) {
                      ((ComparitiveBooleanContext) _localctx).comp =
                          (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(257);
                    booleanExpression(7);
                  }
                  break;
                case 2:
                  {
                    _localctx =
                        new LogicalAndContext(
                            new BooleanExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
                    setState(258);
                    if (!(precpred(_ctx, 4)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                    setState(259);
                    match(T__50);
                    setState(260);
                    booleanExpression(5);
                  }
                  break;
                case 3:
                  {
                    _localctx =
                        new LogicalOrContext(
                            new BooleanExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
                    setState(261);
                    if (!(precpred(_ctx, 3)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                    setState(262);
                    match(T__51);
                    setState(263);
                    booleanExpression(4);
                  }
                  break;
              }
            }
          }
          setState(268);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
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
    enterRule(_localctx, 38, RULE_variable);
    int _la;
    try {
      setState(272);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case IDENTIFIER:
          _localctx = new NameContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(269);
            match(IDENTIFIER);
          }
          break;
        case REAL:
        case INTEGER:
          _localctx = new NumericContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(270);
            _la = _input.LA(1);
            if (!(_la == REAL || _la == INTEGER)) {
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
            setState(271);
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
      case 15:
        return expression_sempred((ExpressionContext) _localctx, predIndex);
      case 18:
        return booleanExpression_sempred((BooleanExpressionContext) _localctx, predIndex);
    }
    return true;
  }

  private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
    switch (predIndex) {
      case 0:
        return precpred(_ctx, 6);
      case 1:
        return precpred(_ctx, 5);
      case 2:
        return precpred(_ctx, 4);
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
      "\u0004\u0001;\u0113\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"
          + "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"
          + "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"
          + "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"
          + "\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"
          + "\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"
          + "\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"
          + "\u0005\u0001-\b\u0001\n\u0001\f\u00010\t\u0001\u0001\u0002\u0001\u0002"
          + "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"
          + "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"
          + "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"
          + "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"
          + "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"
          + "\u0001\u0002\u0003\u0002S\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"
          + "\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"
          + "\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"
          + "\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"
          + "\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"
          + "\u0001\u0006\u0001\u0006\u0005\u0006r\b\u0006\n\u0006\f\u0006u\t\u0006"
          + "\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006z\b\u0006\u0001\u0006"
          + "\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
          + "\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"
          + "\b\u0003\b\u008c\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"
          + "\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"
          + "\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"
          + "\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00ab"
          + "\b\f\n\f\f\f\u00ae\t\f\u0001\r\u0001\r\u0001\r\u0003\r\u00b3\b\r\u0001"
          + "\r\u0001\r\u0001\r\u0005\r\u00b8\b\r\n\r\f\r\u00bb\t\r\u0001\u000e\u0005"
          + "\u000e\u00be\b\u000e\n\u000e\f\u000e\u00c1\t\u000e\u0001\u000e\u0001\u000e"
          + "\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00c9\b\u000f"
          + "\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"
          + "\u0003\u000f\u00d1\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"
          + "\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"
          + "\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"
          + "\u00e2\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"
          + "\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00ed\b\u000f"
          + "\n\u000f\f\u000f\u00f0\t\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"
          + "\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"
          + "\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00fe\b\u0012\u0001\u0012\u0001"
          + "\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"
          + "\u0012\u0001\u0012\u0005\u0012\u0109\b\u0012\n\u0012\f\u0012\u010c\t\u0012"
          + "\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0111\b\u0013\u0001\u0013"
          + "\u0000\u0002\u001e$\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"
          + "\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000\t\u0001\u0000\u0010\u0011"
          + "\u0001\u0000\u0016\u0017\u0001\u0000\u0019!\u0001\u0000\"\'\u0001\u0000"
          + "*+\u0002\u0000((,,\u0002\u00007799\u0002\u0000\u0002\u0002-1\u0001\u0000"
          + "89\u0124\u0000(\u0001\u0000\u0000\u0000\u0002.\u0001\u0000\u0000\u0000"
          + "\u0004R\u0001\u0000\u0000\u0000\u0006T\u0001\u0000\u0000\u0000\bY\u0001"
          + "\u0000\u0000\u0000\n`\u0001\u0000\u0000\u0000\ff\u0001\u0000\u0000\u0000"
          + "\u000e}\u0001\u0000\u0000\u0000\u0010\u0082\u0001\u0000\u0000\u0000\u0012"
          + "\u0091\u0001\u0000\u0000\u0000\u0014\u0097\u0001\u0000\u0000\u0000\u0016"
          + "\u00a0\u0001\u0000\u0000\u0000\u0018\u00a6\u0001\u0000\u0000\u0000\u001a"
          + "\u00af\u0001\u0000\u0000\u0000\u001c\u00bf\u0001\u0000\u0000\u0000\u001e"
          + "\u00e1\u0001\u0000\u0000\u0000 \u00f1\u0001\u0000\u0000\u0000\"\u00f3"
          + "\u0001\u0000\u0000\u0000$\u00fd\u0001\u0000\u0000\u0000&\u0110\u0001\u0000"
          + "\u0000\u0000()\u0003\u0002\u0001\u0000)*\u0005\u0000\u0000\u0001*\u0001"
          + "\u0001\u0000\u0000\u0000+-\u0003\u0004\u0002\u0000,+\u0001\u0000\u0000"
          + "\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000"
          + "\u0000\u0000/\u0003\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u0000"
          + "1S\u00055\u0000\u00002S\u0003\u001c\u000e\u000034\u0003\u0006\u0003\u0000"
          + "45\u0005:\u0000\u00005S\u0001\u0000\u0000\u000067\u0003\b\u0004\u0000"
          + "78\u0005:\u0000\u00008S\u0001\u0000\u0000\u00009:\u0003\n\u0005\u0000"
          + ":;\u0005:\u0000\u0000;S\u0001\u0000\u0000\u0000<S\u0003\u000e\u0007\u0000"
          + "=>\u0003\f\u0006\u0000>?\u0005:\u0000\u0000?S\u0001\u0000\u0000\u0000"
          + "@A\u0003\u0010\b\u0000AB\u0005:\u0000\u0000BS\u0001\u0000\u0000\u0000"
          + "CD\u0003\u0012\t\u0000DE\u0005:\u0000\u0000ES\u0001\u0000\u0000\u0000"
          + "FG\u0003\u0014\n\u0000GH\u0005:\u0000\u0000HS\u0001\u0000\u0000\u0000"
          + "IJ\u0003\u0016\u000b\u0000JK\u0005:\u0000\u0000KS\u0001\u0000\u0000\u0000"
          + "LM\u0003\u0018\f\u0000MN\u0005:\u0000\u0000NS\u0001\u0000\u0000\u0000"
          + "OP\u0003\u001a\r\u0000PQ\u0005:\u0000\u0000QS\u0001\u0000\u0000\u0000"
          + "R1\u0001\u0000\u0000\u0000R2\u0001\u0000\u0000\u0000R3\u0001\u0000\u0000"
          + "\u0000R6\u0001\u0000\u0000\u0000R9\u0001\u0000\u0000\u0000R<\u0001\u0000"
          + "\u0000\u0000R=\u0001\u0000\u0000\u0000R@\u0001\u0000\u0000\u0000RC\u0001"
          + "\u0000\u0000\u0000RF\u0001\u0000\u0000\u0000RI\u0001\u0000\u0000\u0000"
          + "RL\u0001\u0000\u0000\u0000RO\u0001\u0000\u0000\u0000S\u0005\u0001\u0000"
          + "\u0000\u0000TU\u0005\u0001\u0000\u0000UV\u00057\u0000\u0000VW\u0005\u0002"
          + "\u0000\u0000WX\u0003\u001e\u000f\u0000X\u0007\u0001\u0000\u0000\u0000"
          + "YZ\u00057\u0000\u0000Z[\u0005\u0003\u0000\u0000[\\\u0003 \u0010\u0000"
          + "\\]\u0005\u0004\u0000\u0000]^\u0005\u0002\u0000\u0000^_\u0003\u001e\u000f"
          + "\u0000_\t\u0001\u0000\u0000\u0000`a\u0005\u0005\u0000\u0000ab\u00057\u0000"
          + "\u0000bc\u0005\u0003\u0000\u0000cd\u0003\"\u0011\u0000de\u0005\u0004\u0000"
          + "\u0000e\u000b\u0001\u0000\u0000\u0000fg\u0005\u0006\u0000\u0000gh\u0003"
          + "$\u0012\u0000hi\u0005\u0007\u0000\u0000ij\u0005:\u0000\u0000js\u0003\u0002"
          + "\u0001\u0000kl\u0005\b\u0000\u0000lm\u0003$\u0012\u0000mn\u0005\u0007"
          + "\u0000\u0000no\u0005:\u0000\u0000op\u0003\u0002\u0001\u0000pr\u0001\u0000"
          + "\u0000\u0000qk\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001"
          + "\u0000\u0000\u0000st\u0001\u0000\u0000\u0000ty\u0001\u0000\u0000\u0000"
          + "us\u0001\u0000\u0000\u0000vw\u0005\t\u0000\u0000wx\u0005:\u0000\u0000"
          + "xz\u0003\u0002\u0001\u0000yv\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"
          + "\u0000z{\u0001\u0000\u0000\u0000{|\u0005\n\u0000\u0000|\r\u0001\u0000"
          + "\u0000\u0000}~\u0005\u0006\u0000\u0000~\u007f\u0003$\u0012\u0000\u007f"
          + "\u0080\u0005\u0007\u0000\u0000\u0080\u0081\u0003\u0004\u0002\u0000\u0081"
          + "\u000f\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u000b\u0000\u0000\u0083"
          + "\u0084\u00057\u0000\u0000\u0084\u0085\u0005\u0002\u0000\u0000\u0085\u0086"
          + "\u00059\u0000\u0000\u0086\u0087\u0005\f\u0000\u0000\u0087\u008b\u0005"
          + "9\u0000\u0000\u0088\u0089\u0005\r\u0000\u0000\u0089\u008a\u0005\u0002"
          + "\u0000\u0000\u008a\u008c\u00059\u0000\u0000\u008b\u0088\u0001\u0000\u0000"
          + "\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"
          + "\u0000\u008d\u008e\u0005:\u0000\u0000\u008e\u008f\u0003\u0002\u0001\u0000"
          + "\u008f\u0090\u0005\u000e\u0000\u0000\u0090\u0011\u0001\u0000\u0000\u0000"
          + "\u0091\u0092\u0005\u000f\u0000\u0000\u0092\u0093\u0003$\u0012\u0000\u0093"
          + "\u0094\u0005:\u0000\u0000\u0094\u0095\u0003\u0002\u0001\u0000\u0095\u0096"
          + "\u0007\u0000\u0000\u0000\u0096\u0013\u0001\u0000\u0000\u0000\u0097\u0098"
          + "\u0005\u0012\u0000\u0000\u0098\u0099\u0005\u0013\u0000\u0000\u0099\u009a"
          + "\u00057\u0000\u0000\u009a\u009b\u0005\u0003\u0000\u0000\u009b\u009c\u0003"
          + "&\u0013\u0000\u009c\u009d\u0005\u0004\u0000\u0000\u009d\u009e\u0005\u0002"
          + "\u0000\u0000\u009e\u009f\u0003\u001e\u000f\u0000\u009f\u0015\u0001\u0000"
          + "\u0000\u0000\u00a0\u00a1\u0005\u0014\u0000\u0000\u00a1\u00a2\u00057\u0000"
          + "\u0000\u00a2\u00a3\u0005\u0003\u0000\u0000\u00a3\u00a4\u0003&\u0013\u0000"
          + "\u00a4\u00a5\u0005\u0004\u0000\u0000\u00a5\u0017\u0001\u0000\u0000\u0000"
          + "\u00a6\u00a7\u0005\u0015\u0000\u0000\u00a7\u00ac\u0003\u001e\u000f\u0000"
          + "\u00a8\u00a9\u0007\u0001\u0000\u0000\u00a9\u00ab\u0003\u001e\u000f\u0000"
          + "\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000"
          + "\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000"
          + "\u00ad\u0019\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000"
          + "\u00af\u00b2\u0005\u0018\u0000\u0000\u00b0\u00b1\u00056\u0000\u0000\u00b1"
          + "\u00b3\u0007\u0001\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2"
          + "\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4"
          + "\u00b9\u00057\u0000\u0000\u00b5\u00b6\u0005\u0016\u0000\u0000\u00b6\u00b8"
          + "\u00057\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001"
          + "\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001"
          + "\u0000\u0000\u0000\u00ba\u001b\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001"
          + "\u0000\u0000\u0000\u00bc\u00be\u0005;\u0000\u0000\u00bd\u00bc\u0001\u0000"
          + "\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000"
          + "\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c2\u0001\u0000"
          + "\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005:\u0000"
          + "\u0000\u00c3\u001d\u0001\u0000\u0000\u0000\u00c4\u00c5\u0006\u000f\uffff"
          + "\uffff\u0000\u00c5\u00c6\u0007\u0002\u0000\u0000\u00c6\u00c8\u0005\u0003"
          + "\u0000\u0000\u00c7\u00c9\u0003&\u0013\u0000\u00c8\u00c7\u0001\u0000\u0000"
          + "\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000"
          + "\u0000\u00ca\u00e2\u0005\u0004\u0000\u0000\u00cb\u00cc\u0007\u0003\u0000"
          + "\u0000\u00cc\u00cd\u0005\u0003\u0000\u0000\u00cd\u00d0\u0003&\u0013\u0000"
          + "\u00ce\u00cf\u0005\u0016\u0000\u0000\u00cf\u00d1\u0003&\u0013\u0000\u00d0"
          + "\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1"
          + "\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u0004\u0000\u0000\u00d3"
          + "\u00e2\u0001\u0000\u0000\u0000\u00d4\u00d5\u00057\u0000\u0000\u00d5\u00d6"
          + "\u0005\u0003\u0000\u0000\u00d6\u00d7\u0003 \u0010\u0000\u00d7\u00d8\u0005"
          + "\u0004\u0000\u0000\u00d8\u00e2\u0001\u0000\u0000\u0000\u00d9\u00da\u0005"
          + "(\u0000\u0000\u00da\u00e2\u0003\u001e\u000f\u0007\u00db\u00e2\u0003\u0016"
          + "\u000b\u0000\u00dc\u00e2\u0003&\u0013\u0000\u00dd\u00de\u0005\u0003\u0000"
          + "\u0000\u00de\u00df\u0003\u001e\u000f\u0000\u00df\u00e0\u0005\u0004\u0000"
          + "\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u00c4\u0001\u0000\u0000"
          + "\u0000\u00e1\u00cb\u0001\u0000\u0000\u0000\u00e1\u00d4\u0001\u0000\u0000"
          + "\u0000\u00e1\u00d9\u0001\u0000\u0000\u0000\u00e1\u00db\u0001\u0000\u0000"
          + "\u0000\u00e1\u00dc\u0001\u0000\u0000\u0000\u00e1\u00dd\u0001\u0000\u0000"
          + "\u0000\u00e2\u00ee\u0001\u0000\u0000\u0000\u00e3\u00e4\n\u0006\u0000\u0000"
          + "\u00e4\u00e5\u0005)\u0000\u0000\u00e5\u00ed\u0003\u001e\u000f\u0006\u00e6"
          + "\u00e7\n\u0005\u0000\u0000\u00e7\u00e8\u0007\u0004\u0000\u0000\u00e8\u00ed"
          + "\u0003\u001e\u000f\u0006\u00e9\u00ea\n\u0004\u0000\u0000\u00ea\u00eb\u0007"
          + "\u0005\u0000\u0000\u00eb\u00ed\u0003\u001e\u000f\u0005\u00ec\u00e3\u0001"
          + "\u0000\u0000\u0000\u00ec\u00e6\u0001\u0000\u0000\u0000\u00ec\u00e9\u0001"
          + "\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001"
          + "\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u001f\u0001"
          + "\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f2\u0007"
          + "\u0006\u0000\u0000\u00f2!\u0001\u0000\u0000\u0000\u00f3\u00f4\u00059\u0000"
          + "\u0000\u00f4#\u0001\u0000\u0000\u0000\u00f5\u00f6\u0006\u0012\uffff\uffff"
          + "\u0000\u00f6\u00f7\u00052\u0000\u0000\u00f7\u00fe\u0003$\u0012\u0005\u00f8"
          + "\u00fe\u0003&\u0013\u0000\u00f9\u00fa\u0005\u0003\u0000\u0000\u00fa\u00fb"
          + "\u0003$\u0012\u0000\u00fb\u00fc\u0005\u0004\u0000\u0000\u00fc\u00fe\u0001"
          + "\u0000\u0000\u0000\u00fd\u00f5\u0001\u0000\u0000\u0000\u00fd\u00f8\u0001"
          + "\u0000\u0000\u0000\u00fd\u00f9\u0001\u0000\u0000\u0000\u00fe\u010a\u0001"
          + "\u0000\u0000\u0000\u00ff\u0100\n\u0006\u0000\u0000\u0100\u0101\u0007\u0007"
          + "\u0000\u0000\u0101\u0109\u0003$\u0012\u0007\u0102\u0103\n\u0004\u0000"
          + "\u0000\u0103\u0104\u00053\u0000\u0000\u0104\u0109\u0003$\u0012\u0005\u0105"
          + "\u0106\n\u0003\u0000\u0000\u0106\u0107\u00054\u0000\u0000\u0107\u0109"
          + "\u0003$\u0012\u0004\u0108\u00ff\u0001\u0000\u0000\u0000\u0108\u0102\u0001"
          + "\u0000\u0000\u0000\u0108\u0105\u0001\u0000\u0000\u0000\u0109\u010c\u0001"
          + "\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001"
          + "\u0000\u0000\u0000\u010b%\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000"
          + "\u0000\u0000\u010d\u0111\u00057\u0000\u0000\u010e\u0111\u0007\b\u0000"
          + "\u0000\u010f\u0111\u00056\u0000\u0000\u0110\u010d\u0001\u0000\u0000\u0000"
          + "\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u010f\u0001\u0000\u0000\u0000"
          + "\u0111\'\u0001\u0000\u0000\u0000\u0012.Rsy\u008b\u00ac\u00b2\u00b9\u00bf"
          + "\u00c8\u00d0\u00e1\u00ec\u00ee\u00fd\u0108\u010a\u0110";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
