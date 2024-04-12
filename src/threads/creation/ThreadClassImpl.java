package src.threads.creation;

public class ThreadClassImpl {

    public static void main(String[] args) {
        System.out.println(">> [Start] main() Thread :: " + Thread.currentThread()
                .getName());

        ThreadClass threadClass = new ThreadClass();
        threadClass.start();

        System.out.println(">> [End] main() Thread :: " + Thread.currentThread()
                .getName());
    }
}

class ThreadClass extends Thread {
    @Override
    public void run() {
        System.out.println();
        System.out.println(">> [Start] run() Thread :: " + Thread.currentThread()
                .getName());

        System.out.println("Using 'Thread Class' for thread creation ");

        System.out.println(">> [End] run() Thread :: " + Thread.currentThread()
                .getName());
        System.out.println();
    }
}