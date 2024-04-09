package src.patterns.pattern.execute.around;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExecuteAroundPatternOfReadingAFile {

    public static void main(String[] args) {
        try {
            BufferedReaderProcessor<BufferedReader, String> function = br -> br.readLine();
            String line = processFile(function);
            System.out.println(line);

            function = br -> br.readLine() + " >> " + br.readLine();
            line = processFile(function);
            System.out.println(line);

            function = br -> br.readLine() + " >> " + br.readLine() + " << " + br.readLine();
            line = processFile(function);
            System.out.println(line);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static String processFile(BufferedReaderProcessor<BufferedReader, String> functionForReading)
            throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("Example.txt"))) {
            return functionForReading.process(br);
        }
    }
}

@FunctionalInterface
interface BufferedReaderProcessor<T, R> {
    R process(T t) throws IOException;
}