package src.streams.filtering_and_slicing.pack;

import src.model.Employee;

import java.util.stream.Collectors;

public class SlicingElementsWithSkip {

    public static void main(String[] args) {
        System.out.println("Employee List");
        Employee.employees()
                .stream()
                .map(Employee::getName)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\nSkip First Three Name Unique Employee List");
        Employee.employees()
                .stream()
                .map(Employee::getName)
                .skip(3)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
