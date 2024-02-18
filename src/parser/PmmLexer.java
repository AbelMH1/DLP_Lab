// Generated from C:/Users/Abel/OneDrive/Documents/UniOvi/Asignaturas/Cuarto/Cuatrimestre 2/DLP/Laboratorio/DLP_Lab/src/parser/Pmm.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TRASH=1, INT_CONSTANT=2, REAL_CONSTANT=3, CHAR_CONSTANT=4, COMENTARIO=5, 
		ID=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TRASH", "LETRA", "DIGITO", "INT_CONSTANT", "REAL_CONSTANT_P", "REAL_CONSTANT_E", 
			"REAL_CONSTANT", "CHAR_CONSTANT_NUM", "CHAR_CONSTANT_TEXT", "CHAR_CONSTANT", 
			"COMENTARIO_1LINEA", "COMENTARIO_NLINEAS", "COMENTARIO", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TRASH", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "COMENTARIO", 
			"ID"
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


	public PmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0006\u008c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0004\u0000"+
		"\u001f\b\u0000\u000b\u0000\f\u0000 \u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003,\b\u0003\n\u0003\f\u0003/\t\u0003\u0003\u00031\b\u0003\u0001"+
		"\u0004\u0003\u00044\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004;\b\u0004\u0003\u0004=\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0003\u0005A\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"E\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006"+
		"K\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\ta\b\t\u0001"+
		"\n\u0001\n\u0005\ne\b\n\n\n\f\nh\t\n\u0001\n\u0003\nk\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000br\b\u000b"+
		"\n\u000b\f\u000bu\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0003\f}\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0003\r"+
		"\u0083\b\r\u0001\r\u0001\r\u0001\r\u0005\r\u0088\b\r\n\r\f\r\u008b\t\r"+
		"\u0001s\u0000\u000e\u0001\u0001\u0003\u0000\u0005\u0000\u0007\u0002\t"+
		"\u0000\u000b\u0000\r\u0003\u000f\u0000\u0011\u0000\u0013\u0004\u0015\u0000"+
		"\u0017\u0000\u0019\u0005\u001b\u0006\u0001\u0000\u0006\u0003\u0000\t\n"+
		"\f\r  \u0002\u0000AZaz\u0001\u000009\u0001\u000019\u0002\u0000EEee\u0001"+
		"\u0000\n\n\u0097\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0001\u001e\u0001\u0000\u0000\u0000\u0003$\u0001\u0000\u0000"+
		"\u0000\u0005&\u0001\u0000\u0000\u0000\u00070\u0001\u0000\u0000\u0000\t"+
		"<\u0001\u0000\u0000\u0000\u000b@\u0001\u0000\u0000\u0000\rJ\u0001\u0000"+
		"\u0000\u0000\u000fL\u0001\u0000\u0000\u0000\u0011R\u0001\u0000\u0000\u0000"+
		"\u0013`\u0001\u0000\u0000\u0000\u0015b\u0001\u0000\u0000\u0000\u0017l"+
		"\u0001\u0000\u0000\u0000\u0019|\u0001\u0000\u0000\u0000\u001b\u0082\u0001"+
		"\u0000\u0000\u0000\u001d\u001f\u0007\u0000\u0000\u0000\u001e\u001d\u0001"+
		"\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000"+
		"\u0000 !\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"#\u0006\u0000"+
		"\u0000\u0000#\u0002\u0001\u0000\u0000\u0000$%\u0007\u0001\u0000\u0000"+
		"%\u0004\u0001\u0000\u0000\u0000&\'\u0007\u0002\u0000\u0000\'\u0006\u0001"+
		"\u0000\u0000\u0000(1\u00050\u0000\u0000)-\u0007\u0003\u0000\u0000*,\u0003"+
		"\u0005\u0002\u0000+*\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000"+
		"-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000"+
		"\u0000/-\u0001\u0000\u0000\u00000(\u0001\u0000\u0000\u00000)\u0001\u0000"+
		"\u0000\u00001\b\u0001\u0000\u0000\u000024\u0003\u0007\u0003\u000032\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u0000"+
		"56\u0005.\u0000\u00006=\u0003\u0007\u0003\u000078\u0003\u0007\u0003\u0000"+
		"8:\u0005.\u0000\u00009;\u0003\u0007\u0003\u0000:9\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;=\u0001\u0000\u0000\u0000<3\u0001\u0000\u0000"+
		"\u0000<7\u0001\u0000\u0000\u0000=\n\u0001\u0000\u0000\u0000>A\u0003\u0007"+
		"\u0003\u0000?A\u0003\t\u0004\u0000@>\u0001\u0000\u0000\u0000@?\u0001\u0000"+
		"\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0007\u0004\u0000\u0000CE\u0005"+
		"-\u0000\u0000DC\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000FG\u0003\u0007\u0003\u0000G\f\u0001\u0000\u0000\u0000"+
		"HK\u0003\t\u0004\u0000IK\u0003\u000b\u0005\u0000JH\u0001\u0000\u0000\u0000"+
		"JI\u0001\u0000\u0000\u0000K\u000e\u0001\u0000\u0000\u0000LM\u0005\'\u0000"+
		"\u0000MN\u0005\\\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0003\u0007\u0003"+
		"\u0000PQ\u0005\'\u0000\u0000Q\u0010\u0001\u0000\u0000\u0000RS\u0005\'"+
		"\u0000\u0000ST\t\u0000\u0000\u0000TU\u0005\'\u0000\u0000U\u0012\u0001"+
		"\u0000\u0000\u0000Va\u0003\u000f\u0007\u0000Wa\u0003\u0011\b\u0000XY\u0005"+
		"\'\u0000\u0000YZ\u0005\\\u0000\u0000Z[\u0005n\u0000\u0000[a\u0005\'\u0000"+
		"\u0000\\]\u0005\'\u0000\u0000]^\u0005\\\u0000\u0000^_\u0005t\u0000\u0000"+
		"_a\u0005\'\u0000\u0000`V\u0001\u0000\u0000\u0000`W\u0001\u0000\u0000\u0000"+
		"`X\u0001\u0000\u0000\u0000`\\\u0001\u0000\u0000\u0000a\u0014\u0001\u0000"+
		"\u0000\u0000bf\u0005#\u0000\u0000ce\b\u0005\u0000\u0000dc\u0001\u0000"+
		"\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000"+
		"ik\u0005\n\u0000\u0000ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"k\u0016\u0001\u0000\u0000\u0000lm\u0005\"\u0000\u0000mn\u0005\"\u0000"+
		"\u0000no\u0005\"\u0000\u0000os\u0001\u0000\u0000\u0000pr\t\u0000\u0000"+
		"\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000sq\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000vw\u0005\"\u0000\u0000wx\u0005\"\u0000\u0000xy\u0005"+
		"\"\u0000\u0000y\u0018\u0001\u0000\u0000\u0000z}\u0003\u0015\n\u0000{}"+
		"\u0003\u0017\u000b\u0000|z\u0001\u0000\u0000\u0000|{\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0006\f\u0000\u0000\u007f\u001a"+
		"\u0001\u0000\u0000\u0000\u0080\u0083\u0003\u0003\u0001\u0000\u0081\u0083"+
		"\u0005_\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0089\u0001\u0000\u0000\u0000\u0084\u0088\u0003"+
		"\u0003\u0001\u0000\u0085\u0088\u0003\u0005\u0002\u0000\u0086\u0088\u0005"+
		"_\u0000\u0000\u0087\u0084\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000"+
		"\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\u001c\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u0012\u0000 -03:<@DJ`fjs|\u0082\u0087\u0089\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}