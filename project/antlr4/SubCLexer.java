// Generated from SubC.g4 by ANTLR 4.8

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
		T__17=18, T__18=19, T__19=20, MOD=21, AND=22, OR=23, NOT=24, IF=25, ELSE=26, 
		SWITCH=27, WHILE=28, FOR=29, CASE=30, PRINT=31, FUNCTION=32, INT=33, STRING=34, 
		CHAR=35, MAIN=36, RETURN=37, DOUBLE=38, VOID=39, BREAK=40, PROGRAM=41, 
		IDENTIFIER=42, INTEGER=43, REAL=44, NEWLINE=45, WS=46, QUOTE=47, CHARACTER=48, 
		STR=49, SEMICOLON=50, COMMENT=51;
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
			"T__17", "T__18", "T__19", "MOD", "AND", "OR", "NOT", "IF", "ELSE", "SWITCH", 
			"WHILE", "FOR", "CASE", "PRINT", "FUNCTION", "INT", "STRING", "CHAR", 
			"MAIN", "RETURN", "DOUBLE", "VOID", "BREAK", "PROGRAM", "IDENTIFIER", 
			"INTEGER", "REAL", "NEWLINE", "WS", "QUOTE", "CHARACTER", "STR", "SEMICOLON", 
			"CHARACTER_CHAR", "STRING_CHAR", "COMMENT", "COMMENT_CHARACTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'{'", "'}'", "'='", "'++'", "'--'", "':'", 
			"'default'", "'-'", "'+'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", 
			"'*'", "'/'", "'%'", "'&&'", "'||'", "'!'", "'if'", "'else'", "'switch'", 
			"'while'", "'for'", "'case'", "'print'", "'function'", "'int'", "'string'", 
			"'char'", "'main'", "'return'", "'double'", "'void'", "'break'", "'Program'", 
			null, null, null, null, null, "'''", null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "MOD", "AND", "OR", 
			"NOT", "IF", "ELSE", "SWITCH", "WHILE", "FOR", "CASE", "PRINT", "FUNCTION", 
			"INT", "STRING", "CHAR", "MAIN", "RETURN", "DOUBLE", "VOID", "BREAK", 
			"PROGRAM", "IDENTIFIER", "INTEGER", "REAL", "NEWLINE", "WS", "QUOTE", 
			"CHARACTER", "STR", "SEMICOLON", "COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0165\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\7+\u0113"+
		"\n+\f+\16+\u0116\13+\3,\6,\u0119\n,\r,\16,\u011a\3-\3-\3-\3-\3-\3-\3-"+
		"\5-\u0124\n-\3-\3-\3-\3-\3-\3-\3-\5-\u012d\n-\3-\3-\5-\u0131\n-\3.\5."+
		"\u0134\n.\3.\3.\3.\3.\3/\6/\u013b\n/\r/\16/\u013c\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\7\62\u0149\n\62\f\62\16\62\u014c\13\62\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\7\66\u015a\n\66"+
		"\f\66\16\66\u015d\13\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\2\28\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\2i\2k\65m\2\3\2\13"+
		"\4\2C\\c|\5\2\62;C\\c|\3\2\62;\4\2GGgg\4\2--//\4\2\13\13\"\"\3\2))\3\2"+
		"$$\3\2,,\2\u016b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2k\3\2\2\2\3o\3\2\2\2\5q"+
		"\3\2\2\2\7s\3\2\2\2\tu\3\2\2\2\13w\3\2\2\2\ry\3\2\2\2\17{\3\2\2\2\21~"+
		"\3\2\2\2\23\u0081\3\2\2\2\25\u0083\3\2\2\2\27\u008b\3\2\2\2\31\u008d\3"+
		"\2\2\2\33\u008f\3\2\2\2\35\u0092\3\2\2\2\37\u0095\3\2\2\2!\u0097\3\2\2"+
		"\2#\u009a\3\2\2\2%\u009c\3\2\2\2\'\u009f\3\2\2\2)\u00a1\3\2\2\2+\u00a3"+
		"\3\2\2\2-\u00a5\3\2\2\2/\u00a8\3\2\2\2\61\u00ab\3\2\2\2\63\u00ad\3\2\2"+
		"\2\65\u00b0\3\2\2\2\67\u00b5\3\2\2\29\u00bc\3\2\2\2;\u00c2\3\2\2\2=\u00c6"+
		"\3\2\2\2?\u00cb\3\2\2\2A\u00d1\3\2\2\2C\u00da\3\2\2\2E\u00de\3\2\2\2G"+
		"\u00e5\3\2\2\2I\u00ea\3\2\2\2K\u00ef\3\2\2\2M\u00f6\3\2\2\2O\u00fd\3\2"+
		"\2\2Q\u0102\3\2\2\2S\u0108\3\2\2\2U\u0110\3\2\2\2W\u0118\3\2\2\2Y\u0130"+
		"\3\2\2\2[\u0133\3\2\2\2]\u013a\3\2\2\2_\u0140\3\2\2\2a\u0142\3\2\2\2c"+
		"\u0146\3\2\2\2e\u014f\3\2\2\2g\u0151\3\2\2\2i\u0153\3\2\2\2k\u0155\3\2"+
		"\2\2m\u0163\3\2\2\2op\7*\2\2p\4\3\2\2\2qr\7+\2\2r\6\3\2\2\2st\7.\2\2t"+
		"\b\3\2\2\2uv\7}\2\2v\n\3\2\2\2wx\7\177\2\2x\f\3\2\2\2yz\7?\2\2z\16\3\2"+
		"\2\2{|\7-\2\2|}\7-\2\2}\20\3\2\2\2~\177\7/\2\2\177\u0080\7/\2\2\u0080"+
		"\22\3\2\2\2\u0081\u0082\7<\2\2\u0082\24\3\2\2\2\u0083\u0084\7f\2\2\u0084"+
		"\u0085\7g\2\2\u0085\u0086\7h\2\2\u0086\u0087\7c\2\2\u0087\u0088\7w\2\2"+
		"\u0088\u0089\7n\2\2\u0089\u008a\7v\2\2\u008a\26\3\2\2\2\u008b\u008c\7"+
		"/\2\2\u008c\30\3\2\2\2\u008d\u008e\7-\2\2\u008e\32\3\2\2\2\u008f\u0090"+
		"\7?\2\2\u0090\u0091\7?\2\2\u0091\34\3\2\2\2\u0092\u0093\7#\2\2\u0093\u0094"+
		"\7?\2\2\u0094\36\3\2\2\2\u0095\u0096\7>\2\2\u0096 \3\2\2\2\u0097\u0098"+
		"\7>\2\2\u0098\u0099\7?\2\2\u0099\"\3\2\2\2\u009a\u009b\7@\2\2\u009b$\3"+
		"\2\2\2\u009c\u009d\7@\2\2\u009d\u009e\7?\2\2\u009e&\3\2\2\2\u009f\u00a0"+
		"\7,\2\2\u00a0(\3\2\2\2\u00a1\u00a2\7\61\2\2\u00a2*\3\2\2\2\u00a3\u00a4"+
		"\7\'\2\2\u00a4,\3\2\2\2\u00a5\u00a6\7(\2\2\u00a6\u00a7\7(\2\2\u00a7.\3"+
		"\2\2\2\u00a8\u00a9\7~\2\2\u00a9\u00aa\7~\2\2\u00aa\60\3\2\2\2\u00ab\u00ac"+
		"\7#\2\2\u00ac\62\3\2\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7h\2\2\u00af\64"+
		"\3\2\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7u\2\2\u00b3"+
		"\u00b4\7g\2\2\u00b4\66\3\2\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7y\2\2\u00b7"+
		"\u00b8\7k\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb\7j\2\2"+
		"\u00bb8\3\2\2\2\u00bc\u00bd\7y\2\2\u00bd\u00be\7j\2\2\u00be\u00bf\7k\2"+
		"\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7g\2\2\u00c1:\3\2\2\2\u00c2\u00c3\7"+
		"h\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7t\2\2\u00c5<\3\2\2\2\u00c6\u00c7"+
		"\7e\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7g\2\2\u00ca"+
		">\3\2\2\2\u00cb\u00cc\7r\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7k\2\2\u00ce"+
		"\u00cf\7p\2\2\u00cf\u00d0\7v\2\2\u00d0@\3\2\2\2\u00d1\u00d2\7h\2\2\u00d2"+
		"\u00d3\7w\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7e\2\2\u00d5\u00d6\7v\2\2"+
		"\u00d6\u00d7\7k\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7p\2\2\u00d9B\3\2\2"+
		"\2\u00da\u00db\7k\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7v\2\2\u00ddD\3\2"+
		"\2\2\u00de\u00df\7u\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2"+
		"\7k\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7i\2\2\u00e4F\3\2\2\2\u00e5\u00e6"+
		"\7e\2\2\u00e6\u00e7\7j\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7t\2\2\u00e9"+
		"H\3\2\2\2\u00ea\u00eb\7o\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7k\2\2\u00ed"+
		"\u00ee\7p\2\2\u00eeJ\3\2\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7g\2\2\u00f1"+
		"\u00f2\7v\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7p\2\2"+
		"\u00f5L\3\2\2\2\u00f6\u00f7\7f\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7w\2"+
		"\2\u00f9\u00fa\7d\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc\7g\2\2\u00fcN\3\2"+
		"\2\2\u00fd\u00fe\7x\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7k\2\2\u0100\u0101"+
		"\7f\2\2\u0101P\3\2\2\2\u0102\u0103\7d\2\2\u0103\u0104\7t\2\2\u0104\u0105"+
		"\7g\2\2\u0105\u0106\7c\2\2\u0106\u0107\7m\2\2\u0107R\3\2\2\2\u0108\u0109"+
		"\7R\2\2\u0109\u010a\7t\2\2\u010a\u010b\7q\2\2\u010b\u010c\7i\2\2\u010c"+
		"\u010d\7t\2\2\u010d\u010e\7c\2\2\u010e\u010f\7o\2\2\u010fT\3\2\2\2\u0110"+
		"\u0114\t\2\2\2\u0111\u0113\t\3\2\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2"+
		"\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115V\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0117\u0119\t\4\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011bX\3\2\2\2\u011c\u011d\5W,\2\u011d"+
		"\u011e\7\60\2\2\u011e\u011f\5W,\2\u011f\u0131\3\2\2\2\u0120\u0121\5W,"+
		"\2\u0121\u0123\t\5\2\2\u0122\u0124\t\6\2\2\u0123\u0122\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\5W,\2\u0126\u0131\3\2\2\2\u0127"+
		"\u0128\5W,\2\u0128\u0129\7\60\2\2\u0129\u012a\5W,\2\u012a\u012c\t\5\2"+
		"\2\u012b\u012d\t\6\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e"+
		"\3\2\2\2\u012e\u012f\5W,\2\u012f\u0131\3\2\2\2\u0130\u011c\3\2\2\2\u0130"+
		"\u0120\3\2\2\2\u0130\u0127\3\2\2\2\u0131Z\3\2\2\2\u0132\u0134\7\17\2\2"+
		"\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136"+
		"\7\f\2\2\u0136\u0137\3\2\2\2\u0137\u0138\b.\2\2\u0138\\\3\2\2\2\u0139"+
		"\u013b\t\7\2\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\b/\2\2\u013f"+
		"^\3\2\2\2\u0140\u0141\7)\2\2\u0141`\3\2\2\2\u0142\u0143\5_\60\2\u0143"+
		"\u0144\5g\64\2\u0144\u0145\5_\60\2\u0145b\3\2\2\2\u0146\u014a\7$\2\2\u0147"+
		"\u0149\5i\65\2\u0148\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2"+
		"\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d"+
		"\u014e\7$\2\2\u014ed\3\2\2\2\u014f\u0150\7=\2\2\u0150f\3\2\2\2\u0151\u0152"+
		"\n\b\2\2\u0152h\3\2\2\2\u0153\u0154\n\t\2\2\u0154j\3\2\2\2\u0155\u0156"+
		"\7\61\2\2\u0156\u0157\7,\2\2\u0157\u015b\3\2\2\2\u0158\u015a\5m\67\2\u0159"+
		"\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2"+
		"\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f\7,\2\2\u015f"+
		"\u0160\7\61\2\2\u0160\u0161\3\2\2\2\u0161\u0162\b\66\2\2\u0162l\3\2\2"+
		"\2\u0163\u0164\n\n\2\2\u0164n\3\2\2\2\f\2\u0114\u011a\u0123\u012c\u0130"+
		"\u0133\u013c\u014a\u015b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}