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
		TRASH=1, COMENTARIO=2, ID=3, INT_CONSTANT=4, REAL_CONSTANT=5, CHAR_CONSTANT=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TRASH", "COMENTARIO", "ID", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", 
			"LETRA", "DIGITO", "REAL_CONSTANT_P", "REAL_CONSTANT_E", "COMENTARIO_1LINEA", 
			"COMENTARIO_NLINEAS"
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
			null, "TRASH", "COMENTARIO", "ID", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT"
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
		"\u0004\u0000\u0006\u0089\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0001\u0000\u0004\u0000\u001b\b\u0000\u000b\u0000\f"+
		"\u0000\u001c\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"#\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002"+
		")\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002.\b\u0002\n\u0002"+
		"\f\u00021\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u00036\b\u0003"+
		"\n\u0003\f\u00039\t\u0003\u0003\u0003;\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0003\u0004?\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005O\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0003\bV\b\b"+
		"\u0001\b\u0001\b\u0004\bZ\b\b\u000b\b\f\b[\u0001\b\u0001\b\u0001\b\u0005"+
		"\ba\b\b\n\b\f\bd\t\b\u0003\bf\b\b\u0001\t\u0001\t\u0003\tj\b\t\u0001\t"+
		"\u0001\t\u0003\tn\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\nt\b\n\n\n"+
		"\f\nw\t\n\u0001\n\u0003\nz\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u0081\b\u000b\n\u000b\f\u000b\u0084\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0002u\u0082\u0000\f"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0000\u000f\u0000\u0011\u0000\u0013\u0000\u0015\u0000\u0017\u0000\u0001"+
		"\u0000\b\u0003\u0000\t\n\f\r  \u0001\u000019\u0002\u0000nntt\u0002\u0000"+
		"AZaz\u0001\u000009\u0002\u0000EEee\u0002\u0000++--\u0001\u0001\n\n\u0095"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0001"+
		"\u001a\u0001\u0000\u0000\u0000\u0003\"\u0001\u0000\u0000\u0000\u0005("+
		"\u0001\u0000\u0000\u0000\u0007:\u0001\u0000\u0000\u0000\t>\u0001\u0000"+
		"\u0000\u0000\u000bN\u0001\u0000\u0000\u0000\rP\u0001\u0000\u0000\u0000"+
		"\u000fR\u0001\u0000\u0000\u0000\u0011e\u0001\u0000\u0000\u0000\u0013i"+
		"\u0001\u0000\u0000\u0000\u0015q\u0001\u0000\u0000\u0000\u0017{\u0001\u0000"+
		"\u0000\u0000\u0019\u001b\u0007\u0000\u0000\u0000\u001a\u0019\u0001\u0000"+
		"\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000"+
		"\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0006\u0000\u0000\u0000\u001f\u0002\u0001\u0000"+
		"\u0000\u0000 #\u0003\u0015\n\u0000!#\u0003\u0017\u000b\u0000\" \u0001"+
		"\u0000\u0000\u0000\"!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000"+
		"$%\u0006\u0001\u0000\u0000%\u0004\u0001\u0000\u0000\u0000&)\u0003\r\u0006"+
		"\u0000\')\u0005_\u0000\u0000(&\u0001\u0000\u0000\u0000(\'\u0001\u0000"+
		"\u0000\u0000)/\u0001\u0000\u0000\u0000*.\u0003\r\u0006\u0000+.\u0003\u000f"+
		"\u0007\u0000,.\u0005_\u0000\u0000-*\u0001\u0000\u0000\u0000-+\u0001\u0000"+
		"\u0000\u0000-,\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001"+
		"\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000\u0006\u0001\u0000\u0000"+
		"\u00001/\u0001\u0000\u0000\u00002;\u00050\u0000\u000037\u0007\u0001\u0000"+
		"\u000046\u0003\u000f\u0007\u000054\u0001\u0000\u0000\u000069\u0001\u0000"+
		"\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008;\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u0000:2\u0001\u0000\u0000\u0000"+
		":3\u0001\u0000\u0000\u0000;\b\u0001\u0000\u0000\u0000<?\u0003\u0011\b"+
		"\u0000=?\u0003\u0013\t\u0000><\u0001\u0000\u0000\u0000>=\u0001\u0000\u0000"+
		"\u0000?\n\u0001\u0000\u0000\u0000@A\u0005\'\u0000\u0000AB\u0005\\\u0000"+
		"\u0000BC\u0001\u0000\u0000\u0000CD\u0003\u0007\u0003\u0000DE\u0005\'\u0000"+
		"\u0000EO\u0001\u0000\u0000\u0000FG\u0005\'\u0000\u0000GH\u0005\\\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000IJ\u0007\u0002\u0000\u0000JO\u0005\'\u0000"+
		"\u0000KL\u0005\'\u0000\u0000LM\t\u0000\u0000\u0000MO\u0005\'\u0000\u0000"+
		"N@\u0001\u0000\u0000\u0000NF\u0001\u0000\u0000\u0000NK\u0001\u0000\u0000"+
		"\u0000O\f\u0001\u0000\u0000\u0000PQ\u0007\u0003\u0000\u0000Q\u000e\u0001"+
		"\u0000\u0000\u0000RS\u0007\u0004\u0000\u0000S\u0010\u0001\u0000\u0000"+
		"\u0000TV\u0003\u0007\u0003\u0000UT\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0005.\u0000\u0000XZ\u0003\u000f"+
		"\u0007\u0000YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\f\u0001\u0000\u0000\u0000"+
		"]^\u0003\u0007\u0003\u0000^b\u0005.\u0000\u0000_a\u0003\u000f\u0007\u0000"+
		"`_\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000"+
		"\u0000\u0000eU\u0001\u0000\u0000\u0000e]\u0001\u0000\u0000\u0000f\u0012"+
		"\u0001\u0000\u0000\u0000gj\u0003\u0007\u0003\u0000hj\u0003\u0011\b\u0000"+
		"ig\u0001\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000km\u0007\u0005\u0000\u0000ln\u0007\u0006\u0000\u0000ml\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0003"+
		"\u0007\u0003\u0000p\u0014\u0001\u0000\u0000\u0000qu\u0005#\u0000\u0000"+
		"rt\t\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000xz\u0007\u0007\u0000\u0000yx\u0001\u0000"+
		"\u0000\u0000z\u0016\u0001\u0000\u0000\u0000{|\u0005\"\u0000\u0000|}\u0005"+
		"\"\u0000\u0000}~\u0005\"\u0000\u0000~\u0082\u0001\u0000\u0000\u0000\u007f"+
		"\u0081\t\u0000\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0005\"\u0000\u0000\u0086\u0087\u0005"+
		"\"\u0000\u0000\u0087\u0088\u0005\"\u0000\u0000\u0088\u0018\u0001\u0000"+
		"\u0000\u0000\u0013\u0000\u001c\"(-/7:>NU[beimuy\u0082\u0001\u0006\u0000"+
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