package src.streams.streams_operations.pack;

import src.model.Dish;

import java.util.stream.Stream;

public class TerminalOperations {

    public static void main(String[] args) {
        System.out.println("Intermediate Operations");
        Stream<String> dishes = Dish.menu().stream().map(d -> {
            System.out.println("Print only when terminal operation is called");
            return d.getName();
        });
        System.out.println("Dishes :: " + dishes);

        System.out.println("\n<<<<<<<<<<< >>>>>>>>>>>>");
        System.out.println("Terminal Operations");
        dishes.forEach(System.out::println);
    }
}
