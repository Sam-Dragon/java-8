package src.optionals.learn.java8.optional.unwrapping.methods;

import java.util.Optional;

public class OptionalOrElseThrowMethod {

    public static void main(String[] args) {

        Optional<String> stringOptional = Optional.ofNullable("Present");
        String string = stringOptional.orElseThrow(() -> new RuntimeException("Throw Exception"));
        System.out.println("If Value is Present :: " + string);

        stringOptional = Optional.ofNullable(null);
        string = stringOptional.orElseThrow(() -> new RuntimeException("Throw Exception"));
        System.out.println("If Value is Present :: " + string);

    }
}
