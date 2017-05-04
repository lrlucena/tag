package br.ifrn.tads.tag;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Principal {
    private static ParseTree parse(String pagina) {
        final ANTLRInputStream input = new ANTLRInputStream(pagina);
        final TagLexer lexer = new TagLexer(input);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final TagParser parser = new TagParser(tokens);
        return parser.pagina();
    }

    public static void main(String[] args) {
        String pagina = "titulo \"Titulo da pagina\" paragrafo { Algum texto }"+
    "paragrafo {fdfdfdsfsd}";
        final ParseTree tree = parse(pagina);
        final ParseTreeWalker walker = new ParseTreeWalker();
        final MeuListener listener = new MeuListener();
        walker.walk(listener, tree);
        System.out.println(listener.html());
      //  Programa p1 = listener.getPrograma();

    }

}

/*


    public static void main(String... args) throws IOException {

        String programa = "x:=10; y:=leia ; c:= x + y; "

                + "se 30<=c entao escreva c senao exiba \"menor\"";

        final ParseTree tree = parse(programa);

        final ParseTreeWalker walker = new ParseTreeWalker();

        final MeuListener listener = new MeuListener();

        walker.walk(listener, tree);

        Programa p1 = listener.getPrograma();

        // O parser devolve um objeto 'Programa' semelhante ao programa a seguir:

        Programa p2 = new Programa(asList(

                new Atribuicao("x", new Inteiro(10)),                       // x := 10

                new Atribuicao("y", leia),                                  // y := leia

                new Atribuicao("c", new ExpSoma(new Id("x"), new Id("y"))), // c := x + y

                new Se(new ExpMenorIgual(new Inteiro(30), new Id("c")),     // se 30 <= c entao

                        new Escreva(new Id("c")),                           // escreva c

                        new Exiba("menor"))                                 // senao exiba "menor"

                ));

        p1.execute();

        p2.execute();

    }

}
 */
