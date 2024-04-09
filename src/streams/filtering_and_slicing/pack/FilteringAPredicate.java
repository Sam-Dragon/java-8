package src.streams.filtering_and_slicing.pack;

import src.model.Employee;

import java.util.stream.Collectors;

public class FilteringAPredicate {

    public static void main(String[] args) {
        System.out.println("Employee List");
        Employee.employees().forEach(System.out::println);

        System.out.println("\nFiltered Name Unique Employee List");
        Employee.employees().stream().filter(e -> "Khushboo".equalsIgnoreCase(e.getName())).collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
