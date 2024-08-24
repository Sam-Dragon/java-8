package lamda.consumer_interface.pack;

import model.Employee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CustomEmployeeConsumerExample {

    public static void main(String[] args) {
        TriConsumerInterface<Employee, Employee, Employee> employeeConsumer = CustomEmployeeConsumerExample::filter;// Employee::new
        employeeConsumer.recieve(new Employee(1L, "Employee", "+919735672353", BigDecimal.valueOf(145120404)),
                new Employee(2L, "Employee", "+919735672353", BigDecimal.valueOf(145120404)),
                new Employee(3L, "Employee", "+919735672353", BigDecimal.valueOf(145120404)));
    }

    public static void filter(Employee employee, Employee employee2, Employee employee3) {
        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(employee2);
        employees.add(employee3);
        System.out.println(employees);
    }
}
