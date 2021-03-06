package dsl.operator;// Generated from Expr.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, MUL=3, DIV=4, ADD=5, SUB=6, POW=7, MOD=8, NUMBER=9, STRING=10, 
		ID=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "MUL", "DIV", "ADD", "SUB", "POW", "MOD", "DIGIT", "S_QUOTE", 
		"QUOTE", "ALPHABET", "NUMBER", "STRING", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'^'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "MUL", "DIV", "ADD", "SUB", "POW", "MOD", "NUMBER", 
		"STRING", "ID", "WS"
	};
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16w\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\6\16=\n\16\r\16\16\16>\3\16\3\16\6\16C\n\16\r"+
		"\16\16\16D\5\16G\n\16\3\17\3\17\7\17K\n\17\f\17\16\17N\13\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\7\17W\n\17\f\17\16\17Z\13\17\3\17\3\17\5\17"+
		"^\n\17\3\20\6\20a\n\20\r\20\16\20b\3\20\3\20\7\20g\n\20\f\20\16\20j\13"+
		"\20\7\20l\n\20\f\20\16\20o\13\20\3\21\6\21r\n\21\r\21\16\21s\3\21\3\21"+
		"\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\2\25\2\27\2\31\2\33\13\35"+
		"\f\37\r!\16\3\2\7\3\2\62;\5\2C\\aac|\3\2))\3\2$$\7\2\"\"\61\61ppttvv\2"+
		"}\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2"+
		"\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7\'\3\2\2\2\t)\3\2\2\2\13+\3\2\2\2\r"+
		"-\3\2\2\2\17/\3\2\2\2\21\61\3\2\2\2\23\63\3\2\2\2\25\65\3\2\2\2\27\67"+
		"\3\2\2\2\319\3\2\2\2\33<\3\2\2\2\35]\3\2\2\2\37`\3\2\2\2!q\3\2\2\2#$\7"+
		"*\2\2$\4\3\2\2\2%&\7+\2\2&\6\3\2\2\2\'(\7,\2\2(\b\3\2\2\2)*\7\61\2\2*"+
		"\n\3\2\2\2+,\7-\2\2,\f\3\2\2\2-.\7/\2\2.\16\3\2\2\2/\60\7`\2\2\60\20\3"+
		"\2\2\2\61\62\7\'\2\2\62\22\3\2\2\2\63\64\t\2\2\2\64\24\3\2\2\2\65\66\7"+
		")\2\2\66\26\3\2\2\2\678\7$\2\28\30\3\2\2\29:\t\3\2\2:\32\3\2\2\2;=\5\23"+
		"\n\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?F\3\2\2\2@B\7\60\2\2AC\5"+
		"\23\n\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2F@\3\2\2\2FG"+
		"\3\2\2\2G\34\3\2\2\2HL\5\25\13\2IK\n\4\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2"+
		"\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\5\25\13\2P^\3\2\2\2QX\5\27\f\2RS\7"+
		"\61\2\2ST\7\61\2\2TW\7$\2\2UW\n\5\2\2VR\3\2\2\2VU\3\2\2\2WZ\3\2\2\2XV"+
		"\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\5\27\f\2\\^\3\2\2\2]H\3\2\2"+
		"\2]Q\3\2\2\2^\36\3\2\2\2_a\5\31\r\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3"+
		"\2\2\2cm\3\2\2\2dh\5\23\n\2eg\5\31\r\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2h"+
		"i\3\2\2\2il\3\2\2\2jh\3\2\2\2kd\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2"+
		"n \3\2\2\2om\3\2\2\2pr\t\6\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2"+
		"tu\3\2\2\2uv\b\21\2\2v\"\3\2\2\2\16\2>DFLVX]bhms\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}