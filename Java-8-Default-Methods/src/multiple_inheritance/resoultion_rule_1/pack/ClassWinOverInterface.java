package multiple_inheritance.resoultion_rule_1.pack;

public class ClassWinOverInterface extends ParentClassWithDefaultMethodName implements
        InterfaceWithDefaultAndStaticMethodsParentMother, InterfaceWithDefaultAndStaticMethodsParentGrandFather {

    public static void main(String[] args) {
        new ClassWinOverInterface().defaultMethod();
    }
}
