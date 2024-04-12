package src.streams.streams_creation.pack;

import src.model.Dish;

public class CreatingFiniteStreamFromCollectionStream {

    public static void main(String[] args) {
        Dish.menu()
                .stream()
                .map(Dish::getName)
                .forEach(System.out::println);
    }
}
