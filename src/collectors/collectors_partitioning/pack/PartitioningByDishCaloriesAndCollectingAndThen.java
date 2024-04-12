package src.collectors.collectors_partitioning.pack;


import src.model.Dish;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class PartitioningByDishCaloriesAndCollectingAndThen {

    public static void main(String[] args) {
        Map<Boolean, Dish> vegetarianDishesWithMaxCalories = Dish.menu()
                .stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian, Collectors
                        .collectingAndThen(Collectors.maxBy(Comparator.comparing(Dish::getCalories)), Optional::get)));

        System.out.println(vegetarianDishesWithMaxCalories);
    }
}
