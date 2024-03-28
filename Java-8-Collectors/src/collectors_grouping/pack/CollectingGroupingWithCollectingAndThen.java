package collectors_grouping.pack;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import model.pack.DishInstance.Type;

public class CollectingGroupingWithCollectingAndThen {

    public static void main(String[] args) {
        System.out.println("Collecting Grouping Maximum Calories Of Dishes By Type Removing Optional");
        Map<Type, model.pack.DishInstance> dishesByType = model.pack.DishInstance.menuUpdated().stream().collect(Collectors.groupingBy(model.pack.DishInstance::getType, Collectors
                .collectingAndThen(Collectors.maxBy(Comparator.comparing(model.pack.DishInstance::getCalories)), Optional::get)));

        System.out.println(dishesByType);
    }

}
