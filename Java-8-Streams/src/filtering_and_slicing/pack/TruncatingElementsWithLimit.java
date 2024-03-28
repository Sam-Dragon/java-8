package filtering_and_slicing.pack;

import java.util.stream.Collectors;

public class TruncatingElementsWithLimit {

    public static void main(String[] args) {
        System.out.println("Employee List");
        model.pack.EmployeeObj.employees().stream().map(model.pack.EmployeeObj::getName).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("\nLimit First Three Name Unique Employee List");
        model.pack.EmployeeObj.employees().stream().map(model.pack.EmployeeObj::getName).limit(3).collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
