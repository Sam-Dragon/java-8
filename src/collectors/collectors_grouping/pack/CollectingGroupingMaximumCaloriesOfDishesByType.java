package collectors.collectors_grouping.pack;

import model.Dish;
import model.Dish.Type;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectingGroupingMaximumCaloriesOfDishesByType {

    public static void main(String[] args) {
        Map<Type, Optional<Dish>> dishesCountByType = Dish.menu()
                .stream()
                .collect(
                        Collectors.groupingBy(Dish::getType, Collectors.maxBy(Comparator.comparing(Dish::getCalories))));

        System.out.println(dishesCountByType);
    }
}
