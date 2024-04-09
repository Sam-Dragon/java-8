package src.optionals.learn.java8.optional.create.methods;

import java.util.Optional;

public class OptionalOf {

    public static void main(String[] args) {

        Optional<String> string = Optional.of("Rahul");
        System.out.println(string.get());

        Optional<Integer> nullPointerException = Optional.of(null);
        System.out.println(nullPointerException);
    }
}
