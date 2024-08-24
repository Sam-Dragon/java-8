package threads.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);

        System.out.println();
        for (int i = 0; i < 5; i++) {
            Future<Double> future = service.submit(Math::random);
            System.out.println(Thread.currentThread()
                .getName() + " - " + future.get());
        }
        service.shutdown();
    }
}
