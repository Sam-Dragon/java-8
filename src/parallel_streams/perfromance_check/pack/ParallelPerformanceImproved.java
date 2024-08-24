package parallel_streams.perfromance_check.pack;

import java.util.function.Function;
import java.util.stream.LongStream;

public class ParallelPerformanceImproved {

    public static void main(String[] args) {
        System.out.println("Parallel Sum done in : "
                + ParallelPerformanceImproved.measurePerformance(ParallelPerformanceImproved::parallelSum, 10_000_000)
                + " milli secs");

        System.out.println("Sequential Sum done in : "
                + ParallelPerformanceImproved.measurePerformance(ParallelPerformanceImproved::sequentialSum, 10_000_000)
                + " milli secs");

        System.out.println("Iterative Sum done in : "
                + ParallelPerformanceImproved.measurePerformance(ParallelPerformanceImproved::iterativeSum, 10_000_000)
                + " milli secs");
    }

    public static long measurePerformance(Function<Long, Long> function, long number) {
        long fastest = Long.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
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
        return LongStream.rangeClosed(1, n)
                .parallel()
                .reduce(0, Long::sum);
    }

    public static long sequentialSum(long n) {
        return LongStream.rangeClosed(1, n)
                .reduce(0, Long::sum);
    }

    public static long iterativeSum(long n) {
        long sum = 0L;
        for (long i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
