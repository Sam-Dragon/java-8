package streams.streams_creation.pack;

import model.Dish;

public class CreatingFiniteStreamFromCollectionStream {

    public static void main(String[] args) {
        Dish.menu()
                .stream()
                .map(Dish::getName)
                .forEach(System.out::println);
    }
}
