package collector_interface.pack;

import java.util.stream.Collectors;

public class PerformanceTest {

    public static void main(String[] args) {
        Long fastest = Long.MAX_VALUE;

        long startTime = System.nanoTime();
        model.pack.DishObj.menu().stream().collect(Collectors.toList());
        long duration = (System.nanoTime() - startTime) / 1_000_000;
        if (duration < fastest)
            fastest = duration;

        System.out.println("Utility Execution Time :: " + fastest);

        startTime = System.nanoTime();
        model.pack.DishObj.menu().stream().collect(new CustomCollectorToList<>());
        duration = (System.nanoTime() - startTime) / 1_000_000;
        if (duration < fastest)
            fastest = duration;

        System.out.println("Custom Execution Time :: " + fastest);
    }

}
