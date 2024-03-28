package collectors_reduction.pack;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorReduction {

    public static void main(String[] args) {
        List<model.pack.DishObj> dishes = model.pack.DishObj.menu();

        System.out.println("\n# Counting Dishes Without Initial Value And Mapping Column in Collector");
        countingEmployees(dishes);

        System.out.println("\n# Summing Calories of Dishes With Initial Value And Without Mapping Column in Collector");
        sumCaloriesOfEmployees(dishes);

        System.out.println("\n# Maximum Calories Of Dish with Initial Value And With Mapping Column in Collector");
        maximumCaloriesOfEmployee(dishes);

        System.out.println("\n# Maximum Calories Of Dish With Initial Value And Without Mapping Column in Collector");
        minimumCaloriesOfEmployee(dishes);
    }

    private static void countingEmployees(List<model.pack.DishObj> dishes) {
        Optional<Integer> count = dishes.stream().map(d -> 1).collect(Collectors.reducing(Integer::sum));
        System.out.println(count.get());
    }

    private static void sumCaloriesOfEmployees(List<model.pack.DishObj> dishes) {
        Integer sum = dishes.stream().map(model.pack.DishObj::getCalories).collect(Collectors.reducing(0, Integer::sum));
        System.out.println(sum);
    }

    private static void maximumCaloriesOfEmployee(List<model.pack.DishObj> employees) {
        Integer max = employees.stream().collect(Collectors.reducing(0, model.pack.DishObj::getCalories, Integer::max));
        System.out.println(max);
    }

    private static void minimumCaloriesOfEmployee(List<model.pack.DishObj> employees) {
        Integer min = employees.stream().map(model.pack.DishObj::getCalories).collect(Collectors.reducing(0, Integer::min));
        System.out.println(min);
    }

}
