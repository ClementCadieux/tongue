

package JMalt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * main
 */
public class Malt {

    public static void main(String[] args) {
        if (args.length > 1) {
            System.out.println("Usage: jMalt [script]");
            System.exit(64); 
          } else if (args.length == 1) {
            runFile(args[0]);
          } else {
            runPrompt();
          }
    }

    private static void runFile(String path) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(path));
        run(new String(bytes, Charset.defaultCharset()));
    }
}