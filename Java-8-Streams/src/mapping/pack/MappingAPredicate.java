package mapping.pack;

import java.math.BigDecimal;
import java.util.stream.Collectors;

import model.pack.Employee;

public class MappingAPredicate {

    public static void main(String[] args) {

        System.out.println("Employee List");
        Employee.employees().forEach(System.out::println);

        System.out.println("\nMapping To Fetch Employee Names");
        Employee.employees().stream().map(e -> e.getSalary().compareTo(BigDecimal.valueOf(2500000)) > 0)
                .collect(Collectors.toList()).forEach(System.out::println);

    }
}
