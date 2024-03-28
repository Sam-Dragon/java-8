package collectors_summarization.pack;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsAveraging {

    public static void main(String[] args) {
        List<model.pack.DishObj> dishes = model.pack.DishObj.menu();

        System.out.println("Average Int");
        Double averageCaloriesInt = dishes.stream().collect(Collectors.averagingInt(model.pack.DishObj::getCalories));
        System.out.println("average Calories = " + averageCaloriesInt);

        System.out.println("Average Long");
        Double averageCaloriesLong = dishes.stream().collect(Collectors.averagingLong(model.pack.DishObj::getCalories));
        System.out.println("average Calories = " + averageCaloriesLong);

        System.out.println("Summing Double");
        Double averageCaloriesDouble = dishes.stream().collect(Collectors.averagingDouble(model.pack.DishObj::getCalories));
        System.out.println("average Calories = " + averageCaloriesDouble);
    }

}
