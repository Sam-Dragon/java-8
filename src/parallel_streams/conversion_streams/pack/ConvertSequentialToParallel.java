package src.parallel_streams.conversion_streams.pack;

import java.util.stream.Stream;

public class ConvertSequentialToParallel {
    /*
     * which ever function is called last, that kind of stream with execute
     */
    public static void main(String[] args) {
        // parallel stream
        Integer sum = Stream.iterate(1, i -> i + 1)
                .sequential()
                .limit(10000)
                .parallel()
                .reduce(0, Integer::sum);
        System.out.println(sum);

        // Sequential Stream
        sum = Stream.iterate(1, i -> i + 1)
                .limit(10000)
                .parallel()
                .sequential()
                .reduce(0, Integer::sum);
        System.out.println(sum);

    }
}
