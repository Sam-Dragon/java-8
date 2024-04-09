package src.lamda.function_interface.pack;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExample {

    public static void main(String[] args) {
        // BiBiFunction<void, void> BiFunction = () -> System.out.print("Hello World");

        BiFunction<String, String, String> stringBiFunction = (s, s2) -> s + s2;
        Function<String, String> stringAnotherFunction = s -> s + " --> ";
        BiFunction<Integer, Integer, Integer> integerBiFunction = (i, j) -> i + j;

        String string = "Rahul";
        String string2 = "Sheth";
        Integer integer = 10;
        Integer integer2 = 10;

        System.out.println("\nAPPLY");
        apply(stringBiFunction, integerBiFunction, string, string2, integer, integer2);

        System.out.println("\nANDTHEN");
        andThen(stringBiFunction, integerBiFunction, stringAnotherFunction, string, string2, integer, integer2);
    }

    public static void apply(BiFunction<String, String, String> stringFunction,
            BiFunction<Integer, Integer, Integer> integerFunction, String string, String string2, Integer integer,
            Integer integer2) {
        String stringResult = stringFunction.apply(string, string2);
        Integer integerResult = integerFunction.apply(integer, integer2);
        System.out.println(stringResult + " >> " + integerResult);
    }

    private static void andThen(BiFunction<String, String, String> stringFunction,
            BiFunction<Integer, Integer, Integer> integerFunction, Function<String, String> stringAnotherFunction,
            String string, String string2, Integer integer, Integer integer2) {
        String stringResult = stringFunction.apply(string, string2);
        String stringAnotherResult = stringAnotherFunction.apply(string);
        System.out.println(stringResult + " >> " + stringAnotherResult);

        // Similar datatype predicate can be combined
        // stringFunction.and(integerFunction);
        BiFunction<String, String, String> condition = stringFunction.andThen(stringAnotherFunction);
        String stringFinalResult = condition.apply(string, string2);
        System.out.println(stringFinalResult);
    }
}
