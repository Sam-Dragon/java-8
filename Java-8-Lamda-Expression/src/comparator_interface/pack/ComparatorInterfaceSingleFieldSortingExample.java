package comparator_interface.pack;

import java.util.Comparator;
import java.util.stream.Collectors;

import model.pack.Employee;

public class ComparatorInterfaceSingleFieldSortingExample {

    public static void main(String[] args) {
        System.out.println("\nSorting With Streams");
        sortByStream();

        System.out.println("\nSorting Normally");
        sortNormally();
    }

    private static void sortNormally() {
        System.out.println("Before Sorting");
        Employee.employeeList().stream().forEach(System.out::println);

        System.out.println("\n[NORMAL] Sorting By ID - ASC");
        Employee.employeeList().sort(Comparator.comparing(Employee::getId));
        System.out.println(Employee.employees());

        System.out.println("\n[NORMAL] Sorting By ID - DESC");
        Employee.employeeList().sort(Comparator.comparing(Employee::getId).reversed());
        System.out.println(Employee.employees());
    }

    private static void sortByStream() {
        System.out.println("Before Sorting");
        Employee.employees().stream().forEach(System.out::println);

        System.out.println("\n[STREAM] Sorting By Name - ASC");
        Employee.employees().stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\n[STREAM] Sorting By Name - DESC");
        Employee.employees().stream().sorted(Comparator.comparing(Employee::getName).reversed())
                .collect(Collectors.toList()).forEach(System.out::println);
    }

}
