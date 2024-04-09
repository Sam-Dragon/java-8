package src.streams.streams_features.pack;

import src.model.Dish;

import java.util.List;

public class StreamsSupportsInternalIteration {

    public static void main(String[] args) {
        System.out.println("External Iteration");
        externalIteration(Dish.menu());

        System.out.println("\n\nInternal Iteration");
        internalIteration(Dish.menu());
    }

    private static void internalIteration(List<Dish> menu) {
        menu.forEach(dish -> System.out.print(dish.getName() + ", "));
    }

    public static void externalIteration(List<Dish> list) {
        for (Dish dish : list) {
            System.out.print(dish.getName() + ", ");
        }
    }
}
