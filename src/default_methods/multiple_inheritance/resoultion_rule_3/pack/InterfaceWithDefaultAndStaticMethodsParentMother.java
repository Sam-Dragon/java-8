package src.default_methods.multiple_inheritance.resoultion_rule_3.pack;

public interface InterfaceWithDefaultAndStaticMethodsParentMother
//        extends InterfaceWithDefaultAndStaticMethodsParentGrandFather 
{

    default void defaultMethod() {
        System.out.println("Default Method - Mother");
    }
}
