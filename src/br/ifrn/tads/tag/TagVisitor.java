// Generated from Tag.g4 by ANTLR 4.7
package br.ifrn.tads.tag;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TagParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TagVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TagParser#pagina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPagina(TagParser.PaginaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paragrafo}
	 * labeled alternative in {@link TagParser#elemento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagrafo(TagParser.ParagrafoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imagem}
	 * labeled alternative in {@link TagParser#elemento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImagem(TagParser.ImagemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code titulo}
	 * labeled alternative in {@link TagParser#elemento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitulo(TagParser.TituloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quebra}
	 * labeled alternative in {@link TagParser#elemento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuebra(TagParser.QuebraContext ctx);
	/**
	 * Visit a parse tree produced by the {@code link}
	 * labeled alternative in {@link TagParser#elemento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink(TagParser.LinkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repete}
	 * labeled alternative in {@link TagParser#elemento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepete(TagParser.RepeteContext ctx);
}