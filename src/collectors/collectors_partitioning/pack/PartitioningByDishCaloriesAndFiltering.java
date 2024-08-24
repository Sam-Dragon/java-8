package collectors.collectors_partitioning.pack;


import model.Dish;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByDishCaloriesAndFiltering {

    public static void main(String[] args) {

        Map<Boolean, List<String>> vegetarianDishesWithMaxCalories = Dish.menu()
                .stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian,
                        Collectors.filtering(Dish -> Dish.getCalories() > 500,
                                Collectors.mapping(Dish::getName, Collectors.toList()))));

        System.out.println("Veg Dishes :: " + vegetarianDishesWithMaxCalories.get(true));
        System.out.println("Non-Veg Dishes :: " + vegetarianDishesWithMaxCalories.get(false));
    }
}
