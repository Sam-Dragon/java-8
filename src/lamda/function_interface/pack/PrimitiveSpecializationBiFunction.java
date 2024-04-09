package src.lamda.function_interface.pack;

import java.util.function.BiFunction;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToLongBiFunction;

public class PrimitiveSpecializationBiFunction {

    public static void main(String[] args) {
        integerBiFunctionObject();
        intBiFunctionPrimitiveSpecialization();
    }

    private static void integerBiFunctionObject() {
        int intNumber = 10, intAnotherNumber = 20;
        BiFunction<Integer, Integer, Integer> intBiFunction = (m, n) -> n == 0 ? m : m / n;
        System.out.println(
                "Is Number = [" + intNumber + "] Non Zero ? " + (intBiFunction.apply(intNumber, intAnotherNumber)));
    }

    public static void intBiFunctionPrimitiveSpecialization() {
        int intNumber = 10, intAnotherNumber = 20;
        ToIntBiFunction<Integer, Integer> intBiFunction = (m, n) -> n == 0 ? m : m / n;
        System.out.println("Is Number = [" + intNumber + "] Non Zero ? "
                + (intBiFunction.applyAsInt(intAnotherNumber, intNumber)));
    }

    public static void longBiFunctionPrimitiveSpecialization() {
        long longNumber = 11, longAnotherNumber = 20;
        ToLongBiFunction<Long, Long> longBiFunction = (m, n) -> n == 0 ? m : m / n;
        System.out.println("Is Number = [" + longNumber + "] Non Zero ? "
                + (longBiFunction.applyAsLong(longNumber, longAnotherNumber)));
    }

    public static void doubleBiFunctionPrimitiveSpecialization() {
        double doubleNumber = 11.12, doubleAnotherNumber = 12.12;
        ToDoubleBiFunction<Double, Double> doubleBiFunction = (m, n) -> n == 0 ? m : m / n;
        System.out.println("Is Number = [" + doubleNumber + "] Non Zero ? "
                + (doubleBiFunction.applyAsDouble(doubleAnotherNumber, doubleNumber)));
    }
}
