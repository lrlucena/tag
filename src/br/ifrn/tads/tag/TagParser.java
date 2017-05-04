// Generated from Tag.g4 by ANTLR 4.7
package br.ifrn.tads.tag;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TagParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, Bloco=8, ID=9, 
		INT=10, Texto=11, WS=12;
	public static final int
		RULE_pagina = 0, RULE_elemento = 1;
	public static final String[] ruleNames = {
		"pagina", "elemento"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'paragrafo'", "'imagem'", "'titulo'", "'[quebra]'", "'link'", "'->'", 
		"'repete'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "Bloco", "ID", "INT", 
		"Texto", "WS"
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

	@Override
	public String getGrammarFileName() { return "Tag.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TagParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PaginaContext extends ParserRuleContext {
		public List<ElementoContext> elemento() {
			return getRuleContexts(ElementoContext.class);
		}
		public ElementoContext elemento(int i) {
			return getRuleContext(ElementoContext.class,i);
		}
		public PaginaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pagina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TagListener ) ((TagListener)listener).enterPagina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TagListener ) ((TagListener)listener).exitPagina(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TagVisitor ) return ((TagVisitor<? extends T>)visitor).visitPagina(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PaginaContext pagina() throws RecognitionException {
		PaginaContext _localctx = new PaginaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pagina);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6))) != 0)) {
				{
				{
				setState(4);
				elemento();
				}
				}
				setState(9);
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

	public static class ElementoContext extends ParserRuleContext {
		public ElementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemento; }
	 
		public ElementoContext() { }
		public void copyFrom(ElementoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParagrafoContext extends ElementoContext {
		public TerminalNode Bloco() { return getToken(TagParser.Bloco, 0); }
		public ParagrafoContext(ElementoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TagListener ) ((TagListener)listener).enterParagrafo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TagListener ) ((TagListener)listener).exitParagrafo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TagVisitor ) return ((TagVisitor<? extends T>)visitor).visitParagrafo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuebraContext extends ElementoContext {
		public QuebraContext(ElementoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TagListener ) ((TagListener)listener).enterQuebra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TagListener ) ((TagListener)listener).exitQuebra(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TagVisitor ) return ((TagVisitor<? extends T>)visitor).visitQuebra(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepeteContext extends ElementoContext {
		public TerminalNode INT() { return getToken(TagParser.INT, 0); }
		public ElementoContext elemento() {
			return getRuleContext(ElementoContext.class,0);
		}
		public RepeteContext(ElementoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TagListener ) ((TagListener)listener).enterRepete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TagListener ) ((TagListener)listener).exitRepete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TagVisitor ) return ((TagVisitor<? extends T>)visitor).visitRepete(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImagemContext extends ElementoContext {
		public TerminalNode Texto() { return getToken(TagParser.Texto, 0); }
		public ImagemContext(ElementoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TagListener ) ((TagListener)listener).enterImagem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TagListener ) ((TagListener)listener).exitImagem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TagVisitor ) return ((TagVisitor<? extends T>)visitor).visitImagem(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LinkContext extends ElementoContext {
		public List<TerminalNode> Texto() { return getTokens(TagParser.Texto); }
		public TerminalNode Texto(int i) {
			return getToken(TagParser.Texto, i);
		}
		public LinkContext(ElementoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TagListener ) ((TagListener)listener).enterLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TagListener ) ((TagListener)listener).exitLink(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TagVisitor ) return ((TagVisitor<? extends T>)visitor).visitLink(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TituloContext extends ElementoContext {
		public TerminalNode Texto() { return getToken(TagParser.Texto, 0); }
		public TituloContext(ElementoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TagListener ) ((TagListener)listener).enterTitulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TagListener ) ((TagListener)listener).exitTitulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TagVisitor ) return ((TagVisitor<? extends T>)visitor).visitTitulo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementoContext elemento() throws RecognitionException {
		ElementoContext _localctx = new ElementoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_elemento);
		try {
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new ParagrafoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				match(T__0);
				setState(11);
				match(Bloco);
				}
				break;
			case T__1:
				_localctx = new ImagemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(12);
				match(T__1);
				setState(13);
				match(Texto);
				}
				break;
			case T__2:
				_localctx = new TituloContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(14);
				match(T__2);
				setState(15);
				match(Texto);
				}
				break;
			case T__3:
				_localctx = new QuebraContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(16);
				match(T__3);
				}
				break;
			case T__4:
				_localctx = new LinkContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(17);
				match(T__4);
				setState(18);
				match(Texto);
				setState(19);
				match(T__5);
				setState(20);
				match(Texto);
				}
				break;
			case T__6:
				_localctx = new RepeteContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(21);
				match(T__6);
				setState(22);
				match(INT);
				setState(23);
				elemento();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16\35\4\2\t\2\4\3"+
		"\t\3\3\2\7\2\b\n\2\f\2\16\2\13\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3\33\n\3\3\3\2\2\4\2\4\2\2\2 \2\t\3\2\2\2\4\32"+
		"\3\2\2\2\6\b\5\4\3\2\7\6\3\2\2\2\b\13\3\2\2\2\t\7\3\2\2\2\t\n\3\2\2\2"+
		"\n\3\3\2\2\2\13\t\3\2\2\2\f\r\7\3\2\2\r\33\7\n\2\2\16\17\7\4\2\2\17\33"+
		"\7\r\2\2\20\21\7\5\2\2\21\33\7\r\2\2\22\33\7\6\2\2\23\24\7\7\2\2\24\25"+
		"\7\r\2\2\25\26\7\b\2\2\26\33\7\r\2\2\27\30\7\t\2\2\30\31\7\f\2\2\31\33"+
		"\5\4\3\2\32\f\3\2\2\2\32\16\3\2\2\2\32\20\3\2\2\2\32\22\3\2\2\2\32\23"+
		"\3\2\2\2\32\27\3\2\2\2\33\5\3\2\2\2\4\t\32";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}