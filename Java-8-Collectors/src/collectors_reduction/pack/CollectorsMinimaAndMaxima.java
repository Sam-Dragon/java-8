package collectors_reduction.pack;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsMinimaAndMaxima {

    public static void main(String[] args) {
        List<model.pack.EmployeeObj> employees = model.pack.EmployeeObj.employees();

        System.out.println("\n# Maximum Employee Salary by Collector");
        maximumEmployees(employees);

        System.out.println("\n# Maximum Employee Salary By Name");
        maximumEmployeesByName(employees);

        System.out.println("\n# Minimum Employee Salary by Collector");
        minimumEmployees(employees);

        System.out.println("\n# Minimum Employee Salary By Name");
        minimumEmployeesByName(employees);
    }

    private static void maximumEmployees(List<model.pack.EmployeeObj> employees) {
        Optional<model.pack.EmployeeObj> count = employees.stream()
                .collect(Collectors.maxBy(Comparator.comparing(model.pack.EmployeeObj::getSalary)));
        System.out.println("Employee Maximum Salary :: " + count.get());
    }

    private static void maximumEmployeesByName(List<model.pack.EmployeeObj> employees) {
        Map<String, Optional<model.pack.EmployeeObj>> employeeNameWithCount = employees.stream().collect(
                Collectors.groupingBy(model.pack.EmployeeObj::getName, Collectors.maxBy(Comparator.comparing(model.pack.EmployeeObj::getSalary))));
        System.out.println("Employee Name with Count :: " + employeeNameWithCount);
    }

    private static void minimumEmployees(List<model.pack.EmployeeObj> employees) {
        Optional<model.pack.EmployeeObj> count = employees.stream()
                .collect(Collectors.minBy(Comparator.comparing(model.pack.EmployeeObj::getSalary)));
        System.out.println("Employee Maximum Salary :: " + count.get());
    }

    private static void minimumEmployeesByName(List<model.pack.EmployeeObj> employees) {
        Map<String, Optional<model.pack.EmployeeObj>> employeeNameWithCount = employees.stream().collect(
                Collectors.groupingBy(model.pack.EmployeeObj::getName, Collectors.minBy(Comparator.comparing(model.pack.EmployeeObj::getSalary))));
        System.out.println("Employee Name with Count :: " + employeeNameWithCount);
    }
}
