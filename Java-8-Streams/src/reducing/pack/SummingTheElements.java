package reducing.pack;

import java.util.Optional;

import model.pack.Dish;

public class SummingTheElements {

    public static void main(String[] args) {
        System.out.println("<<<<<<<<<< Reduce with Initial value >>>>>>>>>");
        Integer result;

        System.out.println("\nSum using reduce & lamda expression");
        result = Dish.menu().stream().map(Dish::getCalories).reduce(0, (a, b) -> a + b);
        System.out.println("Sum of Dish Calories :: " + result);

        System.out.println("\nSum using reduce & Inbuilt Integer sum function");
        result = Dish.menu().stream().map(Dish::getCalories).reduce(0, Integer::sum);
        System.out.println("Sum of Dish Calories :: " + result);

        System.out.println("\n<<<<<<<<<< Reduce without Initial value >>>>>>>>>");

        System.out.println("\nSum using reduce & lamda expression");
        Optional<Integer> optionalResult = Dish.menu().stream().map(Dish::getCalories).reduce((a, b) -> a + b);
        System.out.println("Sum of Dish Calories :: " + optionalResult.get());

        System.out.println("\nSum using reduce & Inbuilt Integer sum function");
        optionalResult = Dish.menu().stream().map(Dish::getCalories).reduce(Integer::sum);
        System.out.println("Sum of Dish Calories :: " + optionalResult.get());

        System.out.println("\n<<<<<<<<<< Reduce without variation >>>>>>>>>");

        System.out.println("\nSum using reduce & lamda expression -- PENDING");
        result = Dish.menu().stream().map(Dish::getCalories).reduce(0, (a, b) -> a, (a, b) -> a + b);
        System.out.println("Sum of Dish Calories :: " + result);

    }
}
