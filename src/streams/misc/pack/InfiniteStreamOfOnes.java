package src.streams.misc.pack;

import java.util.stream.IntStream;

public class InfiniteStreamOfOnes {

    public static void main(String[] args) {
        IntStream.generate(() -> 1).limit(5).forEach(i -> System.out.print(i + ", "));
    }
}
