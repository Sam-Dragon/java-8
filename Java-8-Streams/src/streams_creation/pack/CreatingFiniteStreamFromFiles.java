package streams_creation.pack;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CreatingFiniteStreamFromFiles {

    public static void main(String[] args) {

        try (Stream<String> lines = Files.lines(Paths.get("Project File.txt"), Charset.defaultCharset())) {
            long uniqueWords = lines/* .flatMap(line -> Arrays.stream(line.split(" "))) */.distinct().count();
            System.out.println("Unique Words = " + uniqueWords);

            // lines.flatMap(line -> Arrays.stream(line.split("
            // "))).distinct().forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
