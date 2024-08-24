package optionals.learn.java8.optional.unwrapping.methods;

import java.util.Optional;

public class OptionalGetMethod {

    public static void main(String[] args) {

        Optional<String> stringOptional = Optional.of("String");
        System.out.println("If Value is Present :: " + stringOptional.get());

        stringOptional = Optional.empty();
        System.out.println("If Value is Present :: " + stringOptional.get());
    }
}
