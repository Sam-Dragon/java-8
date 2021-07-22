package streams_creation.pack;

import model.pack.Dish;

public class CreatingFiniteStreamFromCollectionStream {

    public static void main(String[] args) {
        Dish.menu().stream().map(Dish::getName).forEach(System.out::println);
    }
}
