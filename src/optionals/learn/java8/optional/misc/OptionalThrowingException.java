package optionals.learn.java8.optional.misc;

import java.util.Optional;

public class OptionalThrowingException {

    public static void main(String[] args) {

        Optional<String> emptyOptional = Optional.empty();
        emptyOptional.get();
    }
}
