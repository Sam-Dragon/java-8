package filtering_and_slicing.pack;

import java.util.stream.Collectors;

public class FilteringAPredicate {

    public static void main(String[] args) {
        System.out.println("Employee List");
        model.pack.EmployeeObj.employees().forEach(System.out::println);

        System.out.println("\nFiltered Name Unique Employee List");
        model.pack.EmployeeObj.employees().stream().filter(e -> "Khushboo".equalsIgnoreCase(e.getName())).collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
