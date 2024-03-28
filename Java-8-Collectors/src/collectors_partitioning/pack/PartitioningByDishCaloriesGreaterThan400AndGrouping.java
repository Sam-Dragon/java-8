package collectors_partitioning.pack;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.pack.DishObj.Type;

public class PartitioningByDishCaloriesGreaterThan400AndGrouping {

    public static void main(String[] args) {
        Map<Boolean, Map<Type, List<model.pack.DishObj>>> dishesGreaterThan400 = model.pack.DishObj.menu().stream().collect(Collectors.partitioningBy(
                dish -> dish.getCalories() > 400, Collectors.groupingBy(model.pack.DishObj::getType)));

        System.out.println(dishesGreaterThan400);
    }
}
