package src.default_methods.multiple_inheritance.diamond_problem.pack;

public interface InterfaceWithDefaultAndStaticMethodsParentGrandFather {

    default void defaultMethod() {
        System.out.println("Default Method - Grand Father");
    }
}
