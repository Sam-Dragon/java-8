package threads.creation;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceImpl {

    public static void main(String[] args) {
        RunnableClass runnable = new RunnableClass();
        usingExecutorService(runnable);

        CallableClass callable = new CallableClass();
        usingExecutorService(callable);
    }

    private static void usingExecutorService(RunnableClass runnable) {
        System.out.println(">> [Start] usingExecutorService() Thread creation using runnable interface & executor service. Thread :: " + Thread.currentThread()
            .getName());
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<?> result = service.submit(runnable);

        try {
            System.out.println(">> [Result] usingExecutorService() Thread :: " + result.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        System.out.println(">> [End] usingExecutorService() Thread creation using runnable interface & executor service. Thread :: " + Thread.currentThread()
            .getName());

        service.shutdown();
    }

    private static void usingExecutorService(CallableClass callable) {
        System.out.println(">> [Start] usingExecutorService() Thread creation using callable interface & executor service. Thread :: " + Thread.currentThread()
            .getName());
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<String> result = service.submit(callable);

        try {
            System.out.println(">> [Result] :: " + result.get() + ". Thread :: " + Thread.currentThread()
                .getName());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        System.out.println(">> [End] usingExecutorService() Thread creation using callable interface & executor service. Thread :: " + Thread.currentThread()
            .getName());

        service.shutdown();
    }
}
