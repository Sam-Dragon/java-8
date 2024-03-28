package numeric_streams.pack;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertingPrimitiveStreamsToObjectStream {

    public static void main(String[] args) {
        System.out.println("Primitive Streams");
        IntStream intStream = model.pack.DishObj.menu().stream().mapToInt(model.pack.DishObj::getCalories);
        System.out.println(intStream);

        System.out.println("\nConverting Primitive Streams To Object Stream");
        Stream<Integer> streamOfInteger = intStream.boxed();
        System.out.println(streamOfInteger);
    }
}
