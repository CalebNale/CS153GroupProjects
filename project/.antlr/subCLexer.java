// Generated from /Users/rahulg510/Documents/code/cs153/CS153GroupProjects/project/SubC.g4 by ANTLR 4.8

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
public class SubCLexer extends Lexer {
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
			"STR", "SEMICOLON", "CHARACTER_CHAR", "STRING_CHAR", "COMMENT", "COMMENT_CHARACTER"
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


	public SubCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SubC.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u0163\b\1\4\2"+
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
		"\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\7,\u0111\n,\f,"+
		"\16,\u0114\13,\3-\6-\u0117\n-\r-\16-\u0118\3.\3.\3.\3.\3.\3.\3.\5.\u0122"+
		"\n.\3.\3.\3.\3.\3.\3.\3.\5.\u012b\n.\3.\3.\5.\u012f\n.\3/\5/\u0132\n/"+
		"\3/\3/\3/\3/\3\60\6\60\u0139\n\60\r\60\16\60\u013a\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\7\63\u0147\n\63\f\63\16\63\u014a\13\63"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\7\67\u0158"+
		"\n\67\f\67\16\67\u015b\13\67\3\67\3\67\3\67\3\67\3\67\38\38\2\29\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\2k\2m\66o\2\3"+
		"\2\13\4\2C\\c|\5\2\62;C\\c|\3\2\62;\4\2GGgg\4\2--//\4\2\13\13\"\"\3\2"+
		"))\3\2$$\3\2,,\2\u0169\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2m\3\2\2"+
		"\2\3q\3\2\2\2\5s\3\2\2\2\7u\3\2\2\2\tw\3\2\2\2\13y\3\2\2\2\r{\3\2\2\2"+
		"\17}\3\2\2\2\21\u0080\3\2\2\2\23\u0083\3\2\2\2\25\u0085\3\2\2\2\27\u008d"+
		"\3\2\2\2\31\u008f\3\2\2\2\33\u0091\3\2\2\2\35\u0093\3\2\2\2\37\u0095\3"+
		"\2\2\2!\u0098\3\2\2\2#\u009b\3\2\2\2%\u009d\3\2\2\2\'\u00a0\3\2\2\2)\u00a2"+
		"\3\2\2\2+\u00a5\3\2\2\2-\u00a7\3\2\2\2/\u00a9\3\2\2\2\61\u00ab\3\2\2\2"+
		"\63\u00ae\3\2\2\2\65\u00b1\3\2\2\2\67\u00b3\3\2\2\29\u00b6\3\2\2\2;\u00bb"+
		"\3\2\2\2=\u00c2\3\2\2\2?\u00c8\3\2\2\2A\u00cc\3\2\2\2C\u00d1\3\2\2\2E"+
		"\u00d7\3\2\2\2G\u00e0\3\2\2\2I\u00e4\3\2\2\2K\u00eb\3\2\2\2M\u00f0\3\2"+
		"\2\2O\u00f5\3\2\2\2Q\u00fc\3\2\2\2S\u0103\3\2\2\2U\u0108\3\2\2\2W\u010e"+
		"\3\2\2\2Y\u0116\3\2\2\2[\u012e\3\2\2\2]\u0131\3\2\2\2_\u0138\3\2\2\2a"+
		"\u013e\3\2\2\2c\u0140\3\2\2\2e\u0144\3\2\2\2g\u014d\3\2\2\2i\u014f\3\2"+
		"\2\2k\u0151\3\2\2\2m\u0153\3\2\2\2o\u0161\3\2\2\2qr\7*\2\2r\4\3\2\2\2"+
		"st\7+\2\2t\6\3\2\2\2uv\7.\2\2v\b\3\2\2\2wx\7}\2\2x\n\3\2\2\2yz\7\177\2"+
		"\2z\f\3\2\2\2{|\7?\2\2|\16\3\2\2\2}~\7-\2\2~\177\7-\2\2\177\20\3\2\2\2"+
		"\u0080\u0081\7/\2\2\u0081\u0082\7/\2\2\u0082\22\3\2\2\2\u0083\u0084\7"+
		"<\2\2\u0084\24\3\2\2\2\u0085\u0086\7f\2\2\u0086\u0087\7g\2\2\u0087\u0088"+
		"\7h\2\2\u0088\u0089\7c\2\2\u0089\u008a\7w\2\2\u008a\u008b\7n\2\2\u008b"+
		"\u008c\7v\2\2\u008c\26\3\2\2\2\u008d\u008e\7]\2\2\u008e\30\3\2\2\2\u008f"+
		"\u0090\7_\2\2\u0090\32\3\2\2\2\u0091\u0092\7/\2\2\u0092\34\3\2\2\2\u0093"+
		"\u0094\7-\2\2\u0094\36\3\2\2\2\u0095\u0096\7?\2\2\u0096\u0097\7?\2\2\u0097"+
		" \3\2\2\2\u0098\u0099\7#\2\2\u0099\u009a\7?\2\2\u009a\"\3\2\2\2\u009b"+
		"\u009c\7>\2\2\u009c$\3\2\2\2\u009d\u009e\7>\2\2\u009e\u009f\7?\2\2\u009f"+
		"&\3\2\2\2\u00a0\u00a1\7@\2\2\u00a1(\3\2\2\2\u00a2\u00a3\7@\2\2\u00a3\u00a4"+
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
		"\7m\2\2\u010dV\3\2\2\2\u010e\u0112\t\2\2\2\u010f\u0111\t\3\2\2\u0110\u010f"+
		"\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"X\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0117\t\4\2\2\u0116\u0115\3\2\2\2"+
		"\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119Z\3"+
		"\2\2\2\u011a\u011b\5Y-\2\u011b\u011c\7\60\2\2\u011c\u011d\5Y-\2\u011d"+
		"\u012f\3\2\2\2\u011e\u011f\5Y-\2\u011f\u0121\t\5\2\2\u0120\u0122\t\6\2"+
		"\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124"+
		"\5Y-\2\u0124\u012f\3\2\2\2\u0125\u0126\5Y-\2\u0126\u0127\7\60\2\2\u0127"+
		"\u0128\5Y-\2\u0128\u012a\t\5\2\2\u0129\u012b\t\6\2\2\u012a\u0129\3\2\2"+
		"\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\5Y-\2\u012d\u012f"+
		"\3\2\2\2\u012e\u011a\3\2\2\2\u012e\u011e\3\2\2\2\u012e\u0125\3\2\2\2\u012f"+
		"\\\3\2\2\2\u0130\u0132\7\17\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2"+
		"\2\u0132\u0133\3\2\2\2\u0133\u0134\7\f\2\2\u0134\u0135\3\2\2\2\u0135\u0136"+
		"\b/\2\2\u0136^\3\2\2\2\u0137\u0139\t\7\2\2\u0138\u0137\3\2\2\2\u0139\u013a"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013d\b\60\2\2\u013d`\3\2\2\2\u013e\u013f\7)\2\2\u013fb\3\2\2\2\u0140"+
		"\u0141\5a\61\2\u0141\u0142\5i\65\2\u0142\u0143\5a\61\2\u0143d\3\2\2\2"+
		"\u0144\u0148\7$\2\2\u0145\u0147\5k\66\2\u0146\u0145\3\2\2\2\u0147\u014a"+
		"\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014b\u014c\7$\2\2\u014cf\3\2\2\2\u014d\u014e\7=\2\2\u014e"+
		"h\3\2\2\2\u014f\u0150\n\b\2\2\u0150j\3\2\2\2\u0151\u0152\n\t\2\2\u0152"+
		"l\3\2\2\2\u0153\u0154\7\61\2\2\u0154\u0155\7,\2\2\u0155\u0159\3\2\2\2"+
		"\u0156\u0158\5o8\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c"+
		"\u015d\7,\2\2\u015d\u015e\7\61\2\2\u015e\u015f\3\2\2\2\u015f\u0160\b\67"+
		"\2\2\u0160n\3\2\2\2\u0161\u0162\n\n\2\2\u0162p\3\2\2\2\f\2\u0112\u0118"+
		"\u0121\u012a\u012e\u0131\u013a\u0148\u0159\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}