package collectors_reduction.pack;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsCounting {

    public static void main(String[] args) {
        List<model.pack.EmployeeObj> employees = model.pack.EmployeeObj.employees();

        System.out.println("\n# Counting Employees by Collector");
        countingEmployees(employees);

        System.out.println("\n# Counting Employees By Name");
        countingEmployeesByName(employees);

        System.out.println("\n# Counting Employees By Name With Mapping");
        countingEmployeesByNameWithMapping(employees);

    }

    private static void countingEmployees(List<model.pack.EmployeeObj> employees) {
        Long count = employees.stream().collect(Collectors.counting());
        System.out.println("Employee Count :: " + count);
    }

    private static void countingEmployeesByName(List<model.pack.EmployeeObj> employees) {
        Map<String, Long> employeeNameWithCount = employees.stream()
                .collect(Collectors.groupingBy(model.pack.EmployeeObj::getName, Collectors.counting()));
        System.out.println("Employee Name with Count :: " + employeeNameWithCount);
    }

    private static void countingEmployeesByNameWithMapping(List<model.pack.EmployeeObj> employees) {
        Map<String, Long> employeeNameWithCount = employees.stream().collect(
                Collectors.groupingBy(model.pack.EmployeeObj::getName, Collectors.mapping(model.pack.EmployeeObj::getId, Collectors.counting())));
        System.out.println("Employee Name with Count :: " + employeeNameWithCount);
    }

}
