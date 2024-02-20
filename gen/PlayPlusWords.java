// Generated from C:/Users/guill/IdeaProjects/2122_SyntaxeSemantique_Students/src/main/antlr4/tmp\PlayPlusWords.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlayPlusWords extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, WS=2, AS=3, AMPERSTAND=4, AND=5, BOOLEAN=6, CHAR=7, CONST=8, 
		DIG=9, DO=10, DOWN=11, DQUOTE=12, ELSE=13, END=14, ENUM=15, FALSE=16, 
		FIGHT=17, FOR=18, FUNCTION=19, IF=20, IMPORT=21, INTEGER=22, JUMP=23, 
		LEFT=24, MAIN=25, MAP=26, NOT=27, OR=28, RECORD=29, REPEAT=30, RIGHT=31, 
		THEN=32, TO=33, TRUE=34, UP=35, UNTIL=36, VOID=37, WHILE=38, ASSIGN=39, 
		SMALEQ=40, BIGGEQ=41, DIFFERENT=42, BIGGER=43, SMALLER=44, BY=45, TIME=46, 
		PERCENT=47, MINUS=48, PLUS=49, EQUAL=50, LBRACKET=51, RBRACKET=52, LPAR=53, 
		RPAR=54, BACKSLASH=55, QUOTE=56, COLON=57, COMMA=58, DOT=59, SEMICOLON=60, 
		ID=61, ENTIER=62;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NEWLINE", "WS", "AS", "AMPERSTAND", "AND", "BOOLEAN", "CHAR", "CONST", 
			"DIG", "DO", "DOWN", "DQUOTE", "ELSE", "END", "ENUM", "FALSE", "FIGHT", 
			"FOR", "FUNCTION", "IF", "IMPORT", "INTEGER", "JUMP", "LEFT", "MAIN", 
			"MAP", "NOT", "OR", "RECORD", "REPEAT", "RIGHT", "THEN", "TO", "TRUE", 
			"UP", "UNTIL", "VOID", "WHILE", "ASSIGN", "SMALEQ", "BIGGEQ", "DIFFERENT", 
			"BIGGER", "SMALLER", "BY", "TIME", "PERCENT", "MINUS", "PLUS", "EQUAL", 
			"LBRACKET", "RBRACKET", "LPAR", "RPAR", "BACKSLASH", "QUOTE", "COLON", 
			"COMMA", "DOT", "SEMICOLON", "ID", "ENTIER", "LETTER", "CHIFFRE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'as'", "'&'", "'and'", "'boolean'", "'char'", "'const'", 
			"'dig'", "'do'", "'down'", "'\"'", "'else'", "'end'", "'enum'", "'false'", 
			"'fight'", "'for'", "'function'", "'if'", "'#import'", "'integer'", "'jump'", 
			"'left'", "'main'", "'.map'", "'not'", "'or'", "'record'", "'repeat'", 
			"'right'", "'then'", "'to'", "'true'", "'up'", "'until'", "'void'", "'while'", 
			null, "'<='", "'>='", "'<>'", "'>'", "'<'", "'/'", "'*'", "'%'", "'-'", 
			"'+'", "'='", "'['", "']'", "'('", "')'", "'\\'", "'''", "':'", "','", 
			"'.'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEWLINE", "WS", "AS", "AMPERSTAND", "AND", "BOOLEAN", "CHAR", 
			"CONST", "DIG", "DO", "DOWN", "DQUOTE", "ELSE", "END", "ENUM", "FALSE", 
			"FIGHT", "FOR", "FUNCTION", "IF", "IMPORT", "INTEGER", "JUMP", "LEFT", 
			"MAIN", "MAP", "NOT", "OR", "RECORD", "REPEAT", "RIGHT", "THEN", "TO", 
			"TRUE", "UP", "UNTIL", "VOID", "WHILE", "ASSIGN", "SMALEQ", "BIGGEQ", 
			"DIFFERENT", "BIGGER", "SMALLER", "BY", "TIME", "PERCENT", "MINUS", "PLUS", 
			"EQUAL", "LBRACKET", "RBRACKET", "LPAR", "RPAR", "BACKSLASH", "QUOTE", 
			"COLON", "COMMA", "DOT", "SEMICOLON", "ID", "ENTIER"
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


	public PlayPlusWords(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PlayPlusWords.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2@\u0189\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\5\2\u0085\n\2\3\2\3\2\3\2\3\2\3\3\6\3\u008c"+
		"\n\3\r\3\16\3\u008d\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3"+
		")\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3"+
		":\3;\3;\3<\3<\3=\3=\3>\3>\3>\7>\u0179\n>\f>\16>\u017c\13>\3?\5?\u017f"+
		"\n?\3?\6?\u0182\n?\r?\16?\u0183\3@\3@\3A\3A\2\2B\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177\2"+
		"\u0081\2\3\2\4\4\2\13\13\"\"\4\2C\\c|\2\u018c\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\3\u0084"+
		"\3\2\2\2\5\u008b\3\2\2\2\7\u0091\3\2\2\2\t\u0094\3\2\2\2\13\u0096\3\2"+
		"\2\2\r\u009a\3\2\2\2\17\u00a2\3\2\2\2\21\u00a7\3\2\2\2\23\u00ad\3\2\2"+
		"\2\25\u00b1\3\2\2\2\27\u00b4\3\2\2\2\31\u00b9\3\2\2\2\33\u00bb\3\2\2\2"+
		"\35\u00c0\3\2\2\2\37\u00c4\3\2\2\2!\u00c9\3\2\2\2#\u00cf\3\2\2\2%\u00d5"+
		"\3\2\2\2\'\u00d9\3\2\2\2)\u00e2\3\2\2\2+\u00e5\3\2\2\2-\u00ed\3\2\2\2"+
		"/\u00f5\3\2\2\2\61\u00fa\3\2\2\2\63\u00ff\3\2\2\2\65\u0104\3\2\2\2\67"+
		"\u0109\3\2\2\29\u010d\3\2\2\2;\u0110\3\2\2\2=\u0117\3\2\2\2?\u011e\3\2"+
		"\2\2A\u0124\3\2\2\2C\u0129\3\2\2\2E\u012c\3\2\2\2G\u0131\3\2\2\2I\u0134"+
		"\3\2\2\2K\u013a\3\2\2\2M\u013f\3\2\2\2O\u0145\3\2\2\2Q\u0148\3\2\2\2S"+
		"\u014b\3\2\2\2U\u014e\3\2\2\2W\u0151\3\2\2\2Y\u0153\3\2\2\2[\u0155\3\2"+
		"\2\2]\u0157\3\2\2\2_\u0159\3\2\2\2a\u015b\3\2\2\2c\u015d\3\2\2\2e\u015f"+
		"\3\2\2\2g\u0161\3\2\2\2i\u0163\3\2\2\2k\u0165\3\2\2\2m\u0167\3\2\2\2o"+
		"\u0169\3\2\2\2q\u016b\3\2\2\2s\u016d\3\2\2\2u\u016f\3\2\2\2w\u0171\3\2"+
		"\2\2y\u0173\3\2\2\2{\u0175\3\2\2\2}\u017e\3\2\2\2\177\u0185\3\2\2\2\u0081"+
		"\u0187\3\2\2\2\u0083\u0085\7\17\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\f\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\b\2\2\2\u0089\4\3\2\2\2\u008a\u008c\t\2\2\2\u008b\u008a\3\2\2\2"+
		"\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u0090\b\3\2\2\u0090\6\3\2\2\2\u0091\u0092\7c\2\2\u0092"+
		"\u0093\7u\2\2\u0093\b\3\2\2\2\u0094\u0095\7(\2\2\u0095\n\3\2\2\2\u0096"+
		"\u0097\7c\2\2\u0097\u0098\7p\2\2\u0098\u0099\7f\2\2\u0099\f\3\2\2\2\u009a"+
		"\u009b\7d\2\2\u009b\u009c\7q\2\2\u009c\u009d\7q\2\2\u009d\u009e\7n\2\2"+
		"\u009e\u009f\7g\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7p\2\2\u00a1\16\3\2"+
		"\2\2\u00a2\u00a3\7e\2\2\u00a3\u00a4\7j\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6"+
		"\7t\2\2\u00a6\20\3\2\2\2\u00a7\u00a8\7e\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa"+
		"\7p\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac\7v\2\2\u00ac\22\3\2\2\2\u00ad\u00ae"+
		"\7f\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7i\2\2\u00b0\24\3\2\2\2\u00b1\u00b2"+
		"\7f\2\2\u00b2\u00b3\7q\2\2\u00b3\26\3\2\2\2\u00b4\u00b5\7f\2\2\u00b5\u00b6"+
		"\7q\2\2\u00b6\u00b7\7y\2\2\u00b7\u00b8\7p\2\2\u00b8\30\3\2\2\2\u00b9\u00ba"+
		"\7$\2\2\u00ba\32\3\2\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be"+
		"\7u\2\2\u00be\u00bf\7g\2\2\u00bf\34\3\2\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2"+
		"\7p\2\2\u00c2\u00c3\7f\2\2\u00c3\36\3\2\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6"+
		"\7p\2\2\u00c6\u00c7\7w\2\2\u00c7\u00c8\7o\2\2\u00c8 \3\2\2\2\u00c9\u00ca"+
		"\7h\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7u\2\2\u00cd"+
		"\u00ce\7g\2\2\u00ce\"\3\2\2\2\u00cf\u00d0\7h\2\2\u00d0\u00d1\7k\2\2\u00d1"+
		"\u00d2\7i\2\2\u00d2\u00d3\7j\2\2\u00d3\u00d4\7v\2\2\u00d4$\3\2\2\2\u00d5"+
		"\u00d6\7h\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7t\2\2\u00d8&\3\2\2\2\u00d9"+
		"\u00da\7h\2\2\u00da\u00db\7w\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7e\2\2"+
		"\u00dd\u00de\7v\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1"+
		"\7p\2\2\u00e1(\3\2\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7h\2\2\u00e4*\3"+
		"\2\2\2\u00e5\u00e6\7%\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7o\2\2\u00e8"+
		"\u00e9\7r\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7v\2\2"+
		"\u00ec,\3\2\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7v\2"+
		"\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7i\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4"+
		"\7t\2\2\u00f4.\3\2\2\2\u00f5\u00f6\7l\2\2\u00f6\u00f7\7w\2\2\u00f7\u00f8"+
		"\7o\2\2\u00f8\u00f9\7r\2\2\u00f9\60\3\2\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc"+
		"\7g\2\2\u00fc\u00fd\7h\2\2\u00fd\u00fe\7v\2\2\u00fe\62\3\2\2\2\u00ff\u0100"+
		"\7o\2\2\u0100\u0101\7c\2\2\u0101\u0102\7k\2\2\u0102\u0103\7p\2\2\u0103"+
		"\64\3\2\2\2\u0104\u0105\7\60\2\2\u0105\u0106\7o\2\2\u0106\u0107\7c\2\2"+
		"\u0107\u0108\7r\2\2\u0108\66\3\2\2\2\u0109\u010a\7p\2\2\u010a\u010b\7"+
		"q\2\2\u010b\u010c\7v\2\2\u010c8\3\2\2\2\u010d\u010e\7q\2\2\u010e\u010f"+
		"\7t\2\2\u010f:\3\2\2\2\u0110\u0111\7t\2\2\u0111\u0112\7g\2\2\u0112\u0113"+
		"\7e\2\2\u0113\u0114\7q\2\2\u0114\u0115\7t\2\2\u0115\u0116\7f\2\2\u0116"+
		"<\3\2\2\2\u0117\u0118\7t\2\2\u0118\u0119\7g\2\2\u0119\u011a\7r\2\2\u011a"+
		"\u011b\7g\2\2\u011b\u011c\7c\2\2\u011c\u011d\7v\2\2\u011d>\3\2\2\2\u011e"+
		"\u011f\7t\2\2\u011f\u0120\7k\2\2\u0120\u0121\7i\2\2\u0121\u0122\7j\2\2"+
		"\u0122\u0123\7v\2\2\u0123@\3\2\2\2\u0124\u0125\7v\2\2\u0125\u0126\7j\2"+
		"\2\u0126\u0127\7g\2\2\u0127\u0128\7p\2\2\u0128B\3\2\2\2\u0129\u012a\7"+
		"v\2\2\u012a\u012b\7q\2\2\u012bD\3\2\2\2\u012c\u012d\7v\2\2\u012d\u012e"+
		"\7t\2\2\u012e\u012f\7w\2\2\u012f\u0130\7g\2\2\u0130F\3\2\2\2\u0131\u0132"+
		"\7w\2\2\u0132\u0133\7r\2\2\u0133H\3\2\2\2\u0134\u0135\7w\2\2\u0135\u0136"+
		"\7p\2\2\u0136\u0137\7v\2\2\u0137\u0138\7k\2\2\u0138\u0139\7n\2\2\u0139"+
		"J\3\2\2\2\u013a\u013b\7x\2\2\u013b\u013c\7q\2\2\u013c\u013d\7k\2\2\u013d"+
		"\u013e\7f\2\2\u013eL\3\2\2\2\u013f\u0140\7y\2\2\u0140\u0141\7j\2\2\u0141"+
		"\u0142\7k\2\2\u0142\u0143\7n\2\2\u0143\u0144\7g\2\2\u0144N\3\2\2\2\u0145"+
		"\u0146\7<\2\2\u0146\u0147\7?\2\2\u0147P\3\2\2\2\u0148\u0149\7>\2\2\u0149"+
		"\u014a\7?\2\2\u014aR\3\2\2\2\u014b\u014c\7@\2\2\u014c\u014d\7?\2\2\u014d"+
		"T\3\2\2\2\u014e\u014f\7>\2\2\u014f\u0150\7@\2\2\u0150V\3\2\2\2\u0151\u0152"+
		"\7@\2\2\u0152X\3\2\2\2\u0153\u0154\7>\2\2\u0154Z\3\2\2\2\u0155\u0156\7"+
		"\61\2\2\u0156\\\3\2\2\2\u0157\u0158\7,\2\2\u0158^\3\2\2\2\u0159\u015a"+
		"\7\'\2\2\u015a`\3\2\2\2\u015b\u015c\7/\2\2\u015cb\3\2\2\2\u015d\u015e"+
		"\7-\2\2\u015ed\3\2\2\2\u015f\u0160\7?\2\2\u0160f\3\2\2\2\u0161\u0162\7"+
		"]\2\2\u0162h\3\2\2\2\u0163\u0164\7_\2\2\u0164j\3\2\2\2\u0165\u0166\7*"+
		"\2\2\u0166l\3\2\2\2\u0167\u0168\7+\2\2\u0168n\3\2\2\2\u0169\u016a\7^\2"+
		"\2\u016ap\3\2\2\2\u016b\u016c\7)\2\2\u016cr\3\2\2\2\u016d\u016e\7<\2\2"+
		"\u016et\3\2\2\2\u016f\u0170\7.\2\2\u0170v\3\2\2\2\u0171\u0172\7\60\2\2"+
		"\u0172x\3\2\2\2\u0173\u0174\7=\2\2\u0174z\3\2\2\2\u0175\u017a\5\177@\2"+
		"\u0176\u0179\5\177@\2\u0177\u0179\5\u0081A\2\u0178\u0176\3\2\2\2\u0178"+
		"\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2"+
		"\2\2\u017b|\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017f\5a\61\2\u017e\u017d"+
		"\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u0182\5\u0081A"+
		"\2\u0181\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184"+
		"\3\2\2\2\u0184~\3\2\2\2\u0185\u0186\t\3\2\2\u0186\u0080\3\2\2\2\u0187"+
		"\u0188\4\62;\2\u0188\u0082\3\2\2\2\t\2\u0084\u008d\u0178\u017a\u017e\u0183"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}