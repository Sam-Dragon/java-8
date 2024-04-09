package src.streams.mapping.pack;

import src.model.Employee;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FlatMappingUsingFunction {

    public static void main(String[] args) {
        System.out.println("Employee List");
        Employee.employees().forEach(System.out::println);

        System.out.println("\nFlat Mapping To Fetch Employee Names");
        Employee.employees().stream().map(e -> e.getName().split(" ")).flatMap(Arrays::stream)
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
