package src.lamda.consumer_interface.pack;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class PrimitiveSpecializationConsumer {

    public static void main(String[] args) {
        integerConsumerObject();
        intConsumerPrimitiveSpecialization();
    }

    private static void integerConsumerObject() {
        int intNumber = 10;
        Consumer<Integer> intConsumer = n -> System.out.println(n % 2 == 0);
        intConsumer.accept(intNumber);
    }

    public static void intConsumerPrimitiveSpecialization() {
        int intNumber = 10;
        IntConsumer intConsumer = n -> System.out.println(n % 2 == 0);
        intConsumer.accept(intNumber);
    }

    public static void longConsumerPrimitiveSpecialization() {
        long longNumber = 11;
        LongConsumer longConsumer = n -> System.out.println(n % 2 == 0);
        longConsumer.accept(longNumber);
    }

    public static void doubleConsumerPrimitiveSpecialization() {
        double doubleNumber = 11.12;
        DoubleConsumer doubleConsumer = n -> System.out.println(n % 2 == 0);
        doubleConsumer.accept(doubleNumber);
    }
}
