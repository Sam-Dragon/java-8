package threads.creation;

public class RunnableInterfaceImpl {

    public static void main(String[] args) {
        System.out.println(">> [Start] main() Thread :: " + Thread.currentThread()
            .getName());
        System.out.println();

        RunnableClass runnable = new RunnableClass();
        // Normal Way
        usingRunnableClass(runnable);

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