package src.optionals.learn.java8.optional.chaining.methods;

import java.util.Optional;

public class FilterOnOptional {

    public static void main(String[] args) {

        Optional<String> stringOptional = Optional.ofNullable("Cambridge");
        String result = stringOptional.filter(e -> "Cambridge".equals(e))
                .get();
        System.out.println("Result :: " + result);

        result = stringOptional.filter(e -> "Premid".equals(e))
                .get();
        System.out.println("Result :: " + result);
    }
}
