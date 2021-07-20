package mapping.pack;

import java.util.function.Function;
import java.util.stream.Collectors;

import model.pack.Employee;

public class MappingAUnaryOperator {

    public static void main(String[] args) {

        System.out.println("Employee List");
        Employee.employees().forEach(System.out::println);

        System.out.println("\nMapping To Fetch Employee Names");
        Employee.employees().stream().map(e -> e.getName()).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("\nMapping To Fetch Employee Names");
        Employee.employees().stream().map(Function.identity()).collect(Collectors.toList())
                .forEach(System.out::println); // Function.identity() == e --> e
    }
}
