package filtering_and_slicing.pack;

import java.util.stream.Collectors;

public class SlicingElementsWithSkip {

    public static void main(String[] args) {
        System.out.println("Employee List");
        model.pack.EmployeeObj.employees().stream().map(model.pack.EmployeeObj::getName).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("\nSkip First Three Name Unique Employee List");
        model.pack.EmployeeObj.employees().stream().map(model.pack.EmployeeObj::getName).skip(3).collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
