package src.collectors.collectors_grouping.pack;


import src.model.Dish;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectingGroupingWithMapping {

    public static void main(String[] args) {
        Map<Dish.Type, List<String>> dishesNameByType = Dish.menu().stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors.mapping(Dish::getName, Collectors.toList())));

        System.out.println(dishesNameByType);

        Map<Dish.Type, List<CollectorGroupingWithEnums.Calories>> dishesCaloriesByType = Dish.menu().stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors.mapping(d -> {
                    if (d.getCalories() <= 400)
                        return CollectorGroupingWithEnums.Calories.DIET;
                    else if (d.getCalories() <= 700)
                        return CollectorGroupingWithEnums.Calories.NORMAL;
                    else
                        return CollectorGroupingWithEnums.Calories.FAT;
                }, Collectors.toList())));

        System.out.println(dishesCaloriesByType);
    }

}
