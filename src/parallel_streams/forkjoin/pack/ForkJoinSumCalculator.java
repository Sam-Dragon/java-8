package parallel_streams.forkjoin.pack;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

public class ForkJoinSumCalculator extends RecursiveTask<Long> {

    private final long[] numbers;
    private final int start;
    private final int end;
    public static final long THRESHOLD = 10_000;

    private static final ForkJoinPool pool = new ForkJoinPool();

    private static final Set<String> threads = new TreeSet<>();

    public ForkJoinSumCalculator(long[] numbers) {
        this(numbers, 0, numbers.length);
    }


    public ForkJoinSumCalculator(long[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        int length = end - start;
        threads.add(Thread.currentThread()
                .getName());

//      System.out.println("Length :: " + length);

        if (length <= THRESHOLD)
            return computeSequentially();

        ForkJoinSumCalculator leftTask = new ForkJoinSumCalculator(numbers, start, start + length / 2);
        leftTask.fork();
        ForkJoinSumCalculator rightTask = new ForkJoinSumCalculator(numbers, start + length / 2, end);
        long rightResult = rightTask.compute();
        long leftResult = leftTask.join();

        return leftResult + rightResult;
    }

    private Long computeSequentially() {
        return LongStream.range(start, end)
                .map(i -> numbers[Math.toIntExact(i)])
                .reduce(0L, Long::sum);
    }

    public static long forkJoinSum(long n) {
        long[] numbers = LongStream.rangeClosed(1, n)
                .toArray();
        ForkJoinSumCalculator task = new ForkJoinSumCalculator(numbers);
        System.out.println("Support Pool Threads for Parallelism :: " + ForkJoinPool.commonPool());
        return pool.invoke(task);
    }

    public static void main(String[] args) {
        System.out.println("Active Processors :: " + Runtime.getRuntime()
                .availableProcessors());

        long start = System.nanoTime();
        var result = ForkJoinSumCalculator.forkJoinSum(10_000_000L);
        long duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println("Time take to complete :: " + duration + " in milli secs");
        System.out.println("Total :: " + result);

        System.out.println("ForkJoin CommonPool Thread Names :: " + threads);

    }
}
