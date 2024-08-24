package lamda.functional_interface.pack;

import java.util.function.Function;

public class CallFunctionalInterfaceInsideAnotherFunctionInterface {

    public static void main(String[] args) {

        FunctionalInterfaceWithFunctionInterfaceArgument functionInFunction = (i, f) -> {
            System.out.println(f.apply(i));
        };

        Function<String, String> concatFunction = s -> s;
        functionInFunction.display("Function", concatFunction);

    }

}
