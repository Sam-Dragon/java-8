package multiple_inheritance.resoultion_rule_2.pack;

public class ClassWithMostSpecificSubInterfaceWinOverInterfaces extends ParentClassWithDefaultMethodName implements
        InterfaceWithDefaultAndStaticMethodsParentMother, InterfaceWithDefaultAndStaticMethodsParentGrandFather {

    public static void main(String[] args) {
        new ClassWithMostSpecificSubInterfaceWinOverInterfaces().defaultMethod();
    }

}
