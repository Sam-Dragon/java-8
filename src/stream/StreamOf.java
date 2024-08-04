package stream;

import java.util.stream.Stream;

public class StreamOf {

    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5)
            .filter(i -> i % 2 == 0)
            .forEach(System.out::println);
    }
}
