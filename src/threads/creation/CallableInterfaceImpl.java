package threads.creation;

import java.util.concurrent.*;

public class CallableInterfaceImpl {

    public static void main(String[] args) {
        System.out.println(">> [Start] main() Thread :: " + Thread.currentThread()
                .getName());

        // Using Executor Service
        CallableClass callable = new CallableClass();
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<String> result = service.submit(callable);

        try {
            System.out.println(">> [Result] main() Thread :: " + result.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
        System.out.println(">> [End] main() Thread :: " + Thread.currentThread()
                .getName());
    }
}

class CallableClass implements Callable<String> {
    @Override
    public String call() {
        System.out.println();
        System.out.println(">> [Start] run() Thread :: " + Thread.currentThread()
                .getName());
        System.out.println(">> [End] run() Thread :: " + Thread.currentThread()
                .getName());
        System.out.println();

        return "Using 'Callable Interface' for thread creation..!!";
    }
}