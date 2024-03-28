package consumer_interface.pack;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CustomEmployeeConsumerExample {

    public static void main(String[] args) {
        TriConsumerInterface<model.pack.EmployeeObj, model.pack.EmployeeObj, model.pack.EmployeeObj> employeeConsumer = CustomEmployeeConsumerExample::filter;// Employee::new
        employeeConsumer.recieve(new model.pack.EmployeeObj(1L, "Employee", "+919735672353", BigDecimal.valueOf(145120404)),
                new model.pack.EmployeeObj(2L, "Employee", "+919735672353", BigDecimal.valueOf(145120404)),
                new model.pack.EmployeeObj(3L, "Employee", "+919735672353", BigDecimal.valueOf(145120404)));
    }

    public static void filter(model.pack.EmployeeObj employee, model.pack.EmployeeObj employee2, model.pack.EmployeeObj employee3) {
        List<model.pack.EmployeeObj> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(employee2);
        employees.add(employee3);
        System.out.println(employees);
    }
}
