package br.ufma.compiladores.token;
import java.util.List;

public enum TokenType {
    // symbols
    LPAREN, RPAREN,
    LBRACE, RBRACE,
    LBRACKET, RBRACKET,

    COMMA, SEMICOLON, DOT,

    PLUS, MINUS, ASTERISK, SLASH,

    AND, OR, NOT,

    LT, GT, EQ,

    // Literals.
    NUMBER,
    STRING,
    IDENT,

    // keywords
    WHILE, CLASS, CONSTRUCTOR, FUNCTION,
    METHOD, FIELD, STATIC, VAR, INT,
    CHAR, BOOLEAN, VOID, TRUE, FALSE,
    NULL, THIS, LET, DO, IF, ELSE, RETURN,

    ILLEGAL, EOF, PRINT, value;

    public static boolean isSymbol(char c) {
        String symbols = "{}()[].,;+-*/&|<>=~";
        return symbols.indexOf(c) > -1;
    }

    public static boolean isKeyword(TokenType type) {
        List<TokenType> keywords = List.of(
                WHILE, CLASS, CONSTRUCTOR, FUNCTION,
                METHOD, FIELD, STATIC, VAR, INT,
                CHAR, BOOLEAN, VOID, TRUE, FALSE,
                NULL, THIS, LET, DO, IF, ELSE, RETURN,
                CONSTRUCTOR);
        return keywords.contains(type);
    }

}
