package lamda.function_interface.pack;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class HacksOnFunction {

    public static void main(String[] args) {
        Function<Integer, Boolean> predicateFunction = e -> true;
        System.out.println(predicateFunction.apply(100));

        BiFunction<Integer, Integer, Boolean> biPredicateFunction = (e, e1) -> false;
        System.out.println(biPredicateFunction.apply(100, 101));

        UnaryOperator<Integer> unaryOperator = e -> 1;
        System.out.println(unaryOperator.apply(100));

        BinaryOperator<Integer> binaryOperator = (e, e1) -> 1;
        System.out.println(binaryOperator.apply(100, 101));

        Function<Integer, Integer> intFunction = e -> 1;
        System.out.println(intFunction.apply(100));

        BiFunction<Integer, Integer, Integer> biIntFunction = (e, e1) -> 1;
        System.out.println(biIntFunction.apply(100, 101));
    }
}
