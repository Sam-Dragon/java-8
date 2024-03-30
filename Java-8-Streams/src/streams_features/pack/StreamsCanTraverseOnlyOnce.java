package streams_features.pack;

import java.util.stream.Stream;

public class StreamsCanTraverseOnlyOnce {

    public static void main(String[] args) {
        Stream<String> dishes = model.pack.DishObj.menu().stream().map(model.pack.DishObj::getName);

        System.out.println("> Traverse For First Time");
        dishes.forEach(e -> System.out.print(e + ", "));

        System.out.println("\n\n> Traverse For Second Time");
        dishes.forEach(e -> System.out.print(e + ", "));
    }
}
