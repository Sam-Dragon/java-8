package src.collectors.collectors_reduction.pack;


import src.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsMinimaAndMaxima {

    public static void main(String[] args) {
        List<Employee> employees = Employee.employees();

        System.out.println("\n# Maximum Employee Salary by Collector");
        maximumEmployees(employees);

        System.out.println("\n# Maximum Employee Salary By Name");
        maximumEmployeesByName(employees);

        System.out.println("\n# Minimum Employee Salary by Collector");
        minimumEmployees(employees);

        System.out.println("\n# Minimum Employee Salary By Name");
        minimumEmployeesByName(employees);
    }

    private static void maximumEmployees(List<Employee> employees) {
        Optional<Employee> count = employees.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("Employee Maximum Salary :: " + count.get());
    }

    private static void maximumEmployeesByName(List<Employee> employees) {
        Map<String, Optional<Employee>> employeeNameWithCount = employees.stream()
                .collect(
                        Collectors.groupingBy(Employee::getName, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println("Employee Name with Count :: " + employeeNameWithCount);
    }

    private static void minimumEmployees(List<Employee> employees) {
        Optional<Employee> count = employees.stream()
                .collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("Employee Maximum Salary :: " + count.get());
    }

    private static void minimumEmployeesByName(List<Employee> employees) {
        Map<String, Optional<Employee>> employeeNameWithCount = employees.stream()
                .collect(
                        Collectors.groupingBy(Employee::getName, Collectors.minBy(Comparator.comparing(Employee::getSalary))));
        System.out.println("Employee Name with Count :: " + employeeNameWithCount);
    }
}
