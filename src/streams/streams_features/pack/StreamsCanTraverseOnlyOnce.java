package src.streams.streams_features.pack;

import src.model.Dish;

import java.util.stream.Stream;

public class StreamsCanTraverseOnlyOnce {

    public static void main(String[] args) {
        Stream<String> dishes = Dish.menu()
                .stream()
                .map(Dish::getName);

        System.out.println("> Traverse For First Time");
        dishes.forEach(e -> System.out.print(e + ", "));

        System.out.println("\n\n> Traverse For Second Time");
        dishes.forEach(e -> System.out.print(e + ", "));
    }
}
