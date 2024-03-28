package collectors_partitioning.pack;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class PartitioningByDishCaloriesAndCollectingAndThen {

    public static void main(String[] args) {
        Map<Boolean, model.pack.DishObj> vegeterianDishesWithMaxCalories = model.pack.DishObj.menu().stream()
                .collect(Collectors.partitioningBy(model.pack.DishObj::isVegeterian, Collectors
                        .collectingAndThen(Collectors.maxBy(Comparator.comparing(model.pack.DishObj::getCalories)), Optional::get)));

        System.out.println(vegeterianDishesWithMaxCalories);
    }
}
