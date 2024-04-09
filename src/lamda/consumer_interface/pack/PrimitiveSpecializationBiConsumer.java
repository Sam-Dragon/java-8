package src.lamda.consumer_interface.pack;

import java.util.function.BiConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

public class PrimitiveSpecializationBiConsumer {

    public static void main(String[] args) {
        integerBiConsumerObject();
        intBiConsumerPrimitiveSpecialization();
    }

    private static void integerBiConsumerObject() {
        int intNumber = 10;
        BiConsumer<Integer, Integer> intBiConsumer = (m, n) -> System.out.println(n % 2 == 0);
        intBiConsumer.accept(intNumber, intNumber);
    }

    public static void intBiConsumerPrimitiveSpecialization() {
        int intNumber = 10;
        ObjIntConsumer intBiConsumer = (m, n) -> System.out.println(n % 2 == 0);
        intBiConsumer.accept(intNumber, intNumber);
    }

    public static void longBiConsumerPrimitiveSpecialization() {
        long longNumber = 11;
        ObjLongConsumer longBiConsumer = (m, n) -> System.out.println(n % 2 == 0);
        longBiConsumer.accept(longNumber, longNumber);
    }

    public static void doubleBiConsumerPrimitiveSpecialization() {
        double doubleNumber = 11.12;
        ObjDoubleConsumer doubleBiConsumer = (m, n) -> System.out.println(n % 2 == 0);
        doubleBiConsumer.accept(doubleNumber, doubleNumber);
    }
}
