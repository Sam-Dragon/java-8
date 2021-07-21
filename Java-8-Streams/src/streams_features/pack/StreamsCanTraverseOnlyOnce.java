package streams_features.pack;

import java.util.stream.Stream;

import model.pack.Dish;

public class StreamsCanTraverseOnlyOnce {

    public static void main(String[] args) {
        Stream<String> dishes = Dish.menu().stream().map(Dish::getName);

        System.out.println("Traverse For First Time");
        dishes.forEach(e -> System.out.print(e + ", "));

        System.out.println("\n\nTraverse For Second Time");
        dishes.forEach(e -> System.out.print(e + ", "));
    }
}
