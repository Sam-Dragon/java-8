package streams_operations.pack;

import java.util.stream.Stream;

import model.pack.Dish;

public class IntermediateOperations {

    public static void main(String[] args) {
        System.out.println("Intermediate Opertions");
        Stream<String> dishes = Dish.menu().stream().map(d -> {
            System.out.println("Print only when terminal operation is called");
            return d.getName();
        });
        System.out.println(dishes);
    }
}
