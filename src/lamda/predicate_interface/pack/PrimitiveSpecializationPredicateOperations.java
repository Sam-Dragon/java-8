package lamda.predicate_interface.pack;

import java.util.function.IntPredicate;

public class PrimitiveSpecializationPredicateOperations {

    public static void main(String[] args) {
        int number10 = 10;
        int number100 = 100;

        IntPredicate integer10Predicate = i -> i > 10;
        IntPredicate integer100Predicate = i -> i > 100;

        System.out.println("\nTEST");
        test(integer10Predicate, number10);

        System.out.println("\nNEGATE");
        negate(integer10Predicate, number10);

        System.out.println("\nAND");
        and(integer10Predicate, integer100Predicate, number100);

        System.out.println("\nOR");
        or(integer10Predicate, integer100Predicate, number100);
    }

    public static void test(IntPredicate integer10Predicate, Integer integer) {
        boolean result = integer10Predicate.test(integer);
        System.out.println("Integer [" + integer10Predicate + "] > 10 = " + result);
    }

    private static void negate(IntPredicate integer10Predicate, Integer integer) {
        boolean result = integer10Predicate.test(integer);
        System.out.println("Integer [" + integer10Predicate + "] > 10 = " + result);

        IntPredicate negatedPredicate = integer10Predicate.negate();
        boolean negatedResult = negatedPredicate.test(integer);
        System.out.println("Negated Integer [" + integer10Predicate + "] > 10 = " + negatedResult);
    }

    private static void and(IntPredicate integer10Predicate, IntPredicate integer100Predicate, Integer number100) {
        boolean initialResult = integer10Predicate.test(number100);
        System.out.println("Integer [" + integer10Predicate + "] > 10 = " + initialResult);

        initialResult = integer100Predicate.test(number100);
        System.out.println("Integer [" + integer100Predicate + "] > 100 = " + initialResult);

        // Similar datatype predicate can be combined
        // stringPredicate.and(integerPredicate);
        IntPredicate condition = integer10Predicate.and(integer100Predicate);
        System.out.println("Condition =" + condition + ", Result = " + condition.test(number100));
    }

    private static void or(IntPredicate integer10Predicate, IntPredicate integer100Predicate, Integer number100) {
        boolean initialResult = integer10Predicate.test(number100);
        System.out.println("Integer [" + integer10Predicate + "] > 10 = " + initialResult);

        initialResult = integer100Predicate.test(number100);
        System.out.println("Integer [" + integer100Predicate + "] > 100 = " + initialResult);

        // Similar datatype predicate can be combined
        // stringPredicate.and(integerPredicate);
        IntPredicate condition = integer10Predicate.or(integer100Predicate);
        System.out.println("Condition =" + condition + ", Result = " + condition.test(number100));
    }

}
