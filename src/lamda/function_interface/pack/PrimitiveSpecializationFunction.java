package src.lamda.function_interface.pack;

import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class PrimitiveSpecializationFunction {

    public static void main(String[] args) {
        integerFunctionObject();
        intFunctionPrimitiveSpecialization();
    }

    private static void integerFunctionObject() {
        int intNumber = 10;
        Function<Integer, Integer> intFunction = n -> n / 2;
        System.out.println("Is Number = [" + intNumber + "] even ? " + (intFunction.apply(intNumber)));
    }

    public static void intFunctionPrimitiveSpecialization() {
        int intNumber = 10;
        IntFunction<Integer> intFunction = n -> n / 2;
        System.out.println("Is Number = [" + intNumber + "] even ? " + (intFunction.apply(intNumber)));
    }

    public static void longFunctionPrimitiveSpecialization() {
        long longNumber = 11;
        LongFunction<Long> longFunction = n -> n / 2;
        System.out.println("Is Number = [" + longNumber + "] even ? " + (longFunction.apply(longNumber)));
    }

    public static void doubleFunctionPrimitiveSpecialization() {
        double doubleNumber = 11.12;
        DoubleFunction<Double> doubleFunction = n -> n / 2;
        System.out.println("Is Number = [" + doubleNumber + "] even ? " + (doubleFunction.apply(doubleNumber)));
    }

    public static void IntToLongFunctionPrimitiveSpecialization() {
        int intNumber = 10;
        IntToLongFunction intToLongFunction = n -> n / 2;
        System.out.println("Is Number = [" + intNumber + "] even ? " + (intToLongFunction.applyAsLong(intNumber)));
    }

    public static void IntToDobuleFunctionPrimitiveSpecialization() {
        int intNumber = 10;
        IntToDoubleFunction intToDoubleFunction = n -> n / 2;
        System.out.println("Is Number = [" + intNumber + "] even ? " + (intToDoubleFunction.applyAsDouble(intNumber)));
    }

    public static void LongToIntFunctionPrimitiveSpecialization() {
        long intNumber = 10;
        LongToIntFunction longToIntFunction = n -> (int) n;
        System.out.println("Is Number = [" + intNumber + "] even ? " + (longToIntFunction.applyAsInt(intNumber)));
    }

    public static void LongToDobuleFunctionPrimitiveSpecialization() {
        int intNumber = 10;
        LongToDoubleFunction longToDoubleFunction = n -> (long) n / 2;
        System.out.println("Is Number = [" + intNumber + "] even ? " + (longToDoubleFunction.applyAsDouble(intNumber)));
    }

    public static void ToIntFunctionPrimitiveSpecialization() {
        int intNumber = 10;
        ToIntFunction<Integer> longToIntFunction = n -> n + n;
        System.out.println("Is Number = [" + intNumber + "] even ? " + (longToIntFunction.applyAsInt(intNumber)));
    }

    public static void ToLongFunctionPrimitiveSpecialization() {
        long longNumber = 10;
        ToLongFunction<Long> longToDoubleFunction = n -> n + n;
        System.out.println("Is Number = [" + longNumber + "] even ? " + (longToDoubleFunction.applyAsLong(longNumber)));
    }

    public static void ToDoubleFunctionPrimitiveSpecialization() {
        double doubleNumber = 10;
        ToDoubleFunction<Double> longToDoubleFunction = n -> n + n;
        System.out.println(
                "Is Number = [" + doubleNumber + "] even ? " + (longToDoubleFunction.applyAsDouble(doubleNumber)));
    }

}
