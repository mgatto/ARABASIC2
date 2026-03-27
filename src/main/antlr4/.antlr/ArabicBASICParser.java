// Generated from /Users/mgatto/Development/cs-361/ARABASIC2/src/main/antlr4/ArabicBASIC.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArabicBASICParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, COMMENT=55, STRING=56, IDENTIFIER=57, REAL=58, INTEGER=59, 
		EOL=60, WS=61;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_simpleAssignment = 3, 
		RULE_arrayAssignment = 4, RULE_arrayCreation = 5, RULE_conditionalBlock = 6, 
		RULE_singleLineConditional = 7, RULE_forLoop = 8, RULE_whileLoop = 9, 
		RULE_defineSingleLineFunction = 10, RULE_callFunction = 11, RULE_print = 12, 
		RULE_input = 13, RULE_blank = 14, RULE_expression = 15, RULE_subscript = 16, 
		RULE_arraySize = 17, RULE_booleanExpression = 18, RULE_variable = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "statement", "simpleAssignment", "arrayAssignment", 
			"arrayCreation", "conditionalBlock", "singleLineConditional", "forLoop", 
			"whileLoop", "defineSingleLineFunction", "callFunction", "print", "input", 
			"blank", "expression", "subscript", "arraySize", "booleanExpression", 
			"variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\u0635\u0627\u0631'", "','", "'\u060C'", "'='", "'('", "')'", 
			"'\u0645\u0635\u0641\u0648\u0641\u0629'", "'\u0627\u0630\u0627'", "'\u062B\u0645'", 
			"'\u0648\u0625\u0644\u0627 \u0627\u0630\u0627'", "'\u0648\u0625\u0644\u0627'", 
			"'\u0646\u0647\u0627\u064A\u0629 \u0627\u0630\u0627'", "'\u0644\u0643\u0644'", 
			"'\u062D\u062A\u0649'", "'\u062F\u0631\u062C\u0629'", "'\u0627\u0644\u062A\u0627\u0644\u064A'", 
			"'\u0641\u064A \u0625\u062B\u0646\u0623'", "'\u0646\u0647\u0627\u064A\u0629 \u0641\u064A \u0625\u062B\u0646\u0623'", 
			"'\u0639\u0631\u0651\u0641'", "'\u0648\u0638\u064A\u0641\u0629'", "'\u0627\u062C\u0631\u064A'", 
			"'\u0627\u0637\u0628\u0639'", "';'", "'\u061B'", "'\u0627\u062F\u062E\u0644'", 
			"'ABS'", "'COS'", "'SIN'", "'TAN'", "'LOG'", "'EXP'", "'INT'", "'SQR'", 
			"'RND'", "'LEFT'", "'RIGHT'", "'MID'", "'LEN'", "'CHR'", "'ORD'", "'-'", 
			"'^'", "'MOD'", "'*'", "'/'", "'+'", "'>'", "'<'", "'<='", "'>='", "'<>'", 
			"'\u0644\u064A\u0633'", "'\u0627\u064A\u0636\u0627\u064B'", "'\u0627\u0645'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "COMMENT", "STRING", "IDENTIFIER", 
			"REAL", "INTEGER", "EOL", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
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
	public String getGrammarFileName() { return "ArabicBASIC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArabicBASICParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ArabicBASICParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
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
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__7) | (1L << T__12) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__24) | (1L << COMMENT) | (1L << IDENTIFIER) | (1L << EOL) | (1L << WS))) != 0)) {
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
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(ArabicBASICParser.COMMENT, 0); }
		public BlankContext blank() {
			return getRuleContext(BlankContext.class,0);
		}
		public SimpleAssignmentContext simpleAssignment() {
			return getRuleContext(SimpleAssignmentContext.class,0);
		}
		public TerminalNode EOL() { return getToken(ArabicBASICParser.EOL, 0); }
		public ArrayAssignmentContext arrayAssignment() {
			return getRuleContext(ArrayAssignmentContext.class,0);
		}
		public ArrayCreationContext arrayCreation() {
			return getRuleContext(ArrayCreationContext.class,0);
		}
		public SingleLineConditionalContext singleLineConditional() {
			return getRuleContext(SingleLineConditionalContext.class,0);
		}
		public ConditionalBlockContext conditionalBlock() {
			return getRuleContext(ConditionalBlockContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public DefineSingleLineFunctionContext defineSingleLineFunction() {
			return getRuleContext(DefineSingleLineFunctionContext.class,0);
		}
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
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
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleAssignmentContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public List<Token> name = new ArrayList<Token>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ArabicBASICParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ArabicBASICParser.IDENTIFIER, i);
		}
		public SimpleAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleAssignment; }
	}

	public final SimpleAssignmentContext simpleAssignment() throws RecognitionException {
		SimpleAssignmentContext _localctx = new SimpleAssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simpleAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__0);
			setState(85);
			((SimpleAssignmentContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			((SimpleAssignmentContext)_localctx).name.add(((SimpleAssignmentContext)_localctx).IDENTIFIER);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__2) {
				{
				{
				setState(86);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(87);
				((SimpleAssignmentContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((SimpleAssignmentContext)_localctx).name.add(((SimpleAssignmentContext)_localctx).IDENTIFIER);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(T__3);
			setState(94);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ArabicBASICParser.IDENTIFIER, 0); }
		public SubscriptContext subscript() {
			return getRuleContext(SubscriptContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssignment; }
	}

	public final ArrayAssignmentContext arrayAssignment() throws RecognitionException {
		ArrayAssignmentContext _localctx = new ArrayAssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arrayAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(IDENTIFIER);
			setState(97);
			match(T__4);
			setState(98);
			subscript();
			setState(99);
			match(T__5);
			setState(100);
			match(T__3);
			setState(101);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ArabicBASICParser.IDENTIFIER, 0); }
		public ArraySizeContext arraySize() {
			return getRuleContext(ArraySizeContext.class,0);
		}
		public ArrayCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreation; }
	}

	public final ArrayCreationContext arrayCreation() throws RecognitionException {
		ArrayCreationContext _localctx = new ArrayCreationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrayCreation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__6);
			setState(104);
			match(IDENTIFIER);
			setState(105);
			match(T__4);
			setState(106);
			arraySize();
			setState(107);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalBlockContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression;
		public List<BooleanExpressionContext> tests = new ArrayList<BooleanExpressionContext>();
		public List<TerminalNode> EOL() { return getTokens(ArabicBASICParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(ArabicBASICParser.EOL, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public ConditionalBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalBlock; }
	}

	public final ConditionalBlockContext conditionalBlock() throws RecognitionException {
		ConditionalBlockContext _localctx = new ConditionalBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditionalBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__7);
			setState(110);
			((ConditionalBlockContext)_localctx).booleanExpression = booleanExpression(0);
			((ConditionalBlockContext)_localctx).tests.add(((ConditionalBlockContext)_localctx).booleanExpression);
			setState(111);
			match(T__8);
			setState(112);
			match(EOL);
			setState(113);
			block();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(114);
				match(T__9);
				setState(115);
				((ConditionalBlockContext)_localctx).booleanExpression = booleanExpression(0);
				((ConditionalBlockContext)_localctx).tests.add(((ConditionalBlockContext)_localctx).booleanExpression);
				setState(116);
				match(T__8);
				setState(117);
				match(EOL);
				setState(118);
				block();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(125);
				match(T__10);
				setState(126);
				match(EOL);
				setState(127);
				block();
				}
			}

			setState(130);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleLineConditionalContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SingleLineConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleLineConditional; }
	}

	public final SingleLineConditionalContext singleLineConditional() throws RecognitionException {
		SingleLineConditionalContext _localctx = new SingleLineConditionalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_singleLineConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__7);
			setState(133);
			booleanExpression(0);
			setState(134);
			match(T__8);
			setState(135);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForLoopContext extends ParserRuleContext {
		public Token control;
		public Token lower;
		public ExpressionContext upper;
		public Token step;
		public TerminalNode EOL() { return getToken(ArabicBASICParser.EOL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ArabicBASICParser.IDENTIFIER, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(ArabicBASICParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(ArabicBASICParser.INTEGER, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__12);
			setState(138);
			((ForLoopContext)_localctx).control = match(IDENTIFIER);
			setState(139);
			match(T__3);
			setState(140);
			((ForLoopContext)_localctx).lower = match(INTEGER);
			setState(141);
			match(T__13);
			setState(142);
			((ForLoopContext)_localctx).upper = expression(0);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(143);
				match(T__14);
				setState(144);
				match(T__3);
				setState(145);
				((ForLoopContext)_localctx).step = match(INTEGER);
				}
			}

			setState(148);
			match(EOL);
			setState(149);
			block();
			setState(150);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileLoopContext extends ParserRuleContext {
		public BooleanExpressionContext test;
		public TerminalNode EOL() { return getToken(ArabicBASICParser.EOL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__16);
			setState(153);
			((WhileLoopContext)_localctx).test = booleanExpression(0);
			setState(154);
			match(EOL);
			setState(155);
			block();
			setState(156);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefineSingleLineFunctionContext extends ParserRuleContext {
		public Token funcName;
		public VariableContext arg;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ArabicBASICParser.IDENTIFIER, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public DefineSingleLineFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineSingleLineFunction; }
	}

	public final DefineSingleLineFunctionContext defineSingleLineFunction() throws RecognitionException {
		DefineSingleLineFunctionContext _localctx = new DefineSingleLineFunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_defineSingleLineFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__18);
			setState(159);
			match(T__19);
			setState(160);
			((DefineSingleLineFunctionContext)_localctx).funcName = match(IDENTIFIER);
			setState(161);
			match(T__4);
			setState(162);
			((DefineSingleLineFunctionContext)_localctx).arg = variable();
			setState(163);
			match(T__5);
			setState(164);
			match(T__3);
			setState(165);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallFunctionContext extends ParserRuleContext {
		public Token funcName;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ArabicBASICParser.IDENTIFIER, 0); }
		public CallFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction; }
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_callFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__20);
			setState(168);
			((CallFunctionContext)_localctx).funcName = match(IDENTIFIER);
			setState(169);
			match(T__4);
			setState(170);
			variable();
			setState(171);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public Token s2;
		public List<Token> spacer = new ArrayList<Token>();
		public Token s23;
		public Token s24;
		public Token s3;
		public Token _tset327;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__21);
			setState(174);
			expression(0);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__22) | (1L << T__23))) != 0)) {
				{
				{
				setState(175);
				((PrintContext)_localctx)._tset327 = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__22) | (1L << T__23))) != 0)) ) {
					((PrintContext)_localctx)._tset327 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((PrintContext)_localctx).spacer.add(((PrintContext)_localctx)._tset327);
				setState(176);
				expression(0);
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputContext extends ParserRuleContext {
		public Token prompt;
		public Token spacer;
		public Token IDENTIFIER;
		public List<Token> var = new ArrayList<Token>();
		public List<TerminalNode> IDENTIFIER() { return getTokens(ArabicBASICParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ArabicBASICParser.IDENTIFIER, i);
		}
		public TerminalNode STRING() { return getToken(ArabicBASICParser.STRING, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__24);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(183);
				((InputContext)_localctx).prompt = match(STRING);
				{
				setState(184);
				((InputContext)_localctx).spacer = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__22) | (1L << T__23))) != 0)) ) {
					((InputContext)_localctx).spacer = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
			}

			setState(187);
			((InputContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			((InputContext)_localctx).var.add(((InputContext)_localctx).IDENTIFIER);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__2) {
				{
				{
				setState(188);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(189);
				((InputContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((InputContext)_localctx).var.add(((InputContext)_localctx).IDENTIFIER);
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlankContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(ArabicBASICParser.EOL, 0); }
		public List<TerminalNode> WS() { return getTokens(ArabicBASICParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ArabicBASICParser.WS, i);
		}
		public BlankContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blank; }
	}

	public final BlankContext blank() throws RecognitionException {
		BlankContext _localctx = new BlankContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_blank);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(195);
				match(WS);
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
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
			return getRuleContext(VariableContext.class,i);
		}
		public StringFunctionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionCallContext extends ExpressionContext {
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public FunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MathFunctionContext extends ExpressionContext {
		public Token name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MathFunctionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class TermContext extends ExpressionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TermContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AddSubContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddSubContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayAccessContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(ArabicBASICParser.IDENTIFIER, 0); }
		public SubscriptContext subscript() {
			return getRuleContext(SubscriptContext.class,0);
		}
		public ArrayAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NestedContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NestedContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExponentationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExponentationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ModulusContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ModulusContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MulDivContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulDivContext(ExpressionContext ctx) { copyFrom(ctx); }
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
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new MathFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(204);
				((MathFunctionContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
					((MathFunctionContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(205);
				match(T__4);
				setState(206);
				expression(0);
				setState(207);
				match(T__5);
				}
				break;
			case 2:
				{
				_localctx = new StringFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				((StringFunctionContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
					((StringFunctionContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(210);
				match(T__4);
				setState(211);
				((StringFunctionContext)_localctx).variable = variable();
				((StringFunctionContext)_localctx).arg.add(((StringFunctionContext)_localctx).variable);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==T__2) {
					{
					setState(212);
					_la = _input.LA(1);
					if ( !(_la==T__1 || _la==T__2) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(213);
					((StringFunctionContext)_localctx).variable = variable();
					((StringFunctionContext)_localctx).arg.add(((StringFunctionContext)_localctx).variable);
					}
				}

				setState(216);
				match(T__5);
				}
				break;
			case 3:
				{
				_localctx = new ArrayAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(IDENTIFIER);
				setState(219);
				match(T__4);
				setState(220);
				subscript();
				setState(221);
				match(T__5);
				}
				break;
			case 4:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				match(T__40);
				setState(224);
				expression(8);
				}
				break;
			case 5:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				callFunction();
				}
				break;
			case 6:
				{
				_localctx = new TermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				variable();
				}
				break;
			case 7:
				{
				_localctx = new NestedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				match(T__4);
				setState(228);
				expression(0);
				setState(229);
				match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(245);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExponentationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(233);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(234);
						match(T__41);
						setState(235);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ModulusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(236);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(237);
						((ModulusContext)_localctx).op = match(T__42);
						setState(238);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new MulDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(239);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(240);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__43 || _la==T__44) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(241);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new AddSubContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(242);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(243);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__40 || _la==T__45) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(244);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SubscriptContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(ArabicBASICParser.INTEGER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArabicBASICParser.IDENTIFIER, 0); }
		public SubscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript; }
	}

	public final SubscriptContext subscript() throws RecognitionException {
		SubscriptContext _localctx = new SubscriptContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_subscript);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==INTEGER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArraySizeContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArraySizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraySize; }
	}

	public final ArraySizeContext arraySize() throws RecognitionException {
		ArraySizeContext _localctx = new ArraySizeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arraySize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtomicBooleanContext extends BooleanExpressionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AtomicBooleanContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalAndContext extends BooleanExpressionContext {
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public LogicalAndContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ComparitiveBooleanContext extends BooleanExpressionContext {
		public Token comp;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public ComparitiveBooleanContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalOrContext extends BooleanExpressionContext {
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public LogicalOrContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NegatingBooleanContext extends BooleanExpressionContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NegatingBooleanContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NestedBooleanContext extends BooleanExpressionContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NestedBooleanContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
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
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__51:
				{
				_localctx = new NegatingBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(255);
				match(T__51);
				setState(256);
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
				setState(257);
				variable();
				}
				break;
			case T__4:
				{
				_localctx = new NestedBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258);
				match(T__4);
				setState(259);
				booleanExpression(0);
				setState(260);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(273);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ComparitiveBooleanContext(new BooleanExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(264);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(265);
						((ComparitiveBooleanContext)_localctx).comp = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0)) ) {
							((ComparitiveBooleanContext)_localctx).comp = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(266);
						booleanExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new LogicalAndContext(new BooleanExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(267);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(268);
						match(T__52);
						setState(269);
						booleanExpression(5);
						}
						break;
					case 3:
						{
						_localctx = new LogicalOrContext(new BooleanExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(270);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(271);
						match(T__53);
						setState(272);
						booleanExpression(4);
						}
						break;
					}
					} 
				}
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	 
		public VariableContext() { }
		public void copyFrom(VariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NameContext extends VariableContext {
		public TerminalNode IDENTIFIER() { return getToken(ArabicBASICParser.IDENTIFIER, 0); }
		public NameContext(VariableContext ctx) { copyFrom(ctx); }
	}
	public static class NumericContext extends VariableContext {
		public TerminalNode INTEGER() { return getToken(ArabicBASICParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(ArabicBASICParser.REAL, 0); }
		public NumericContext(VariableContext ctx) { copyFrom(ctx); }
	}
	public static class TextContext extends VariableContext {
		public TerminalNode STRING() { return getToken(ArabicBASICParser.STRING, 0); }
		public TextContext(VariableContext ctx) { copyFrom(ctx); }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variable);
		int _la;
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new NameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(IDENTIFIER);
				}
				break;
			case REAL:
			case INTEGER:
				_localctx = new NumericContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				_la = _input.LA(1);
				if ( !(_la==REAL || _la==INTEGER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STRING:
				_localctx = new TextContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 18:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u011e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\7\3/\n\3\f\3\16\3\62\13"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4U"+
		"\n\4\3\5\3\5\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\7\b{\n\b\f\b\16\b~\13\b\3\b\3\b\3\b\5\b\u0083\n\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0095\n\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u00b4\n"+
		"\16\f\16\16\16\u00b7\13\16\3\17\3\17\3\17\5\17\u00bc\n\17\3\17\3\17\3"+
		"\17\7\17\u00c1\n\17\f\17\16\17\u00c4\13\17\3\20\7\20\u00c7\n\20\f\20\16"+
		"\20\u00ca\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00d9\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ea\n\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00f8\n\21\f\21\16\21\u00fb\13"+
		"\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0109"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0114\n\24\f\24"+
		"\16\24\u0117\13\24\3\25\3\25\3\25\5\25\u011c\n\25\3\25\2\4 &\26\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\13\3\2\4\5\4\2\4\5\31\32\3\2"+
		"\34$\3\2%*\3\2./\4\2++\60\60\4\2;;==\4\2\6\6\61\65\3\2<=\2\u0130\2*\3"+
		"\2\2\2\4\60\3\2\2\2\6T\3\2\2\2\bV\3\2\2\2\nb\3\2\2\2\fi\3\2\2\2\16o\3"+
		"\2\2\2\20\u0086\3\2\2\2\22\u008b\3\2\2\2\24\u009a\3\2\2\2\26\u00a0\3\2"+
		"\2\2\30\u00a9\3\2\2\2\32\u00af\3\2\2\2\34\u00b8\3\2\2\2\36\u00c8\3\2\2"+
		"\2 \u00e9\3\2\2\2\"\u00fc\3\2\2\2$\u00fe\3\2\2\2&\u0108\3\2\2\2(\u011b"+
		"\3\2\2\2*+\5\4\3\2+,\7\2\2\3,\3\3\2\2\2-/\5\6\4\2.-\3\2\2\2/\62\3\2\2"+
		"\2\60.\3\2\2\2\60\61\3\2\2\2\61\5\3\2\2\2\62\60\3\2\2\2\63U\79\2\2\64"+
		"U\5\36\20\2\65\66\5\b\5\2\66\67\7>\2\2\67U\3\2\2\289\5\n\6\29:\7>\2\2"+
		":U\3\2\2\2;<\5\f\7\2<=\7>\2\2=U\3\2\2\2>U\5\20\t\2?@\5\16\b\2@A\7>\2\2"+
		"AU\3\2\2\2BC\5\22\n\2CD\7>\2\2DU\3\2\2\2EF\5\24\13\2FG\7>\2\2GU\3\2\2"+
		"\2HI\5\26\f\2IJ\7>\2\2JU\3\2\2\2KL\5\30\r\2LM\7>\2\2MU\3\2\2\2NO\5\32"+
		"\16\2OP\7>\2\2PU\3\2\2\2QR\5\34\17\2RS\7>\2\2SU\3\2\2\2T\63\3\2\2\2T\64"+
		"\3\2\2\2T\65\3\2\2\2T8\3\2\2\2T;\3\2\2\2T>\3\2\2\2T?\3\2\2\2TB\3\2\2\2"+
		"TE\3\2\2\2TH\3\2\2\2TK\3\2\2\2TN\3\2\2\2TQ\3\2\2\2U\7\3\2\2\2VW\7\3\2"+
		"\2W\\\7;\2\2XY\t\2\2\2Y[\7;\2\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2"+
		"\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\6\2\2`a\5 \21\2a\t\3\2\2\2bc\7;\2\2cd\7"+
		"\7\2\2de\5\"\22\2ef\7\b\2\2fg\7\6\2\2gh\5 \21\2h\13\3\2\2\2ij\7\t\2\2"+
		"jk\7;\2\2kl\7\7\2\2lm\5$\23\2mn\7\b\2\2n\r\3\2\2\2op\7\n\2\2pq\5&\24\2"+
		"qr\7\13\2\2rs\7>\2\2s|\5\4\3\2tu\7\f\2\2uv\5&\24\2vw\7\13\2\2wx\7>\2\2"+
		"xy\5\4\3\2y{\3\2\2\2zt\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0082\3"+
		"\2\2\2~|\3\2\2\2\177\u0080\7\r\2\2\u0080\u0081\7>\2\2\u0081\u0083\5\4"+
		"\3\2\u0082\177\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085"+
		"\7\16\2\2\u0085\17\3\2\2\2\u0086\u0087\7\n\2\2\u0087\u0088\5&\24\2\u0088"+
		"\u0089\7\13\2\2\u0089\u008a\5\6\4\2\u008a\21\3\2\2\2\u008b\u008c\7\17"+
		"\2\2\u008c\u008d\7;\2\2\u008d\u008e\7\6\2\2\u008e\u008f\7=\2\2\u008f\u0090"+
		"\7\20\2\2\u0090\u0094\5 \21\2\u0091\u0092\7\21\2\2\u0092\u0093\7\6\2\2"+
		"\u0093\u0095\7=\2\2\u0094\u0091\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u0097\7>\2\2\u0097\u0098\5\4\3\2\u0098\u0099\7\22\2\2\u0099"+
		"\23\3\2\2\2\u009a\u009b\7\23\2\2\u009b\u009c\5&\24\2\u009c\u009d\7>\2"+
		"\2\u009d\u009e\5\4\3\2\u009e\u009f\7\24\2\2\u009f\25\3\2\2\2\u00a0\u00a1"+
		"\7\25\2\2\u00a1\u00a2\7\26\2\2\u00a2\u00a3\7;\2\2\u00a3\u00a4\7\7\2\2"+
		"\u00a4\u00a5\5(\25\2\u00a5\u00a6\7\b\2\2\u00a6\u00a7\7\6\2\2\u00a7\u00a8"+
		"\5 \21\2\u00a8\27\3\2\2\2\u00a9\u00aa\7\27\2\2\u00aa\u00ab\7;\2\2\u00ab"+
		"\u00ac\7\7\2\2\u00ac\u00ad\5(\25\2\u00ad\u00ae\7\b\2\2\u00ae\31\3\2\2"+
		"\2\u00af\u00b0\7\30\2\2\u00b0\u00b5\5 \21\2\u00b1\u00b2\t\3\2\2\u00b2"+
		"\u00b4\5 \21\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\33\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb"+
		"\7\33\2\2\u00b9\u00ba\7:\2\2\u00ba\u00bc\t\3\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c2\7;\2\2\u00be\u00bf\t\2"+
		"\2\2\u00bf\u00c1\7;\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\35\3\2\2\2\u00c4\u00c2\3\2\2"+
		"\2\u00c5\u00c7\7?\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00cc\7>\2\2\u00cc\37\3\2\2\2\u00cd\u00ce\b\21\1\2\u00ce\u00cf\t\4\2"+
		"\2\u00cf\u00d0\7\7\2\2\u00d0\u00d1\5 \21\2\u00d1\u00d2\7\b\2\2\u00d2\u00ea"+
		"\3\2\2\2\u00d3\u00d4\t\5\2\2\u00d4\u00d5\7\7\2\2\u00d5\u00d8\5(\25\2\u00d6"+
		"\u00d7\t\2\2\2\u00d7\u00d9\5(\25\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\7\b\2\2\u00db\u00ea\3\2\2\2\u00dc"+
		"\u00dd\7;\2\2\u00dd\u00de\7\7\2\2\u00de\u00df\5\"\22\2\u00df\u00e0\7\b"+
		"\2\2\u00e0\u00ea\3\2\2\2\u00e1\u00e2\7+\2\2\u00e2\u00ea\5 \21\n\u00e3"+
		"\u00ea\5\30\r\2\u00e4\u00ea\5(\25\2\u00e5\u00e6\7\7\2\2\u00e6\u00e7\5"+
		" \21\2\u00e7\u00e8\7\b\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00cd\3\2\2\2\u00e9"+
		"\u00d3\3\2\2\2\u00e9\u00dc\3\2\2\2\u00e9\u00e1\3\2\2\2\u00e9\u00e3\3\2"+
		"\2\2\u00e9\u00e4\3\2\2\2\u00e9\u00e5\3\2\2\2\u00ea\u00f9\3\2\2\2\u00eb"+
		"\u00ec\f\t\2\2\u00ec\u00ed\7,\2\2\u00ed\u00f8\5 \21\t\u00ee\u00ef\f\b"+
		"\2\2\u00ef\u00f0\7-\2\2\u00f0\u00f8\5 \21\t\u00f1\u00f2\f\7\2\2\u00f2"+
		"\u00f3\t\6\2\2\u00f3\u00f8\5 \21\b\u00f4\u00f5\f\6\2\2\u00f5\u00f6\t\7"+
		"\2\2\u00f6\u00f8\5 \21\7\u00f7\u00eb\3\2\2\2\u00f7\u00ee\3\2\2\2\u00f7"+
		"\u00f1\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa!\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd"+
		"\t\b\2\2\u00fd#\3\2\2\2\u00fe\u00ff\5 \21\2\u00ff%\3\2\2\2\u0100\u0101"+
		"\b\24\1\2\u0101\u0102\7\66\2\2\u0102\u0109\5&\24\7\u0103\u0109\5(\25\2"+
		"\u0104\u0105\7\7\2\2\u0105\u0106\5&\24\2\u0106\u0107\7\b\2\2\u0107\u0109"+
		"\3\2\2\2\u0108\u0100\3\2\2\2\u0108\u0103\3\2\2\2\u0108\u0104\3\2\2\2\u0109"+
		"\u0115\3\2\2\2\u010a\u010b\f\b\2\2\u010b\u010c\t\t\2\2\u010c\u0114\5&"+
		"\24\t\u010d\u010e\f\6\2\2\u010e\u010f\7\67\2\2\u010f\u0114\5&\24\7\u0110"+
		"\u0111\f\5\2\2\u0111\u0112\78\2\2\u0112\u0114\5&\24\6\u0113\u010a\3\2"+
		"\2\2\u0113\u010d\3\2\2\2\u0113\u0110\3\2\2\2\u0114\u0117\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\'\3\2\2\2\u0117\u0115\3\2\2\2"+
		"\u0118\u011c\7;\2\2\u0119\u011c\t\n\2\2\u011a\u011c\7:\2\2\u011b\u0118"+
		"\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c)\3\2\2\2\24\60"+
		"T\\|\u0082\u0094\u00b5\u00bb\u00c2\u00c8\u00d8\u00e9\u00f7\u00f9\u0108"+
		"\u0113\u0115\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}