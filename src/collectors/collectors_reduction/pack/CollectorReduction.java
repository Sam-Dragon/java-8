package collectors.collectors_reduction.pack;


import model.Dish;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorReduction {

    public static void main(String[] args) {
        List<Dish> dishes = Dish.menu();

        System.out.println("\n# Counting Dishes Without Initial Value And Mapping Column in Collector");
        countingEmployees(dishes);

        System.out.println("\n# Summing Calories of Dishes With Initial Value And Without Mapping Column in Collector");
        sumCaloriesOfEmployees(dishes);

        System.out.println("\n# Maximum Calories Of Dish with Initial Value And With Mapping Column in Collector");
        maximumCaloriesOfEmployee(dishes);

        System.out.println("\n# Maximum Calories Of Dish With Initial Value And Without Mapping Column in Collector");
        minimumCaloriesOfEmployee(dishes);
    }

    private static void countingEmployees(List<Dish> dishes) {
        Optional<Integer> count = dishes.stream()
                .map(d -> 1)
                .collect(Collectors.reducing(Integer::sum));
        System.out.println(count.get());
    }

    private static void sumCaloriesOfEmployees(List<Dish> dishes) {
        Integer sum = dishes.stream()
                .map(Dish::getCalories)
                .collect(Collectors.reducing(0, Integer::sum));
        System.out.println(sum);
    }

    private static void maximumCaloriesOfEmployee(List<Dish> employees) {
        Integer max = employees.stream()
                .collect(Collectors.reducing(0, Dish::getCalories, Integer::max));
        System.out.println(max);
    }

    private static void minimumCaloriesOfEmployee(List<Dish> employees) {
        Integer min = employees.stream()
                .map(Dish::getCalories)
                .collect(Collectors.reducing(0, Integer::min));
        System.out.println(min);
    }

}
