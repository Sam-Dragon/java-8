package src.lamda.operator_interface.pack;

import src.model.Employee;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {
        // BinaryOperator<void, void> BinaryOperator = () ->
        // System.out.print("HelloWorld");

        System.out.println("\nMINBY");
        Employee minEmployee = minBy(new Employee(1L, "Rahul", "+919663374604", BigDecimal.valueOf(15000000)),
                new Employee(2L, "Khushboo", "+918770133516", BigDecimal.valueOf(2500000)));
        System.out.println(minEmployee);

        System.out.println("\nMAXBY");
        Employee maxEmployee = maxBy(new Employee(1L, "Rahul", "+919663374604", BigDecimal.valueOf(15000000)),
                new Employee(2L, "Khushboo", "+918770133516", BigDecimal.valueOf(2500000)));
        System.out.println(maxEmployee);
    }

    private static Employee maxBy(Employee e1, Employee e2) {
        return BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary))
                .apply(e1, e2);
    }

    private static Employee minBy(Employee e1, Employee e2) {
        return BinaryOperator.minBy(Comparator.comparing(Employee::getSalary))
                .apply(e1, e2);
    }

}
