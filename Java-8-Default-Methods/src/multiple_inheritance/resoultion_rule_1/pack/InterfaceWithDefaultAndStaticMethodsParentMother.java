package multiple_inheritance.resoultion_rule_1.pack;

public interface InterfaceWithDefaultAndStaticMethodsParentMother
//        extends InterfaceWithDefaultAndStaticMethods {
        extends InterfaceWithDefaultAndStaticMethodsParentGrandFather {

    default void defaultMethod() {
        System.out.println("Default Method- Mother");
    }
}
