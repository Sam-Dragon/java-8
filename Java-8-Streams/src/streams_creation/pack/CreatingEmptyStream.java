package streams_creation.pack;

import java.util.stream.Stream;

public class CreatingEmptyStream {

    public static void main(String[] args) {
        Stream<Integer> intStream = Stream.empty();
        System.out.println(intStream);
    }
}
