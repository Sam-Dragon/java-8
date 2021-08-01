package collectors_grouping.pack;

import java.util.Map;
import java.util.stream.Collectors;

import model.pack.Dish;
import model.pack.Dish.Type;

public class CollectingGroupingCountingDishesByType {

    public static void main(String[] args) {
        Map<Type, Long> dishesCountByType = Dish.menu().stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors.counting()));

        System.out.println(dishesCountByType);
    }
}
