package src.threads.creation;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableInterfaceImpl {

    public static void main(String[] args) {
        System.out.println(">> [Start] main() Thread :: " + Thread.currentThread()
                .getName());
        System.out.println();

        RunnableClass runnable = new RunnableClass();

        // Normal Way
        usingRunnableClass(runnable);

        //Using Executor Service
        usingExecutorService(runnable);

        System.out.println();
        System.out.println(">> [End] main() Thread :: " + Thread.currentThread()
                .getName());
    }

    private static void usingRunnableClass(RunnableClass runnable) {
        System.out.println(">> [Start] Thread creation using runnable interface & thread class. Thread :: " + Thread.currentThread()
                .getName());
        Thread threadClass = new Thread(runnable);
        threadClass.start();
        System.out.println(">> [End] Thread creation using runnable interface & thread class. Thread :: " + Thread.currentThread()
                .getName());
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
    }
}

class RunnableClass implements Runnable {
    @Override
    public void run() {
        System.out.println();
        System.out.println(">> [Start] run() Thread :: " + Thread.currentThread()
                .getName());

        System.out.println("Using 'Runnable Interface' for thread creation ");

        System.out.println(">> [End] run() Thread :: " + Thread.currentThread()
                .getName());
        System.out.println();
    }
}