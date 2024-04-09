package src.lamda.function_interface.pack;

import src.model.Employee;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        // Function<void> function = () -> System.out.print("Hello World");

        String name = "Rahul Sheth";
        Integer age = 8;

        Function<String, String> stringFunction = s -> s + s;
        Function<String, String> stringAnotherFunction = s -> "[" + s + "]";
        Function<Integer, Integer> numberFunction = s -> s + s;
        Function<Integer, Integer> numberAnotherFunction = s -> s * s;

        System.out.println("\nIDENTITY");
        identity(name, age);

        System.out.println("\nAPPLY");
        apply(stringFunction, numberFunction, name, age);

        System.out.println("\nANDTHEN");
        andThen(stringFunction, numberFunction, stringAnotherFunction, numberAnotherFunction, name, age);

        System.out.println("\nCOMPOSE");
        compose(stringFunction, numberFunction, stringAnotherFunction, numberAnotherFunction, name, age);
    }

    private static void identity(String name, Integer age) {
        String string = (String) Function.identity().apply(name);
        System.out.println(string);

        Integer number = (Integer) Function.identity().apply(age);
        System.out.println(number);

        Employee employee = (Employee) Function.identity().apply(new Employee());
        System.out.println(employee);
    }

    private static void apply(Function<String, String> stringFunction, Function<Integer, Integer> numberFunction,
            String name, Integer age) {
        String string = stringFunction.apply(name);
        System.out.println(string);

        Integer number = numberFunction.apply(age);
        System.out.println(number);
    }

    private static void andThen(Function<String, String> stringFunction, Function<Integer, Integer> numberFunction,
            Function<String, String> stringAnotherFunction, Function<Integer, Integer> numberAnotherFunction,
            String name, Integer age) {
        // stringFunction.andThen(numberFunction)

        Function<String, String> andThenFunction = stringFunction.andThen(stringAnotherFunction);
        System.out.println(andThenFunction.apply(name));

        Function<Integer, Integer> andThenNumberFunction = numberFunction.andThen(numberAnotherFunction);
        System.out.println(andThenNumberFunction.apply(age));
    }

    private static void compose(Function<String, String> stringFunction, Function<Integer, Integer> numberFunction,
            Function<String, String> stringAnotherFunction, Function<Integer, Integer> numberAnotherFunction,
            String name, Integer age) {
        // stringFunction.andThen(numberFunction)

        Function<String, String> andThenFunction = stringFunction.compose(stringAnotherFunction);
        System.out.println(andThenFunction.apply(name));

        Function<Integer, Integer> andThenNumberFunction = numberFunction.compose(numberAnotherFunction);
        System.out.println(andThenNumberFunction.apply(age));
    }
}
