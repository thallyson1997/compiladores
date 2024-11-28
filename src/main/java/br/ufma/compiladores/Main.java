package src.main.java.br.ufma.compiladores;
import src.main.java.br.ufma.compiladores.token.Token;
import src.main.java.br.ufma.compiladores.token.TokenType;

public class Main {
    public static void main(String[] args) {
        String input = """
                // é um comentario 10
                45 "hello variavel + while < , if
                /*
                comentario em bloco
                */
                42 ola
                """;

        Scanner scan = new Scanner(input.getBytes());

        System.out.println("<tokens>");
        for (Token tk = scan.nextToken(); tk.type != TokenType.EOF; tk = scan.nextToken()) {
            System.out.println(tk);
        }
        System.out.println("</tokens>");
    }
}