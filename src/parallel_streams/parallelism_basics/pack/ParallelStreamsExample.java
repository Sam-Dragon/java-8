package src.parallel_streams.parallelism_basics.pack;

import java.util.stream.Stream;

public class ParallelStreamsExample {

    public static void main(String[] args) {
        Integer sum = Stream.iterate(1, i -> i + 1).limit(10000).parallel().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
