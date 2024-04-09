package src.default_methods.multiple_inheritance.diamond_problem.pack;

public interface InterfaceWithDefaultAndStaticMethodsParentMother
        extends InterfaceWithDefaultAndStaticMethodsParentGrandFather {

    default void defaultMethod() {
        System.out.println("Default Method - Mother");
    }
}
