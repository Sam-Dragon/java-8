package comparator_interface.pack;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorInterfaceSingleFieldSortingExample {

    public static void main(String[] args) {
        System.out.println("\nSorting With Streams Comparator");
        sortByStreamComprator();

        System.out.println("\nSorting With Streams");
        sortByStream();

        System.out.println("\nSorting Normally");
        sortNormally();
    }

    private static void sortNormally() {
        List<model.pack.EmployeeObj> employeeList = model.pack.EmployeeObj.employeeList();

        System.out.println("Before Sorting");
        employeeList.stream().forEach(System.out::println);

        System.out.println("\n[NORMAL] Sorting By Id - ASC");
        employeeList.sort(Comparator.comparing(model.pack.EmployeeObj::getId));
        System.out.println(employeeList);

        System.out.println("\n[NORMAL] Sorting By Id - DESC");
        employeeList.sort(Comparator.comparing(model.pack.EmployeeObj::getId).reversed());
        System.out.println(employeeList);
    }

    private static void sortByStream() {
        System.out.println("Before Sorting");
        model.pack.EmployeeObj.employeeList().stream().forEach(System.out::println);

        System.out.println("\n[STREAM] Sorting By Id - ASC");
        model.pack.EmployeeObj.employeeList().stream().sorted(Comparator.comparing(model.pack.EmployeeObj::getId)).collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\n[STREAM] Sorting By Id - DESC");
        model.pack.EmployeeObj.employeeList().stream().sorted(Comparator.comparing(model.pack.EmployeeObj::getId).reversed())
                .collect(Collectors.toList()).forEach(System.out::println);
    }

    private static void sortByStreamComprator() {
        System.out.println("Before Sorting");
        model.pack.EmployeeObj.employeeList().stream().forEach(System.out::println);

        System.out.println("\n[STREAM] Sorting By Id - ASC");
        model.pack.EmployeeObj.employeeList().stream().sorted(Comparator.comparing(model.pack.EmployeeObj::getId)).collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\n[STREAM] Sorting By Id - DESC");
        model.pack.EmployeeObj.employeeList().stream().sorted(Comparator.comparing(model.pack.EmployeeObj::getId, Comparator.reverseOrder())) // Change
                                                                                                                  // is
                                                                                                                  // here
                .collect(Collectors.toList()).forEach(System.out::println);
    }

}
