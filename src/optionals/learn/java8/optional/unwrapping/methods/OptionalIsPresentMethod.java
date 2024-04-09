package src.optionals.learn.java8.optional.unwrapping.methods;

import java.util.Optional;

public class OptionalIsPresentMethod {

    public static void main(String[] args) {

        Optional<String> stringOptional = Optional.ofNullable("Present");
        String string = stringOptional.isPresent() ? stringOptional.get() : "Unknown";
        System.out.println("Result :: " + string);

        stringOptional = Optional.empty();
        string = stringOptional.isPresent() ? stringOptional.get() : "Unknown";
        System.out.println("Result :: " + string);
    }
}
