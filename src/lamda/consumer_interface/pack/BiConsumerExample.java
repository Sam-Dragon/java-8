package src.lamda.consumer_interface.pack;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {
        // BiBiConsumer<void, void> BiConsumer = () -> System.out.print("Hello World");

        BiConsumer<String, String> stringBiConsumer = (s, s2) -> System.out.println(s + " + " + s2 + " = " + s + s2);
        BiConsumer<String, String> stringAnotherBiConsumer = (s, s2) -> System.out.println(s + " --> " + s2);
        BiConsumer<Integer, Integer> integerBiConsumer = (i, j) -> System.out.println(i + " + " + j + " = " + (i + j));

        String string = "Rahul";
        String string2 = "Sheth";
        Integer integer = 10;
        Integer integer2 = 10;

        System.out.println("\nACCEPT");
        accept(stringBiConsumer, integerBiConsumer, string, string2, integer, integer2);

        System.out.println("\nAND");
        andThen(stringBiConsumer, integerBiConsumer, stringAnotherBiConsumer, string, string2, integer, integer2);
    }

    public static void accept(BiConsumer<String, String> stringConsumer, BiConsumer<Integer, Integer> integerConsumer,
            String string, String string2, Integer integer, Integer integer2) {
        stringConsumer.accept(string, string2);
        integerConsumer.accept(integer, integer2);
    }

    private static void andThen(BiConsumer<String, String> stringConsumer, BiConsumer<Integer, Integer> integerConsumer,
            BiConsumer<String, String> stringAnotherConsumer, String string, String string2, Integer integer,
            Integer integer2) {
        stringConsumer.accept(string, string2);
        stringAnotherConsumer.accept(string, string2);

        // Similar datatype predicate can be combined
        // stringConsumer.and(integerConsumer);
        BiConsumer<String, String> condition = stringConsumer.andThen(stringAnotherConsumer);
        condition.accept(string, string2);
    }
}
