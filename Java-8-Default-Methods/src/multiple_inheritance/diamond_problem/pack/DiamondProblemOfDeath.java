package multiple_inheritance.diamond_problem.pack;

public class DiamondProblemOfDeath implements InterfaceWithDefaultAndStaticMethodsParentFather,
        InterfaceWithDefaultAndStaticMethodsParentMother, InterfaceWithDefaultAndStaticMethodsParentGrandFather {

    public static void main(String[] args) {
        new DiamondProblemOfDeath().defaultMethod();
    }

    @Override
    public void defaultMethod() {
        InterfaceWithDefaultAndStaticMethodsParentFather.super.defaultMethod();
        InterfaceWithDefaultAndStaticMethodsParentMother.super.defaultMethod();
    }
}
