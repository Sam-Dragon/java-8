package src.streams.filtering_and_slicing.pack;

import src.model.Employee;

import java.util.stream.Collectors;

public class TruncatingElementsWithLimit {

    public static void main(String[] args) {
        System.out.println("Employee List");
        Employee.employees()
                .stream()
                .map(Employee::getName)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\nLimit First Three Name Unique Employee List");
        Employee.employees()
                .stream()
                .map(Employee::getName)
                .limit(3)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
