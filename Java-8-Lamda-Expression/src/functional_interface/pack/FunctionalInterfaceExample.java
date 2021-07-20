package functional_interface.pack;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import model.pack.Employee;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        CustomFunctionalInterface runnable = () -> System.out.println("Hello World");
        runnable.display();

        System.out.println("\nBEFORE");
        System.out.println(Employee.employees());

        Comparator<Employee> sortByName = (a, b) -> a.getName().compareToIgnoreCase(b.getName());
        List<Employee> Updatedemployees = Employee.employees().stream().sorted(sortByName).collect(Collectors.toList());

        System.out.println("\nAFTER");
        System.out.println(Updatedemployees);
    }
}
