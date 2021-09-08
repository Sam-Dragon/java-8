package collectors_grouping.pack;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import model.pack.Dish;
import model.pack.Dish.Type;

public class CollectingGroupingWithCollectingAndThen {

    public static void main(String[] args) {
        System.out.println("Collecting Grouping Maximum Calories Of Dishes By Type Removing Optional");
        Map<Type, Dish> dishesByType = Dish.menuUpdated().stream().collect(Collectors.groupingBy(Dish::getType, Collectors
                .collectingAndThen(Collectors.maxBy(Comparator.comparing(Dish::getCalories)), Optional::get)));

        System.out.println(dishesByType);
    }

}
