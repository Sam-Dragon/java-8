package numeric_streams.pack;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class MaximaAndMinimaOfTheElements {

    public static void main(String[] args) {
        System.out.println("<<<<<<<< Maximum >>>>>>>>>>");

        System.out.println("\nMax using mapToInt & max function");
        OptionalInt resultInt = model.pack.DishObj.menu().stream().mapToInt(model.pack.DishObj::getCalories).max();
        System.out.println("Max of Dish Calories :: " + resultInt.getAsInt());

        System.out.println("\nMax using mapToLong & max function");
        OptionalLong resultLong = model.pack.DishObj.menu().stream().mapToLong(model.pack.DishObj::getCalories).max();
        System.out.println("Max of Dish Calories :: " + resultLong.getAsLong());

        System.out.println("\nMax using mapToDouble & max function");
        OptionalDouble resultDouble = model.pack.DishObj.menu().stream().mapToDouble(model.pack.DishObj::getCalories).max();
        System.out.println("Max of Dish Calories :: " + resultDouble.getAsDouble());

        System.out.println("<<<<<<<< Maximum >>>>>>>>>>");

        System.out.println("\nMin using mapToInt & min function");
        resultInt = model.pack.DishObj.menu().stream().mapToInt(model.pack.DishObj::getCalories).min();
        System.out.println("Min of Dish Calories :: " + resultInt.getAsInt());

        System.out.println("\nMin using mapToLong & min function");
        resultLong = model.pack.DishObj.menu().stream().mapToLong(model.pack.DishObj::getCalories).min();
        System.out.println("Min of Dish Calories :: " + resultLong.getAsLong());

        System.out.println("\nMin using mapToDouble & min function");
        resultDouble = model.pack.DishObj.menu().stream().mapToDouble(model.pack.DishObj::getCalories).min();
        System.out.println("Min of Dish Calories :: " + resultDouble.getAsDouble());

    }
}
