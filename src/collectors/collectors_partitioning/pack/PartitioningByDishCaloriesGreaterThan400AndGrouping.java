package src.collectors.collectors_partitioning.pack;


import src.model.Dish;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByDishCaloriesGreaterThan400AndGrouping {

    public static void main(String[] args) {
        Map<Boolean, Map<Dish.Type, List<Dish>>> dishesGreaterThan400 = Dish.menu()
                .stream()
                .collect(Collectors.partitioningBy(dish -> dish.getCalories() > 400,
                        Collectors.groupingBy(Dish::getType)));

        System.out.println(dishesGreaterThan400);
    }
}
