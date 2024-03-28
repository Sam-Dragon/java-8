package collectors_summarization.pack;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

public class CollectorsSummarizing {

    public static void main(String[] args) {
        List<model.pack.DishObj> dishes = model.pack.DishObj.menu();

        System.out.println("Summarizing Int");
        IntSummaryStatistics distStatisticsInt = dishes.stream().collect(Collectors.summarizingInt(model.pack.DishObj::getCalories));
        System.out.println("Total Calories = " + distStatisticsInt);
        
        System.out.println(distStatisticsInt.getCount());

        System.out.println("Summarizing Long");
        LongSummaryStatistics distStatisticsLong = dishes.stream()
                .collect(Collectors.summarizingLong(model.pack.DishObj::getCalories));
        System.out.println("Total Calories = " + distStatisticsLong);

        System.out.println("Summing Double");
        DoubleSummaryStatistics distStatisticsDouble = dishes.stream()
                .collect(Collectors.summarizingDouble(model.pack.DishObj::getCalories));
        System.out.println("Total Calories = " + distStatisticsDouble);
    }

}
