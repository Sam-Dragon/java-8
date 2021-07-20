package supplier_interface.pack;

import java.util.function.Supplier;

import model.pack.Employee;

public class SupplierExample {

    public static void main(String[] args) {
        // Supplier<void> supplier = () -> System.out.print("Hello World");

        Supplier<String> stringSupplier = () -> "Welcome to Hello World";
        System.out.println(stringSupplier.get());

        Supplier<Integer> integerSupplier = () -> 10;
        System.out.println(integerSupplier.get());

        Supplier<Employee> employeeSupplier = Employee::new;
        Employee employee = employeeSupplier.get();
        System.out.println(employee);
    }

}
