package collectors_grouping.pack;

import java.util.Map;
import java.util.stream.Collectors;

import model.pack.DishObj.Type;

public class CollectingGroupingCountingDishesByType {

    public static void main(String[] args) {
        Map<Type, Long> dishesCountByType = model.pack.DishObj.menu().stream()
                .collect(Collectors.groupingBy(model.pack.DishObj::getType, Collectors.counting()));

        System.out.println(dishesCountByType);
    }
}
