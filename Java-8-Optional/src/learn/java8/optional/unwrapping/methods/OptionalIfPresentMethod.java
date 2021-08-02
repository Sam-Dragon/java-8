package learn.java8.optional.unwrapping.methods;

import java.util.Optional;

public class OptionalIfPresentMethod {

    public static void main(String[] args) {

        Optional<String> stringOptional = Optional.ofNullable("Present");
        stringOptional.ifPresent(string -> System.out.println("If Value is Present :: " + string));
        
        stringOptional = Optional.ofNullable(null);
        stringOptional.ifPresent(string -> System.out.println("If Value is Present :: " + string));
    }
}
