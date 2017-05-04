package br.ifrn.tads.tag;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MeuListener extends TagBaseListener {

    private final ParseTreeProperty<String> values = new ParseTreeProperty<>();

    String remover(String s) {
        return s.substring(1, s.length() - 1);
    }
    String html1 = "";
    
    public String html() {
        return html1;
    }

    @Override
    public void exitPagina(TagParser.PaginaContext ctx) {
        String pagina = "<html><body>\n";
        for (ParseTree filho : ctx.children) {
            pagina = pagina + "  " + values.get(filho) + "\n";
        }
        pagina = pagina + "</body></html>";
        html1 = pagina;
//        System.out.println(pagina);
    }

    @Override
    public void exitParagrafo(TagParser.ParagrafoContext ctx) {
        String bloco = "<p>" + remover(ctx.Bloco().getText()) + "</p>";
     //   System.out.println("Achei um paragrafo :" + bloco);
        values.put(ctx, bloco);
    }

    @Override
    public void exitImagem(TagParser.ImagemContext ctx) {
    }

    @Override
    public void exitTitulo(TagParser.TituloContext ctx) {
        String titulo = "<h1>" + remover(ctx.Texto().getText()) + "</h1>";
       // System.out.println("Achei um titulo :" + titulo);
        values.put(ctx, titulo);
    }

    @Override
    public void exitQuebra(TagParser.QuebraContext ctx) {
    }

    @Override
    public void exitLink(TagParser.LinkContext ctx) {
    }

    @Override
    public void exitRepete(TagParser.RepeteContext ctx) {
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
    }

    @Override
    public void visitTerminal(TerminalNode node) {
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
    }
}
