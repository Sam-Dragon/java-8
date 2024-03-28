package conversion_streams.pack;

import java.util.Arrays;

public class ConvertingStreamToArray {

    public static void main(String[] args) {
        Integer[] intArr = model.pack.DishObj.menu().stream().map(model.pack.DishObj::getCalories).toArray(Integer[]::new);
        System.out.println(Arrays.asList(intArr));
    }
}
