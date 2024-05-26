// Generated from C:/Users/Abel/OneDrive/Documents/UniOvi/Asignaturas/Cuarto/Cuatrimestre 2/DLP/Laboratorio/DLP_Lab/src/parser/Pmm.g4 by ANTLR 4.13.1
package parser;

    import ast.*;
    import ast.definition.*;
    import ast.expression.*;
    import ast.statement.*;
    import ast.type.*;
    import java.util.HashSet;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, TRASH=40, COMENTARIO=41, ID=42, INT_CONSTANT=43, REAL_CONSTANT=44, 
		CHAR_CONSTANT=45;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_definition = 2, RULE_varDefinition = 3, 
		RULE_idents = 4, RULE_funcDefinition = 5, RULE_paramDefinition = 6, RULE_type = 7, 
		RULE_simpleType = 8, RULE_statement = 9, RULE_body = 10, RULE_cases = 11, 
		RULE_statementsList = 12, RULE_expression = 13, RULE_params = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "definition", "varDefinition", "idents", "funcDefinition", 
			"paramDefinition", "type", "simpleType", "statement", "body", "cases", 
			"statementsList", "expression", "params"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'main'", "'('", "')'", "':'", "'{'", "'}'", "';'", "','", 
			"'['", "']'", "'struct'", "'int'", "'double'", "'char'", "'print'", "'input'", 
			"'return'", "'='", "'if'", "'else'", "'while'", "'switch'", "'case'", 
			"'.'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'>'", "'>='", "'<'", 
			"'<='", "'!='", "'=='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "TRASH", "COMENTARIO", "ID", "INT_CONSTANT", 
			"REAL_CONSTANT", "CHAR_CONSTANT"
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
	public String getGrammarFileName() { return "Pmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public List<Definition> progBody = new ArrayList<>();
		public DefinitionContext definition;
		public MainContext main;
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					((ProgramContext)_localctx).definition = definition();
					_localctx.progBody.addAll(((ProgramContext)_localctx).definition.list); 
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(38);
			((ProgramContext)_localctx).main = main();
			_localctx.progBody.add(((ProgramContext)_localctx).main.ast); 
			setState(40);
			match(EOF);
			((ProgramContext)_localctx).ast =  new Program(0, 0, _localctx.progBody); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public FunctionDefinition ast;
		public List<Statement> funcBody = new ArrayList<>();
		public Token OP;
		public VarDefinitionContext varDefinition;
		public StatementContext statement;
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__0);
			setState(44);
			((MainContext)_localctx).OP = match(T__1);
			setState(45);
			match(T__2);
			setState(46);
			match(T__3);
			setState(47);
			match(T__4);
			setState(48);
			match(T__5);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(49);
					((MainContext)_localctx).varDefinition = varDefinition();
					_localctx.funcBody.addAll(((MainContext)_localctx).varDefinition.list); 
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65970913083400L) != 0)) {
				{
				{
				setState(57);
				((MainContext)_localctx).statement = statement();
				_localctx.funcBody.addAll(((MainContext)_localctx).statement.list); 
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(T__6);
			((MainContext)_localctx).ast =  new FunctionDefinition(((MainContext)_localctx).OP.getLine(), ((MainContext)_localctx).OP.getCharPositionInLine()+1, new FunctionType(VoidType.getInstance(), new ArrayList<VariableDefinition>()), (((MainContext)_localctx).OP!=null?((MainContext)_localctx).OP.getText():null), _localctx.funcBody); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public List<Definition> list = new ArrayList<>();
		public VarDefinitionContext varDefinition;
		public FuncDefinitionContext funcDefinition;
		public VarDefinitionContext varDefinition() {
			return getRuleContext(VarDefinitionContext.class,0);
		}
		public FuncDefinitionContext funcDefinition() {
			return getRuleContext(FuncDefinitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definition);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				((DefinitionContext)_localctx).varDefinition = varDefinition();
				_localctx.list.addAll(((DefinitionContext)_localctx).varDefinition.list); 
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				((DefinitionContext)_localctx).funcDefinition = funcDefinition();
				_localctx.list.add(((DefinitionContext)_localctx).funcDefinition.ast); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDefinitionContext extends ParserRuleContext {
		public List<VariableDefinition> list = new ArrayList<>();
		public IdentsContext idents;
		public Token OP;
		public TypeContext type;
		public IdentsContext idents() {
			return getRuleContext(IdentsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVarDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			((VarDefinitionContext)_localctx).idents = idents(0);
			setState(77);
			((VarDefinitionContext)_localctx).OP = match(T__4);
			setState(78);
			((VarDefinitionContext)_localctx).type = type();
			setState(79);
			match(T__7);

			        HashSet<String> e = new HashSet<>();
			        for(String name : ((VarDefinitionContext)_localctx).idents.list) {
			            if(e.contains(name)){
			                _localctx.list.add(new VariableDefinition(((VarDefinitionContext)_localctx).OP.getLine(), ((VarDefinitionContext)_localctx).OP.getCharPositionInLine()+1, new ErrorType(((VarDefinitionContext)_localctx).OP.getLine(), ((VarDefinitionContext)_localctx).OP.getCharPositionInLine()+1, "No se pueden definir dos variables con el mismo nombre en el mismo ámbito"), name));
			            }
			            else {
			                e.add(name);
			                _localctx.list.add(new VariableDefinition(((VarDefinitionContext)_localctx).OP.getLine(), ((VarDefinitionContext)_localctx).OP.getCharPositionInLine()+1, ((VarDefinitionContext)_localctx).type.ast, name));
			            }
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentsContext extends ParserRuleContext {
		public List<String> list = new ArrayList<>();
		public IdentsContext idents1;
		public Token ID;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public IdentsContext idents() {
			return getRuleContext(IdentsContext.class,0);
		}
		public IdentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idents; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitIdents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentsContext idents() throws RecognitionException {
		return idents(0);
	}

	private IdentsContext idents(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentsContext _localctx = new IdentsContext(_ctx, _parentState);
		IdentsContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_idents, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(83);
			((IdentsContext)_localctx).ID = match(ID);
			_localctx.list.add((((IdentsContext)_localctx).ID!=null?((IdentsContext)_localctx).ID.getText():null)); 
			}
			_ctx.stop = _input.LT(-1);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdentsContext(_parentctx, _parentState);
					_localctx.idents1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_idents);
					setState(86);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(87);
					match(T__8);
					setState(88);
					((IdentsContext)_localctx).ID = match(ID);
					_localctx.list.addAll(((IdentsContext)_localctx).idents1.list); _localctx.list.add((((IdentsContext)_localctx).ID!=null?((IdentsContext)_localctx).ID.getText():null)); 
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncDefinitionContext extends ParserRuleContext {
		public FunctionDefinition ast;
		public List<Statement> funcBody = new ArrayList<>();
		public Token ID;
		public ParamDefinitionContext paramDefinition;
		public SimpleTypeContext simpleType;
		public VarDefinitionContext varDefinition;
		public StatementContext statement;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ParamDefinitionContext paramDefinition() {
			return getRuleContext(ParamDefinitionContext.class,0);
		}
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FuncDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFuncDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefinitionContext funcDefinition() throws RecognitionException {
		FuncDefinitionContext _localctx = new FuncDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__0);
			setState(96);
			((FuncDefinitionContext)_localctx).ID = match(ID);
			setState(97);
			match(T__2);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(98);
				((FuncDefinitionContext)_localctx).paramDefinition = paramDefinition(0);
				}
			}

			setState(101);
			match(T__3);
			setState(102);
			match(T__4);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) {
				{
				setState(103);
				((FuncDefinitionContext)_localctx).simpleType = simpleType();
				}
			}

			setState(106);
			match(T__5);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107);
					((FuncDefinitionContext)_localctx).varDefinition = varDefinition();
					_localctx.funcBody.addAll(((FuncDefinitionContext)_localctx).varDefinition.list); 
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65970913083400L) != 0)) {
				{
				{
				setState(115);
				((FuncDefinitionContext)_localctx).statement = statement();
				_localctx.funcBody.addAll(((FuncDefinitionContext)_localctx).statement.list); 
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(T__6);
			((FuncDefinitionContext)_localctx).ast =  new FunctionDefinition(((FuncDefinitionContext)_localctx).ID.getLine(), ((FuncDefinitionContext)_localctx).ID.getCharPositionInLine()+1, new FunctionType(((FuncDefinitionContext)_localctx).simpleType != null ? ((FuncDefinitionContext)_localctx).simpleType.ast : VoidType.getInstance(), ((FuncDefinitionContext)_localctx).paramDefinition != null ? ((FuncDefinitionContext)_localctx).paramDefinition.list : new ArrayList<VariableDefinition>()), (((FuncDefinitionContext)_localctx).ID!=null?((FuncDefinitionContext)_localctx).ID.getText():null), _localctx.funcBody); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamDefinitionContext extends ParserRuleContext {
		public List<VariableDefinition> list = new ArrayList<>();
		public ParamDefinitionContext paramDefinition1;
		public Token ID;
		public SimpleTypeContext simpleType;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public ParamDefinitionContext paramDefinition() {
			return getRuleContext(ParamDefinitionContext.class,0);
		}
		public ParamDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitParamDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamDefinitionContext paramDefinition() throws RecognitionException {
		return paramDefinition(0);
	}

	private ParamDefinitionContext paramDefinition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParamDefinitionContext _localctx = new ParamDefinitionContext(_ctx, _parentState);
		ParamDefinitionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_paramDefinition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(127);
			((ParamDefinitionContext)_localctx).ID = match(ID);
			setState(128);
			match(T__4);
			setState(129);
			((ParamDefinitionContext)_localctx).simpleType = simpleType();
			_localctx.list.add(new VariableDefinition(((ParamDefinitionContext)_localctx).ID.getLine(), ((ParamDefinitionContext)_localctx).ID.getCharPositionInLine()+1, ((ParamDefinitionContext)_localctx).simpleType.ast, (((ParamDefinitionContext)_localctx).ID!=null?((ParamDefinitionContext)_localctx).ID.getText():null))); 
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParamDefinitionContext(_parentctx, _parentState);
					_localctx.paramDefinition1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_paramDefinition);
					setState(132);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(133);
					match(T__8);
					setState(134);
					((ParamDefinitionContext)_localctx).ID = match(ID);
					setState(135);
					match(T__4);
					setState(136);
					((ParamDefinitionContext)_localctx).simpleType = simpleType();
					_localctx.list.addAll(((ParamDefinitionContext)_localctx).paramDefinition1.list); _localctx.list.add(new VariableDefinition(((ParamDefinitionContext)_localctx).ID.getLine(), ((ParamDefinitionContext)_localctx).ID.getCharPositionInLine()+1, ((ParamDefinitionContext)_localctx).simpleType.ast, (((ParamDefinitionContext)_localctx).ID!=null?((ParamDefinitionContext)_localctx).ID.getText():null))); 
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public List<VariableDefinition> recordFields = new ArrayList<>();
		public SimpleTypeContext simpleType;
		public Token INT_CONSTANT;
		public TypeContext type;
		public VarDefinitionContext varDefinition;
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				((TypeContext)_localctx).simpleType = simpleType();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).simpleType.ast; 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(T__9);
				setState(148);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(149);
				match(T__10);
				setState(150);
				((TypeContext)_localctx).type = type();
				((TypeContext)_localctx).ast =  new ArrayType(LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null)), ((TypeContext)_localctx).type.ast); 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(T__11);
				setState(154);
				match(T__5);
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(155);
					((TypeContext)_localctx).varDefinition = varDefinition();
					_localctx.recordFields.addAll(((TypeContext)_localctx).varDefinition.list); 
					}
					}
					setState(160); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(162);
				match(T__6);

				        List<RecordField> list = new ArrayList<>();
				        HashSet<String> e = new HashSet<>();
				        for(VariableDefinition var : _localctx.recordFields) {
				            if(e.contains(var.getName())){
				                list.add(new RecordField(var.getLine(), var.getColumn(), var.getName(), new ErrorType(var.getLine(), var.getColumn(), "No se pueden definir dos campos con el mismo nombre dentro de un struct (" + var.getName() + ")")));
				            }
				            else {
				                e.add(var.getName());
				                list.add(new RecordField(var.getLine(), var.getColumn(), var.getName(), var.getType()));
				            }
				        }
				        ((TypeContext)_localctx).ast =  new StructType(list);
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleTypeContext extends ParserRuleContext {
		public Type ast;
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitSimpleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simpleType);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(T__12);
				((SimpleTypeContext)_localctx).ast =  IntType.getInstance(); 
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(T__13);
				((SimpleTypeContext)_localctx).ast =  DoubleType.getInstance(); 
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(T__14);
				((SimpleTypeContext)_localctx).ast =  CharType.getInstance(); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public List<Statement> list = new ArrayList<>();
		public Token OP;
		public ParamsContext params;
		public ExpressionContext expression;
		public Token ID;
		public ExpressionContext expression1;
		public ExpressionContext expression2;
		public BodyContext body1;
		public BodyContext body2;
		public BodyContext body;
		public CasesContext cases;
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		int _la;
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				((StatementContext)_localctx).OP = match(T__15);
				setState(176);
				((StatementContext)_localctx).params = params(0);
				setState(177);
				match(T__7);
				_localctx.list.add(new Print(((StatementContext)_localctx).OP.getLine(), ((StatementContext)_localctx).OP.getCharPositionInLine()+1, ((StatementContext)_localctx).params.list)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				((StatementContext)_localctx).OP = match(T__16);
				setState(181);
				((StatementContext)_localctx).params = params(0);
				setState(182);
				match(T__7);
				((StatementContext)_localctx).params.list.forEach((statement -> _localctx.list.add(new Input(statement.getLine(), statement.getColumn(), statement)))); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				((StatementContext)_localctx).OP = match(T__17);
				setState(186);
				((StatementContext)_localctx).expression = expression(0);
				setState(187);
				match(T__7);
				_localctx.list.add(new Return(((StatementContext)_localctx).OP.getLine(), ((StatementContext)_localctx).OP.getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast)); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				((StatementContext)_localctx).ID = match(ID);
				setState(191);
				match(T__2);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65970898993160L) != 0)) {
					{
					setState(192);
					((StatementContext)_localctx).params = params(0);
					}
				}

				setState(195);
				match(T__3);
				setState(196);
				match(T__7);
				_localctx.list.add(new FunctionInvocation(((StatementContext)_localctx).ID.getLine(), ((StatementContext)_localctx).ID.getCharPositionInLine()+1, new Variable(((StatementContext)_localctx).ID.getLine(), ((StatementContext)_localctx).ID.getCharPositionInLine()+1, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null)), ((StatementContext)_localctx).params != null ? ((StatementContext)_localctx).params.list : new ArrayList<Expression>())); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				((StatementContext)_localctx).expression1 = expression(0);
				setState(199);
				((StatementContext)_localctx).OP = match(T__18);
				setState(200);
				((StatementContext)_localctx).expression2 = expression(0);
				setState(201);
				match(T__7);
				_localctx.list.add(new Assignment(((StatementContext)_localctx).OP.getLine(), ((StatementContext)_localctx).OP.getCharPositionInLine()+1, ((StatementContext)_localctx).expression1.ast, ((StatementContext)_localctx).expression2.ast)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(204);
				((StatementContext)_localctx).OP = match(T__19);
				setState(205);
				((StatementContext)_localctx).expression = expression(0);
				setState(206);
				match(T__4);
				setState(207);
				((StatementContext)_localctx).body1 = body();
				setState(211);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(208);
					match(T__20);
					setState(209);
					match(T__4);
					setState(210);
					((StatementContext)_localctx).body2 = body();
					}
					break;
				}
				_localctx.list.add(new If(((StatementContext)_localctx).OP.getLine(), ((StatementContext)_localctx).OP.getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).body1.list, ((StatementContext)_localctx).body2 != null ? ((StatementContext)_localctx).body2.list : new ArrayList<Statement>())); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(215);
				((StatementContext)_localctx).OP = match(T__21);
				setState(216);
				((StatementContext)_localctx).expression = expression(0);
				setState(217);
				match(T__4);
				setState(218);
				((StatementContext)_localctx).body = body();
				_localctx.list.add(new While(((StatementContext)_localctx).OP.getLine(), ((StatementContext)_localctx).OP.getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).body.list)); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(221);
				((StatementContext)_localctx).OP = match(T__22);
				setState(222);
				match(T__2);
				setState(223);
				((StatementContext)_localctx).expression = expression(0);
				setState(224);
				match(T__3);
				setState(225);
				match(T__5);
				setState(226);
				((StatementContext)_localctx).cases = cases();
				setState(227);
				match(T__6);
				_localctx.list.add(new Switch(((StatementContext)_localctx).OP.getLine(), ((StatementContext)_localctx).OP.getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).cases.list)); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public List<Statement> list = new ArrayList<>();
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_body);
		int _la;
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(232);
					match(T__5);
					}
				}

				setState(235);
				((BodyContext)_localctx).statement = statement();
				setState(237);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(236);
					match(T__6);
					}
					break;
				}
				_localctx.list.addAll(((BodyContext)_localctx).statement.list); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(T__5);
				setState(245); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(242);
					((BodyContext)_localctx).statement = statement();
					_localctx.list.addAll(((BodyContext)_localctx).statement.list); 
					}
					}
					setState(247); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 65970913083400L) != 0) );
				setState(249);
				match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CasesContext extends ParserRuleContext {
		public List<SwitchCase> list = new ArrayList<>();
		public List<Statement> statements = new ArrayList<>();
		public Token OP;
		public ExpressionContext expression;
		public StatementsListContext statementsList;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementsListContext> statementsList() {
			return getRuleContexts(StatementsListContext.class);
		}
		public StatementsListContext statementsList(int i) {
			return getRuleContext(StatementsListContext.class,i);
		}
		public CasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitCases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasesContext cases() throws RecognitionException {
		CasesContext _localctx = new CasesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(253);
				((CasesContext)_localctx).OP = match(T__23);
				setState(254);
				((CasesContext)_localctx).expression = expression(0);
				setState(255);
				match(T__4);
				setState(256);
				((CasesContext)_localctx).statementsList = statementsList();
				_localctx.list.add(new SwitchCase(((CasesContext)_localctx).OP.getLine(), ((CasesContext)_localctx).OP.getCharPositionInLine()+1, ((CasesContext)_localctx).expression.ast, ((CasesContext)_localctx).statementsList.list)); 
				}
				}
				setState(261); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__23 );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsListContext extends ParserRuleContext {
		public List<Statement> list = new ArrayList<>();
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementsList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatementsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsListContext statementsList() throws RecognitionException {
		StatementsListContext _localctx = new StatementsListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statementsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(263);
				((StatementsListContext)_localctx).statement = statement();
				_localctx.list.addAll(((StatementsListContext)_localctx).statement.list); 
				}
				}
				setState(268); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 65970913083400L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext expression1;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token ID;
		public ParamsContext params;
		public Token OP;
		public SimpleTypeContext simpleType;
		public ExpressionContext expression2;
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(271);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 2:
				{
				setState(273);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new DoubleLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 3:
				{
				setState(275);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			case 4:
				{
				setState(277);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			case 5:
				{
				setState(279);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(280);
				match(T__2);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65970898993160L) != 0)) {
					{
					setState(281);
					((ExpressionContext)_localctx).params = params(0);
					}
				}

				setState(284);
				match(T__3);
				((ExpressionContext)_localctx).ast =  new FunctionInvocation(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)), ((ExpressionContext)_localctx).params != null ? ((ExpressionContext)_localctx).params.list : new ArrayList<Expression>()); 
				}
				break;
			case 6:
				{
				setState(286);
				match(T__2);
				setState(287);
				((ExpressionContext)_localctx).expression1 = expression(0);
				setState(288);
				match(T__3);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression1.ast; 
				}
				break;
			case 7:
				{
				setState(291);
				((ExpressionContext)_localctx).OP = match(T__2);
				setState(292);
				((ExpressionContext)_localctx).simpleType = simpleType();
				setState(293);
				match(T__3);
				setState(294);
				((ExpressionContext)_localctx).expression1 = expression(8);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).OP.getLine(), ((ExpressionContext)_localctx).OP.getCharPositionInLine()+1, ((ExpressionContext)_localctx).expression1.ast, ((ExpressionContext)_localctx).simpleType.ast); 
				}
				break;
			case 8:
				{
				setState(297);
				((ExpressionContext)_localctx).OP = match(T__25);
				setState(298);
				((ExpressionContext)_localctx).expression1 = expression(7);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).OP.getLine(), ((ExpressionContext)_localctx).OP.getCharPositionInLine()+1, ((ExpressionContext)_localctx).expression1.ast); 
				}
				break;
			case 9:
				{
				setState(301);
				((ExpressionContext)_localctx).OP = match(T__26);
				setState(302);
				((ExpressionContext)_localctx).expression1 = expression(6);
				((ExpressionContext)_localctx).ast =  new LogicalNot(((ExpressionContext)_localctx).OP.getLine(), ((ExpressionContext)_localctx).OP.getCharPositionInLine()+1, ((ExpressionContext)_localctx).expression1.ast); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(342);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.expression1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(307);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(308);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(309);
						((ExpressionContext)_localctx).expression2 = expression(6);
						((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).OP.getLine(), ((ExpressionContext)_localctx).OP.getCharPositionInLine()+1, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).expression1.ast, ((ExpressionContext)_localctx).expression2.ast); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.expression1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(312);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(313);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__30) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(314);
						((ExpressionContext)_localctx).expression2 = expression(5);
						((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).OP.getLine(), ((ExpressionContext)_localctx).OP.getCharPositionInLine()+1, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).expression1.ast, ((ExpressionContext)_localctx).expression2.ast); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.expression1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(317);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(318);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 270582939648L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(319);
						((ExpressionContext)_localctx).expression2 = expression(4);
						((ExpressionContext)_localctx).ast =  new Comparison(((ExpressionContext)_localctx).OP.getLine(), ((ExpressionContext)_localctx).OP.getCharPositionInLine()+1, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).expression1.ast, ((ExpressionContext)_localctx).expression2.ast); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.expression1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(322);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(323);
						((ExpressionContext)_localctx).OP = match(T__37);
						setState(324);
						((ExpressionContext)_localctx).expression2 = expression(3);
						((ExpressionContext)_localctx).ast =  new Logical(((ExpressionContext)_localctx).OP.getLine(), ((ExpressionContext)_localctx).OP.getCharPositionInLine()+1, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).expression1.ast, ((ExpressionContext)_localctx).expression2.ast); 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.expression1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(327);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(328);
						((ExpressionContext)_localctx).OP = match(T__38);
						setState(329);
						((ExpressionContext)_localctx).expression2 = expression(2);
						((ExpressionContext)_localctx).ast =  new Logical(((ExpressionContext)_localctx).OP.getLine(), ((ExpressionContext)_localctx).OP.getCharPositionInLine()+1, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).expression1.ast, ((ExpressionContext)_localctx).expression2.ast); 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.expression1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(332);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(333);
						((ExpressionContext)_localctx).OP = match(T__9);
						setState(334);
						((ExpressionContext)_localctx).expression2 = expression(0);
						setState(335);
						match(T__10);
						((ExpressionContext)_localctx).ast =  new ArrayAccess(((ExpressionContext)_localctx).OP.getLine(), ((ExpressionContext)_localctx).OP.getCharPositionInLine()+1, ((ExpressionContext)_localctx).expression1.ast, ((ExpressionContext)_localctx).expression2.ast); 
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.expression1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(338);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(339);
						((ExpressionContext)_localctx).OP = match(T__24);
						setState(340);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new StructAccess(((ExpressionContext)_localctx).OP.getLine(), ((ExpressionContext)_localctx).OP.getCharPositionInLine()+1, ((ExpressionContext)_localctx).expression1.ast, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
						}
						break;
					}
					} 
				}
				setState(346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public List<Expression> list = new ArrayList<>();
		public ParamsContext params1;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		return params(0);
	}

	private ParamsContext params(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParamsContext _localctx = new ParamsContext(_ctx, _parentState);
		ParamsContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_params, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(348);
			((ParamsContext)_localctx).expression = expression(0);
			_localctx.list.add(((ParamsContext)_localctx).expression.ast); 
			}
			_ctx.stop = _input.LT(-1);
			setState(358);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParamsContext(_parentctx, _parentState);
					_localctx.params1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_params);
					setState(351);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(352);
					match(T__8);
					setState(353);
					((ParamsContext)_localctx).expression = expression(0);
					_localctx.list.addAll(((ParamsContext)_localctx).params1.list); _localctx.list.add(((ParamsContext)_localctx).expression.ast); 
					}
					} 
				}
				setState(360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return idents_sempred((IdentsContext)_localctx, predIndex);
		case 6:
			return paramDefinition_sempred((ParamDefinitionContext)_localctx, predIndex);
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 14:
			return params_sempred((ParamsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean idents_sempred(IdentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean paramDefinition_sempred(ParamDefinitionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean params_sempred(ParamsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u016a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u00015\b\u0001\n\u0001\f\u00018\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001=\b\u0001\n\u0001\f\u0001@\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002K\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004[\b\u0004\n\u0004\f\u0004^\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005d\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005i\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005o\b\u0005\n\u0005\f\u0005r\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005w\b\u0005\n\u0005\f\u0005"+
		"z\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u008c\b\u0006\n\u0006\f\u0006\u008f\t\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004"+
		"\u0007\u009f\b\u0007\u000b\u0007\f\u0007\u00a0\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00a6\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0003\b\u00ae\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00c2\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00d4\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00e7\b\t\u0001\n\u0003"+
		"\n\u00ea\b\n\u0001\n\u0001\n\u0003\n\u00ee\b\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0004\n\u00f6\b\n\u000b\n\f\n\u00f7\u0001\n\u0001"+
		"\n\u0003\n\u00fc\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0004\u000b\u0104\b\u000b\u000b\u000b\f\u000b\u0105"+
		"\u0001\f\u0001\f\u0001\f\u0004\f\u010b\b\f\u000b\f\f\f\u010c\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u011b\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0132\b\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0157"+
		"\b\r\n\r\f\r\u015a\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u0165\b\u000e\n\u000e\f\u000e\u0168\t\u000e\u0001\u000e\u0000\u0004\b"+
		"\f\u001a\u001c\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u0000\u0003\u0001\u0000\u001c\u001e\u0002\u0000"+
		"\u001a\u001a\u001f\u001f\u0001\u0000 %\u0189\u0000#\u0001\u0000\u0000"+
		"\u0000\u0002+\u0001\u0000\u0000\u0000\u0004J\u0001\u0000\u0000\u0000\u0006"+
		"L\u0001\u0000\u0000\u0000\bR\u0001\u0000\u0000\u0000\n_\u0001\u0000\u0000"+
		"\u0000\f~\u0001\u0000\u0000\u0000\u000e\u00a5\u0001\u0000\u0000\u0000"+
		"\u0010\u00ad\u0001\u0000\u0000\u0000\u0012\u00e6\u0001\u0000\u0000\u0000"+
		"\u0014\u00fb\u0001\u0000\u0000\u0000\u0016\u0103\u0001\u0000\u0000\u0000"+
		"\u0018\u010a\u0001\u0000\u0000\u0000\u001a\u0131\u0001\u0000\u0000\u0000"+
		"\u001c\u015b\u0001\u0000\u0000\u0000\u001e\u001f\u0003\u0004\u0002\u0000"+
		"\u001f \u0006\u0000\uffff\uffff\u0000 \"\u0001\u0000\u0000\u0000!\u001e"+
		"\u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000"+
		"\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%#\u0001\u0000"+
		"\u0000\u0000&\'\u0003\u0002\u0001\u0000\'(\u0006\u0000\uffff\uffff\u0000"+
		"()\u0005\u0000\u0000\u0001)*\u0006\u0000\uffff\uffff\u0000*\u0001\u0001"+
		"\u0000\u0000\u0000+,\u0005\u0001\u0000\u0000,-\u0005\u0002\u0000\u0000"+
		"-.\u0005\u0003\u0000\u0000./\u0005\u0004\u0000\u0000/0\u0005\u0005\u0000"+
		"\u000006\u0005\u0006\u0000\u000012\u0003\u0006\u0003\u000023\u0006\u0001"+
		"\uffff\uffff\u000035\u0001\u0000\u0000\u000041\u0001\u0000\u0000\u0000"+
		"58\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u00007>\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0003\u0012"+
		"\t\u0000:;\u0006\u0001\uffff\uffff\u0000;=\u0001\u0000\u0000\u0000<9\u0001"+
		"\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000"+
		">?\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000"+
		"\u0000AB\u0005\u0007\u0000\u0000BC\u0006\u0001\uffff\uffff\u0000C\u0003"+
		"\u0001\u0000\u0000\u0000DE\u0003\u0006\u0003\u0000EF\u0006\u0002\uffff"+
		"\uffff\u0000FK\u0001\u0000\u0000\u0000GH\u0003\n\u0005\u0000HI\u0006\u0002"+
		"\uffff\uffff\u0000IK\u0001\u0000\u0000\u0000JD\u0001\u0000\u0000\u0000"+
		"JG\u0001\u0000\u0000\u0000K\u0005\u0001\u0000\u0000\u0000LM\u0003\b\u0004"+
		"\u0000MN\u0005\u0005\u0000\u0000NO\u0003\u000e\u0007\u0000OP\u0005\b\u0000"+
		"\u0000PQ\u0006\u0003\uffff\uffff\u0000Q\u0007\u0001\u0000\u0000\u0000"+
		"RS\u0006\u0004\uffff\uffff\u0000ST\u0005*\u0000\u0000TU\u0006\u0004\uffff"+
		"\uffff\u0000U\\\u0001\u0000\u0000\u0000VW\n\u0001\u0000\u0000WX\u0005"+
		"\t\u0000\u0000XY\u0005*\u0000\u0000Y[\u0006\u0004\uffff\uffff\u0000ZV"+
		"\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]\t\u0001\u0000\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000_`\u0005\u0001\u0000\u0000`a\u0005*\u0000\u0000ac\u0005"+
		"\u0003\u0000\u0000bd\u0003\f\u0006\u0000cb\u0001\u0000\u0000\u0000cd\u0001"+
		"\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0005\u0004\u0000\u0000"+
		"fh\u0005\u0005\u0000\u0000gi\u0003\u0010\b\u0000hg\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jp\u0005\u0006\u0000"+
		"\u0000kl\u0003\u0006\u0003\u0000lm\u0006\u0005\uffff\uffff\u0000mo\u0001"+
		"\u0000\u0000\u0000nk\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000"+
		"pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qx\u0001\u0000\u0000"+
		"\u0000rp\u0001\u0000\u0000\u0000st\u0003\u0012\t\u0000tu\u0006\u0005\uffff"+
		"\uffff\u0000uw\u0001\u0000\u0000\u0000vs\u0001\u0000\u0000\u0000wz\u0001"+
		"\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"y{\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{|\u0005\u0007\u0000"+
		"\u0000|}\u0006\u0005\uffff\uffff\u0000}\u000b\u0001\u0000\u0000\u0000"+
		"~\u007f\u0006\u0006\uffff\uffff\u0000\u007f\u0080\u0005*\u0000\u0000\u0080"+
		"\u0081\u0005\u0005\u0000\u0000\u0081\u0082\u0003\u0010\b\u0000\u0082\u0083"+
		"\u0006\u0006\uffff\uffff\u0000\u0083\u008d\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\n\u0001\u0000\u0000\u0085\u0086\u0005\t\u0000\u0000\u0086\u0087"+
		"\u0005*\u0000\u0000\u0087\u0088\u0005\u0005\u0000\u0000\u0088\u0089\u0003"+
		"\u0010\b\u0000\u0089\u008a\u0006\u0006\uffff\uffff\u0000\u008a\u008c\u0001"+
		"\u0000\u0000\u0000\u008b\u0084\u0001\u0000\u0000\u0000\u008c\u008f\u0001"+
		"\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001"+
		"\u0000\u0000\u0000\u008e\r\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0003\u0010\b\u0000\u0091\u0092\u0006\u0007\uffff"+
		"\uffff\u0000\u0092\u00a6\u0001\u0000\u0000\u0000\u0093\u0094\u0005\n\u0000"+
		"\u0000\u0094\u0095\u0005+\u0000\u0000\u0095\u0096\u0005\u000b\u0000\u0000"+
		"\u0096\u0097\u0003\u000e\u0007\u0000\u0097\u0098\u0006\u0007\uffff\uffff"+
		"\u0000\u0098\u00a6\u0001\u0000\u0000\u0000\u0099\u009a\u0005\f\u0000\u0000"+
		"\u009a\u009e\u0005\u0006\u0000\u0000\u009b\u009c\u0003\u0006\u0003\u0000"+
		"\u009c\u009d\u0006\u0007\uffff\uffff\u0000\u009d\u009f\u0001\u0000\u0000"+
		"\u0000\u009e\u009b\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0007\u0000"+
		"\u0000\u00a3\u00a4\u0006\u0007\uffff\uffff\u0000\u00a4\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a5\u0090\u0001\u0000\u0000\u0000\u00a5\u0093\u0001\u0000"+
		"\u0000\u0000\u00a5\u0099\u0001\u0000\u0000\u0000\u00a6\u000f\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0005\r\u0000\u0000\u00a8\u00ae\u0006\b\uffff"+
		"\uffff\u0000\u00a9\u00aa\u0005\u000e\u0000\u0000\u00aa\u00ae\u0006\b\uffff"+
		"\uffff\u0000\u00ab\u00ac\u0005\u000f\u0000\u0000\u00ac\u00ae\u0006\b\uffff"+
		"\uffff\u0000\u00ad\u00a7\u0001\u0000\u0000\u0000\u00ad\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u0011\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0005\u0010\u0000\u0000\u00b0\u00b1\u0003\u001c"+
		"\u000e\u0000\u00b1\u00b2\u0005\b\u0000\u0000\u00b2\u00b3\u0006\t\uffff"+
		"\uffff\u0000\u00b3\u00e7\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u0011"+
		"\u0000\u0000\u00b5\u00b6\u0003\u001c\u000e\u0000\u00b6\u00b7\u0005\b\u0000"+
		"\u0000\u00b7\u00b8\u0006\t\uffff\uffff\u0000\u00b8\u00e7\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0005\u0012\u0000\u0000\u00ba\u00bb\u0003\u001a\r\u0000"+
		"\u00bb\u00bc\u0005\b\u0000\u0000\u00bc\u00bd\u0006\t\uffff\uffff\u0000"+
		"\u00bd\u00e7\u0001\u0000\u0000\u0000\u00be\u00bf\u0005*\u0000\u0000\u00bf"+
		"\u00c1\u0005\u0003\u0000\u0000\u00c0\u00c2\u0003\u001c\u000e\u0000\u00c1"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u0004\u0000\u0000\u00c4"+
		"\u00c5\u0005\b\u0000\u0000\u00c5\u00e7\u0006\t\uffff\uffff\u0000\u00c6"+
		"\u00c7\u0003\u001a\r\u0000\u00c7\u00c8\u0005\u0013\u0000\u0000\u00c8\u00c9"+
		"\u0003\u001a\r\u0000\u00c9\u00ca\u0005\b\u0000\u0000\u00ca\u00cb\u0006"+
		"\t\uffff\uffff\u0000\u00cb\u00e7\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005"+
		"\u0014\u0000\u0000\u00cd\u00ce\u0003\u001a\r\u0000\u00ce\u00cf\u0005\u0005"+
		"\u0000\u0000\u00cf\u00d3\u0003\u0014\n\u0000\u00d0\u00d1\u0005\u0015\u0000"+
		"\u0000\u00d1\u00d2\u0005\u0005\u0000\u0000\u00d2\u00d4\u0003\u0014\n\u0000"+
		"\u00d3\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d6\u0006\t\uffff\uffff\u0000"+
		"\u00d6\u00e7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u0016\u0000\u0000"+
		"\u00d8\u00d9\u0003\u001a\r\u0000\u00d9\u00da\u0005\u0005\u0000\u0000\u00da"+
		"\u00db\u0003\u0014\n\u0000\u00db\u00dc\u0006\t\uffff\uffff\u0000\u00dc"+
		"\u00e7\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u0017\u0000\u0000\u00de"+
		"\u00df\u0005\u0003\u0000\u0000\u00df\u00e0\u0003\u001a\r\u0000\u00e0\u00e1"+
		"\u0005\u0004\u0000\u0000\u00e1\u00e2\u0005\u0006\u0000\u0000\u00e2\u00e3"+
		"\u0003\u0016\u000b\u0000\u00e3\u00e4\u0005\u0007\u0000\u0000\u00e4\u00e5"+
		"\u0006\t\uffff\uffff\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00af"+
		"\u0001\u0000\u0000\u0000\u00e6\u00b4\u0001\u0000\u0000\u0000\u00e6\u00b9"+
		"\u0001\u0000\u0000\u0000\u00e6\u00be\u0001\u0000\u0000\u0000\u00e6\u00c6"+
		"\u0001\u0000\u0000\u0000\u00e6\u00cc\u0001\u0000\u0000\u0000\u00e6\u00d7"+
		"\u0001\u0000\u0000\u0000\u00e6\u00dd\u0001\u0000\u0000\u0000\u00e7\u0013"+
		"\u0001\u0000\u0000\u0000\u00e8\u00ea\u0005\u0006\u0000\u0000\u00e9\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ed\u0003\u0012\t\u0000\u00ec\u00ee\u0005"+
		"\u0007\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0\u0006"+
		"\n\uffff\uffff\u0000\u00f0\u00fc\u0001\u0000\u0000\u0000\u00f1\u00f5\u0005"+
		"\u0006\u0000\u0000\u00f2\u00f3\u0003\u0012\t\u0000\u00f3\u00f4\u0006\n"+
		"\uffff\uffff\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0005\u0007\u0000\u0000\u00fa\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fb\u00e9\u0001\u0000\u0000\u0000\u00fb\u00f1\u0001"+
		"\u0000\u0000\u0000\u00fc\u0015\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005"+
		"\u0018\u0000\u0000\u00fe\u00ff\u0003\u001a\r\u0000\u00ff\u0100\u0005\u0005"+
		"\u0000\u0000\u0100\u0101\u0003\u0018\f\u0000\u0101\u0102\u0006\u000b\uffff"+
		"\uffff\u0000\u0102\u0104\u0001\u0000\u0000\u0000\u0103\u00fd\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0017\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0003\u0012\t\u0000\u0108\u0109\u0006\f\uffff"+
		"\uffff\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a\u0107\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u0019\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0006\r\uffff\uffff\u0000\u010f\u0110\u0005+"+
		"\u0000\u0000\u0110\u0132\u0006\r\uffff\uffff\u0000\u0111\u0112\u0005,"+
		"\u0000\u0000\u0112\u0132\u0006\r\uffff\uffff\u0000\u0113\u0114\u0005-"+
		"\u0000\u0000\u0114\u0132\u0006\r\uffff\uffff\u0000\u0115\u0116\u0005*"+
		"\u0000\u0000\u0116\u0132\u0006\r\uffff\uffff\u0000\u0117\u0118\u0005*"+
		"\u0000\u0000\u0118\u011a\u0005\u0003\u0000\u0000\u0119\u011b\u0003\u001c"+
		"\u000e\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000"+
		"\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0005\u0004"+
		"\u0000\u0000\u011d\u0132\u0006\r\uffff\uffff\u0000\u011e\u011f\u0005\u0003"+
		"\u0000\u0000\u011f\u0120\u0003\u001a\r\u0000\u0120\u0121\u0005\u0004\u0000"+
		"\u0000\u0121\u0122\u0006\r\uffff\uffff\u0000\u0122\u0132\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\u0005\u0003\u0000\u0000\u0124\u0125\u0003\u0010\b\u0000"+
		"\u0125\u0126\u0005\u0004\u0000\u0000\u0126\u0127\u0003\u001a\r\b\u0127"+
		"\u0128\u0006\r\uffff\uffff\u0000\u0128\u0132\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0005\u001a\u0000\u0000\u012a\u012b\u0003\u001a\r\u0007\u012b\u012c"+
		"\u0006\r\uffff\uffff\u0000\u012c\u0132\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0005\u001b\u0000\u0000\u012e\u012f\u0003\u001a\r\u0006\u012f\u0130\u0006"+
		"\r\uffff\uffff\u0000\u0130\u0132\u0001\u0000\u0000\u0000\u0131\u010e\u0001"+
		"\u0000\u0000\u0000\u0131\u0111\u0001\u0000\u0000\u0000\u0131\u0113\u0001"+
		"\u0000\u0000\u0000\u0131\u0115\u0001\u0000\u0000\u0000\u0131\u0117\u0001"+
		"\u0000\u0000\u0000\u0131\u011e\u0001\u0000\u0000\u0000\u0131\u0123\u0001"+
		"\u0000\u0000\u0000\u0131\u0129\u0001\u0000\u0000\u0000\u0131\u012d\u0001"+
		"\u0000\u0000\u0000\u0132\u0158\u0001\u0000\u0000\u0000\u0133\u0134\n\u0005"+
		"\u0000\u0000\u0134\u0135\u0007\u0000\u0000\u0000\u0135\u0136\u0003\u001a"+
		"\r\u0006\u0136\u0137\u0006\r\uffff\uffff\u0000\u0137\u0157\u0001\u0000"+
		"\u0000\u0000\u0138\u0139\n\u0004\u0000\u0000\u0139\u013a\u0007\u0001\u0000"+
		"\u0000\u013a\u013b\u0003\u001a\r\u0005\u013b\u013c\u0006\r\uffff\uffff"+
		"\u0000\u013c\u0157\u0001\u0000\u0000\u0000\u013d\u013e\n\u0003\u0000\u0000"+
		"\u013e\u013f\u0007\u0002\u0000\u0000\u013f\u0140\u0003\u001a\r\u0004\u0140"+
		"\u0141\u0006\r\uffff\uffff\u0000\u0141\u0157\u0001\u0000\u0000\u0000\u0142"+
		"\u0143\n\u0002\u0000\u0000\u0143\u0144\u0005&\u0000\u0000\u0144\u0145"+
		"\u0003\u001a\r\u0003\u0145\u0146\u0006\r\uffff\uffff\u0000\u0146\u0157"+
		"\u0001\u0000\u0000\u0000\u0147\u0148\n\u0001\u0000\u0000\u0148\u0149\u0005"+
		"\'\u0000\u0000\u0149\u014a\u0003\u001a\r\u0002\u014a\u014b\u0006\r\uffff"+
		"\uffff\u0000\u014b\u0157\u0001\u0000\u0000\u0000\u014c\u014d\n\n\u0000"+
		"\u0000\u014d\u014e\u0005\n\u0000\u0000\u014e\u014f\u0003\u001a\r\u0000"+
		"\u014f\u0150\u0005\u000b\u0000\u0000\u0150\u0151\u0006\r\uffff\uffff\u0000"+
		"\u0151\u0157\u0001\u0000\u0000\u0000\u0152\u0153\n\t\u0000\u0000\u0153"+
		"\u0154\u0005\u0019\u0000\u0000\u0154\u0155\u0005*\u0000\u0000\u0155\u0157"+
		"\u0006\r\uffff\uffff\u0000\u0156\u0133\u0001\u0000\u0000\u0000\u0156\u0138"+
		"\u0001\u0000\u0000\u0000\u0156\u013d\u0001\u0000\u0000\u0000\u0156\u0142"+
		"\u0001\u0000\u0000\u0000\u0156\u0147\u0001\u0000\u0000\u0000\u0156\u014c"+
		"\u0001\u0000\u0000\u0000\u0156\u0152\u0001\u0000\u0000\u0000\u0157\u015a"+
		"\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0159"+
		"\u0001\u0000\u0000\u0000\u0159\u001b\u0001\u0000\u0000\u0000\u015a\u0158"+
		"\u0001\u0000\u0000\u0000\u015b\u015c\u0006\u000e\uffff\uffff\u0000\u015c"+
		"\u015d\u0003\u001a\r\u0000\u015d\u015e\u0006\u000e\uffff\uffff\u0000\u015e"+
		"\u0166\u0001\u0000\u0000\u0000\u015f\u0160\n\u0001\u0000\u0000\u0160\u0161"+
		"\u0005\t\u0000\u0000\u0161\u0162\u0003\u001a\r\u0000\u0162\u0163\u0006"+
		"\u000e\uffff\uffff\u0000\u0163\u0165\u0001\u0000\u0000\u0000\u0164\u015f"+
		"\u0001\u0000\u0000\u0000\u0165\u0168\u0001\u0000\u0000\u0000\u0166\u0164"+
		"\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u001d"+
		"\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u001b#6>"+
		"J\\chpx\u008d\u00a0\u00a5\u00ad\u00c1\u00d3\u00e6\u00e9\u00ed\u00f7\u00fb"+
		"\u0105\u010c\u011a\u0131\u0156\u0158\u0166";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}