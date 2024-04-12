package src.lamda.operator_interface.pack;

import src.model.Employee;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {
        // UnaryOperator<void> unaryOperator = () -> System.out.print("Hello World");

        String name = "Rahul Sheth";
        Integer age = 8;

        UnaryOperator<String> stringUnaryOperator = s -> s + s;
        UnaryOperator<String> stringUnaryAnotherOperator = s -> "[" + s + "]";
        UnaryOperator<Integer> numberUnaryOperator = s -> s + s;
        UnaryOperator<Integer> numberUnaryAnotherOperator = s -> s * s;

        System.out.println("\nIDENTITY");
        identity(name, age);

        System.out.println("\nAPPLY");
        apply(stringUnaryOperator, numberUnaryOperator, name, age);

        System.out.println("\nANDTHEN");
        andThen(stringUnaryOperator, numberUnaryOperator, stringUnaryAnotherOperator, numberUnaryAnotherOperator, name,
                age);

        System.out.println("\nCOMPOSE");
        compose(stringUnaryOperator, numberUnaryOperator, stringUnaryAnotherOperator, numberUnaryAnotherOperator, name,
                age);
    }

    private static void identity(String name, Integer age) {
        String string = (String) UnaryOperator.identity()
                .apply(name);
        System.out.println(string);

        Integer number = (Integer) UnaryOperator.identity()
                .apply(age);
        System.out.println(number);

        Employee employee = (Employee) UnaryOperator.identity()
                .apply(new Employee());
        System.out.println(employee);
    }

    private static void apply(UnaryOperator<String> stringUnaryOperator, UnaryOperator<Integer> numberUnaryOperator,
                              String name, Integer age) {
        String string = stringUnaryOperator.apply(name);
        System.out.println(string);

        Integer number = numberUnaryOperator.apply(age);
        System.out.println(number);
    }

    private static void andThen(UnaryOperator<String> stringUnaryOperator, UnaryOperator<Integer> numberUnaryOperator,
                                UnaryOperator<String> stringUnaryAnotherOperator, UnaryOperator<Integer> numberUnaryAnotherOperator,
                                String name, Integer age) {
        // stringUnaryOperator.andThen(numberUnaryOperator)

        Function<String, String> andThenUnaryOperator = stringUnaryOperator.andThen(stringUnaryAnotherOperator);
        System.out.println(andThenUnaryOperator.apply(name));

        Function<Integer, Integer> andThenNumberUnaryOperator = numberUnaryOperator.andThen(numberUnaryAnotherOperator);
        System.out.println(andThenNumberUnaryOperator.apply(age));
    }

    private static void compose(UnaryOperator<String> stringUnaryOperator, UnaryOperator<Integer> numberUnaryOperator,
                                UnaryOperator<String> stringUnaryAnotherOperator, UnaryOperator<Integer> numberUnaryAnotherOperator,
                                String name, Integer age) {
        // stringUnaryOperator.andThen(numberUnaryOperator)

        Function<String, String> andThenUnaryOperator = stringUnaryOperator.compose(stringUnaryAnotherOperator);
        System.out.println(andThenUnaryOperator.apply(name));

        Function<Integer, Integer> andThenNumberUnaryOperator = numberUnaryOperator.compose(numberUnaryAnotherOperator);
        System.out.println(andThenNumberUnaryOperator.apply(age));
    }
}
