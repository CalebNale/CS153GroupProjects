// Generated from subC.g4 by ANTLR 4.8

    package antlr4;
    import java.util.HashMap;
    import intermediate.symtab.SymtabEntry;
    import intermediate.type.Typespec;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class subCLexer extends Lexer {
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
		VOID=41, BREAK=42, IDENTIFIER=43, INTEGER=44, REAL=45, NEWLINE=46, WS=47, 
		QUOTE=48, CHARACTER=49, STR=50, SEMICOLON=51, COMMENT=52;
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
			"IDENTIFIER", "INTEGER", "REAL", "NEWLINE", "WS", "QUOTE", "CHARACTER", 
			"STR", "SEMICOLON", "CHARACTER_CHAR", "STRING_CHAR", "COMMENT"
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
			null, null, null, null, null, "'''", null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "MOD", 
			"AND", "OR", "NOT", "IF", "ELSE", "SWITCH", "WHILE", "FOR", "CASE", "PRINT", 
			"FUNCTION", "INT", "STRING", "CHAR", "MAIN", "RETURN", "DOUBLE", "VOID", 
			"BREAK", "IDENTIFIER", "INTEGER", "REAL", "NEWLINE", "WS", "QUOTE", "CHARACTER", 
			"STR", "SEMICOLON", "COMMENT"
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


	public subCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "subC.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u015a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&"+
		"\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3"+
		")\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\7,\u010f\n,\f,\16,\u0112\13"+
		",\3-\6-\u0115\n-\r-\16-\u0116\3.\3.\3.\3.\3.\3.\3.\5.\u0120\n.\3.\3.\3"+
		".\3.\3.\3.\3.\5.\u0129\n.\3.\3.\5.\u012d\n.\3/\5/\u0130\n/\3/\3/\3/\3"+
		"/\3\60\6\60\u0137\n\60\r\60\16\60\u0138\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\7\63\u0145\n\63\f\63\16\63\u0148\13\63\3\63\3\63"+
		"\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\2\28\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\2k\2m\66\3\2\n\4\2C\\c|\5\2\62;C\\c|\3\2\62;\4\2GGgg\4\2--//\4\2\13"+
		"\13\"\"\3\2))\3\2$$\2\u0160\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2m"+
		"\3\2\2\2\3o\3\2\2\2\5q\3\2\2\2\7s\3\2\2\2\tu\3\2\2\2\13w\3\2\2\2\ry\3"+
		"\2\2\2\17{\3\2\2\2\21~\3\2\2\2\23\u0081\3\2\2\2\25\u0083\3\2\2\2\27\u008b"+
		"\3\2\2\2\31\u008d\3\2\2\2\33\u008f\3\2\2\2\35\u0091\3\2\2\2\37\u0093\3"+
		"\2\2\2!\u0096\3\2\2\2#\u0099\3\2\2\2%\u009b\3\2\2\2\'\u009e\3\2\2\2)\u00a0"+
		"\3\2\2\2+\u00a3\3\2\2\2-\u00a5\3\2\2\2/\u00a7\3\2\2\2\61\u00a9\3\2\2\2"+
		"\63\u00ac\3\2\2\2\65\u00af\3\2\2\2\67\u00b1\3\2\2\29\u00b4\3\2\2\2;\u00b9"+
		"\3\2\2\2=\u00c0\3\2\2\2?\u00c6\3\2\2\2A\u00ca\3\2\2\2C\u00cf\3\2\2\2E"+
		"\u00d5\3\2\2\2G\u00de\3\2\2\2I\u00e2\3\2\2\2K\u00e9\3\2\2\2M\u00ee\3\2"+
		"\2\2O\u00f3\3\2\2\2Q\u00fa\3\2\2\2S\u0101\3\2\2\2U\u0106\3\2\2\2W\u010c"+
		"\3\2\2\2Y\u0114\3\2\2\2[\u012c\3\2\2\2]\u012f\3\2\2\2_\u0136\3\2\2\2a"+
		"\u013c\3\2\2\2c\u013e\3\2\2\2e\u0142\3\2\2\2g\u014b\3\2\2\2i\u014d\3\2"+
		"\2\2k\u014f\3\2\2\2m\u0151\3\2\2\2op\7*\2\2p\4\3\2\2\2qr\7+\2\2r\6\3\2"+
		"\2\2st\7.\2\2t\b\3\2\2\2uv\7}\2\2v\n\3\2\2\2wx\7\177\2\2x\f\3\2\2\2yz"+
		"\7?\2\2z\16\3\2\2\2{|\7-\2\2|}\7-\2\2}\20\3\2\2\2~\177\7/\2\2\177\u0080"+
		"\7/\2\2\u0080\22\3\2\2\2\u0081\u0082\7<\2\2\u0082\24\3\2\2\2\u0083\u0084"+
		"\7f\2\2\u0084\u0085\7g\2\2\u0085\u0086\7h\2\2\u0086\u0087\7c\2\2\u0087"+
		"\u0088\7w\2\2\u0088\u0089\7n\2\2\u0089\u008a\7v\2\2\u008a\26\3\2\2\2\u008b"+
		"\u008c\7]\2\2\u008c\30\3\2\2\2\u008d\u008e\7_\2\2\u008e\32\3\2\2\2\u008f"+
		"\u0090\7/\2\2\u0090\34\3\2\2\2\u0091\u0092\7-\2\2\u0092\36\3\2\2\2\u0093"+
		"\u0094\7?\2\2\u0094\u0095\7?\2\2\u0095 \3\2\2\2\u0096\u0097\7#\2\2\u0097"+
		"\u0098\7?\2\2\u0098\"\3\2\2\2\u0099\u009a\7>\2\2\u009a$\3\2\2\2\u009b"+
		"\u009c\7>\2\2\u009c\u009d\7?\2\2\u009d&\3\2\2\2\u009e\u009f\7@\2\2\u009f"+
		"(\3\2\2\2\u00a0\u00a1\7@\2\2\u00a1\u00a2\7?\2\2\u00a2*\3\2\2\2\u00a3\u00a4"+
		"\7,\2\2\u00a4,\3\2\2\2\u00a5\u00a6\7\61\2\2\u00a6.\3\2\2\2\u00a7\u00a8"+
		"\7\'\2\2\u00a8\60\3\2\2\2\u00a9\u00aa\7(\2\2\u00aa\u00ab\7(\2\2\u00ab"+
		"\62\3\2\2\2\u00ac\u00ad\7~\2\2\u00ad\u00ae\7~\2\2\u00ae\64\3\2\2\2\u00af"+
		"\u00b0\7#\2\2\u00b0\66\3\2\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7h\2\2\u00b3"+
		"8\3\2\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7u\2\2\u00b7"+
		"\u00b8\7g\2\2\u00b8:\3\2\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7y\2\2\u00bb"+
		"\u00bc\7k\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7e\2\2\u00be\u00bf\7j\2\2"+
		"\u00bf<\3\2\2\2\u00c0\u00c1\7y\2\2\u00c1\u00c2\7j\2\2\u00c2\u00c3\7k\2"+
		"\2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7g\2\2\u00c5>\3\2\2\2\u00c6\u00c7\7"+
		"h\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7t\2\2\u00c9@\3\2\2\2\u00ca\u00cb"+
		"\7e\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7g\2\2\u00ce"+
		"B\3\2\2\2\u00cf\u00d0\7r\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7k\2\2\u00d2"+
		"\u00d3\7p\2\2\u00d3\u00d4\7v\2\2\u00d4D\3\2\2\2\u00d5\u00d6\7h\2\2\u00d6"+
		"\u00d7\7w\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7e\2\2\u00d9\u00da\7v\2\2"+
		"\u00da\u00db\7k\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7p\2\2\u00ddF\3\2\2"+
		"\2\u00de\u00df\7k\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7v\2\2\u00e1H\3\2"+
		"\2\2\u00e2\u00e3\7u\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6"+
		"\7k\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7i\2\2\u00e8J\3\2\2\2\u00e9\u00ea"+
		"\7e\2\2\u00ea\u00eb\7j\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7t\2\2\u00ed"+
		"L\3\2\2\2\u00ee\u00ef\7o\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7k\2\2\u00f1"+
		"\u00f2\7p\2\2\u00f2N\3\2\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7g\2\2\u00f5"+
		"\u00f6\7v\2\2\u00f6\u00f7\7w\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7p\2\2"+
		"\u00f9P\3\2\2\2\u00fa\u00fb\7f\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7w\2"+
		"\2\u00fd\u00fe\7d\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100\7g\2\2\u0100R\3\2"+
		"\2\2\u0101\u0102\7x\2\2\u0102\u0103\7q\2\2\u0103\u0104\7k\2\2\u0104\u0105"+
		"\7f\2\2\u0105T\3\2\2\2\u0106\u0107\7d\2\2\u0107\u0108\7t\2\2\u0108\u0109"+
		"\7g\2\2\u0109\u010a\7c\2\2\u010a\u010b\7m\2\2\u010bV\3\2\2\2\u010c\u0110"+
		"\t\2\2\2\u010d\u010f\t\3\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111X\3\2\2\2\u0112\u0110\3\2\2\2"+
		"\u0113\u0115\t\4\2\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117Z\3\2\2\2\u0118\u0119\5Y-\2\u0119\u011a"+
		"\7\60\2\2\u011a\u011b\5Y-\2\u011b\u012d\3\2\2\2\u011c\u011d\5Y-\2\u011d"+
		"\u011f\t\5\2\2\u011e\u0120\t\6\2\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\u0121\3\2\2\2\u0121\u0122\5Y-\2\u0122\u012d\3\2\2\2\u0123\u0124"+
		"\5Y-\2\u0124\u0125\7\60\2\2\u0125\u0126\5Y-\2\u0126\u0128\t\5\2\2\u0127"+
		"\u0129\t\6\2\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a\u012b\5Y-\2\u012b\u012d\3\2\2\2\u012c\u0118\3\2\2\2\u012c\u011c"+
		"\3\2\2\2\u012c\u0123\3\2\2\2\u012d\\\3\2\2\2\u012e\u0130\7\17\2\2\u012f"+
		"\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\7\f"+
		"\2\2\u0132\u0133\3\2\2\2\u0133\u0134\b/\2\2\u0134^\3\2\2\2\u0135\u0137"+
		"\t\7\2\2\u0136\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\b\60\2\2\u013b`\3\2\2\2"+
		"\u013c\u013d\7)\2\2\u013db\3\2\2\2\u013e\u013f\5a\61\2\u013f\u0140\5i"+
		"\65\2\u0140\u0141\5a\61\2\u0141d\3\2\2\2\u0142\u0146\7$\2\2\u0143\u0145"+
		"\5k\66\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014a\7$"+
		"\2\2\u014af\3\2\2\2\u014b\u014c\7=\2\2\u014ch\3\2\2\2\u014d\u014e\n\b"+
		"\2\2\u014ej\3\2\2\2\u014f\u0150\n\t\2\2\u0150l\3\2\2\2\u0151\u0152\7\61"+
		"\2\2\u0152\u0153\7,\2\2\u0153\u0154\3\2\2\2\u0154\u0155\5k\66\2\u0155"+
		"\u0156\7,\2\2\u0156\u0157\7\61\2\2\u0157\u0158\3\2\2\2\u0158\u0159\b\67"+
		"\2\2\u0159n\3\2\2\2\13\2\u0110\u0116\u011f\u0128\u012c\u012f\u0138\u0146"+
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