package src.collectors.collectors_summarization.pack;


import src.model.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsJoining {
    public static void main(String[] args) {
        List<Employee> employees = Employee.employees();

        System.out.println("\n# Joining By Unique Employee Name Without Delimiter");
        joinByName(employees);

        System.out.println("\n# Joining By Unique Employee Name with ',' Delimiter");
        joinByNameWithDelimiter(employees);

        System.out.println("\n# Joining By Unique Employee Name");
        joinByNameWithPrefixDelimeterSuffix(employees);
    }

    private static void joinByName(List<Employee> employees) {
        String concatenatedEmployees = employees.stream()
                .map(Employee::getName)
                .distinct()
                .collect(Collectors.joining());
        System.out.println(concatenatedEmployees);
    }

    private static void joinByNameWithDelimiter(List<Employee> employees) {
        String concatenatedEmployees = employees.stream()
                .map(Employee::getName)
                .distinct()
                .collect(Collectors.joining(","));
        System.out.println(concatenatedEmployees);
    }

    private static void joinByNameWithPrefixDelimeterSuffix(List<Employee> employees) {
        String concatenatedEmployees = employees.stream()
                .map(Employee::getName)
                .distinct()
                .collect(Collectors.joining(",", "{", "}"));
        System.out.println(concatenatedEmployees);
    }
}
