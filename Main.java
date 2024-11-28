public class Main {
    public static void main(String[] args) throws Exception {
        String input = """
            if (x < 0) {
            // prints the sign
            let sign = "negative";
            }
            """;
        Scanner scan = new Scanner (input.getBytes());
        for (Token tk = scan.nextToken(); tk.type != TokenType.EOF; tk = scan.nextToken()) {
            System.out.println(tk);
        }
    }
}