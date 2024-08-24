package collectors.collectors_summarization.pack;

import model.Dish;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsAveraging {

    public static void main(String[] args) {
        List<Dish> dishes = Dish.menu();

        System.out.println("Average Int");
        Double averageCaloriesInt = dishes.stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println("average Calories = " + averageCaloriesInt);

        System.out.println("Average Long");
        Double averageCaloriesLong = dishes.stream()
                .collect(Collectors.averagingLong(Dish::getCalories));
        System.out.println("average Calories = " + averageCaloriesLong);

        System.out.println("Summing Double");
        Double averageCaloriesDouble = dishes.stream()
                .collect(Collectors.averagingDouble(Dish::getCalories));
        System.out.println("average Calories = " + averageCaloriesDouble);
    }

}
