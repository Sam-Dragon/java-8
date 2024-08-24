package default_methods.multiple_inheritance.resoultion_rule_3.pack;

public class ClassMustOverrideSubInterfaceDefaultMethod implements InterfaceWithDefaultAndStaticMethodsParentMother,
        InterfaceWithDefaultAndStaticMethodsParentGrandFather {

    public static void main(String[] args) {
        new ClassMustOverrideSubInterfaceDefaultMethod().defaultMethod();
    }

    @Override
    public void defaultMethod() {
        InterfaceWithDefaultAndStaticMethodsParentMother.super.defaultMethod();
    }

}
