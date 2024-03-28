package mapping.pack;

import java.math.BigDecimal;
import java.util.stream.Collectors;

public class MappingAPredicate {

    public static void main(String[] args) {

        System.out.println("Employee List");
        model.pack.EmployeeObj.employees().forEach(System.out::println);

        System.out.println("\nMapping To Fetch Employee Names");
        model.pack.EmployeeObj.employees().stream().map(e -> e.getSalary().compareTo(BigDecimal.valueOf(2500000)) > 0)
                .collect(Collectors.toList()).forEach(System.out::println);

    }
}
