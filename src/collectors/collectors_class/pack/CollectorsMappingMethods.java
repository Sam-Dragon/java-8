package src.collectors.collectors_class.pack;


import src.model.Employee;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsMappingMethods {

    public static void main(String[] args) {
        List<Employee> employees = Employee.employees();

        System.out.println("\n# Filtering Employees");
        filteringEmployees(employees);

        System.out.println("\n# Mapping Employees");
        mappingEmployees(employees);

        System.out.println("\n# Flat Mapping Employees [PEDNING]");
        flatMappingEmployees(employees);

        System.out.println("\n# Collecting And Then Employees");
        collectingAndThenEmployees(employees);

//        employees.stream().map(e -> e.getSalary().compareTo(BigDecimal.valueOf(2500000)) > 0)
//                .collect(Collectors.toList()).forEach(System.out::println);
    }

    private static void filteringEmployees(List<Employee> employees) {
        Long count = employees.stream().collect(Collectors
                .filtering(e -> e.getSalary().compareTo(BigDecimal.valueOf(2500000)) > 0, Collectors.counting()));
        System.out.println("Employee Salary Count > 2500000 :: " + count);
    }

    private static void mappingEmployees(List<Employee> employees) {
        List<Object> employeeList = employees.stream()
                .collect(Collectors.mapping(Employee::getName, Collectors.toList()));
        System.out.println("Employee Names :: " + employeeList);
    }

    private static void flatMappingEmployees(List<Employee> employees) {
//        List<Object> employeeList = employees.stream().collect(
//                Collectors.flatMapping(e -> e.getSalary().stream(), Collectors.toList()));
//        System.out.println("Employee Salary Count > 2500000 :: " + employeeList);
    }

    private static void collectingAndThenEmployees(List<Employee> employees) {
        Long employeeList = employees.stream().collect(Collectors.collectingAndThen(Collectors.counting(), e -> e * 2));
        System.out.println("Employee Count * 2 :: " + employeeList);
    }
}
