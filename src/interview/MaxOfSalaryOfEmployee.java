package interview;


import model.Dish;

import java.util.*;
import java.util.stream.Collectors;

public class MaxOfSalaryOfEmployee {

    public static void main(String[] args) {
        OptionalInt maxByMapToIntAndMax = Dish.menu()
                .stream()
                .mapToInt(Dish::getCalories)
                .max();
        System.out.println("Max of Calories [mapToInt & max] :: " + maxByMapToIntAndMax.getAsInt());

        Optional<Integer> maxByMapAndMaxWithComparator = Dish.menu()
                .stream()
                .map(Dish::getCalories)
                .max(Comparator.comparingInt(value -> value));
        System.out.println("Max of Calories [map & max with comparator] :: " + maxByMapAndMaxWithComparator.get());

        Optional<Integer> maxWithReduce = Dish.menu()
                .stream()
                .map(Dish::getCalories)
                .reduce(Integer::max);
        System.out.println("Max of Calories [map & reduce] :: " + maxWithReduce.get());

        int maxWithReduceWithDefaultValue = Dish.menu()
                .stream()
                .map(Dish::getCalories)
                .reduce(0, Integer::max);
        System.out.println("Max of Calories [map & reduce with default value] :: " + maxWithReduceWithDefaultValue);

        List<Integer> maxWithSortAndLimit = Dish.menu()
                .stream()
                .map(Dish::getCalories)
                .sorted(Collections.reverseOrder())
                .limit(1)
                .collect(Collectors.toList());
        System.out.println("Max of Calories [map & sort & limit & collect] :: " + maxWithSortAndLimit);

        Optional<Integer> maxWithFindFirst = Dish.menu()
                .stream()
                .map(Dish::getCalories)
                .sorted(Collections.reverseOrder())
                .limit(1)
                .findFirst();
        System.out.println("Max of Calories [map & sort & limit & findFirst] :: " + maxWithFindFirst.get());

        IntSummaryStatistics maxWithSummaryStatistics = Dish.menu()
                .stream()
                .mapToInt(Dish::getCalories)
                .summaryStatistics();
        System.out.println("Max of Calories [map & Summary Statistics] :: " + maxWithSummaryStatistics.getMax());
    }
}
