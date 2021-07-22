package streams_creation.pack;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingFiniteStreamUsingOfMethod {

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        System.out.println("Stream.of(Integer) :: " + integerStream);

        System.out.println("\nCalling Terminal Operation");
        System.out.println(integerStream.collect(Collectors.toList()));

        System.out.println("\nStream of(Array)");
        Integer[] arr = new Integer[] { 1, 2, 3 };
        Stream<Integer> intStream = Stream.of(arr);
        intStream.forEach(i -> System.out.print(i + ", "));
    }
}
