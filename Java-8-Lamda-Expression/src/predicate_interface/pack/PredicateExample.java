package predicate_interface.pack;

import java.math.BigDecimal;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import model.pack.Employee;

public class PredicateExample {

    public static void main(String[] args) {
        // Predicate<void> predicate = () -> System.out.print("Hello World");

        Predicate<Employee> employeeSalaryPredicate = e -> e.getSalary().compareTo(BigDecimal.valueOf(7500000)) >= 0;
        System.out.println(Employee.employees().stream().filter(employeeSalaryPredicate).collect(Collectors.toList()));

        Predicate<String> stringPredicate = (String s) -> s.length() > 10;
        Predicate<String> stringAnotherPredicate = s -> s.length() < 10;
        Predicate<Integer> integerPredicate = i -> i > 10;

        String string = "Rahul Sheth";
        Integer integer = 10;

        System.out.println("\nTEST");
        test(stringPredicate, integerPredicate, string, integer);

        System.out.println("\nNEGATE");
        negate(stringPredicate, string);

        System.out.println("\nISEQUAL");
        isEqual(stringPredicate, integerPredicate, string, integer);

        System.out.println("\nAND");
        and(stringPredicate, integerPredicate, stringAnotherPredicate, string, integer);

        System.out.println("\nOR");
        or(stringPredicate, integerPredicate, stringAnotherPredicate, string, integer);
    }

    public static void test(Predicate<String> stringPredicate, Predicate<Integer> integerPredicate, String string,
            Integer integer) {
        boolean result = stringPredicate.test(string);
        System.out.println("String [" + stringPredicate + "].length(" + string.length() + ") > 10 = " + result);

        result = integerPredicate.test(integer);
        System.out.println("Integer [" + integerPredicate + "] > 10 = " + result);
    }

    private static void negate(Predicate<String> stringPredicate, String string) {
        boolean initialResult = stringPredicate.test(string);
        System.out.println("String [" + string + "].length(" + string.length() + ") > 10 = " + initialResult);

        Predicate<String> negatedPredicate = stringPredicate.negate();
        boolean negatedResult = negatedPredicate.test(string);
        System.out.println("Negated String [" + string + "].length(" + string.length() + ") > 10 = " + negatedResult);
    }

    private static void isEqual(Predicate<String> stringPredicate, Predicate<Integer> integerPredicate, String string,
            Integer integer) {
        boolean result = stringPredicate.equals(integerPredicate);
        System.out.println(stringPredicate + " == " + integerPredicate + " ? " + result);

        result = stringPredicate.equals(stringPredicate);
        System.out.println(stringPredicate + " == " + stringPredicate + " ? " + result);

        System.out.println(
                "Match direct predicate = " + stringPredicate.equals((Predicate<String>) (s -> s.length() > 10)));
    }

    private static void and(Predicate<String> stringPredicate, Predicate<Integer> integerPredicate,
            Predicate<String> stringAnotherPredicate, String string, Integer integer) {
        boolean initialResult = stringPredicate.test(string);
        System.out.println("String [" + string + "].length(" + string.length() + ") > 10 = " + initialResult);

        initialResult = stringAnotherPredicate.test(string);
        System.out.println("String [" + string + "].length(" + string.length() + ") > 10 = " + initialResult);

        // Similar datatype predicate can be combined
        // stringPredicate.and(integerPredicate);
        Predicate<String> condition = stringPredicate.and(stringAnotherPredicate);
        System.out.println("Condition =" + condition.toString() + ", Result = " + condition.test(string));
    }

    private static void or(Predicate<String> stringPredicate, Predicate<Integer> integerPredicate,
            Predicate<String> stringAnotherPredicate, String string, Integer integer) {
        boolean initialResult = stringPredicate.test(string);
        System.out.println("String [" + string + "].length(" + string.length() + ") > 10 = " + initialResult);

        initialResult = stringAnotherPredicate.test(string);
        System.out.println("String [" + string + "].length(" + string.length() + ") > 10 = " + initialResult);

        // Similar datatype predicate can be combined
        // stringPredicate.or(integerPredicate);
        Predicate<String> condition = stringPredicate.or(stringAnotherPredicate);
        System.out.println("Condition =" + condition.toString() + ", Result = " + condition.test(string));
    }

}
