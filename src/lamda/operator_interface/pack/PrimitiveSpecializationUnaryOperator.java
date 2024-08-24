package lamda.operator_interface.pack;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class PrimitiveSpecializationUnaryOperator {

    public static void main(String[] args) {
        integerUnaryOperatorObject();
        intUnaryOperatorPrimitiveSpecialization();
    }

    private static void integerUnaryOperatorObject() {
        int intNumber = 10;
        UnaryOperator<Integer> intUnaryOperator = n -> n / 2;
        System.out.println("Is Number = [" + intNumber + "] even ? " + (intUnaryOperator.apply(intNumber)));
    }

    public static void intUnaryOperatorPrimitiveSpecialization() {
        int intNumber = 10;
        IntUnaryOperator intUnaryOperator = n -> n / 2;
        System.out.println("Is Number = [" + intNumber + "] even ? " + (intUnaryOperator.applyAsInt(intNumber)));
    }

    public static void longUnaryOperatorPrimitiveSpecialization() {
        long longNumber = 11;
        LongUnaryOperator longUnaryOperator = n -> n / 2;
        System.out.println("Is Number = [" + longNumber + "] even ? " + (longUnaryOperator.applyAsLong(longNumber)));
    }

    public static void doubleUnaryOperatorPrimitiveSpecialization() {
        double doubleNumber = 11.12;
        DoubleUnaryOperator doubleUnaryOperator = n -> n / 2;
        System.out.println(
                "Is Number = [" + doubleNumber + "] even ? " + (doubleUnaryOperator.applyAsDouble(doubleNumber)));
    }
}
