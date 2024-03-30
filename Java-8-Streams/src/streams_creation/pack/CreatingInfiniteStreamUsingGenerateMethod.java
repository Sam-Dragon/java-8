package streams_creation.pack;

import java.util.stream.Stream;

public class CreatingInfiniteStreamUsingGenerateMethod {

    public static void main(String[] args) {
        Stream.generate(Math::random).limit(5)
                .forEach(i -> System.out.println(i + ", "));
    }
}
