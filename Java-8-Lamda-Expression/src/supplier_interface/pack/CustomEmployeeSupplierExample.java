package supplier_interface.pack;

import model.pack.Employee;

public class CustomEmployeeSupplierExample {

    public static void main(String[] args) {
        SupplierInterface employee = Employee::new;
        System.out.println(employee.instance());
    }
}
