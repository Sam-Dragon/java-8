package multiple_inheritance.resoultion_rule_3.pack;

public class MostSpecificSubInterfaceWinOverInterface implements InterfaceWithDefaultAndStaticMethodsParentMother,
        InterfaceWithDefaultAndStaticMethodsParentGrandFather {

    public static void main(String[] args) {
        new MostSpecificSubInterfaceWinOverInterface().defaultMethod();
    }

    @Override
    public void defaultMethod() {
        InterfaceWithDefaultAndStaticMethodsParentMother.super.defaultMethod();
    }

}
