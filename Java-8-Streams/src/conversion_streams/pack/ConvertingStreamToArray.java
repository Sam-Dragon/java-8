package conversion_streams.pack;

import java.util.Arrays;

import model.pack.Dish;

public class ConvertingStreamToArray {

    public static void main(String[] args) {
        Integer[] intArr = Dish.menu().stream().map(Dish::getCalories).toArray(Integer[]::new);
        System.out.println(Arrays.asList(intArr));
    }
}
