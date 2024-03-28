package functional_interface.pack;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        functional_interface.pack.CustomFunctionalInterface runnable = () -> System.out.println("Hello World");
        runnable.display();

        System.out.println("\nBEFORE");
        System.out.println(model.pack.EmployeeObj.employees());

        Comparator<model.pack.EmployeeObj> sortByName = (a, b) -> a.getName().compareToIgnoreCase(b.getName());
        List<model.pack.EmployeeObj> Updatedemployees = model.pack.EmployeeObj.employees().stream().sorted(sortByName).collect(Collectors.toList());

        System.out.println("\nAFTER");
        System.out.println(Updatedemployees);
    }
}
