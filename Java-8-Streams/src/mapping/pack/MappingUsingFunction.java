package mapping.pack;

import java.util.stream.Collectors;

public class MappingUsingFunction {

    public static void main(String[] args) {
        System.out.println("Employee List");
        model.pack.EmployeeObj.employees().forEach(System.out::println);

        System.out.println("\nMapping To Fetch Employee Names");
        model.pack.EmployeeObj.employees().stream().map(model.pack.EmployeeObj::getName).collect(Collectors.toList()).forEach(System.out::println);
    }
}
