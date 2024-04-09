package src.collectors.collectors_grouping.pack;

import src.model.Dish;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorGroupingWithEnums {

    public static void main(String[] args) {

        Map<Calories, List<Dish>> dishesByCalorieLevel = Dish.menu().stream().collect(Collectors.groupingBy(d -> {
            if (d.getCalories() <= 400)
                return Calories.DIET;
            else if (d.getCalories() <= 700)
                return Calories.NORMAL;
            else
                return Calories.FAT;
        }));

        dishesByCalorieLevel.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    public enum Calories {
        DIET, NORMAL, FAT
    }
}
