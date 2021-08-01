package collectors_grouping.pack;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import model.pack.Dish;
import model.pack.Dish.Type;

public class CollectingGroupingMaximumCaloriesOfDishesByType {

    public static void main(String[] args) {
        Map<Type, Optional<Dish>> dishesCountByType = Dish.menu().stream().collect(
                Collectors.groupingBy(Dish::getType, Collectors.maxBy(Comparator.comparing(Dish::getCalories))));

        System.out.println(dishesCountByType);
    }
}
