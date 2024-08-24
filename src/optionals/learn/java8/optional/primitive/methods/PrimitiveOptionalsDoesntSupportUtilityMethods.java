package optionals.learn.java8.optional.primitive.methods;

import java.util.OptionalInt;

public class PrimitiveOptionalsDoesntSupportUtilityMethods {

    public static void main(String[] args) {

        OptionalInt number = OptionalInt.of(3);
//		number.filter
//		number.map
//		number.flatMap
        System.out.println(number.getAsInt());
    }
}
