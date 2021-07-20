package default_static_method.pack;

public class ClassWithDefaultAndStaticMethodsImpl implements InterfaceWithDefaultAndStaticMethods {

    public static void main(String[] args) {
        InterfaceWithDefaultAndStaticMethods.staticMethod();

        ClassWithDefaultAndStaticMethodsImpl interfaceMethods = new ClassWithDefaultAndStaticMethodsImpl();
        // interfaceMethods.defaultMethod();
        interfaceMethods.callDefaultMethod();
    }

    @Override
    public void abstractMethod() {
        System.out.println("Abstract Method");
    }

    public void callDefaultMethod() {
        defaultMethod();
    }
}
