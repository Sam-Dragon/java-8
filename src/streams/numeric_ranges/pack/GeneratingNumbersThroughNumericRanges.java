package streams.numeric_ranges.pack;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class GeneratingNumbersThroughNumericRanges {

    public static void main(String[] args) {

        System.out.println("Int Stream Range method");
        IntStream.range(1, 5)
                .forEach(System.out::print);

        System.out.println("\n\nInt Stream RangeClosed method");
        IntStream.rangeClosed(1, 5)
                .forEach(System.out::print);

        System.out.println("\n\nLong Stream Range method");
        LongStream.range(1, 5)
                .forEach(System.out::print);

        System.out.println("\n\nLong Stream RangeClosed method");
        LongStream.rangeClosed(1, 5)
                .forEach(System.out::print);

//        System.out.println("\n\nDouble Stream Range method");
//        DoubleStream.range(1, 5).forEach(System.out::print);
//
//        System.out.println("\n\nDouble Stream RangeClosed method");
//        DoubleStream.rangeClosed(1, 5).forEach(System.out::print);
    }
}
