package perfromance_check.pack;

import java.util.function.Function;
import java.util.stream.Stream;

public class ParellelPerformanceFails {

    public static void main(String[] args) {
        System.out.println("Parallel Sum done in : "
                + ParellelPerformanceFails.measurePerformance(ParellelPerformanceFails::parallelSum, 10_000_000) + " msecs");

        System.out.println("Sequencial Sum done in : "
                + ParellelPerformanceFails.measurePerformance(ParellelPerformanceFails::sequencialSum, 10_000_000) + " msecs");

        System.out.println("Iterative Sum done in : "
                + ParellelPerformanceFails.measurePerformance(ParellelPerformanceFails::iterativeSum, 10_000_000) + " msecs");
    }
    
    public static long measurePerformance(Function<Long, Long> function, long number) {
        Long fastest = Long.MAX_VALUE;

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
        return Stream.iterate(1, i -> i + 1).limit(n).parallel().reduce(0, Integer::sum);
    }

    public static long sequencialSum(long n) {
        return Stream.iterate(1, i -> i + 1).limit(n).reduce(0, Integer::sum);
    }

    public static long iterativeSum(long n) {
        long sum = 0L;
        for (long i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
