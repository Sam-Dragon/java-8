package functional_interface.pack;

public class CallFunctionalInterfaceInsideAnotherFunctionInterface {

    public static void main(String[] args) {

        FunctionalInterfaceWithFunctionInterfaceArgument functionInFunction = (s, f) -> {
            System.out.println("");
        };

    }

}
