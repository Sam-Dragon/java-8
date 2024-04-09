package src.lamda.method_references.pack;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferencesExample {

    public static void main(String[] args) {
        Function<String, String> stringFunction = s -> MethodReferencesExample.staticMethod(s);
        System.out.println("Lamda Result = " + stringFunction.apply("Lamda"));

        stringFunction = s -> s.concat(" >> ");
        System.out.println("Method References Result = " + stringFunction.apply("Method References :: Library Method"));

        stringFunction = MethodReferencesExample::staticMethod;
        System.out.println("Method References Result = " + stringFunction.apply("Method References :: static method"));

        Supplier<MethodReferencesExample> supplier = MethodReferencesExample::new;
        MethodReferencesExample methodReferencesExample = supplier.get();

        stringFunction = methodReferencesExample::instanceMethod;
        System.out
                .println("Method References Result = " + stringFunction.apply("Method References :: Instance Method"));

    }

    public static String staticMethod(String input) {
        return input;
    }

    public String instanceMethod(String input) {
        return input;
    }
}
