package collectors.collectors_partitioning.pack;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PartitioningPrimeAndNonPrimeNumbers {

    public static void main(String[] args) {
        System.out.println(partitionPrimes(20));
    }

    public static Map<Boolean, List<Integer>> partitionPrimes(int n) {
        return IntStream.rangeClosed(2, n)
                .boxed()
                .collect(Collectors.partitioningBy(PartitioningPrimeAndNonPrimeNumbers::isPrime));
    }

    public static boolean isPrime(int n) {
        int root = (int) Math.sqrt(n);
        return IntStream.rangeClosed(2, root)
                .noneMatch(i -> n % i == 0);
    }
}
