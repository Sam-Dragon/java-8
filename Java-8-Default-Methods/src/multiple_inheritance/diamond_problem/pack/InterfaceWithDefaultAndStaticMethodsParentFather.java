package multiple_inheritance.diamond_problem.pack;

public interface InterfaceWithDefaultAndStaticMethodsParentFather {

    default void defaultMethod() {
        System.out.println("Default Method - Father");
    }
}
