package collectors_summarization.pack;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsJoining {
    public static void main(String[] args) {
        List<model.pack.EmployeeObj> employees = model.pack.EmployeeObj.employees();

        System.out.println("\n# Joining By Unique Employee Name Without Delimiter");
        joinByName(employees);

        System.out.println("\n# Joining By Unique Employee Name with ',' Delimiter");
        joinByNameWithDelimiter(employees);

        System.out.println("\n# Joining By Unique Employee Name");
        joinByNameWithPrefixDelimeterSuffix(employees);
    }

    private static void joinByName(List<model.pack.EmployeeObj> employees) {
        String concatenatedEmployees = employees.stream().map(model.pack.EmployeeObj::getName).distinct()
                .collect(Collectors.joining());
        System.out.println(concatenatedEmployees);
    }

    private static void joinByNameWithDelimiter(List<model.pack.EmployeeObj> employees) {
        String concatenatedEmployees = employees.stream().map(model.pack.EmployeeObj::getName).distinct()
                .collect(Collectors.joining(","));
        System.out.println(concatenatedEmployees);
    }

    private static void joinByNameWithPrefixDelimeterSuffix(List<model.pack.EmployeeObj> employees) {
        String concatenatedEmployees = employees.stream().map(model.pack.EmployeeObj::getName).distinct()
                .collect(Collectors.joining(",", "{", "}"));
        System.out.println(concatenatedEmployees);
    }
}
