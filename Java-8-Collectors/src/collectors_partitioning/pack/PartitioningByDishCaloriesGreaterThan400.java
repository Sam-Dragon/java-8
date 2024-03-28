package collectors_partitioning.pack;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByDishCaloriesGreaterThan400 {

    public static void main(String[] args) {
        Map<Boolean, List<String>> dishesGreaterThan400 = model.pack.DishObj.menu().stream().collect(Collectors.partitioningBy(
                dish -> dish.getCalories() > 400, Collectors.mapping(model.pack.DishObj::getName, Collectors.toList())));

        System.out.println(dishesGreaterThan400);

        System.out.println("\nDishes Greater Than 400 Calories");
        dishesGreaterThan400.get(true).forEach(System.out::println);

        System.out.println("\nDishes Less Than 400 Calories");
        dishesGreaterThan400.get(false).forEach(System.out::println);
    }
}
