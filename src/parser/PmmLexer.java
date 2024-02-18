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
		TRASH=1, INT_CONSTANT=2, REAL_CONSTANT=3, CHAR_CONSTANT=4, CHAR_CONSTANT_N=5, 
		CHAR_CONSTANT_T=6, COMENTARIO=7, IDENT=8;
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
			"CHAR_CONSTANT_N", "CHAR_CONSTANT_T", "COMENTARIO_1LINEA", "COMENTARIO_NLINEAS", 
			"COMENTARIO", "IDENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "''\\n''", "''\\t''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TRASH", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "CHAR_CONSTANT_N", 
			"CHAR_CONSTANT_T", "COMENTARIO", "IDENT"
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
		"\u0004\u0000\b\u0090\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0004\u0000#\b\u0000\u000b\u0000\f\u0000"+
		"$\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u00030\b\u0003\n\u0003\f\u0003"+
		"3\t\u0003\u0003\u00035\b\u0003\u0001\u0004\u0003\u00048\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004?\b"+
		"\u0004\u0003\u0004A\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005E\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005I\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0003\u0006O\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0003\t]\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0005\fk\b\f\n\f\f\fn\t\f\u0001\f\u0003\fq\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\rx\b\r\n\r\f\r{\t\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e\u0083\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0087\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u008c\b\u000f\n\u000f\f\u000f\u008f\t\u000f\u0001y"+
		"\u0000\u0010\u0001\u0001\u0003\u0000\u0005\u0000\u0007\u0002\t\u0000\u000b"+
		"\u0000\r\u0003\u000f\u0000\u0011\u0000\u0013\u0004\u0015\u0005\u0017\u0006"+
		"\u0019\u0000\u001b\u0000\u001d\u0007\u001f\b\u0001\u0000\u0006\u0003\u0000"+
		"\t\n\f\r  \u0002\u0000AZaz\u0001\u000009\u0001\u000019\u0002\u0000EEe"+
		"e\u0001\u0000\n\n\u0099\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0001\"\u0001\u0000\u0000\u0000\u0003(\u0001\u0000"+
		"\u0000\u0000\u0005*\u0001\u0000\u0000\u0000\u00074\u0001\u0000\u0000\u0000"+
		"\t@\u0001\u0000\u0000\u0000\u000bD\u0001\u0000\u0000\u0000\rN\u0001\u0000"+
		"\u0000\u0000\u000fP\u0001\u0000\u0000\u0000\u0011V\u0001\u0000\u0000\u0000"+
		"\u0013\\\u0001\u0000\u0000\u0000\u0015^\u0001\u0000\u0000\u0000\u0017"+
		"c\u0001\u0000\u0000\u0000\u0019h\u0001\u0000\u0000\u0000\u001br\u0001"+
		"\u0000\u0000\u0000\u001d\u0082\u0001\u0000\u0000\u0000\u001f\u0086\u0001"+
		"\u0000\u0000\u0000!#\u0007\u0000\u0000\u0000\"!\u0001\u0000\u0000\u0000"+
		"#$\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000"+
		"\u0000%&\u0001\u0000\u0000\u0000&\'\u0006\u0000\u0000\u0000\'\u0002\u0001"+
		"\u0000\u0000\u0000()\u0007\u0001\u0000\u0000)\u0004\u0001\u0000\u0000"+
		"\u0000*+\u0007\u0002\u0000\u0000+\u0006\u0001\u0000\u0000\u0000,5\u0005"+
		"0\u0000\u0000-1\u0007\u0003\u0000\u0000.0\u0003\u0005\u0002\u0000/.\u0001"+
		"\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u0000"+
		"12\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000"+
		"\u00004,\u0001\u0000\u0000\u00004-\u0001\u0000\u0000\u00005\b\u0001\u0000"+
		"\u0000\u000068\u0003\u0007\u0003\u000076\u0001\u0000\u0000\u000078\u0001"+
		"\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0005.\u0000\u0000:A\u0003"+
		"\u0007\u0003\u0000;<\u0003\u0007\u0003\u0000<>\u0005.\u0000\u0000=?\u0003"+
		"\u0007\u0003\u0000>=\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000"+
		"?A\u0001\u0000\u0000\u0000@7\u0001\u0000\u0000\u0000@;\u0001\u0000\u0000"+
		"\u0000A\n\u0001\u0000\u0000\u0000BE\u0003\u0007\u0003\u0000CE\u0003\t"+
		"\u0004\u0000DB\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000FH\u0007\u0004\u0000\u0000GI\u0005-\u0000\u0000HG\u0001"+
		"\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"JK\u0003\u0007\u0003\u0000K\f\u0001\u0000\u0000\u0000LO\u0003\t\u0004"+
		"\u0000MO\u0003\u000b\u0005\u0000NL\u0001\u0000\u0000\u0000NM\u0001\u0000"+
		"\u0000\u0000O\u000e\u0001\u0000\u0000\u0000PQ\u0005\'\u0000\u0000QR\u0005"+
		"\\\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0003\u0007\u0003\u0000TU\u0005"+
		"\'\u0000\u0000U\u0010\u0001\u0000\u0000\u0000VW\u0005\'\u0000\u0000WX"+
		"\t\u0000\u0000\u0000XY\u0005\'\u0000\u0000Y\u0012\u0001\u0000\u0000\u0000"+
		"Z]\u0003\u000f\u0007\u0000[]\u0003\u0011\b\u0000\\Z\u0001\u0000\u0000"+
		"\u0000\\[\u0001\u0000\u0000\u0000]\u0014\u0001\u0000\u0000\u0000^_\u0005"+
		"\'\u0000\u0000_`\u0005\\\u0000\u0000`a\u0005n\u0000\u0000ab\u0005\'\u0000"+
		"\u0000b\u0016\u0001\u0000\u0000\u0000cd\u0005\'\u0000\u0000de\u0005\\"+
		"\u0000\u0000ef\u0005t\u0000\u0000fg\u0005\'\u0000\u0000g\u0018\u0001\u0000"+
		"\u0000\u0000hl\u0005#\u0000\u0000ik\b\u0005\u0000\u0000ji\u0001\u0000"+
		"\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"oq\u0005\n\u0000\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"q\u001a\u0001\u0000\u0000\u0000rs\u0005\"\u0000\u0000st\u0005\"\u0000"+
		"\u0000tu\u0005\"\u0000\u0000uy\u0001\u0000\u0000\u0000vx\t\u0000\u0000"+
		"\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000|}\u0005\"\u0000\u0000}~\u0005\"\u0000\u0000~\u007f"+
		"\u0005\"\u0000\u0000\u007f\u001c\u0001\u0000\u0000\u0000\u0080\u0083\u0003"+
		"\u0019\f\u0000\u0081\u0083\u0003\u001b\r\u0000\u0082\u0080\u0001\u0000"+
		"\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u001e\u0001\u0000"+
		"\u0000\u0000\u0084\u0087\u0003\u0003\u0001\u0000\u0085\u0087\u0005_\u0000"+
		"\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000"+
		"\u0000\u0087\u008d\u0001\u0000\u0000\u0000\u0088\u008c\u0003\u0003\u0001"+
		"\u0000\u0089\u008c\u0003\u0005\u0002\u0000\u008a\u008c\u0005_\u0000\u0000"+
		"\u008b\u0088\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000"+
		"\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000"+
		"\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"+
		"\u008e \u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0012"+
		"\u0000$147>@DHN\\lpy\u0082\u0086\u008b\u008d\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}