package misc.pack;

import java.util.stream.Stream;

public class FibonacciSeries {

    public static void main(String[] args) {

        Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(5)
                .forEach(t -> System.out.println(t[0] + " + " + t[1] + " = " + (t[0] + t[1])));

        System.out.println("Fibonacci Series");
        Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(5)
                .forEach(t -> System.out.print(t[0] + ", "));

        System.out.println("\n\nFibonacci Sum");
        Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(5)
                .forEach(t -> System.out.println(t[0] + t[1]));
    }

}
