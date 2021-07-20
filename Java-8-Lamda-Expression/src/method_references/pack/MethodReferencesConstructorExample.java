package method_references.pack;

import java.math.BigDecimal;
import java.util.function.Supplier;

import model.pack.Employee;

public class MethodReferencesConstructorExample {

    public static void main(String[] args) {

        Supplier<Employee> employeeSupplier = Employee::new;
        Employee employee = employeeSupplier.get();
        System.out.println(employee);

        System.out.println();

        QuadFunction<Long, String, String, BigDecimal, Employee> function = Employee::new;
        employee = function.apply(1L, "Employee Name", "+879898797962", BigDecimal.valueOf(100000));
        System.out.println(employee);
    }

}
