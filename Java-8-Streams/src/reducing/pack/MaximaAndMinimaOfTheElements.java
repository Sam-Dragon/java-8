package reducing.pack;

import java.util.Optional;

public class MaximaAndMinimaOfTheElements {

    public static void main(String[] args) {
        System.out.println("<<<<<<<<<< Reduce with Initial value >>>>>>>>>");
        Integer result;

        System.out.println("\nMaxima using reduce & lamda expression");
        result = model.pack.DishObj.menu().stream().map(model.pack.DishObj::getCalories).reduce(0, (a, b) -> a > b ? a : b);
        System.out.println("Maximum no. of Dish Calories :: " + result);

        System.out.println("\nMaxima using reduce & Inbuilt Integer sum function");
        result = model.pack.DishObj.menu().stream().map(model.pack.DishObj::getCalories).reduce(0, Integer::max);
        System.out.println("Maximum no. of Dish Calories :: " + result);

        System.out.println("\nMinima using reduce & lamda expression");
        result = model.pack.DishObj.menu().stream().map(model.pack.DishObj::getCalories).reduce(0, (a, b) -> a > b ? b : a);
        System.out.println("Minimum no. of Dish Calories :: " + result);

        System.out.println("\nMinima using reduce & Inbuilt Integer sum function");
        result = model.pack.DishObj.menu().stream().map(model.pack.DishObj::getCalories).reduce(0, Integer::min);
        System.out.println("Minimum no. of Dish Calories :: " + result);

        System.out.println("\n<<<<<<<<<< Reduce without Initial value >>>>>>>>>");

        System.out.println("\nMaxima using reduce & lamda expression");
        Optional<Integer> optionalResult = model.pack.DishObj.menu().stream().map(model.pack.DishObj::getCalories).reduce((a, b) -> a > b ? a : b);
        System.out.println("Maximum no. of Dish Calories :: " + optionalResult.get());

        System.out.println("\nMaxima using reduce & Inbuilt Integer sum function");
        optionalResult = model.pack.DishObj.menu().stream().map(model.pack.DishObj::getCalories).reduce(Integer::max);
        System.out.println("Maximum no. of Dish Calories :: " + optionalResult.get());

        System.out.println("\nMinima using reduce & lamda expression");
        optionalResult = model.pack.DishObj.menu().stream().map(model.pack.DishObj::getCalories).reduce((a, b) -> a > b ? b : a);
        System.out.println("Minimum no. of Dish Calories :: " + optionalResult.get());

        System.out.println("\nMinima using reduce & Inbuilt Integer sum function");
        optionalResult = model.pack.DishObj.menu().stream().map(model.pack.DishObj::getCalories).reduce(Integer::min);
        System.out.println("Minimum no. of Dish Calories :: " + optionalResult.get());

        System.out.println("\n<<<<<<<<<< Reduce without variation >>>>>>>>>");

        System.out.println("\nSum using reduce & lamda expression -- PENDING");
        result = model.pack.DishObj.menu().stream().map(model.pack.DishObj::getCalories).reduce(0, (a, b) -> a, (a, b) -> a + b);
        System.out.println("Sum of Dish Calories :: " + result);

    }
}
