// Generated from Tag.g4 by ANTLR 4.7
package br.ifrn.tads.tag;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TagParser}.
 */
public interface TagListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TagParser#pagina}.
	 * @param ctx the parse tree
	 */
	void enterPagina(TagParser.PaginaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TagParser#pagina}.
	 * @param ctx the parse tree
	 */
	void exitPagina(TagParser.PaginaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paragrafo}
	 * labeled alternative in {@link TagParser#elemento}.
	 * @param ctx the parse tree
	 */
	void enterParagrafo(TagParser.ParagrafoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paragrafo}
	 * labeled alternative in {@link TagParser#elemento}.
	 * @param ctx the parse tree
	 */
	void exitParagrafo(TagParser.ParagrafoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code imagem}
	 * labeled alternative in {@link TagParser#elemento}.
	 * @param ctx the parse tree
	 */
	void enterImagem(TagParser.ImagemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code imagem}
	 * labeled alternative in {@link TagParser#elemento}.
	 * @param ctx the parse tree
	 */
	void exitImagem(TagParser.ImagemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code titulo}
	 * labeled alternative in {@link TagParser#elemento}.
	 * @param ctx the parse tree
	 */
	void enterTitulo(TagParser.TituloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code titulo}
	 * labeled alternative in {@link TagParser#elemento}.
	 * @param ctx the parse tree
	 */
	void exitTitulo(TagParser.TituloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quebra}
	 * labeled alternative in {@link TagParser#elemento}.
	 * @param ctx the parse tree
	 */
	void enterQuebra(TagParser.QuebraContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quebra}
	 * labeled alternative in {@link TagParser#elemento}.
	 * @param ctx the parse tree
	 */
	void exitQuebra(TagParser.QuebraContext ctx);
	/**
	 * Enter a parse tree produced by the {@code link}
	 * labeled alternative in {@link TagParser#elemento}.
	 * @param ctx the parse tree
	 */
	void enterLink(TagParser.LinkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code link}
	 * labeled alternative in {@link TagParser#elemento}.
	 * @param ctx the parse tree
	 */
	void exitLink(TagParser.LinkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repete}
	 * labeled alternative in {@link TagParser#elemento}.
	 * @param ctx the parse tree
	 */
	void enterRepete(TagParser.RepeteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repete}
	 * labeled alternative in {@link TagParser#elemento}.
	 * @param ctx the parse tree
	 */
	void exitRepete(TagParser.RepeteContext ctx);
}