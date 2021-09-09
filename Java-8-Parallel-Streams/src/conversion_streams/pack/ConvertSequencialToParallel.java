package conversion_streams.pack;

import java.util.stream.Stream;

public class ConvertSequencialToParallel {

    public static void main(String[] args) {
        Integer sum = Stream.iterate(1, i -> i + 1).limit(10000).parallel().reduce(0, Integer::sum);
        System.out.println(sum);

        // Sequencial Stream
        sum = Stream.iterate(1, i -> i + 1).limit(10000).parallel().sequential().reduce(0, Integer::sum);
        System.out.println(sum);

    }
}
