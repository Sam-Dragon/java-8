package mapping.pack;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FlatMappingUsingFunction {

    public static void main(String[] args) {
        System.out.println("Employee List");
        model.pack.EmployeeObj.employees().forEach(System.out::println);

        System.out.println("\nFlat Mapping To Fetch Employee Names");
        model.pack.EmployeeObj.employees().stream().map(e -> e.getName().split(" ")).flatMap(Arrays::stream)
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
