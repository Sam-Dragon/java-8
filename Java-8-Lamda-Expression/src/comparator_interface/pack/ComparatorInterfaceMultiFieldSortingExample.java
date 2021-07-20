package comparator_interface.pack;

import java.util.Comparator;
import java.util.stream.Collectors;

import model.pack.Employee;

public class ComparatorInterfaceMultiFieldSortingExample {

    public static void main(String[] args) {
        System.out.println("\nSorting With Streams");
        sortByStream();
    }

    private static void sortByStream() {
        System.out.println("Before Sorting");
        Employee.employees().stream().forEach(System.out::println);

        System.out.println("\n[STREAM] Sorting By Name then id - ASC");
        Employee.employees().stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getId))
                .collect(Collectors.toList()).forEach(System.out::println);
    }

}
