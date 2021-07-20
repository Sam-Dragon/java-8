package multiple_inheritance.resoultion_rule_2.pack;

public class MostSpecificSubInterfaceWinOverInterface extends ParentClassWithDefaultMethodName implements
        InterfaceWithDefaultAndStaticMethodsParentMother, InterfaceWithDefaultAndStaticMethodsParentGrandFather {

    public static void main(String[] args) {
        new MostSpecificSubInterfaceWinOverInterface().defaultMethod();
    }

}
