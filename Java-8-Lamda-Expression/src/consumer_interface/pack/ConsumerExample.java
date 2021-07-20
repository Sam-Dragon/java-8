package consumer_interface.pack;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import model.pack.Employee;

public class ConsumerExample {

    public static void main(String[] args) {
        // Consumer<void> consumer = () -> System.out.print("Hello World");

        Consumer<Employee> employee = System.out::println;
        employee.accept(new Employee());

        System.out.println();
        employee = System.out::println;
        employee.accept(new Employee(1L, "Employee", "+919735672353", BigDecimal.valueOf(145120404)));

        System.out.println();
        List<Employee> employees = new ArrayList<>();
        Consumer<Employee> consumerEmployee = employees::add;
        consumerEmployee.accept(new Employee(2L, "Employee", "+919735672353", BigDecimal.valueOf(145120404)));
        System.out.println(employees);

        System.out.println("\nADDTHEN");
        andThen(employee, consumerEmployee);
        System.out.println(employees);
    }

    private static void andThen(Consumer<Employee> firstConsumer, Consumer<Employee> secondConsumer) {
        // Similar datatype Consumer can be combined
        // stringConsumer.and(integerConsumer);
        Consumer<Employee> condition = firstConsumer.andThen(secondConsumer);
        condition.accept(new Employee(6L, "Employee", "+919735672353", BigDecimal.valueOf(145120404)));

//        Consumer<String> stringConsumer = s -> System.out.println(s);
//        condition.andThen(stringConsumer);
    }

}
