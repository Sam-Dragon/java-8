package multiple_inheritance.diamond_problem.pack;

public class ClassWithDiamondProblemOfDeath implements InterfaceWithDefaultAndStaticMethodsParentFather,
        InterfaceWithDefaultAndStaticMethodsParentMother, InterfaceWithDefaultAndStaticMethodsParentGrandFather {

    public static void main(String[] args) {
        new ClassWithDiamondProblemOfDeath().defaultMethod();
    }

    @Override
    public void defaultMethod() {
        InterfaceWithDefaultAndStaticMethodsParentFather.super.defaultMethod();
        InterfaceWithDefaultAndStaticMethodsParentMother.super.defaultMethod();
    }
}
