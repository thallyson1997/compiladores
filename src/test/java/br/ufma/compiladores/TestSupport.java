package src.test.java.br.ufma.compiladores;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class TestSupport {

    public static String fromFile(String path) throws IOException {
        return Files.readString(Paths.get("src/test/resources/"+ path));
    }

    
}