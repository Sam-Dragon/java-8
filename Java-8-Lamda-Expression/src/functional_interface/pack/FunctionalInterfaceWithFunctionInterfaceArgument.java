package functional_interface.pack;

import java.util.function.Function;

@FunctionalInterface
public interface FunctionalInterfaceWithFunctionInterfaceArgument {
    void display(String t, Function<Integer, String> function);
}
