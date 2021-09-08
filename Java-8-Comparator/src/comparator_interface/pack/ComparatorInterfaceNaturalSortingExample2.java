package comparator_interface.pack;

import java.util.Comparator;
import java.util.stream.Collectors;

import model.pack.Employee;
import model.pack.EmployeeImplmementsComparable;

public class ComparatorInterfaceNaturalSortingExample2 {

    public static void main(String[] args) {
        System.out.println("\nSorting With Streams Null First");
        sortByStreamNaturalOrder();
    }

    private static void sortByStreamNaturalOrder() {
        System.out.println("Before Sorting");
        Employee.employeeList().stream().forEach(System.out::println);

        System.out.println("\n[STREAM] Sorting By Name Natural Order - ASC");
        Employee.employeeList().stream().sorted(Comparator.comparing(Employee::getId, Comparator.naturalOrder()))
                .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("\n[STREAM] Sorting By Name - ASC");
        Employee.employeeList().stream().sorted(Comparator.comparing(Employee::getId))
                .collect(Collectors.toList()).forEach(System.out::println);
        
        System.out.println("\n[STREAM] Sorting By Name - ASC [Comparable Implemented]");
        EmployeeImplmementsComparable.employeeList().stream().sorted()
                .collect(Collectors.toList()).forEach(System.out::println);
        
        System.out.println("\n[STREAM] Sorting By Name - ASC [Exception Thrown]");
        Employee.employeeList().stream().sorted()
                .collect(Collectors.toList()).forEach(System.out::println);
        
        
    }

}
