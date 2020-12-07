// Generated from C:/Users/Neil Majumdar/Downloads/Final\project.g4 by ANTLR 4.8

    package antlr4;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class projectLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, MOD=23, AND=24, OR=25, 
		NOT=26, IF=27, ELSE=28, SWITCH=29, WHILE=30, FOR=31, CASE=32, PRINT=33, 
		FUNCTION=34, INT=35, STRING=36, CHAR=37, MAIN=38, RETURN=39, DOUBLE=40, 
		VOID=41, BREAK=42, PROGRAM=43, IDENTIFIER=44, INTEGER=45, REAL=46, NEWLINE=47, 
		WS=48, QUOTE=49, CHARACTER=50, STR=51, SEMICOLON=52, COMMENT=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "MOD", "AND", "OR", "NOT", 
			"IF", "ELSE", "SWITCH", "WHILE", "FOR", "CASE", "PRINT", "FUNCTION", 
			"INT", "STRING", "CHAR", "MAIN", "RETURN", "DOUBLE", "VOID", "BREAK", 
			"PROGRAM", "IDENTIFIER", "INTEGER", "REAL", "NEWLINE", "WS", "QUOTE", 
			"CHARACTER", "STR", "SEMICOLON", "CHARACTER_CHAR", "STRING_CHAR", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'{'", "'}'", "'='", "'++'", "'--'", "':'", 
			"'default'", "'['", "']'", "'-'", "'+'", "'=='", "'!='", "'<'", "'<='", 
			"'>'", "'>='", "'*'", "'/'", "'%'", "'&&'", "'||'", "'!'", "'if'", "'else'", 
			"'switch'", "'while'", "'for'", "'case'", "'print'", "'function'", "'int'", 
			"'string'", "'char'", "'main'", "'return'", "'double'", "'void'", "'break'", 
			"'Program'", null, null, null, null, null, "'''", null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "MOD", 
			"AND", "OR", "NOT", "IF", "ELSE", "SWITCH", "WHILE", "FOR", "CASE", "PRINT", 
			"FUNCTION", "INT", "STRING", "CHAR", "MAIN", "RETURN", "DOUBLE", "VOID", 
			"BREAK", "PROGRAM", "IDENTIFIER", "INTEGER", "REAL", "NEWLINE", "WS", 
			"QUOTE", "CHARACTER", "STR", "SEMICOLON", "COMMENT"
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


	public projectLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "project.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u0164\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3"+
		"%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)"+
		"\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3-\3-\7-\u0119\n-\f-\16-\u011c\13-\3.\6.\u011f\n.\r.\16.\u0120\3/"+
		"\3/\3/\3/\3/\3/\3/\5/\u012a\n/\3/\3/\3/\3/\3/\3/\3/\5/\u0133\n/\3/\3/"+
		"\5/\u0137\n/\3\60\5\60\u013a\n\60\3\60\3\60\3\60\3\60\3\61\6\61\u0141"+
		"\n\61\r\61\16\61\u0142\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3"+
		"\64\7\64\u014f\n\64\f\64\16\64\u0152\13\64\3\64\3\64\3\65\3\65\3\66\3"+
		"\66\3\67\3\67\38\38\38\38\38\38\38\38\38\2\29\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\2m\2o\67\3\2\n\4\2C\\c|\5\2\62"+
		";C\\c|\3\2\62;\4\2GGgg\4\2--//\4\2\13\13\"\"\3\2))\3\2$$\2\u016a\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\5s"+
		"\3\2\2\2\7u\3\2\2\2\tw\3\2\2\2\13y\3\2\2\2\r{\3\2\2\2\17}\3\2\2\2\21\u0080"+
		"\3\2\2\2\23\u0083\3\2\2\2\25\u0085\3\2\2\2\27\u008d\3\2\2\2\31\u008f\3"+
		"\2\2\2\33\u0091\3\2\2\2\35\u0093\3\2\2\2\37\u0095\3\2\2\2!\u0098\3\2\2"+
		"\2#\u009b\3\2\2\2%\u009d\3\2\2\2\'\u00a0\3\2\2\2)\u00a2\3\2\2\2+\u00a5"+
		"\3\2\2\2-\u00a7\3\2\2\2/\u00a9\3\2\2\2\61\u00ab\3\2\2\2\63\u00ae\3\2\2"+
		"\2\65\u00b1\3\2\2\2\67\u00b3\3\2\2\29\u00b6\3\2\2\2;\u00bb\3\2\2\2=\u00c2"+
		"\3\2\2\2?\u00c8\3\2\2\2A\u00cc\3\2\2\2C\u00d1\3\2\2\2E\u00d7\3\2\2\2G"+
		"\u00e0\3\2\2\2I\u00e4\3\2\2\2K\u00eb\3\2\2\2M\u00f0\3\2\2\2O\u00f5\3\2"+
		"\2\2Q\u00fc\3\2\2\2S\u0103\3\2\2\2U\u0108\3\2\2\2W\u010e\3\2\2\2Y\u0116"+
		"\3\2\2\2[\u011e\3\2\2\2]\u0136\3\2\2\2_\u0139\3\2\2\2a\u0140\3\2\2\2c"+
		"\u0146\3\2\2\2e\u0148\3\2\2\2g\u014c\3\2\2\2i\u0155\3\2\2\2k\u0157\3\2"+
		"\2\2m\u0159\3\2\2\2o\u015b\3\2\2\2qr\7*\2\2r\4\3\2\2\2st\7+\2\2t\6\3\2"+
		"\2\2uv\7.\2\2v\b\3\2\2\2wx\7}\2\2x\n\3\2\2\2yz\7\177\2\2z\f\3\2\2\2{|"+
		"\7?\2\2|\16\3\2\2\2}~\7-\2\2~\177\7-\2\2\177\20\3\2\2\2\u0080\u0081\7"+
		"/\2\2\u0081\u0082\7/\2\2\u0082\22\3\2\2\2\u0083\u0084\7<\2\2\u0084\24"+
		"\3\2\2\2\u0085\u0086\7f\2\2\u0086\u0087\7g\2\2\u0087\u0088\7h\2\2\u0088"+
		"\u0089\7c\2\2\u0089\u008a\7w\2\2\u008a\u008b\7n\2\2\u008b\u008c\7v\2\2"+
		"\u008c\26\3\2\2\2\u008d\u008e\7]\2\2\u008e\30\3\2\2\2\u008f\u0090\7_\2"+
		"\2\u0090\32\3\2\2\2\u0091\u0092\7/\2\2\u0092\34\3\2\2\2\u0093\u0094\7"+
		"-\2\2\u0094\36\3\2\2\2\u0095\u0096\7?\2\2\u0096\u0097\7?\2\2\u0097 \3"+
		"\2\2\2\u0098\u0099\7#\2\2\u0099\u009a\7?\2\2\u009a\"\3\2\2\2\u009b\u009c"+
		"\7>\2\2\u009c$\3\2\2\2\u009d\u009e\7>\2\2\u009e\u009f\7?\2\2\u009f&\3"+
		"\2\2\2\u00a0\u00a1\7@\2\2\u00a1(\3\2\2\2\u00a2\u00a3\7@\2\2\u00a3\u00a4"+
		"\7?\2\2\u00a4*\3\2\2\2\u00a5\u00a6\7,\2\2\u00a6,\3\2\2\2\u00a7\u00a8\7"+
		"\61\2\2\u00a8.\3\2\2\2\u00a9\u00aa\7\'\2\2\u00aa\60\3\2\2\2\u00ab\u00ac"+
		"\7(\2\2\u00ac\u00ad\7(\2\2\u00ad\62\3\2\2\2\u00ae\u00af\7~\2\2\u00af\u00b0"+
		"\7~\2\2\u00b0\64\3\2\2\2\u00b1\u00b2\7#\2\2\u00b2\66\3\2\2\2\u00b3\u00b4"+
		"\7k\2\2\u00b4\u00b5\7h\2\2\u00b58\3\2\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8"+
		"\7n\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba\7g\2\2\u00ba:\3\2\2\2\u00bb\u00bc"+
		"\7u\2\2\u00bc\u00bd\7y\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7v\2\2\u00bf"+
		"\u00c0\7e\2\2\u00c0\u00c1\7j\2\2\u00c1<\3\2\2\2\u00c2\u00c3\7y\2\2\u00c3"+
		"\u00c4\7j\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7g\2\2"+
		"\u00c7>\3\2\2\2\u00c8\u00c9\7h\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7t\2"+
		"\2\u00cb@\3\2\2\2\u00cc\u00cd\7e\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7"+
		"u\2\2\u00cf\u00d0\7g\2\2\u00d0B\3\2\2\2\u00d1\u00d2\7r\2\2\u00d2\u00d3"+
		"\7t\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7v\2\2\u00d6"+
		"D\3\2\2\2\u00d7\u00d8\7h\2\2\u00d8\u00d9\7w\2\2\u00d9\u00da\7p\2\2\u00da"+
		"\u00db\7e\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7q\2\2"+
		"\u00de\u00df\7p\2\2\u00dfF\3\2\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7p\2"+
		"\2\u00e2\u00e3\7v\2\2\u00e3H\3\2\2\2\u00e4\u00e5\7u\2\2\u00e5\u00e6\7"+
		"v\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea"+
		"\7i\2\2\u00eaJ\3\2\2\2\u00eb\u00ec\7e\2\2\u00ec\u00ed\7j\2\2\u00ed\u00ee"+
		"\7c\2\2\u00ee\u00ef\7t\2\2\u00efL\3\2\2\2\u00f0\u00f1\7o\2\2\u00f1\u00f2"+
		"\7c\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7p\2\2\u00f4N\3\2\2\2\u00f5\u00f6"+
		"\7t\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7w\2\2\u00f9"+
		"\u00fa\7t\2\2\u00fa\u00fb\7p\2\2\u00fbP\3\2\2\2\u00fc\u00fd\7f\2\2\u00fd"+
		"\u00fe\7q\2\2\u00fe\u00ff\7w\2\2\u00ff\u0100\7d\2\2\u0100\u0101\7n\2\2"+
		"\u0101\u0102\7g\2\2\u0102R\3\2\2\2\u0103\u0104\7x\2\2\u0104\u0105\7q\2"+
		"\2\u0105\u0106\7k\2\2\u0106\u0107\7f\2\2\u0107T\3\2\2\2\u0108\u0109\7"+
		"d\2\2\u0109\u010a\7t\2\2\u010a\u010b\7g\2\2\u010b\u010c\7c\2\2\u010c\u010d"+
		"\7m\2\2\u010dV\3\2\2\2\u010e\u010f\7R\2\2\u010f\u0110\7t\2\2\u0110\u0111"+
		"\7q\2\2\u0111\u0112\7i\2\2\u0112\u0113\7t\2\2\u0113\u0114\7c\2\2\u0114"+
		"\u0115\7o\2\2\u0115X\3\2\2\2\u0116\u011a\t\2\2\2\u0117\u0119\t\3\2\2\u0118"+
		"\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011bZ\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011f\t\4\2\2\u011e\u011d"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\\\3\2\2\2\u0122\u0123\5[.\2\u0123\u0124\7\60\2\2\u0124\u0125\5[.\2\u0125"+
		"\u0137\3\2\2\2\u0126\u0127\5[.\2\u0127\u0129\t\5\2\2\u0128\u012a\t\6\2"+
		"\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c"+
		"\5[.\2\u012c\u0137\3\2\2\2\u012d\u012e\5[.\2\u012e\u012f\7\60\2\2\u012f"+
		"\u0130\5[.\2\u0130\u0132\t\5\2\2\u0131\u0133\t\6\2\2\u0132\u0131\3\2\2"+
		"\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\5[.\2\u0135\u0137"+
		"\3\2\2\2\u0136\u0122\3\2\2\2\u0136\u0126\3\2\2\2\u0136\u012d\3\2\2\2\u0137"+
		"^\3\2\2\2\u0138\u013a\7\17\2\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2"+
		"\u013a\u013b\3\2\2\2\u013b\u013c\7\f\2\2\u013c\u013d\3\2\2\2\u013d\u013e"+
		"\b\60\2\2\u013e`\3\2\2\2\u013f\u0141\t\7\2\2\u0140\u013f\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144\u0145\b\61\2\2\u0145b\3\2\2\2\u0146\u0147\7)\2\2\u0147d\3\2"+
		"\2\2\u0148\u0149\5c\62\2\u0149\u014a\5k\66\2\u014a\u014b\5c\62\2\u014b"+
		"f\3\2\2\2\u014c\u0150\7$\2\2\u014d\u014f\5m\67\2\u014e\u014d\3\2\2\2\u014f"+
		"\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0153\u0154\7$\2\2\u0154h\3\2\2\2\u0155\u0156"+
		"\7=\2\2\u0156j\3\2\2\2\u0157\u0158\n\b\2\2\u0158l\3\2\2\2\u0159\u015a"+
		"\n\t\2\2\u015an\3\2\2\2\u015b\u015c\7\61\2\2\u015c\u015d\7,\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u015f\5m\67\2\u015f\u0160\7,\2\2\u0160\u0161\7\61"+
		"\2\2\u0161\u0162\3\2\2\2\u0162\u0163\b8\2\2\u0163p\3\2\2\2\13\2\u011a"+
		"\u0120\u0129\u0132\u0136\u0139\u0142\u0150\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}