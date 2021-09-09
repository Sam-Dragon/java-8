package filtering_and_slicing.pack;

import java.util.stream.Collectors;

import model.pack.Employee;

public class FilteringUniqueElements {

    public static void main(String[] args) {
        System.out.println("Employee List");
        Employee.employees().stream().map(Employee::getName).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("\nFiltered Name Unique Employee List - Using distinct");
        Employee.employees().stream().map(Employee::getName).filter(e -> "Khushboo Shah".equalsIgnoreCase(e)).distinct()
                .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("\nFiltered Name Unique Employee List - Using Set");
        Employee.employees().stream().map(Employee::getName).filter(e -> "Khushboo Shah".equalsIgnoreCase(e))
                .collect(Collectors.toSet()).forEach(System.out::println);
    }
}
