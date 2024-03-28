package method_references.pack;

import java.util.stream.Collectors;

public class MethodReferencesMultipleParameterExample {

    public static void main(String[] args) {
        System.out.println("Lamda Expression");
        model.pack.DishObj.menu().stream().collect(Collectors.groupingBy(model.pack.DishObj::getName, Collectors.counting()))
                .forEach((type, dish) -> System.out.print(type + ", " + dish));

        System.out.println("\n\nMethod References");
        model.pack.DishObj.menu().stream().collect(Collectors.groupingBy(model.pack.DishObj::getName, Collectors.counting()))
                .forEach(MethodReferencesMultipleParameterExample::show);
    }

    public static void show(String type, Long dish) {
        System.out.print(type + ", " + dish);
    }
}
