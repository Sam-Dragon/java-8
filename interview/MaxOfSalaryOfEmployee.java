package interview;

import interview.model.DishModel;

import java.util.*;
import java.util.stream.Collectors;

public class MaxOfSalaryOfEmployee {

    public static void main(String[] args) {
        OptionalInt maxByMapToIntAndMax = DishModel.menu().stream().mapToInt(DishModel::getCalories).max();
        System.out.println("Max of Calories [mapToInt & max] :: " + maxByMapToIntAndMax.getAsInt());

        Optional<Integer> maxByMapAndMaxWithComparator = DishModel.menu().stream().map(DishModel::getCalories)
                .max(Comparator.comparingInt(value -> value));
        System.out.println("Max of Calories [map & max with comparator] :: " + maxByMapAndMaxWithComparator.get());

        Optional<Integer> maxWithReduce = DishModel.menu().stream().map(DishModel::getCalories).reduce(Integer::max);
        System.out.println("Max of Calories [map & reduce] :: " + maxWithReduce.get());

        int maxWithReduceWithDefaultValue = DishModel.menu().stream().map(DishModel::getCalories).reduce(0, Integer::max);
        System.out.println("Max of Calories [map & reduce with default value] :: " + maxWithReduceWithDefaultValue);

        List<Integer> maxWithSortAndLimit = DishModel.menu().stream().map(DishModel::getCalories)
                .sorted(Collections.reverseOrder()).limit(1).collect(Collectors.toList());
        System.out.println("Max of Calories [map & sort & limit & collect] :: " + maxWithSortAndLimit);

        Optional<Integer> maxWithFindFirst = DishModel.menu().stream().map(DishModel::getCalories)
                .sorted(Collections.reverseOrder()).limit(1).findFirst();
        System.out.println("Max of Calories [map & sort & limit & findFirst] :: " + maxWithFindFirst.get());

        IntSummaryStatistics maxWithSummaryStatistics = DishModel.menu().stream().mapToInt(DishModel::getCalories).summaryStatistics();
        System.out.println("Max of Calories [map & Summary Statistics] :: " + maxWithSummaryStatistics.getMax());
    }
}
