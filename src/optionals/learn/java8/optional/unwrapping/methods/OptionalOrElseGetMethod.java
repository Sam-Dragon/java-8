package optionals.learn.java8.optional.unwrapping.methods;

import java.util.Optional;

public class OptionalOrElseGetMethod {

    public static void main(String[] args) {

        Optional<String> stringOptional = Optional.ofNullable(null);
        String string = stringOptional.orElseGet(() -> "unknown");
        System.out.println("If Value is Present :: " + string);

        stringOptional = Optional.ofNullable("Present");
        string = stringOptional.orElseGet(() -> "unknown");
        System.out.println("If Value is Present :: " + string);
    }
}
