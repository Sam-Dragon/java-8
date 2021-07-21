package numeric_streams.pack;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import model.pack.Dish;

public class ConvertingPrimitiveStreamsToObjectStream {

    public static void main(String[] args) {
        System.out.println("Primitive Streams");
        IntStream intStream = Dish.menu().stream().mapToInt(Dish::getCalories);
        System.out.println(intStream);

        System.out.println("\nConverting Primitive Streams To Object Stream");
        Stream<Integer> streamOfInteger = intStream.boxed();
        System.out.println(streamOfInteger);
    }
}
