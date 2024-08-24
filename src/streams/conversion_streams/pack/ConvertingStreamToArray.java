package streams.conversion_streams.pack;

import model.Dish;

import java.util.Arrays;

public class ConvertingStreamToArray {

    public static void main(String[] args) {
        Integer[] intArr = Dish.menu()
                .stream()
                .map(Dish::getCalories)
                .toArray(Integer[]::new);
        System.out.println(Arrays.asList(intArr));
    }
}
