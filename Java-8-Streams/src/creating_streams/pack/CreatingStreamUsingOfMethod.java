package creating_streams.pack;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingStreamUsingOfMethod {

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        System.out.println("Stream Output");
        System.out.println(integerStream);

        System.out.println("\nCalling Terminal Operation");
        System.out.println(integerStream.collect(Collectors.toList()));
    }
}
