package src.collectors.collectors_summarization.pack;


import src.model.Dish;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

public class CollectorsSummarizing {

    public static void main(String[] args) {
        List<Dish> dishes = Dish.menu();

        System.out.println("Summarizing Int");
        IntSummaryStatistics distStatisticsInt = dishes.stream().collect(Collectors.summarizingInt(Dish::getCalories));
        System.out.println("Total Calories = " + distStatisticsInt);

        System.out.println(distStatisticsInt.getCount());

        System.out.println("Summarizing Long");
        LongSummaryStatistics distStatisticsLong = dishes.stream()
                .collect(Collectors.summarizingLong(Dish::getCalories));
        System.out.println("Total Calories = " + distStatisticsLong);

        System.out.println("Summing Double");
        DoubleSummaryStatistics distStatisticsDouble = dishes.stream()
                .collect(Collectors.summarizingDouble(Dish::getCalories));
        System.out.println("Total Calories = " + distStatisticsDouble);
    }

}
