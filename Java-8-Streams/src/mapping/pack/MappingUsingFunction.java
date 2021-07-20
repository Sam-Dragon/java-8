package mapping.pack;

import java.util.stream.Collectors;

import model.pack.Employee;

public class MappingUsingFunction {

    public static void main(String[] args) {
        System.out.println("Employee List");
        Employee.employees().forEach(System.out::println);

        System.out.println("\nMapping To Fetch Employee Names");
        Employee.employees().stream().map(Employee::getName).collect(Collectors.toList()).forEach(System.out::println);
    }
}
