package collectors_partitioning.pack;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.pack.Dish;
import model.pack.Dish.Type;

public class PartitioningByDishCaloriesGreaterThan400AndGrouping {

    public static void main(String[] args) {
        Map<Boolean, Map<Type, List<Dish>>> dishesGreaterThan400 = Dish.menu().stream().collect(Collectors.partitioningBy(
                dish -> dish.getCalories() > 400, Collectors.groupingBy(Dish::getType)));

        System.out.println(dishesGreaterThan400);
    }
}
