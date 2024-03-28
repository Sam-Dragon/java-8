package consumer_interface.pack;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        // Consumer<void> consumer = () -> System.out.print("Hello World");

        Consumer<model.pack.EmployeeObj> employee = System.out::println;
        employee.accept(new model.pack.EmployeeObj());

        System.out.println();
        employee = System.out::println;
        employee.accept(new model.pack.EmployeeObj(1L, "Employee", "+919735672353", BigDecimal.valueOf(145120404)));

        System.out.println();
        List<model.pack.EmployeeObj> employees = new ArrayList<>();
        Consumer<model.pack.EmployeeObj> consumerEmployee = employees::add;
        consumerEmployee.accept(new model.pack.EmployeeObj(2L, "Employee", "+919735672353", BigDecimal.valueOf(145120404)));
        System.out.println(employees);

        System.out.println("\nADDTHEN");
        andThen(employee, consumerEmployee);
        System.out.println(employees);
    }

    private static void andThen(Consumer<model.pack.EmployeeObj> firstConsumer, Consumer<model.pack.EmployeeObj> secondConsumer) {
        // Similar datatype Consumer can be combined
        // stringConsumer.and(integerConsumer);
        Consumer<model.pack.EmployeeObj> condition = firstConsumer.andThen(secondConsumer);
        condition.accept(new model.pack.EmployeeObj(6L, "Employee", "+919735672353", BigDecimal.valueOf(145120404)));

//        Consumer<String> stringConsumer = s -> System.out.println(s);
//        condition.andThen(stringConsumer);
    }

}
