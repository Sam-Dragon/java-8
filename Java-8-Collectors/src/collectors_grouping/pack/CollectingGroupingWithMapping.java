package collectors_grouping.pack;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import collectors_grouping.pack.CollectorGroupingWithEnums.Calories;
import model.pack.DishObj.Type;

public class CollectingGroupingWithMapping {

    public static void main(String[] args) {
        Map<Type, List<String>> dishesNameByType = model.pack.DishObj.menu().stream()
                .collect(Collectors.groupingBy(model.pack.DishObj::getType, Collectors.mapping(model.pack.DishObj::getName, Collectors.toList())));

        System.out.println(dishesNameByType);

        Map<Type, List<Calories>> dishesCaloriesByType = model.pack.DishObj.menu().stream()
                .collect(Collectors.groupingBy(model.pack.DishObj::getType, Collectors.mapping(d -> {
                    if (d.getCalories() <= 400)
                        return Calories.DIET;
                    else if (d.getCalories() <= 700)
                        return Calories.NORMAL;
                    else
                        return Calories.FAT;
                }, Collectors.toList())));

        System.out.println(dishesCaloriesByType);
    }

}
