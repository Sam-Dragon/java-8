package reducing.pack;

import java.util.Optional;

public class CountNoOfDishes {

    public static void main(String[] args) {
        System.out.println("<<<<<<<<<< Reduce with Initial value >>>>>>>>>");
        Integer count;

        System.out.println("\nCount using reduce & lamda expression");
        count = model.pack.DishObj.menu().stream().map(d -> 1).reduce(0, (a, b) -> a + b);
        System.out.println("No. of Dishes :: " + count);

        System.out.println("\nCount using reduce & Inbuilt Integer sum function");
        count = model.pack.DishObj.menu().stream().map(d -> 1).reduce(0, Integer::sum);
        System.out.println("No. of Dishes :: " + count);

        System.out.println("\n<<<<<<<<<< Reduce without Initial value >>>>>>>>>");

        System.out.println("\nSum using reduce & lamda expression");
        Optional<Integer> optionalResult = model.pack.DishObj.menu().stream().map(d -> 1).reduce((a, b) -> a + b);
        System.out.println("No. of Dishes :: " + optionalResult.get());

        System.out.println("\nSum using reduce & Inbuilt Integer sum function");
        optionalResult = model.pack.DishObj.menu().stream().map(d -> 1).reduce(Integer::sum);
        System.out.println("No. of Dishes :: " + optionalResult.get());

        System.out.println("\nList Method for pulling count");
        System.out.println("No. of Dishes :: " + model.pack.DishObj.menu().size());

        System.out.println("\nStream Method for pulling count");
        System.out.println("No. of Dishes :: " + model.pack.DishObj.menu().stream().count());
    }
}
