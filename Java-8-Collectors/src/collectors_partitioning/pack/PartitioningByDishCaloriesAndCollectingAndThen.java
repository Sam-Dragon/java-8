package collectors_partitioning.pack;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import model.pack.Dish;

public class PartitioningByDishCaloriesAndCollectingAndThen {

    public static void main(String[] args) {
        Map<Boolean, Dish> vegeterianDishesWithMaxCalories = Dish.menu().stream()
                .collect(Collectors.partitioningBy(Dish::isVegeterian, Collectors
                        .collectingAndThen(Collectors.maxBy(Comparator.comparing(Dish::getCalories)), Optional::get)));

        System.out.println(vegeterianDishesWithMaxCalories);
    }
}
