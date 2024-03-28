package function_interface.pack;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CustomEmployeeFunctionExample {

    public static void main(String[] args) {
        TriFunctionInterface<model.pack.EmployeeObj, model.pack.EmployeeObj, model.pack.EmployeeObj> employeeConsumer = CustomEmployeeFunctionExample::filter;// Employee::new
        List<model.pack.EmployeeObj> employees = employeeConsumer.apply(
                new model.pack.EmployeeObj(1L, "Employee", "+919735672353", BigDecimal.valueOf(145120404)),
                new model.pack.EmployeeObj(2L, "Employee", "+919735672353", BigDecimal.valueOf(145120404)),
                new model.pack.EmployeeObj(3L, "Employee", "+919735672353", BigDecimal.valueOf(145120404)));

        System.out.println(employees);
    }

    public static List<model.pack.EmployeeObj> filter(model.pack.EmployeeObj employee, model.pack.EmployeeObj employee2, model.pack.EmployeeObj employee3) {
        List<model.pack.EmployeeObj> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(employee2);
        employees.add(employee3);

        return employees;
    }
}
