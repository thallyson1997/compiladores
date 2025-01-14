package br.ufma.compiladores.token;
public class Token {
    public final TokenType type;
    public final String lexeme;
    final int line;

    public Token(TokenType type, String lexeme, int line) {
        this.type = type;
        this.lexeme = lexeme;
        this.line = line;
    }

    public String toString() {
        String categoria = type.toString().toLowerCase();
        String valor = lexeme;

        if (TokenType.isSymbol(lexeme.charAt(0))) {
            categoria = "symbol";
            if (valor.equals(">")) {
                valor = "&gt;";
            } else if (valor.equals("<")) {
                valor = "&lt;";
            } else if (valor.equals("\"")) {
                valor = "&quot;";
            } else if (valor.equals("&")) {
                valor = "&amp;";
            }
        } else if (categoria.equals("number")) {
            categoria = "integerConstant";
        } else if (categoria.equals("ident")) {
            categoria = "identifier";
        } else if (categoria.equals("string")) {
            categoria = "stringConstant";
        } else {
            categoria = "keyword";
        }

        return "<" + categoria + "> " + valor + " </" + categoria + ">";
    }

    public String value() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'value'");
    }
}
