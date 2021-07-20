package default_method_lamda.pack;

public class DefaultMethodInLamdaExpression implements InterfaceWithSingleDefaultMethod {

    public static void main(String[] args) {
        DefaultMethodInLamdaExpression expression = new DefaultMethodInLamdaExpression();
        Runnable interfaceMethods = expression::defaultMethod;

        interfaceMethods.run();
    }
}
