package src.streams.streams_creation.pack;

import java.util.stream.Stream;

public class CreatingInfiniteStreamUsingIterateMethod {

    public static void main(String[] args) {
        System.out.println("Iterate method with initial value & increment ");
        Stream.iterate(1, i -> i + 1).limit(5)
                .forEach(i -> System.out.print(i + ", "));

        System.out.println("\n\nIterate method with initial value & increment ");
        Stream.iterate(1, i -> i <= 5, i -> i + 1)
                .forEach(i -> System.out.print(i + ", "));
    }
}
