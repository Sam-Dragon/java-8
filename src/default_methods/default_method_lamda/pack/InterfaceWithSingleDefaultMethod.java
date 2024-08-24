package default_methods.default_method_lamda.pack;

public interface InterfaceWithSingleDefaultMethod {

    default void defaultMethod() {
        System.out.println("Default Method - 1");
    }

    default void defaultMethod_2() {
        System.out.println("Default Method - 2");
    }

    default void defaultMethod_3() {
        System.out.println("Default Method - 3");
    }
}
