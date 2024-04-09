package src.lamda.function_interface.pack;

import src.model.Employee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CustomEmployeeFunctionExample {

    public static void main(String[] args) {
        TriFunctionInterface<Employee, Employee, Employee> employeeConsumer = CustomEmployeeFunctionExample::filter;// Employee::new
        List<Employee> employees = employeeConsumer.apply(
                new Employee(1L, "Employee", "+919735672353", BigDecimal.valueOf(145120404)),
                new Employee(2L, "Employee", "+919735672353", BigDecimal.valueOf(145120404)),
                new Employee(3L, "Employee", "+919735672353", BigDecimal.valueOf(145120404)));

        System.out.println(employees);
    }

    public static List<Employee> filter(Employee employee, Employee employee2, Employee employee3) {
        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(employee2);
        employees.add(employee3);

        return employees;
    }
}
