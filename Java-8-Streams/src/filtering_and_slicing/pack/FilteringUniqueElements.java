package filtering_and_slicing.pack;

import java.util.stream.Collectors;

public class FilteringUniqueElements {

    public static void main(String[] args) {
        System.out.println("Employee List");
        model.pack.EmployeeObj.employees().stream().map(model.pack.EmployeeObj::getName).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("\nFiltered Name Unique Employee List - Using distinct");
        model.pack.EmployeeObj.employees().stream().map(model.pack.EmployeeObj::getName).filter(e -> "Khushboo Shah".equalsIgnoreCase(e)).distinct()
                .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("\nFiltered Name Unique Employee List - Using Set");
        model.pack.EmployeeObj.employees().stream().map(model.pack.EmployeeObj::getName).filter(e -> "Khushboo Shah".equalsIgnoreCase(e))
                .collect(Collectors.toSet()).forEach(System.out::println);
    }
}
