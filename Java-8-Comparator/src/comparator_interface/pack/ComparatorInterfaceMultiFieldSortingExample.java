package comparator_interface.pack;

import java.util.Comparator;
import java.util.stream.Collectors;

public class ComparatorInterfaceMultiFieldSortingExample {

    public static void main(String[] args) {
        System.out.println("\nSorting With Streams");
        sortByStream();
    }

    private static void sortByStream() {
        System.out.println("Before Sorting");
        model.pack.EmployeeObj.employees().stream().forEach(System.out::println);

        System.out.println("\n[STREAM] Sorting By Name then id - ASC");
        model.pack.EmployeeObj.employees().stream().sorted(Comparator.comparing(model.pack.EmployeeObj::getName).thenComparing(model.pack.EmployeeObj::getId))
                .collect(Collectors.toList()).forEach(System.out::println);
    }

}
