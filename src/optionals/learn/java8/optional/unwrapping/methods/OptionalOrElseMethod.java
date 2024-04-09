package src.optionals.learn.java8.optional.unwrapping.methods;

import java.util.Optional;

public class OptionalOrElseMethod {

    public static void main(String[] args) {

        Optional<String> stringOptional = Optional.ofNullable(null);
        String string = stringOptional.orElse("unknown");
        System.out.println("If Value is Present :: " + string);

        stringOptional = Optional.ofNullable("Present");
        string = stringOptional.orElse("unknown");
        System.out.println("If Value is Present :: " + string);
    }
}
