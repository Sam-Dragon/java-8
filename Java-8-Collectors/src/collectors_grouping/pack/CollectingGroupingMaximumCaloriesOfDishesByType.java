package collectors_grouping.pack;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import model.pack.DishObj.Type;

public class CollectingGroupingMaximumCaloriesOfDishesByType {

    public static void main(String[] args) {
        Map<Type, Optional<model.pack.DishObj>> dishesCountByType = model.pack.DishObj.menu().stream().collect(
                Collectors.groupingBy(model.pack.DishObj::getType, Collectors.maxBy(Comparator.comparing(model.pack.DishObj::getCalories))));

        System.out.println(dishesCountByType);
    }
}
