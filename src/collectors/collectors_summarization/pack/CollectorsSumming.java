package src.collectors.collectors_summarization.pack;


import src.model.Dish;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsSumming {

    public static void main(String[] args) {
        List<Dish> dishes = Dish.menu(); // new ArrayList<Dish>();

        System.out.println("Summing Int");
        Integer totalCaloriesInt = dishes.stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println("Total Calories = " + totalCaloriesInt);

        System.out.println("Summing Long");
        Long totalCaloriesLong = dishes.stream()
                .collect(Collectors.summingLong(Dish::getCalories));
        System.out.println("Total Calories = " + totalCaloriesLong);

        System.out.println("Summing Double");
        Double totalCaloriesDouble = dishes.stream()
                .collect(Collectors.summingDouble(Dish::getCalories));
        System.out.println("Total Calories = " + totalCaloriesDouble);
    }

}
