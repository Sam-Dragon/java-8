package operator_interface.pack;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class PrimitiveSpecializationUnaryOperatorExample {

    public static void main(String[] args) {
        Integer age = 8;

        IntUnaryOperator numberUnaryOperator = s -> s + s;
        IntUnaryOperator numberUnaryAnotherOperator = s -> s * s;

        System.out.println("\nIDENTITY");
        identity(age);

        System.out.println("\nAPPLY");
        apply(numberUnaryOperator, age);

        System.out.println("\nANDTHEN");
        andThen(numberUnaryOperator, numberUnaryAnotherOperator, age);

        System.out.println("\nCOMPOSE");
        compose(numberUnaryOperator, numberUnaryAnotherOperator, age);
    }

    private static void identity(Integer age) {
        Integer number = (Integer) UnaryOperator.identity().apply(age);
        System.out.println(number);

        model.pack.EmployeeObj employee = (model.pack.EmployeeObj) UnaryOperator.identity().apply(new model.pack.EmployeeObj());
        System.out.println(employee);
    }

    private static void apply(IntUnaryOperator numberUnaryOperator, Integer age) {
        Integer number = numberUnaryOperator.applyAsInt(age);
        System.out.println(number);
    }

    private static void andThen(IntUnaryOperator numberUnaryOperator, IntUnaryOperator numberUnaryAnotherOperator,
            Integer age) {
        IntUnaryOperator andThenNumberUnaryOperator = numberUnaryOperator.andThen(numberUnaryAnotherOperator);
        System.out.println(andThenNumberUnaryOperator.applyAsInt(age));
    }

    private static void compose(IntUnaryOperator numberUnaryOperator, IntUnaryOperator numberUnaryAnotherOperator,
            Integer age) {
        IntUnaryOperator andThenNumberUnaryOperator = numberUnaryOperator.compose(numberUnaryAnotherOperator);
        System.out.println(andThenNumberUnaryOperator.applyAsInt(age));
    }
}
