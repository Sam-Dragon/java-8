package src.patterns.pattern.execute.around;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NormalReadingOfFile {

    public static void main(String[] args) {
        try {
            processFile();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void processFile() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("Example.txt"))) {
            String line = br.readLine();
            System.out.println(line);
        }
    }
}
