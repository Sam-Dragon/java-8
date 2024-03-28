package comparator_interface.pack;

import java.util.Comparator;
import java.util.stream.Collectors;

public class ComparatorInterfaceNullSortingExample {

    public static void main(String[] args) {
        System.out.println("\nSorting With Streams Null First");
        sortByStreamNullFirst();
        
        System.out.println("\nSorting With Streams Null Last");
        sortByStreamNullLast();
    }

    private static void sortByStreamNullFirst() {
        System.out.println("Before Sorting");
        model.pack.EmployeeObj.employeeList().stream().forEach(System.out::println);

        System.out.println("\n[STREAM] Sorting By Name Null First - ASC");
        model.pack.EmployeeObj.employeeList().stream().sorted(Comparator.nullsFirst(Comparator.comparing(model.pack.EmployeeObj::getName)))
                .collect(Collectors.toList()).forEach(System.out::println);
    }

    private static void sortByStreamNullLast() {
        System.out.println("Before Sorting");
        model.pack.EmployeeObj.employeeList().stream().forEach(System.out::println);

        System.out.println("\n[STREAM] Sorting By Name Null Last - ASC");
        model.pack.EmployeeObj.employeeList().stream().sorted(Comparator.nullsLast(Comparator.comparing(model.pack.EmployeeObj::getName)))
                .collect(Collectors.toList()).forEach(System.out::println);
    }

}
