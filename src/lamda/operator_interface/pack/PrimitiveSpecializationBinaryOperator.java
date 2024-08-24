package lamda.operator_interface.pack;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class PrimitiveSpecializationBinaryOperator {

    public static void main(String[] args) {
        integerBinaryOperatorObject();
        intBinaryOperatorPrimitiveSpecialization();
    }

    private static void integerBinaryOperatorObject() {
        int intNumber = 10, intAnotherNumber = 20;
        BinaryOperator<Integer> intBinaryOperator = (m, n) -> n == 0 ? m : m / n;
        System.out.println(
                "Is Number = [" + intNumber + "] Non Zero ? " + (intBinaryOperator.apply(intNumber, intAnotherNumber)));
    }

    public static void intBinaryOperatorPrimitiveSpecialization() {
        int intNumber = 10, intAnotherNumber = 20;
        IntBinaryOperator intBinaryOperator = (m, n) -> n == 0 ? m : m / n;
        System.out.println("Is Number = [" + intNumber + "] Non Zero ? "
                + (intBinaryOperator.applyAsInt(intAnotherNumber, intNumber)));
    }

    public static void longBinaryOperatorPrimitiveSpecialization() {
        long longNumber = 11, longAnotherNumber = 20;
        LongBinaryOperator longBinaryOperator = (m, n) -> n == 0 ? m : m / n;
        System.out.println("Is Number = [" + longNumber + "] Non Zero ? "
                + (longBinaryOperator.applyAsLong(longNumber, longAnotherNumber)));
    }

    public static void doubleBinaryOperatorPrimitiveSpecialization() {
        double doubleNumber = 11.12, doubleAnotherNumber = 12.12;
        DoubleBinaryOperator doubleBinaryOperator = (m, n) -> n == 0 ? m : m / n;
        System.out.println("Is Number = [" + doubleNumber + "] Non Zero ? "
                + (doubleBinaryOperator.applyAsDouble(doubleAnotherNumber, doubleNumber)));
    }
}
