package src.streams.numeric_streams.pack;

import src.model.Dish;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class MaximaAndMinimaOfTheElements {

    public static void main(String[] args) {
        System.out.println("<<<<<<<< Maximum >>>>>>>>>>");

        System.out.println("\nMax using mapToInt & max function");
        OptionalInt resultInt = Dish.menu()
                .stream()
                .mapToInt(Dish::getCalories)
                .max();
        System.out.println("Max of Dish Calories :: " + resultInt.getAsInt());

        System.out.println("\nMax using mapToLong & max function");
        OptionalLong resultLong = Dish.menu()
                .stream()
                .mapToLong(Dish::getCalories)
                .max();
        System.out.println("Max of Dish Calories :: " + resultLong.getAsLong());

        System.out.println("\nMax using mapToDouble & max function");
        OptionalDouble resultDouble = Dish.menu()
                .stream()
                .mapToDouble(Dish::getCalories)
                .max();
        System.out.println("Max of Dish Calories :: " + resultDouble.getAsDouble());

        System.out.println("<<<<<<<< Maximum >>>>>>>>>>");

        System.out.println("\nMin using mapToInt & min function");
        resultInt = Dish.menu()
                .stream()
                .mapToInt(Dish::getCalories)
                .min();
        System.out.println("Min of Dish Calories :: " + resultInt.getAsInt());

        System.out.println("\nMin using mapToLong & min function");
        resultLong = Dish.menu()
                .stream()
                .mapToLong(Dish::getCalories)
                .min();
        System.out.println("Min of Dish Calories :: " + resultLong.getAsLong());

        System.out.println("\nMin using mapToDouble & min function");
        resultDouble = Dish.menu()
                .stream()
                .mapToDouble(Dish::getCalories)
                .min();
        System.out.println("Min of Dish Calories :: " + resultDouble.getAsDouble());

    }
}
