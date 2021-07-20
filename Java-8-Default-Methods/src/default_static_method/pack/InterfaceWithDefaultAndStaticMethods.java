package default_static_method.pack;

public interface InterfaceWithDefaultAndStaticMethods {

    void abstractMethod();

    default void defaultMethod() {
        System.out.println("Default Method");
    }

    static void staticMethod() {
        System.out.println("Static Method");
    }
}
