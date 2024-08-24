package threads.creation;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableInterfaceImpl {

    public static void main(String[] args) {
        System.out.println(">> [Start] main() Thread :: " + Thread.currentThread()
            .getName());

        CallableClass callable = new CallableClass();
        usingCallableClass(callable);

        System.out.println();
        System.out.println(">> [End] main() Thread :: " + Thread.currentThread()
            .getName());
    }

    private static void usingCallableClass(CallableClass callable) {
        FutureTask<String> futureTask = new FutureTask<>(callable);
        System.out.println(">> [Start] Thread creation using callable interface & thread class. Thread :: " + Thread.currentThread()
            .getName());
        Thread threadClass = new Thread(futureTask);
        threadClass.start();

        try {
            System.out.println("Output :: " + futureTask.get() + ". Thread :: " + Thread.currentThread()
                .getName());
        } catch (Exception e) {
            futureTask.cancel(true);
        }

        System.out.println(">> [End] Thread creation using callable interface & thread class. Thread :: " + Thread.currentThread()
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