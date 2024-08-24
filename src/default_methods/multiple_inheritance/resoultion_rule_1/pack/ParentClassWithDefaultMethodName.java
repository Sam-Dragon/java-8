package default_methods.multiple_inheritance.resoultion_rule_1.pack;

public class ParentClassWithDefaultMethodName implements InterfaceWithDefaultAndStaticMethodsParentGrandFather {

    @Override
    public void defaultMethod() {
        InterfaceWithDefaultAndStaticMethodsParentGrandFather.super.defaultMethod();
    }
}
