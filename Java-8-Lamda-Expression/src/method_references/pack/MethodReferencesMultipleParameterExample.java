package method_references.pack;

import java.util.stream.Collectors;

import model.pack.Dish;

public class MethodReferencesMultipleParameterExample {

    public static void main(String[] args) {
        System.out.println("Lamda Expression");
        Dish.menu().stream().collect(Collectors.groupingBy(Dish::getName, Collectors.counting()))
                .forEach((type, dish) -> System.out.print(type + ", " + dish));

        System.out.println("\n\nMethod References");
        Dish.menu().stream().collect(Collectors.groupingBy(Dish::getName, Collectors.counting()))
                .forEach(MethodReferencesMultipleParameterExample::show);
    }

    public static void show(String type, Long dish) {
        System.out.print(type + ", " + dish);
    }
}
