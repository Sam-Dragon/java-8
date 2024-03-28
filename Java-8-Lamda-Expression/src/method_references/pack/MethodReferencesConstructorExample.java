package method_references.pack;

import java.math.BigDecimal;
import java.util.function.Supplier;

public class MethodReferencesConstructorExample {

    public static void main(String[] args) {

        Supplier<model.pack.EmployeeObj> employeeSupplier = model.pack.EmployeeObj::new;
        model.pack.EmployeeObj employee = employeeSupplier.get();
        System.out.println(employee);

        System.out.println();

        QuadFunction<Long, String, String, BigDecimal, model.pack.EmployeeObj> function = model.pack.EmployeeObj::new;
        employee = function.apply(1L, "Employee Name", "+879898797962", BigDecimal.valueOf(100000));
        System.out.println(employee);
    }

}
