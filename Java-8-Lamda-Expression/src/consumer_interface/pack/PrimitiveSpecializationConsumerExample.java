package consumer_interface.pack;

import java.util.function.IntConsumer;

public class PrimitiveSpecializationConsumerExample {

    public static void main(String[] args) {
        IntConsumer intConsumer = n -> System.out.println(n + n);
        IntConsumer intAnotherConsumer = n -> System.out.println(n * n);

        int number = 10;
        System.out.println("ADDTHEN");
        andThen(intConsumer, intAnotherConsumer, number);
    }

    private static void andThen(IntConsumer intConsumer, IntConsumer intAnotherConsumer, int number) {
        IntConsumer combinedConsumer = intConsumer.andThen(intAnotherConsumer);
        combinedConsumer.accept(number);
    }

}
