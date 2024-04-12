package src.collectors.collectors_reduction.pack;

import src.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsCounting {

    public static void main(String[] args) {
        List<Employee> employees = Employee.employees();

        System.out.println("\n# Counting Employees by Collector");
        countingEmployees(employees);

        System.out.println("\n# Counting Employees By Name");
        countingEmployeesByName(employees);

        System.out.println("\n# Counting Employees By Name With Mapping");
        countingEmployeesByNameWithMapping(employees);

    }

    private static void countingEmployees(List<Employee> employees) {
        Long count = employees.stream()
                .collect(Collectors.counting());
        System.out.println("Employee Count :: " + count);
    }

    private static void countingEmployeesByName(List<Employee> employees) {
        Map<String, Long> employeeNameWithCount = employees.stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
        System.out.println("Employee Name with Count :: " + employeeNameWithCount);
    }

    private static void countingEmployeesByNameWithMapping(List<Employee> employees) {
        Map<String, Long> employeeNameWithCount = employees.stream()
                .collect(
                        Collectors.groupingBy(Employee::getName, Collectors.mapping(Employee::getId, Collectors.counting())));
        System.out.println("Employee Name with Count :: " + employeeNameWithCount);
    }

}
