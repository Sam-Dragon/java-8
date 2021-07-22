package default_method_lamda.pack;

public class ClassWithDefaultMethodInLamdaExpression implements InterfaceWithSingleDefaultMethod {

    public static void main(String[] args) {
        ClassWithDefaultMethodInLamdaExpression expression = new ClassWithDefaultMethodInLamdaExpression();
        Runnable interfaceMethods = expression::defaultMethod;

        interfaceMethods.run();
    }
}
