package predicate_interface.pack;

import java.math.BigDecimal;
import java.util.function.BiPredicate;

import model.pack.Employee;

public class BiPredicateExample {

    public static void main(String[] args) {
        // BiBiPredicate<void, void> BiPredicate = () -> System.out.print("Hello
        // World");

        BiPredicate<Employee, Employee> employeeSalaryBiPredicate = (e,
                e2) -> e.getSalary().compareTo(BigDecimal.valueOf(7500)) >= 0
                        && e2.getSalary().compareTo(BigDecimal.valueOf(7500000)) >= 0;
        System.out.println(employeeSalaryBiPredicate.test(
                new Employee(1L, "Employee", "+919735672353", BigDecimal.valueOf(145120404)),
                new Employee(2L, "Employee", "+919735672353", BigDecimal.valueOf(145120404))));

        BiPredicate<String, String> stringBiPredicate = (s, s2) -> s.length() + s2.length() > 10;
        BiPredicate<String, String> stringAnotherBiPredicate = (s, s2) -> s.length() + s2.length() < 10;
        BiPredicate<Integer, Integer> integerBiPredicate = (i, j) -> i + j > 10;

        String string = "Rahul Sheth";
        String string2 = "Rahul Sheth";
        Integer integer = 10;
        Integer integer2 = 10;

        System.out.println("\nTEST");
        test(stringBiPredicate, integerBiPredicate, string, string2, integer, integer2);

        System.out.println("\nNEGATE");
        negate(stringBiPredicate, string, string2);

        System.out.println("\nAND");
        and(stringBiPredicate, integerBiPredicate, stringAnotherBiPredicate, string, string2, integer, integer2);

        System.out.println("\nOR");
        or(stringBiPredicate, integerBiPredicate, stringAnotherBiPredicate, string, string2, integer, integer2);
    }

    public static void test(BiPredicate<String, String> stringPredicate, BiPredicate<Integer, Integer> integerPredicate,
            String string, String string2, Integer integer, Integer integer2) {
        boolean result = stringPredicate.test(string, string2);
        System.out.println("String [" + stringPredicate + "].length(" + (string.length() + string2.length())
                + ") > 10 = " + result);

        result = integerPredicate.test(integer, integer2);
        System.out.println("Integer [" + integerPredicate + "] > 10 = " + result);
    }

    private static void negate(BiPredicate<String, String> stringPredicate, String string, String string2) {
        boolean initialResult = stringPredicate.test(string, string2);
        System.out.println(
                "String [" + string + "].length(" + (string.length() + string2.length()) + ") > 10 = " + initialResult);

        BiPredicate<String, String> negatedPredicate = stringPredicate.negate();
        boolean negatedResult = negatedPredicate.test(string, string2);
        System.out.println("Negated String [" + string + "].length(" + (string.length() + string2.length())
                + ") > 10 = " + negatedResult);
    }

    private static void or(BiPredicate<String, String> stringPredicate, BiPredicate<Integer, Integer> integerPredicate,
            BiPredicate<String, String> stringAnotherPredicate, String string, String string2, Integer integer,
            Integer integer2) {
        boolean initialResult = stringPredicate.test(string, string2);
        System.out.println(
                "String [" + string + "].length(" + (string.length() + string2.length()) + ") > 10 = " + initialResult);

        initialResult = stringAnotherPredicate.test(string, string2);
        System.out.println(
                "String [" + string + "].length(" + (string.length() + string2.length()) + ") > 10 = " + initialResult);

        // Similar datatype predicate can be combined
        // stringPredicate.and(integerPredicate);

        BiPredicate<String, String> condition = stringPredicate.or(stringAnotherPredicate);
        System.out.println("Condition =" + condition.toString() + ", Result = " + condition.test(string, string2));
    }

    private static void and(BiPredicate<String, String> stringPredicate, BiPredicate<Integer, Integer> integerPredicate,
            BiPredicate<String, String> stringAnotherPredicate, String string, String string2, Integer integer,
            Integer integer2) {
        boolean initialResult = stringPredicate.test(string, string2);
        System.out.println(
                "String [" + string + "].length(" + (string.length() + string2.length()) + ") > 10 = " + initialResult);

        initialResult = stringAnotherPredicate.test(string, string2);
        System.out.println(
                "String [" + string + "].length(" + (string.length() + string2.length()) + ") > 10 = " + initialResult);

        // Similar datatype predicate can be combined
        // stringPredicate.and(integerPredicate);

        BiPredicate<String, String> condition = stringPredicate.and(stringAnotherPredicate);
        System.out.println("Condition =" + condition.toString() + ", Result = " + condition.test(string, string2));
    }
}
