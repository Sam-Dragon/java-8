package operator_interface.pack;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.function.BinaryOperator;

public class PrimitiveSpecializationBinaryOperatorExample {

    public static void main(String[] args) {
        // BinaryOperator<void, void> BinaryOperator = () ->
        // System.out.print("HelloWorld");

        System.out.println("\nMINBY");
        model.pack.EmployeeObj minEmployee = minBy(new model.pack.EmployeeObj(1L, "Rahul", "+919663374604", BigDecimal.valueOf(15000000)),
                new model.pack.EmployeeObj(2L, "Khushboo", "+918770133516", BigDecimal.valueOf(2500000)));
        System.out.println(minEmployee);

        System.out.println("\nMAXBY");
        model.pack.EmployeeObj maxEmployee = maxBy(new model.pack.EmployeeObj(1L, "Rahul", "+919663374604", BigDecimal.valueOf(15000000)),
                new model.pack.EmployeeObj(2L, "Khushboo", "+918770133516", BigDecimal.valueOf(2500000)));
        System.out.println(maxEmployee);
    }

    private static model.pack.EmployeeObj maxBy(model.pack.EmployeeObj e1, model.pack.EmployeeObj e2) {
        return BinaryOperator.maxBy(Comparator.comparing(model.pack.EmployeeObj::getSalary)).apply(e1, e2);
    }

    private static model.pack.EmployeeObj minBy(model.pack.EmployeeObj e1, model.pack.EmployeeObj e2) {
        return BinaryOperator.minBy(Comparator.comparing(model.pack.EmployeeObj::getSalary)).apply(e1, e2);
    }

}
