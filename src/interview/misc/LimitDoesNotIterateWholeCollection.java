package interview.misc;

import java.util.Arrays;

public class LimitDoesNotIterateWholeCollection {

    public static void main(String[] args) {
        var list = Arrays.asList("Ram", "Sam", "Tom", "Tim");

        list.stream()
                .limit(2)
                .map(n -> {
                    System.out.println("Inner Name :: " + n);
                    return n;
                })
                .forEach(System.out::println);

    }
}
