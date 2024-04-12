package src.lamda.supplier_interface.pack;

import java.util.function.*;

public class PrimitiveSpecializationSupplier {

    public static void main(String[] args) {
        integerSupplierObject();
        intSupplierPrimitiveSpecialization();
    }

    private static void integerSupplierObject() {
        int intNumber = 10;
        Supplier<Integer> intSupplier = () -> intNumber;
        System.out.println(intSupplier.get());
    }

    public static void intSupplierPrimitiveSpecialization() {
        int intNumber = 10;
        IntSupplier intSupplier = () -> intNumber;
        System.out.println(intSupplier.getAsInt());
    }

    public static void longSupplierPrimitiveSpecialization() {
        long longNumber = 11;
        LongSupplier longSupplier = () -> longNumber;
        System.out.println(longSupplier.getAsLong());
    }

    public static void doubleSupplierPrimitiveSpecialization() {
        double doubleNumber = 11.12;
        DoubleSupplier doubleSupplier = () -> doubleNumber;
        System.out.println(doubleSupplier.getAsDouble());
    }

    public static void booleanSupplierPrimitiveSpecialization() {
        boolean bool = true;
        BooleanSupplier boolSupplier = () -> bool;
        System.out.println(boolSupplier.getAsBoolean());
    }
}
