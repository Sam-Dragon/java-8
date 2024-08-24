package collectors.collectors_grouping.pack;

import model.Dish;

import java.util.Map;
import java.util.stream.Collectors;

public class CollectingGroupingCountingDishesByType {

    public static void main(String[] args) {
        Map<Dish.Type, Long> dishesCountByType = Dish.menu()
                .stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors.counting()));

        System.out.println(dishesCountByType);
    }
}
