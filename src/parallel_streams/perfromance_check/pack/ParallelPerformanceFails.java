package parallel_streams.perfromance_check.pack;

import java.util.function.Function;
import java.util.stream.Stream;

public class ParallelPerformanceFails {

    public static void main(String[] args) {
        int number;
//        number = 10_000_000;
        number = 10;

        System.out.println("Parallel Sum done in : "
                + ParallelPerformanceFails.measurePerformance(ParallelPerformanceFails::parallelSum, number)
                + " milli secs");

        System.out.println("Sequential Sum done in : "
                + ParallelPerformanceFails.measurePerformance(ParallelPerformanceFails::sequentialSum, number)
                + " milli secs");

        System.out.println("Iterative Sum done in : "
                + ParallelPerformanceFails.measurePerformance(ParallelPerformanceFails::iterativeSum, number)
                + " milli secs");
    }

    public static long measurePerformance(Function<Long, Long> function, long number) {
        long fastest = Long.MAX_VALUE;

        for (int i = 0; i < 2; i++) {
            long startTime = System.nanoTime();
            long sum = function.apply(number);
            long duration = (System.nanoTime() - startTime) / 1_000_000;
            System.out.println("Result :: " + sum);
            if (duration < fastest)
                fastest = duration;
        }

        return fastest;
    }

    public static long parallelSum(long n) {
        return Stream.iterate(1, i -> i + 1)
                .limit(n)
                .parallel()
                .peek(e -> System.out.println("Parallel Sum Thread :: " + Thread.currentThread()
                        .getName()))
                .reduce(0, Integer::sum);
    }

    public static long sequentialSum(long n) {
        return Stream.iterate(1, i -> i + 1)
                .limit(n)
                .peek(e -> System.out.println("Sequential Sum Thread :: " + Thread.currentThread()
                        .getName()))
                .reduce(0, Integer::sum);
    }

    public static long iterativeSum(long n) {
        System.out.println("Iterative Sum Thread :: " + Thread.currentThread()
                .getName());
        long sum = 0L;
        for (long i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
