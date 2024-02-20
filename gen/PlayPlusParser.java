// Generated from C:/Users/guill/IdeaProjects/2122_IHDCB332_G10/src/main/antlr4/tmp\PlayPlus.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlayPlusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENTAIRES=1, NEWLINE=2, WS=3, AS=4, AMPERSTAND=5, AND=6, BAREL=7, BOOLEAN=8, 
		BRIDGE=9, BUSH=10, CHAR=11, CONST=12, DIG=13, DO=14, DOWN=15, ELSE=16, 
		EMPTY=17, END=18, ENUM=19, FALSE=20, FIGHT=21, FOR=22, FUNCTION=23, GRASS=24, 
		IF=25, IMPORT=26, INTEGER=27, JUMP=28, LEFT=29, MAIN=30, MAP=31, NOT=32, 
		OR=33, PALM=34, RECORD=35, REPEAT=36, RIGHT=37, ROBOT=38, SKULL=39, THEN=40, 
		TREASURE=41, TO=42, TRUE=43, UP=44, UNTIL=45, VOID=46, WELL=47, WHILE=48, 
		ASSIGN=49, SMALEQ=50, BIGGEQ=51, DIFFERENT=52, BIGGER=53, SMALLER=54, 
		BY=55, TIME=56, PERCENT=57, MINUS=58, PLUS=59, EQUAL=60, LBRACKET=61, 
		RBRACKET=62, LPAR=63, RPAR=64, BACKSLASH=65, DQUOTE=66, QUOTE=67, COLON=68, 
		COMMA=69, DOT=70, SEMICOLON=71, ID=72, ENTIER=73, STRING=74, CHIFFRE=75, 
		LETTRE=76;
	public static final int
		RULE_root = 0, RULE_programme = 1, RULE_impDecl = 2, RULE_fileDecl = 3, 
		RULE_fileName = 4, RULE_fctDecl = 5, RULE_arglist = 6, RULE_instBlock = 7, 
		RULE_instruction = 8, RULE_actionType = 9, RULE_exprG = 10, RULE_exprBool = 11, 
		RULE_exprEnt = 12, RULE_exprD = 13, RULE_enumDecl = 14, RULE_constDecl = 15, 
		RULE_varDecl = 16, RULE_initVariable = 17, RULE_initArrays = 18, RULE_type = 19, 
		RULE_scalar = 20, RULE_array = 21, RULE_structure = 22, RULE_character = 23, 
		RULE_map = 24, RULE_symbole = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "programme", "impDecl", "fileDecl", "fileName", "fctDecl", "arglist", 
			"instBlock", "instruction", "actionType", "exprG", "exprBool", "exprEnt", 
			"exprD", "enumDecl", "constDecl", "varDecl", "initVariable", "initArrays", 
			"type", "scalar", "array", "structure", "character", "map", "symbole"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'as'", "'&'", "'and'", "'T'", "'boolean'", "'A'", 
			"'B'", "'char'", "'const'", "'dig'", "'do'", "'down'", "'else'", "'_'", 
			"'end'", "'enum'", "'false'", "'fight'", "'for'", "'function'", "'G'", 
			"'if'", "'#import'", "'integer'", "'jump'", "'left'", "'main'", "'map:'", 
			"'not'", "'or'", "'P'", "'record'", "'repeat'", "'right'", "'@'", "'Q'", 
			"'then'", "'X'", "'to'", "'true'", "'up'", "'until'", "'void'", "'S'", 
			"'while'", null, "'<='", "'>='", "'<>'", "'>'", "'<'", "'/'", "'*'", 
			"'%'", "'-'", "'+'", "'='", "'['", "']'", "'('", "')'", "'\\'", "'\"'", 
			"'''", "':'", "','", "'.'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENTAIRES", "NEWLINE", "WS", "AS", "AMPERSTAND", "AND", "BAREL", 
			"BOOLEAN", "BRIDGE", "BUSH", "CHAR", "CONST", "DIG", "DO", "DOWN", "ELSE", 
			"EMPTY", "END", "ENUM", "FALSE", "FIGHT", "FOR", "FUNCTION", "GRASS", 
			"IF", "IMPORT", "INTEGER", "JUMP", "LEFT", "MAIN", "MAP", "NOT", "OR", 
			"PALM", "RECORD", "REPEAT", "RIGHT", "ROBOT", "SKULL", "THEN", "TREASURE", 
			"TO", "TRUE", "UP", "UNTIL", "VOID", "WELL", "WHILE", "ASSIGN", "SMALEQ", 
			"BIGGEQ", "DIFFERENT", "BIGGER", "SMALLER", "BY", "TIME", "PERCENT", 
			"MINUS", "PLUS", "EQUAL", "LBRACKET", "RBRACKET", "LPAR", "RPAR", "BACKSLASH", 
			"DQUOTE", "QUOTE", "COLON", "COMMA", "DOT", "SEMICOLON", "ID", "ENTIER", 
			"STRING", "CHIFFRE", "LETTRE"
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
	public String getGrammarFileName() { return "PlayPlus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlayPlusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public ProgrammeContext programme() {
			return getRuleContext(ProgrammeContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				programme();
				}
				break;
			case MAP:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				map();
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

	public static class ProgrammeContext extends ParserRuleContext {
		public ImpDeclContext impDecl() {
			return getRuleContext(ImpDeclContext.class,0);
		}
		public TerminalNode MAIN() { return getToken(PlayPlusParser.MAIN, 0); }
		public TerminalNode AS() { return getToken(PlayPlusParser.AS, 0); }
		public TerminalNode FUNCTION() { return getToken(PlayPlusParser.FUNCTION, 0); }
		public List<TerminalNode> LPAR() { return getTokens(PlayPlusParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(PlayPlusParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(PlayPlusParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(PlayPlusParser.RPAR, i);
		}
		public TerminalNode COLON() { return getToken(PlayPlusParser.COLON, 0); }
		public TerminalNode VOID() { return getToken(PlayPlusParser.VOID, 0); }
		public TerminalNode DO() { return getToken(PlayPlusParser.DO, 0); }
		public TerminalNode END() { return getToken(PlayPlusParser.END, 0); }
		public TerminalNode DIG() { return getToken(PlayPlusParser.DIG, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<FctDeclContext> fctDecl() {
			return getRuleContexts(FctDeclContext.class);
		}
		public FctDeclContext fctDecl(int i) {
			return getRuleContext(FctDeclContext.class,i);
		}
		public List<ConstDeclContext> constDecl() {
			return getRuleContexts(ConstDeclContext.class);
		}
		public ConstDeclContext constDecl(int i) {
			return getRuleContext(ConstDeclContext.class,i);
		}
		public List<EnumDeclContext> enumDecl() {
			return getRuleContexts(EnumDeclContext.class);
		}
		public EnumDeclContext enumDecl(int i) {
			return getRuleContext(EnumDeclContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ProgrammeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterProgramme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitProgramme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitProgramme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammeContext programme() throws RecognitionException {
		ProgrammeContext _localctx = new ProgrammeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			impDecl();
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(57);
					varDecl();
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(63);
					fctDecl();
					}
					}
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONST) {
					{
					{
					setState(69);
					constDecl();
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				{
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENUM) {
					{
					{
					setState(75);
					enumDecl();
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				{
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << INTEGER))) != 0) || _la==ID) {
					{
					{
					setState(81);
					type();
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(89);
			match(MAIN);
			setState(90);
			match(AS);
			setState(91);
			match(FUNCTION);
			setState(92);
			match(LPAR);
			setState(93);
			match(RPAR);
			setState(94);
			match(COLON);
			setState(95);
			match(VOID);
			setState(96);
			match(DO);
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(97);
				match(DIG);
				setState(98);
				match(LPAR);
				setState(99);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(100);
					instruction();
					}
					}
					setState(103); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (DIG - 13)) | (1L << (DOWN - 13)) | (1L << (FIGHT - 13)) | (1L << (FOR - 13)) | (1L << (IF - 13)) | (1L << (JUMP - 13)) | (1L << (LEFT - 13)) | (1L << (REPEAT - 13)) | (1L << (RIGHT - 13)) | (1L << (UP - 13)) | (1L << (WHILE - 13)) | (1L << (ID - 13)))) != 0) );
				}
				break;
			}
			setState(107);
			match(END);
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

	public static class ImpDeclContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(PlayPlusParser.IMPORT, 0); }
		public FileDeclContext fileDecl() {
			return getRuleContext(FileDeclContext.class,0);
		}
		public ImpDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterImpDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitImpDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitImpDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpDeclContext impDecl() throws RecognitionException {
		ImpDeclContext _localctx = new ImpDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_impDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(IMPORT);
			setState(110);
			fileDecl();
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

	public static class FileDeclContext extends ParserRuleContext {
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public FileDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFileDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFileDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFileDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileDeclContext fileDecl() throws RecognitionException {
		FileDeclContext _localctx = new FileDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fileDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			fileName();
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

	public static class FileNameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PlayPlusParser.STRING, 0); }
		public FileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFileName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFileName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(STRING);
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

	public static class FctDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode AS() { return getToken(PlayPlusParser.AS, 0); }
		public TerminalNode FUNCTION() { return getToken(PlayPlusParser.FUNCTION, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(PlayPlusParser.COLON, 0); }
		public TerminalNode DO() { return getToken(PlayPlusParser.DO, 0); }
		public TerminalNode END() { return getToken(PlayPlusParser.END, 0); }
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public TerminalNode VOID() { return getToken(PlayPlusParser.VOID, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public List<InstBlockContext> instBlock() {
			return getRuleContexts(InstBlockContext.class);
		}
		public InstBlockContext instBlock(int i) {
			return getRuleContext(InstBlockContext.class,i);
		}
		public FctDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fctDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFctDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFctDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFctDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FctDeclContext fctDecl() throws RecognitionException {
		FctDeclContext _localctx = new FctDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fctDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(ID);
			setState(117);
			match(AS);
			setState(118);
			match(FUNCTION);
			setState(119);
			match(LPAR);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(120);
				arglist();
				}
			}

			setState(123);
			match(RPAR);
			setState(124);
			match(COLON);
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case INTEGER:
				{
				setState(125);
				scalar();
				}
				break;
			case VOID:
				{
				setState(126);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(129);
			match(DO);
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				instBlock();
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (CONST - 12)) | (1L << (DIG - 12)) | (1L << (DOWN - 12)) | (1L << (ENUM - 12)) | (1L << (FIGHT - 12)) | (1L << (FOR - 12)) | (1L << (IF - 12)) | (1L << (JUMP - 12)) | (1L << (LEFT - 12)) | (1L << (REPEAT - 12)) | (1L << (RIGHT - 12)) | (1L << (UP - 12)) | (1L << (WHILE - 12)) | (1L << (ID - 12)))) != 0) );
			setState(135);
			match(END);
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

	public static class ArglistContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PlayPlusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PlayPlusParser.ID, i);
		}
		public List<TerminalNode> AS() { return getTokens(PlayPlusParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(PlayPlusParser.AS, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitArglist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arglist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(ID);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(138);
				match(COMMA);
				setState(139);
				match(ID);
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			match(AS);
			setState(146);
			type();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(147);
				match(COMMA);
				setState(148);
				match(ID);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(149);
					match(COMMA);
					setState(150);
					match(ID);
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				match(AS);
				setState(157);
				type();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class InstBlockContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<EnumDeclContext> enumDecl() {
			return getRuleContexts(EnumDeclContext.class);
		}
		public EnumDeclContext enumDecl(int i) {
			return getRuleContext(EnumDeclContext.class,i);
		}
		public List<ConstDeclContext> constDecl() {
			return getRuleContexts(ConstDeclContext.class);
		}
		public ConstDeclContext constDecl(int i) {
			return getRuleContext(ConstDeclContext.class,i);
		}
		public List<StructureContext> structure() {
			return getRuleContexts(StructureContext.class);
		}
		public StructureContext structure(int i) {
			return getRuleContext(StructureContext.class,i);
		}
		public InstBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterInstBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitInstBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitInstBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstBlockContext instBlock() throws RecognitionException {
		InstBlockContext _localctx = new InstBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_instBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(164); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(163);
						varDecl();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(166); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				{
				setState(169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(168);
					enumDecl();
					}
					}
					setState(171); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ENUM );
				}
				break;
			case 3:
				{
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(173);
					constDecl();
					}
					}
					setState(176); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST );
				}
				break;
			case 4:
				{
				setState(179); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(178);
						structure();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(181); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			setState(186); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(185);
					instruction();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(188); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class InstructionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PlayPlusParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public TerminalNode THEN() { return getToken(PlayPlusParser.THEN, 0); }
		public TerminalNode END() { return getToken(PlayPlusParser.END, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PlayPlusParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(PlayPlusParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(PlayPlusParser.DO, 0); }
		public TerminalNode REPEAT() { return getToken(PlayPlusParser.REPEAT, 0); }
		public TerminalNode UNTIL() { return getToken(PlayPlusParser.UNTIL, 0); }
		public TerminalNode FOR() { return getToken(PlayPlusParser.FOR, 0); }
		public List<TerminalNode> ID() { return getTokens(PlayPlusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PlayPlusParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(PlayPlusParser.ASSIGN, 0); }
		public TerminalNode TO() { return getToken(PlayPlusParser.TO, 0); }
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public ActionTypeContext actionType() {
			return getRuleContext(ActionTypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instruction);
		int _la;
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(IF);
				setState(191);
				match(LPAR);
				setState(192);
				exprD();
				setState(193);
				match(RPAR);
				setState(194);
				match(THEN);
				setState(196); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(195);
					instruction();
					}
					}
					setState(198); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (DIG - 13)) | (1L << (DOWN - 13)) | (1L << (FIGHT - 13)) | (1L << (FOR - 13)) | (1L << (IF - 13)) | (1L << (JUMP - 13)) | (1L << (LEFT - 13)) | (1L << (REPEAT - 13)) | (1L << (RIGHT - 13)) | (1L << (UP - 13)) | (1L << (WHILE - 13)) | (1L << (ID - 13)))) != 0) );
				setState(200);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(IF);
				setState(203);
				match(LPAR);
				setState(204);
				exprD();
				setState(205);
				match(RPAR);
				setState(206);
				match(THEN);
				setState(208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(207);
					instruction();
					}
					}
					setState(210); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (DIG - 13)) | (1L << (DOWN - 13)) | (1L << (FIGHT - 13)) | (1L << (FOR - 13)) | (1L << (IF - 13)) | (1L << (JUMP - 13)) | (1L << (LEFT - 13)) | (1L << (REPEAT - 13)) | (1L << (RIGHT - 13)) | (1L << (UP - 13)) | (1L << (WHILE - 13)) | (1L << (ID - 13)))) != 0) );
				setState(212);
				match(ELSE);
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(213);
					instruction();
					}
					}
					setState(216); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (DIG - 13)) | (1L << (DOWN - 13)) | (1L << (FIGHT - 13)) | (1L << (FOR - 13)) | (1L << (IF - 13)) | (1L << (JUMP - 13)) | (1L << (LEFT - 13)) | (1L << (REPEAT - 13)) | (1L << (RIGHT - 13)) | (1L << (UP - 13)) | (1L << (WHILE - 13)) | (1L << (ID - 13)))) != 0) );
				setState(218);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(WHILE);
				setState(221);
				match(LPAR);
				setState(222);
				exprD();
				setState(223);
				match(RPAR);
				setState(224);
				match(DO);
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(225);
					instruction();
					}
					}
					setState(228); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (DIG - 13)) | (1L << (DOWN - 13)) | (1L << (FIGHT - 13)) | (1L << (FOR - 13)) | (1L << (IF - 13)) | (1L << (JUMP - 13)) | (1L << (LEFT - 13)) | (1L << (REPEAT - 13)) | (1L << (RIGHT - 13)) | (1L << (UP - 13)) | (1L << (WHILE - 13)) | (1L << (ID - 13)))) != 0) );
				setState(230);
				match(END);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				match(REPEAT);
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(233);
					instruction();
					}
					}
					setState(236); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (DIG - 13)) | (1L << (DOWN - 13)) | (1L << (FIGHT - 13)) | (1L << (FOR - 13)) | (1L << (IF - 13)) | (1L << (JUMP - 13)) | (1L << (LEFT - 13)) | (1L << (REPEAT - 13)) | (1L << (RIGHT - 13)) | (1L << (UP - 13)) | (1L << (WHILE - 13)) | (1L << (ID - 13)))) != 0) );
				setState(238);
				match(UNTIL);
				setState(239);
				match(LPAR);
				setState(240);
				exprD();
				setState(241);
				match(RPAR);
				setState(242);
				match(END);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				match(FOR);
				setState(245);
				match(ID);
				setState(246);
				match(ASSIGN);
				setState(247);
				exprD();
				setState(248);
				match(TO);
				setState(249);
				exprD();
				setState(250);
				match(DO);
				setState(252); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(251);
					instruction();
					}
					}
					setState(254); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (DIG - 13)) | (1L << (DOWN - 13)) | (1L << (FIGHT - 13)) | (1L << (FOR - 13)) | (1L << (IF - 13)) | (1L << (JUMP - 13)) | (1L << (LEFT - 13)) | (1L << (REPEAT - 13)) | (1L << (RIGHT - 13)) | (1L << (UP - 13)) | (1L << (WHILE - 13)) | (1L << (ID - 13)))) != 0) );
				setState(256);
				match(END);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(258);
				exprG(0);
				setState(259);
				match(ASSIGN);
				setState(260);
				exprD();
				setState(261);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(263);
				actionType();
				setState(264);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(266);
				match(ID);
				setState(267);
				match(LPAR);
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(268);
					match(ID);
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(269);
						match(COMMA);
						setState(270);
						match(ID);
						}
						}
						setState(275);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(278);
				match(RPAR);
				setState(279);
				match(SEMICOLON);
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

	public static class ActionTypeContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(PlayPlusParser.LEFT, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public TerminalNode RIGHT() { return getToken(PlayPlusParser.RIGHT, 0); }
		public TerminalNode UP() { return getToken(PlayPlusParser.UP, 0); }
		public TerminalNode DOWN() { return getToken(PlayPlusParser.DOWN, 0); }
		public TerminalNode JUMP() { return getToken(PlayPlusParser.JUMP, 0); }
		public TerminalNode FIGHT() { return getToken(PlayPlusParser.FIGHT, 0); }
		public TerminalNode DIG() { return getToken(PlayPlusParser.DIG, 0); }
		public ActionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterActionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitActionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitActionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionTypeContext actionType() throws RecognitionException {
		ActionTypeContext _localctx = new ActionTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_actionType);
		int _la;
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(LEFT);
				setState(283);
				match(LPAR);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS || _la==ENTIER) {
					{
					setState(284);
					exprEnt(0);
					}
				}

				setState(287);
				match(RPAR);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(RIGHT);
				setState(289);
				match(LPAR);
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS || _la==ENTIER) {
					{
					setState(290);
					exprEnt(0);
					}
				}

				setState(293);
				match(RPAR);
				}
				break;
			case UP:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				match(UP);
				setState(295);
				match(LPAR);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS || _la==ENTIER) {
					{
					setState(296);
					exprEnt(0);
					}
				}

				setState(299);
				match(RPAR);
				}
				break;
			case DOWN:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				match(DOWN);
				setState(301);
				match(LPAR);
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS || _la==ENTIER) {
					{
					setState(302);
					exprEnt(0);
					}
				}

				setState(305);
				match(RPAR);
				}
				break;
			case JUMP:
				enterOuterAlt(_localctx, 5);
				{
				setState(306);
				match(JUMP);
				setState(307);
				match(LPAR);
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS || _la==ENTIER) {
					{
					setState(308);
					exprEnt(0);
					}
				}

				setState(311);
				match(RPAR);
				}
				break;
			case FIGHT:
				enterOuterAlt(_localctx, 6);
				{
				setState(312);
				match(FIGHT);
				setState(313);
				match(LPAR);
				setState(314);
				match(RPAR);
				}
				break;
			case DIG:
				enterOuterAlt(_localctx, 7);
				{
				setState(315);
				match(DIG);
				setState(316);
				match(LPAR);
				setState(317);
				match(RPAR);
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

	public static class ExprGContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(PlayPlusParser.LBRACKET, 0); }
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(PlayPlusParser.RBRACKET, 0); }
		public TerminalNode COMMA() { return getToken(PlayPlusParser.COMMA, 0); }
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PlayPlusParser.DOT, 0); }
		public ExprGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprG; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprG(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprGContext exprG() throws RecognitionException {
		return exprG(0);
	}

	private ExprGContext exprG(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprGContext _localctx = new ExprGContext(_ctx, _parentState);
		ExprGContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_exprG, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(321);
				match(ID);
				}
				break;
			case 2:
				{
				setState(322);
				match(ID);
				setState(323);
				match(LBRACKET);
				setState(324);
				exprD();
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(325);
					match(COMMA);
					setState(326);
					exprD();
					}
				}

				setState(329);
				match(RBRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprGContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprG);
					setState(333);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(334);
					match(DOT);
					setState(335);
					match(ID);
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class ExprBoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PlayPlusParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PlayPlusParser.FALSE, 0); }
		public TerminalNode NOT() { return getToken(PlayPlusParser.NOT, 0); }
		public List<ExprBoolContext> exprBool() {
			return getRuleContexts(ExprBoolContext.class);
		}
		public ExprBoolContext exprBool(int i) {
			return getRuleContext(ExprBoolContext.class,i);
		}
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
		}
		public TerminalNode SMALLER() { return getToken(PlayPlusParser.SMALLER, 0); }
		public TerminalNode BIGGER() { return getToken(PlayPlusParser.BIGGER, 0); }
		public TerminalNode EQUAL() { return getToken(PlayPlusParser.EQUAL, 0); }
		public TerminalNode SMALEQ() { return getToken(PlayPlusParser.SMALEQ, 0); }
		public TerminalNode BIGGEQ() { return getToken(PlayPlusParser.BIGGEQ, 0); }
		public TerminalNode DIFFERENT() { return getToken(PlayPlusParser.DIFFERENT, 0); }
		public TerminalNode AND() { return getToken(PlayPlusParser.AND, 0); }
		public TerminalNode OR() { return getToken(PlayPlusParser.OR, 0); }
		public ExprBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprBool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprBoolContext exprBool() throws RecognitionException {
		return exprBool(0);
	}

	private ExprBoolContext exprBool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprBoolContext _localctx = new ExprBoolContext(_ctx, _parentState);
		ExprBoolContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_exprBool, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(342);
				match(TRUE);
				}
				break;
			case 2:
				{
				setState(343);
				match(FALSE);
				}
				break;
			case 3:
				{
				setState(344);
				match(NOT);
				setState(345);
				exprBool(7);
				}
				break;
			case 4:
				{
				setState(346);
				exprEnt(0);
				setState(347);
				match(SMALLER);
				setState(348);
				exprEnt(0);
				}
				break;
			case 5:
				{
				setState(350);
				exprEnt(0);
				setState(351);
				match(BIGGER);
				setState(352);
				exprEnt(0);
				}
				break;
			case 6:
				{
				setState(354);
				exprEnt(0);
				setState(355);
				match(EQUAL);
				setState(356);
				exprEnt(0);
				}
				break;
			case 7:
				{
				setState(358);
				exprEnt(0);
				setState(359);
				match(SMALEQ);
				setState(360);
				exprEnt(0);
				}
				break;
			case 8:
				{
				setState(362);
				exprEnt(0);
				setState(363);
				match(BIGGEQ);
				setState(364);
				exprEnt(0);
				}
				break;
			case 9:
				{
				setState(366);
				exprEnt(0);
				setState(367);
				match(DIFFERENT);
				setState(368);
				exprEnt(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(380);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(378);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(372);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(373);
						match(AND);
						setState(374);
						exprBool(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprBoolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(375);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(376);
						match(OR);
						setState(377);
						exprBool(9);
						}
						break;
					}
					} 
				}
				setState(382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

	public static class ExprEntContext extends ParserRuleContext {
		public TerminalNode ENTIER() { return getToken(PlayPlusParser.ENTIER, 0); }
		public TerminalNode MINUS() { return getToken(PlayPlusParser.MINUS, 0); }
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(PlayPlusParser.PLUS, 0); }
		public TerminalNode TIME() { return getToken(PlayPlusParser.TIME, 0); }
		public TerminalNode BY() { return getToken(PlayPlusParser.BY, 0); }
		public TerminalNode PERCENT() { return getToken(PlayPlusParser.PERCENT, 0); }
		public ExprEntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprEnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprEnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprEnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprEnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprEntContext exprEnt() throws RecognitionException {
		return exprEnt(0);
	}

	private ExprEntContext exprEnt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprEntContext _localctx = new ExprEntContext(_ctx, _parentState);
		ExprEntContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_exprEnt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTIER:
				{
				setState(384);
				match(ENTIER);
				}
				break;
			case MINUS:
				{
				setState(385);
				match(MINUS);
				setState(386);
				exprEnt(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(404);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new ExprEntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(389);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(390);
						match(PLUS);
						setState(391);
						exprEnt(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprEntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(392);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(393);
						match(MINUS);
						setState(394);
						exprEnt(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprEntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(395);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(396);
						match(TIME);
						setState(397);
						exprEnt(5);
						}
						break;
					case 4:
						{
						_localctx = new ExprEntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(398);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(399);
						match(BY);
						setState(400);
						exprEnt(4);
						}
						break;
					case 5:
						{
						_localctx = new ExprEntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(401);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(402);
						match(PERCENT);
						setState(403);
						exprEnt(3);
						}
						break;
					}
					} 
				}
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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

	public static class ExprDContext extends ParserRuleContext {
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public TerminalNode STRING() { return getToken(PlayPlusParser.STRING, 0); }
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public ExprDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprDContext exprD() throws RecognitionException {
		ExprDContext _localctx = new ExprDContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exprD);
		int _la;
		try {
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				exprEnt(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(411);
				character();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(412);
				exprBool(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(413);
				exprG(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(414);
				match(ID);
				setState(415);
				match(LPAR);
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (FALSE - 20)) | (1L << (NOT - 20)) | (1L << (TRUE - 20)) | (1L << (MINUS - 20)) | (1L << (LPAR - 20)) | (1L << (QUOTE - 20)) | (1L << (ID - 20)) | (1L << (ENTIER - 20)) | (1L << (STRING - 20)))) != 0)) {
					{
					setState(416);
					exprD();
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(417);
						match(COMMA);
						setState(418);
						exprD();
						}
						}
						setState(423);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(426);
				match(RPAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(427);
				match(LPAR);
				setState(428);
				exprD();
				setState(429);
				match(RPAR);
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

	public static class EnumDeclContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(PlayPlusParser.ENUM, 0); }
		public List<TerminalNode> ID() { return getTokens(PlayPlusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PlayPlusParser.ID, i);
		}
		public TerminalNode EQUAL() { return getToken(PlayPlusParser.EQUAL, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public EnumDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterEnumDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitEnumDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitEnumDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclContext enumDecl() throws RecognitionException {
		EnumDeclContext _localctx = new EnumDeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(ENUM);
			setState(434);
			match(ID);
			setState(435);
			match(EQUAL);
			setState(436);
			match(LPAR);
			setState(437);
			match(ID);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(438);
				match(COMMA);
				setState(439);
				match(ID);
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(445);
			match(SEMICOLON);
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

	public static class ConstDeclContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(PlayPlusParser.CONST, 0); }
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode AS() { return getToken(PlayPlusParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(PlayPlusParser.EQUAL, 0); }
		public InitVariableContext initVariable() {
			return getRuleContext(InitVariableContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitConstDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_constDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(CONST);
			setState(448);
			match(ID);
			setState(449);
			match(AS);
			setState(450);
			type();
			setState(451);
			match(EQUAL);
			setState(452);
			initVariable();
			setState(453);
			match(SEMICOLON);
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

	public static class VarDeclContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PlayPlusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PlayPlusParser.ID, i);
		}
		public TerminalNode AS() { return getToken(PlayPlusParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public TerminalNode EQUAL() { return getToken(PlayPlusParser.EQUAL, 0); }
		public InitVariableContext initVariable() {
			return getRuleContext(InitVariableContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(ID);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(456);
				match(COMMA);
				setState(457);
				match(ID);
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(463);
			match(AS);
			setState(464);
			type();
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(465);
				match(EQUAL);
				setState(466);
				initVariable();
				}
			}

			setState(469);
			match(SEMICOLON);
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

	public static class InitVariableContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PlayPlusParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PlayPlusParser.FALSE, 0); }
		public TerminalNode ENTIER() { return getToken(PlayPlusParser.ENTIER, 0); }
		public TerminalNode STRING() { return getToken(PlayPlusParser.STRING, 0); }
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public InitArraysContext initArrays() {
			return getRuleContext(InitArraysContext.class,0);
		}
		public InitVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterInitVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitInitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitInitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitVariableContext initVariable() throws RecognitionException {
		InitVariableContext _localctx = new InitVariableContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_initVariable);
		try {
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(473);
				match(ENTIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(474);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(475);
				character();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(476);
				exprEnt(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(477);
				exprBool(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(478);
				initArrays();
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

	public static class InitArraysContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public List<InitVariableContext> initVariable() {
			return getRuleContexts(InitVariableContext.class);
		}
		public InitVariableContext initVariable(int i) {
			return getRuleContext(InitVariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public InitArraysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initArrays; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterInitArrays(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitInitArrays(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitInitArrays(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitArraysContext initArrays() throws RecognitionException {
		InitArraysContext _localctx = new InitArraysContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_initArrays);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(LPAR);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (FALSE - 20)) | (1L << (NOT - 20)) | (1L << (TRUE - 20)) | (1L << (MINUS - 20)) | (1L << (LPAR - 20)) | (1L << (QUOTE - 20)) | (1L << (ENTIER - 20)) | (1L << (STRING - 20)))) != 0)) {
				{
				setState(482);
				initVariable();
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(483);
					match(COMMA);
					setState(484);
					initVariable();
					}
					}
					setState(489);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(492);
			match(RPAR);
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

	public static class TypeContext extends ParserRuleContext {
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public StructureContext structure() {
			return getRuleContext(StructureContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type);
		try {
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				scalar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				array();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(496);
				structure();
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

	public static class ScalarContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(PlayPlusParser.BOOLEAN, 0); }
		public TerminalNode INTEGER() { return getToken(PlayPlusParser.INTEGER, 0); }
		public TerminalNode CHAR() { return getToken(PlayPlusParser.CHAR, 0); }
		public ScalarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterScalar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitScalar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitScalar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalarContext scalar() throws RecognitionException {
		ScalarContext _localctx = new ScalarContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_scalar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << INTEGER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ArrayContext extends ParserRuleContext {
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(PlayPlusParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(PlayPlusParser.RBRACKET, 0); }
		public List<TerminalNode> CHIFFRE() { return getTokens(PlayPlusParser.CHIFFRE); }
		public TerminalNode CHIFFRE(int i) {
			return getToken(PlayPlusParser.CHIFFRE, i);
		}
		public TerminalNode COMMA() { return getToken(PlayPlusParser.COMMA, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			scalar();
			setState(502);
			match(LBRACKET);
			setState(504); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(503);
				match(CHIFFRE);
				}
				}
				setState(506); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHIFFRE );
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(508);
				match(COMMA);
				setState(510); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(509);
					match(CHIFFRE);
					}
					}
					setState(512); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CHIFFRE );
				}
			}

			setState(516);
			match(RBRACKET);
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

	public static class StructureContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode AS() { return getToken(PlayPlusParser.AS, 0); }
		public TerminalNode RECORD() { return getToken(PlayPlusParser.RECORD, 0); }
		public TerminalNode END() { return getToken(PlayPlusParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public StructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitStructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureContext structure() throws RecognitionException {
		StructureContext _localctx = new StructureContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(ID);
			setState(519);
			match(AS);
			setState(520);
			match(RECORD);
			setState(522); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(521);
				varDecl();
				}
				}
				setState(524); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(526);
			match(END);
			setState(527);
			match(SEMICOLON);
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

	public static class CharacterContext extends ParserRuleContext {
		public List<TerminalNode> QUOTE() { return getTokens(PlayPlusParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(PlayPlusParser.QUOTE, i);
		}
		public TerminalNode CHIFFRE() { return getToken(PlayPlusParser.CHIFFRE, 0); }
		public TerminalNode LETTRE() { return getToken(PlayPlusParser.LETTRE, 0); }
		public TerminalNode COLON() { return getToken(PlayPlusParser.COLON, 0); }
		public TerminalNode DOT() { return getToken(PlayPlusParser.DOT, 0); }
		public TerminalNode AMPERSTAND() { return getToken(PlayPlusParser.AMPERSTAND, 0); }
		public TerminalNode BACKSLASH() { return getToken(PlayPlusParser.BACKSLASH, 0); }
		public TerminalNode BY() { return getToken(PlayPlusParser.BY, 0); }
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitCharacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_character);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(QUOTE);
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AMPERSTAND || _la==BY || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (BACKSLASH - 65)) | (1L << (COLON - 65)) | (1L << (DOT - 65)) | (1L << (SEMICOLON - 65)) | (1L << (CHIFFRE - 65)) | (1L << (LETTRE - 65)))) != 0)) {
				{
				setState(530);
				_la = _input.LA(1);
				if ( !(_la==AMPERSTAND || _la==BY || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (BACKSLASH - 65)) | (1L << (COLON - 65)) | (1L << (DOT - 65)) | (1L << (SEMICOLON - 65)) | (1L << (CHIFFRE - 65)) | (1L << (LETTRE - 65)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(533);
			match(QUOTE);
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

	public static class MapContext extends ParserRuleContext {
		public TerminalNode MAP() { return getToken(PlayPlusParser.MAP, 0); }
		public List<TerminalNode> ENTIER() { return getTokens(PlayPlusParser.ENTIER); }
		public TerminalNode ENTIER(int i) {
			return getToken(PlayPlusParser.ENTIER, i);
		}
		public TerminalNode EOF() { return getToken(PlayPlusParser.EOF, 0); }
		public List<SymboleContext> symbole() {
			return getRuleContexts(SymboleContext.class);
		}
		public SymboleContext symbole(int i) {
			return getRuleContext(SymboleContext.class,i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(MAP);
			setState(536);
			match(ENTIER);
			setState(537);
			match(ENTIER);
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BAREL) | (1L << BRIDGE) | (1L << BUSH) | (1L << EMPTY) | (1L << GRASS) | (1L << PALM) | (1L << ROBOT) | (1L << SKULL) | (1L << TREASURE) | (1L << WELL))) != 0)) {
				{
				{
				setState(538);
				symbole();
				}
				}
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(544);
			match(EOF);
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

	public static class SymboleContext extends ParserRuleContext {
		public TerminalNode ROBOT() { return getToken(PlayPlusParser.ROBOT, 0); }
		public TerminalNode TREASURE() { return getToken(PlayPlusParser.TREASURE, 0); }
		public TerminalNode GRASS() { return getToken(PlayPlusParser.GRASS, 0); }
		public TerminalNode PALM() { return getToken(PlayPlusParser.PALM, 0); }
		public TerminalNode BRIDGE() { return getToken(PlayPlusParser.BRIDGE, 0); }
		public TerminalNode BUSH() { return getToken(PlayPlusParser.BUSH, 0); }
		public TerminalNode BAREL() { return getToken(PlayPlusParser.BAREL, 0); }
		public TerminalNode WELL() { return getToken(PlayPlusParser.WELL, 0); }
		public TerminalNode EMPTY() { return getToken(PlayPlusParser.EMPTY, 0); }
		public TerminalNode SKULL() { return getToken(PlayPlusParser.SKULL, 0); }
		public SymboleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterSymbole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitSymbole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitSymbole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymboleContext symbole() throws RecognitionException {
		SymboleContext _localctx = new SymboleContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_symbole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BAREL) | (1L << BRIDGE) | (1L << BUSH) | (1L << EMPTY) | (1L << GRASS) | (1L << PALM) | (1L << ROBOT) | (1L << SKULL) | (1L << TREASURE) | (1L << WELL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return exprG_sempred((ExprGContext)_localctx, predIndex);
		case 11:
			return exprBool_sempred((ExprBoolContext)_localctx, predIndex);
		case 12:
			return exprEnt_sempred((ExprEntContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprG_sempred(ExprGContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exprBool_sempred(ExprBoolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean exprEnt_sempred(ExprEntContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3N\u0227\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\5\29\n\2\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3"+
		"\3\3\7\3C\n\3\f\3\16\3F\13\3\3\3\7\3I\n\3\f\3\16\3L\13\3\3\3\7\3O\n\3"+
		"\f\3\16\3R\13\3\3\3\7\3U\n\3\f\3\16\3X\13\3\5\3Z\n\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3h\n\3\r\3\16\3i\5\3l\n\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7|\n\7\3\7\3\7\3\7\3\7"+
		"\5\7\u0082\n\7\3\7\3\7\6\7\u0086\n\7\r\7\16\7\u0087\3\7\3\7\3\b\3\b\3"+
		"\b\7\b\u008f\n\b\f\b\16\b\u0092\13\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u009a"+
		"\n\b\f\b\16\b\u009d\13\b\3\b\3\b\7\b\u00a1\n\b\f\b\16\b\u00a4\13\b\3\t"+
		"\6\t\u00a7\n\t\r\t\16\t\u00a8\3\t\6\t\u00ac\n\t\r\t\16\t\u00ad\3\t\6\t"+
		"\u00b1\n\t\r\t\16\t\u00b2\3\t\6\t\u00b6\n\t\r\t\16\t\u00b7\5\t\u00ba\n"+
		"\t\3\t\6\t\u00bd\n\t\r\t\16\t\u00be\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u00c7"+
		"\n\n\r\n\16\n\u00c8\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u00d3\n\n\r\n"+
		"\16\n\u00d4\3\n\3\n\6\n\u00d9\n\n\r\n\16\n\u00da\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\6\n\u00e5\n\n\r\n\16\n\u00e6\3\n\3\n\3\n\3\n\6\n\u00ed\n\n"+
		"\r\n\16\n\u00ee\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\6\n\u00ff\n\n\r\n\16\n\u0100\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\n\u0112\n\n\f\n\16\n\u0115\13\n\5\n\u0117\n\n"+
		"\3\n\3\n\5\n\u011b\n\n\3\13\3\13\3\13\5\13\u0120\n\13\3\13\3\13\3\13\3"+
		"\13\5\13\u0126\n\13\3\13\3\13\3\13\3\13\5\13\u012c\n\13\3\13\3\13\3\13"+
		"\3\13\5\13\u0132\n\13\3\13\3\13\3\13\3\13\5\13\u0138\n\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u0141\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u014a\n\f\3\f\3\f\5\f\u014e\n\f\3\f\3\f\3\f\7\f\u0153\n\f\f\f\16\f"+
		"\u0156\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0175\n"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u017d\n\r\f\r\16\r\u0180\13\r\3\16\3\16"+
		"\3\16\3\16\5\16\u0186\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0197\n\16\f\16\16\16\u019a\13\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u01a6\n\17\f\17"+
		"\16\17\u01a9\13\17\5\17\u01ab\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u01b2"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u01bb\n\20\f\20\16\20\u01be"+
		"\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\7\22\u01cd\n\22\f\22\16\22\u01d0\13\22\3\22\3\22\3\22\3\22\5\22\u01d6"+
		"\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01e2\n\23"+
		"\3\24\3\24\3\24\3\24\7\24\u01e8\n\24\f\24\16\24\u01eb\13\24\5\24\u01ed"+
		"\n\24\3\24\3\24\3\25\3\25\3\25\5\25\u01f4\n\25\3\26\3\26\3\27\3\27\3\27"+
		"\6\27\u01fb\n\27\r\27\16\27\u01fc\3\27\3\27\6\27\u0201\n\27\r\27\16\27"+
		"\u0202\5\27\u0205\n\27\3\27\3\27\3\30\3\30\3\30\3\30\6\30\u020d\n\30\r"+
		"\30\16\30\u020e\3\30\3\30\3\30\3\31\3\31\5\31\u0216\n\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\7\32\u021e\n\32\f\32\16\32\u0221\13\32\3\32\3\32\3\33"+
		"\3\33\3\33\2\5\26\30\32\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\2\5\5\2\n\n\r\r\35\35\b\2\7\799CCFFHIMN\n\2\t\t\13\f\23"+
		"\23\32\32$$()++\61\61\2\u0271\28\3\2\2\2\4:\3\2\2\2\6o\3\2\2\2\br\3\2"+
		"\2\2\nt\3\2\2\2\fv\3\2\2\2\16\u008b\3\2\2\2\20\u00b9\3\2\2\2\22\u011a"+
		"\3\2\2\2\24\u0140\3\2\2\2\26\u014d\3\2\2\2\30\u0174\3\2\2\2\32\u0185\3"+
		"\2\2\2\34\u01b1\3\2\2\2\36\u01b3\3\2\2\2 \u01c1\3\2\2\2\"\u01c9\3\2\2"+
		"\2$\u01e1\3\2\2\2&\u01e3\3\2\2\2(\u01f3\3\2\2\2*\u01f5\3\2\2\2,\u01f7"+
		"\3\2\2\2.\u0208\3\2\2\2\60\u0213\3\2\2\2\62\u0219\3\2\2\2\64\u0224\3\2"+
		"\2\2\669\5\4\3\2\679\5\62\32\28\66\3\2\2\28\67\3\2\2\29\3\3\2\2\2:Y\5"+
		"\6\4\2;=\5\"\22\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?Z\3\2\2\2@>"+
		"\3\2\2\2AC\5\f\7\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EZ\3\2\2\2F"+
		"D\3\2\2\2GI\5 \21\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KZ\3\2\2\2"+
		"LJ\3\2\2\2MO\5\36\20\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QZ\3\2\2"+
		"\2RP\3\2\2\2SU\5(\25\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WZ\3\2\2"+
		"\2XV\3\2\2\2Y>\3\2\2\2YD\3\2\2\2YJ\3\2\2\2YP\3\2\2\2YV\3\2\2\2YZ\3\2\2"+
		"\2Z[\3\2\2\2[\\\7 \2\2\\]\7\6\2\2]^\7\31\2\2^_\7A\2\2_`\7B\2\2`a\7F\2"+
		"\2ab\7\60\2\2bk\7\20\2\2cd\7\17\2\2de\7A\2\2el\7B\2\2fh\5\22\n\2gf\3\2"+
		"\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2kc\3\2\2\2kg\3\2\2\2lm\3\2"+
		"\2\2mn\7\24\2\2n\5\3\2\2\2op\7\34\2\2pq\5\b\5\2q\7\3\2\2\2rs\5\n\6\2s"+
		"\t\3\2\2\2tu\7L\2\2u\13\3\2\2\2vw\7J\2\2wx\7\6\2\2xy\7\31\2\2y{\7A\2\2"+
		"z|\5\16\b\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7B\2\2~\u0081\7F\2\2\177\u0082"+
		"\5*\26\2\u0080\u0082\7\60\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0085\7\20\2\2\u0084\u0086\5\20\t\2\u0085\u0084\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008a\7\24\2\2\u008a\r\3\2\2\2\u008b\u0090\7J\2\2"+
		"\u008c\u008d\7G\2\2\u008d\u008f\7J\2\2\u008e\u008c\3\2\2\2\u008f\u0092"+
		"\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0093\u0094\7\6\2\2\u0094\u00a2\5(\25\2\u0095\u0096\7G"+
		"\2\2\u0096\u009b\7J\2\2\u0097\u0098\7G\2\2\u0098\u009a\7J\2\2\u0099\u0097"+
		"\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\6\2\2\u009f\u00a1\5("+
		"\25\2\u00a0\u0095\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\17\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\5\"\22"+
		"\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00ba\3\2\2\2\u00aa\u00ac\5\36\20\2\u00ab\u00aa\3\2\2\2"+
		"\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ba"+
		"\3\2\2\2\u00af\u00b1\5 \21\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00ba\3\2\2\2\u00b4\u00b6\5."+
		"\30\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00a6\3\2\2\2\u00b9\u00ab\3\2"+
		"\2\2\u00b9\u00b0\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bc\3\2\2\2\u00bb\u00bd\5\22\n\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3"+
		"\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\21\3\2\2\2\u00c0"+
		"\u00c1\7\33\2\2\u00c1\u00c2\7A\2\2\u00c2\u00c3\5\34\17\2\u00c3\u00c4\7"+
		"B\2\2\u00c4\u00c6\7*\2\2\u00c5\u00c7\5\22\n\2\u00c6\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cb\7\24\2\2\u00cb\u011b\3\2\2\2\u00cc\u00cd\7\33\2\2\u00cd"+
		"\u00ce\7A\2\2\u00ce\u00cf\5\34\17\2\u00cf\u00d0\7B\2\2\u00d0\u00d2\7*"+
		"\2\2\u00d1\u00d3\5\22\n\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\7\22"+
		"\2\2\u00d7\u00d9\5\22\n\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\7\24"+
		"\2\2\u00dd\u011b\3\2\2\2\u00de\u00df\7\62\2\2\u00df\u00e0\7A\2\2\u00e0"+
		"\u00e1\5\34\17\2\u00e1\u00e2\7B\2\2\u00e2\u00e4\7\20\2\2\u00e3\u00e5\5"+
		"\22\n\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7\24\2\2\u00e9\u011b\3"+
		"\2\2\2\u00ea\u00ec\7&\2\2\u00eb\u00ed\5\22\n\2\u00ec\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f1\7/\2\2\u00f1\u00f2\7A\2\2\u00f2\u00f3\5\34\17\2\u00f3"+
		"\u00f4\7B\2\2\u00f4\u00f5\7\24\2\2\u00f5\u011b\3\2\2\2\u00f6\u00f7\7\30"+
		"\2\2\u00f7\u00f8\7J\2\2\u00f8\u00f9\7\63\2\2\u00f9\u00fa\5\34\17\2\u00fa"+
		"\u00fb\7,\2\2\u00fb\u00fc\5\34\17\2\u00fc\u00fe\7\20\2\2\u00fd\u00ff\5"+
		"\22\n\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\7\24\2\2\u0103\u011b\3"+
		"\2\2\2\u0104\u0105\5\26\f\2\u0105\u0106\7\63\2\2\u0106\u0107\5\34\17\2"+
		"\u0107\u0108\7I\2\2\u0108\u011b\3\2\2\2\u0109\u010a\5\24\13\2\u010a\u010b"+
		"\7I\2\2\u010b\u011b\3\2\2\2\u010c\u010d\7J\2\2\u010d\u0116\7A\2\2\u010e"+
		"\u0113\7J\2\2\u010f\u0110\7G\2\2\u0110\u0112\7J\2\2\u0111\u010f\3\2\2"+
		"\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0117"+
		"\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u010e\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0119\7B\2\2\u0119\u011b\7I\2\2\u011a\u00c0\3\2\2"+
		"\2\u011a\u00cc\3\2\2\2\u011a\u00de\3\2\2\2\u011a\u00ea\3\2\2\2\u011a\u00f6"+
		"\3\2\2\2\u011a\u0104\3\2\2\2\u011a\u0109\3\2\2\2\u011a\u010c\3\2\2\2\u011b"+
		"\23\3\2\2\2\u011c\u011d\7\37\2\2\u011d\u011f\7A\2\2\u011e\u0120\5\32\16"+
		"\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0141"+
		"\7B\2\2\u0122\u0123\7\'\2\2\u0123\u0125\7A\2\2\u0124\u0126\5\32\16\2\u0125"+
		"\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0141\7B"+
		"\2\2\u0128\u0129\7.\2\2\u0129\u012b\7A\2\2\u012a\u012c\5\32\16\2\u012b"+
		"\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0141\7B"+
		"\2\2\u012e\u012f\7\21\2\2\u012f\u0131\7A\2\2\u0130\u0132\5\32\16\2\u0131"+
		"\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0141\7B"+
		"\2\2\u0134\u0135\7\36\2\2\u0135\u0137\7A\2\2\u0136\u0138\5\32\16\2\u0137"+
		"\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0141\7B"+
		"\2\2\u013a\u013b\7\27\2\2\u013b\u013c\7A\2\2\u013c\u0141\7B\2\2\u013d"+
		"\u013e\7\17\2\2\u013e\u013f\7A\2\2\u013f\u0141\7B\2\2\u0140\u011c\3\2"+
		"\2\2\u0140\u0122\3\2\2\2\u0140\u0128\3\2\2\2\u0140\u012e\3\2\2\2\u0140"+
		"\u0134\3\2\2\2\u0140\u013a\3\2\2\2\u0140\u013d\3\2\2\2\u0141\25\3\2\2"+
		"\2\u0142\u0143\b\f\1\2\u0143\u014e\7J\2\2\u0144\u0145\7J\2\2\u0145\u0146"+
		"\7?\2\2\u0146\u0149\5\34\17\2\u0147\u0148\7G\2\2\u0148\u014a\5\34\17\2"+
		"\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c"+
		"\7@\2\2\u014c\u014e\3\2\2\2\u014d\u0142\3\2\2\2\u014d\u0144\3\2\2\2\u014e"+
		"\u0154\3\2\2\2\u014f\u0150\f\3\2\2\u0150\u0151\7H\2\2\u0151\u0153\7J\2"+
		"\2\u0152\u014f\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155"+
		"\3\2\2\2\u0155\27\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\b\r\1\2\u0158"+
		"\u0175\7-\2\2\u0159\u0175\7\26\2\2\u015a\u015b\7\"\2\2\u015b\u0175\5\30"+
		"\r\t\u015c\u015d\5\32\16\2\u015d\u015e\78\2\2\u015e\u015f\5\32\16\2\u015f"+
		"\u0175\3\2\2\2\u0160\u0161\5\32\16\2\u0161\u0162\7\67\2\2\u0162\u0163"+
		"\5\32\16\2\u0163\u0175\3\2\2\2\u0164\u0165\5\32\16\2\u0165\u0166\7>\2"+
		"\2\u0166\u0167\5\32\16\2\u0167\u0175\3\2\2\2\u0168\u0169\5\32\16\2\u0169"+
		"\u016a\7\64\2\2\u016a\u016b\5\32\16\2\u016b\u0175\3\2\2\2\u016c\u016d"+
		"\5\32\16\2\u016d\u016e\7\65\2\2\u016e\u016f\5\32\16\2\u016f\u0175\3\2"+
		"\2\2\u0170\u0171\5\32\16\2\u0171\u0172\7\66\2\2\u0172\u0173\5\32\16\2"+
		"\u0173\u0175\3\2\2\2\u0174\u0157\3\2\2\2\u0174\u0159\3\2\2\2\u0174\u015a"+
		"\3\2\2\2\u0174\u015c\3\2\2\2\u0174\u0160\3\2\2\2\u0174\u0164\3\2\2\2\u0174"+
		"\u0168\3\2\2\2\u0174\u016c\3\2\2\2\u0174\u0170\3\2\2\2\u0175\u017e\3\2"+
		"\2\2\u0176\u0177\f\13\2\2\u0177\u0178\7\b\2\2\u0178\u017d\5\30\r\f\u0179"+
		"\u017a\f\n\2\2\u017a\u017b\7#\2\2\u017b\u017d\5\30\r\13\u017c\u0176\3"+
		"\2\2\2\u017c\u0179\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\31\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0182\b\16\1"+
		"\2\u0182\u0186\7K\2\2\u0183\u0184\7<\2\2\u0184\u0186\5\32\16\3\u0185\u0181"+
		"\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0198\3\2\2\2\u0187\u0188\f\b\2\2\u0188"+
		"\u0189\7=\2\2\u0189\u0197\5\32\16\t\u018a\u018b\f\7\2\2\u018b\u018c\7"+
		"<\2\2\u018c\u0197\5\32\16\b\u018d\u018e\f\6\2\2\u018e\u018f\7:\2\2\u018f"+
		"\u0197\5\32\16\7\u0190\u0191\f\5\2\2\u0191\u0192\79\2\2\u0192\u0197\5"+
		"\32\16\6\u0193\u0194\f\4\2\2\u0194\u0195\7;\2\2\u0195\u0197\5\32\16\5"+
		"\u0196\u0187\3\2\2\2\u0196\u018a\3\2\2\2\u0196\u018d\3\2\2\2\u0196\u0190"+
		"\3\2\2\2\u0196\u0193\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\33\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u01b2\5\32\16"+
		"\2\u019c\u01b2\7L\2\2\u019d\u01b2\5\60\31\2\u019e\u01b2\5\30\r\2\u019f"+
		"\u01b2\5\26\f\2\u01a0\u01a1\7J\2\2\u01a1\u01aa\7A\2\2\u01a2\u01a7\5\34"+
		"\17\2\u01a3\u01a4\7G\2\2\u01a4\u01a6\5\34\17\2\u01a5\u01a3\3\2\2\2\u01a6"+
		"\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01ab\3\2"+
		"\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01a2\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01ac\u01b2\7B\2\2\u01ad\u01ae\7A\2\2\u01ae\u01af\5\34"+
		"\17\2\u01af\u01b0\7B\2\2\u01b0\u01b2\3\2\2\2\u01b1\u019b\3\2\2\2\u01b1"+
		"\u019c\3\2\2\2\u01b1\u019d\3\2\2\2\u01b1\u019e\3\2\2\2\u01b1\u019f\3\2"+
		"\2\2\u01b1\u01a0\3\2\2\2\u01b1\u01ad\3\2\2\2\u01b2\35\3\2\2\2\u01b3\u01b4"+
		"\7\25\2\2\u01b4\u01b5\7J\2\2\u01b5\u01b6\7>\2\2\u01b6\u01b7\7A\2\2\u01b7"+
		"\u01bc\7J\2\2\u01b8\u01b9\7G\2\2\u01b9\u01bb\7J\2\2\u01ba\u01b8\3\2\2"+
		"\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf"+
		"\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c0\7I\2\2\u01c0\37\3\2\2\2\u01c1"+
		"\u01c2\7\16\2\2\u01c2\u01c3\7J\2\2\u01c3\u01c4\7\6\2\2\u01c4\u01c5\5("+
		"\25\2\u01c5\u01c6\7>\2\2\u01c6\u01c7\5$\23\2\u01c7\u01c8\7I\2\2\u01c8"+
		"!\3\2\2\2\u01c9\u01ce\7J\2\2\u01ca\u01cb\7G\2\2\u01cb\u01cd\7J\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2"+
		"\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d2\7\6\2\2\u01d2"+
		"\u01d5\5(\25\2\u01d3\u01d4\7>\2\2\u01d4\u01d6\5$\23\2\u01d5\u01d3\3\2"+
		"\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\7I\2\2\u01d8"+
		"#\3\2\2\2\u01d9\u01e2\7-\2\2\u01da\u01e2\7\26\2\2\u01db\u01e2\7K\2\2\u01dc"+
		"\u01e2\7L\2\2\u01dd\u01e2\5\60\31\2\u01de\u01e2\5\32\16\2\u01df\u01e2"+
		"\5\30\r\2\u01e0\u01e2\5&\24\2\u01e1\u01d9\3\2\2\2\u01e1\u01da\3\2\2\2"+
		"\u01e1\u01db\3\2\2\2\u01e1\u01dc\3\2\2\2\u01e1\u01dd\3\2\2\2\u01e1\u01de"+
		"\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e0\3\2\2\2\u01e2%\3\2\2\2\u01e3"+
		"\u01ec\7A\2\2\u01e4\u01e9\5$\23\2\u01e5\u01e6\7G\2\2\u01e6\u01e8\5$\23"+
		"\2\u01e7\u01e5\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea"+
		"\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01e4\3\2\2\2\u01ec"+
		"\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\7B\2\2\u01ef\'\3\2\2\2"+
		"\u01f0\u01f4\5*\26\2\u01f1\u01f4\5,\27\2\u01f2\u01f4\5.\30\2\u01f3\u01f0"+
		"\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f2\3\2\2\2\u01f4)\3\2\2\2\u01f5"+
		"\u01f6\t\2\2\2\u01f6+\3\2\2\2\u01f7\u01f8\5*\26\2\u01f8\u01fa\7?\2\2\u01f9"+
		"\u01fb\7M\2\2\u01fa\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fa\3\2"+
		"\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0204\3\2\2\2\u01fe\u0200\7G\2\2\u01ff"+
		"\u0201\7M\2\2\u0200\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0200\3\2"+
		"\2\2\u0202\u0203\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u01fe\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\7@\2\2\u0207-\3\2\2\2\u0208"+
		"\u0209\7J\2\2\u0209\u020a\7\6\2\2\u020a\u020c\7%\2\2\u020b\u020d\5\"\22"+
		"\2\u020c\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f"+
		"\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\7\24\2\2\u0211\u0212\7I\2\2\u0212"+
		"/\3\2\2\2\u0213\u0215\7E\2\2\u0214\u0216\t\3\2\2\u0215\u0214\3\2\2\2\u0215"+
		"\u0216\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0218\7E\2\2\u0218\61\3\2\2\2"+
		"\u0219\u021a\7!\2\2\u021a\u021b\7K\2\2\u021b\u021f\7K\2\2\u021c\u021e"+
		"\5\64\33\2\u021d\u021c\3\2\2\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2"+
		"\u021f\u0220\3\2\2\2\u0220\u0222\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u0223"+
		"\7\2\2\3\u0223\63\3\2\2\2\u0224\u0225\t\4\2\2\u0225\65\3\2\2\2?8>DJPV"+
		"Yik{\u0081\u0087\u0090\u009b\u00a2\u00a8\u00ad\u00b2\u00b7\u00b9\u00be"+
		"\u00c8\u00d4\u00da\u00e6\u00ee\u0100\u0113\u0116\u011a\u011f\u0125\u012b"+
		"\u0131\u0137\u0140\u0149\u014d\u0154\u0174\u017c\u017e\u0185\u0196\u0198"+
		"\u01a7\u01aa\u01b1\u01bc\u01ce\u01d5\u01e1\u01e9\u01ec\u01f3\u01fc\u0202"+
		"\u0204\u020e\u0215\u021f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}