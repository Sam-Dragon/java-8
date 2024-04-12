package src.lamda.consumer_interface.pack;

import java.util.function.BiConsumer;
import java.util.function.ObjIntConsumer;

public class PrimitiveSpecializationBiConsumerExample {

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> integerBiConsumer = (i, j) -> System.out.println(i + " + " + j + " = " + (i + j));
        BiConsumer<Integer, Integer> integerAnotherBiConsumer = (i, j) -> System.out
                .println(i + " + " + j + " = " + (i + j));

        Integer number10 = 10;
        Integer number100 = 100;

        System.out.println("\nACCEPT");
        accept(integerBiConsumer, number10, number100);

        System.out.println("\nANDTHEN");
        andThen(integerBiConsumer, integerAnotherBiConsumer, number10, number100);
    }

    public static void accept(BiConsumer<Integer, Integer> integerConsumer, Integer number10, Integer number100) {
        integerConsumer.accept(number10, number100);
    }

    private static void andThen(BiConsumer<Integer, Integer> integerBiConsumer,
                                BiConsumer<Integer, Integer> integerAnotherBiConsumer, Integer number10, Integer number100) {
        integerBiConsumer.accept(number10, number100);
        integerAnotherBiConsumer.accept(number10, number100);

        ObjIntConsumer<Integer> condition = (ObjIntConsumer<Integer>) integerBiConsumer
                .andThen(integerAnotherBiConsumer);
        condition.accept(number10, number100);
    }
}
