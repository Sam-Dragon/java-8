package lamda.pack;

public class LamdaExample {

    public static void main(String[] args) {

        int number = 100;

        Runnable runnable = () -> System.out.println(number);
        runnable.run();

        // number = 100000;
    }

}
