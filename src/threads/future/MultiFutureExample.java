package threads.future;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiFutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        MultiFutureExample example = new MultiFutureExample();

        for (int i = 0; i < 3; i++) {
            System.out.println();

            Future<Double> future = service.submit(example::method);
            double first = future.get();
            System.out.println("first :: " + first);

            Future<Integer> random = service.submit(example::random);
            int second = random.get();
            System.out.println("second :: " + second);

            System.out.println(first + second);
        }
        service.shutdown();
    }

    public Double method() {
        System.out.println("method initiated");
        sleep(2000);
        return Math.random();
    }

    public Integer random() {
        System.out.println("random initiated");
        sleep(2000);
        return new Random().nextInt(10);
    }

    public void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
