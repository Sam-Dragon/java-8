package default_methods.multiple_inheritance.diamond_problem.pack;

public interface InterfaceWithDefaultAndStaticMethodsParentFather
        extends InterfaceWithDefaultAndStaticMethodsParentGrandFather {

    default void defaultMethod() {
        System.out.println("Default Method - Father");
    }
}
