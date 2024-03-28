package collectors_summarization.pack;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsSumming {

    public static void main(String[] args) {
        List<model.pack.DishObj> dishes = model.pack.DishObj.menu(); // new ArrayList<Dish>();

        System.out.println("Summing Int");
        Integer totalCaloriesInt = dishes.stream().collect(Collectors.summingInt(model.pack.DishObj::getCalories));
        System.out.println("Total Calories = " + totalCaloriesInt);

        System.out.println("Summing Long");
        Long totalCaloriesLong = dishes.stream().collect(Collectors.summingLong(model.pack.DishObj::getCalories));
        System.out.println("Total Calories = " + totalCaloriesLong);

        System.out.println("Summing Double");
        Double totalCaloriesDouble = dishes.stream().collect(Collectors.summingDouble(model.pack.DishObj::getCalories));
        System.out.println("Total Calories = " + totalCaloriesDouble);
    }

}
