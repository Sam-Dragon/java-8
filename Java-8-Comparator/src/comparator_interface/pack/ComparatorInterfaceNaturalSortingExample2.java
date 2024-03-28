package comparator_interface.pack;

import java.util.Comparator;
import java.util.stream.Collectors;

import model.pack.EmployeeImplmementsComparable;

public class ComparatorInterfaceNaturalSortingExample2 {

    public static void main(String[] args) {
        System.out.println("\nSorting With Streams Null First");
        sortByStreamNaturalOrder();
    }

    private static void sortByStreamNaturalOrder() {
        System.out.println("Before Sorting");
        model.pack.EmployeeObj.employeeList().stream().forEach(System.out::println);

        System.out.println("\n[STREAM] Sorting By Name Natural Order - ASC");
        model.pack.EmployeeObj.employeeList().stream().sorted(Comparator.comparing(model.pack.EmployeeObj::getId, Comparator.naturalOrder()))
                .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("\n[STREAM] Sorting By Name - ASC");
        model.pack.EmployeeObj.employeeList().stream().sorted(Comparator.comparing(model.pack.EmployeeObj::getId))
                .collect(Collectors.toList()).forEach(System.out::println);
        
        System.out.println("\n[STREAM] Sorting By Name - ASC [Comparable Implemented]");
        EmployeeImplmementsComparable.employeeList().stream().sorted()
                .collect(Collectors.toList()).forEach(System.out::println);
        
        System.out.println("\n[STREAM] Sorting By Name - ASC [Exception Thrown]");
        model.pack.EmployeeObj.employeeList().stream().sorted()
                .collect(Collectors.toList()).forEach(System.out::println);
        
        
    }

}
