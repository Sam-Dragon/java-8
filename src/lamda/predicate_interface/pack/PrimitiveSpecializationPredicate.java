package lamda.predicate_interface.pack;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class PrimitiveSpecializationPredicate {

    public static void main(String[] args) {
        integerPredicateObject();
        intPredicatePrimitiveSpecialization();
    }

    private static void integerPredicateObject() {
        int intNumber = 10;
        Predicate<Integer> intPredicate = n -> n % 2 == 0;
        System.out.println("Is Number = [" + intNumber + "] even ? " + (intPredicate.test(intNumber)));
    }

    public static void intPredicatePrimitiveSpecialization() {
        int intNumber = 10;
        IntPredicate intPredicate = n -> n % 2 == 0;
        System.out.println("Is Number = [" + intNumber + "] even ? " + (intPredicate.test(intNumber)));
    }

    public static void longPredicatePrimitiveSpecialization() {
        long longNumber = 11;
        LongPredicate longPredicate = n -> n % 2 == 0;
        System.out.println("Is Number = [" + longNumber + "] even ? " + (longPredicate.test(longNumber)));
    }

    public static void doublePredicatePrimitiveSpecialization() {
        double doubleNumber = 11.12;
        DoublePredicate doublePredicate = n -> n % 2 == 0;
        System.out.println("Is Number = [" + doubleNumber + "] even ? " + (doublePredicate.test(doubleNumber)));
    }
}
