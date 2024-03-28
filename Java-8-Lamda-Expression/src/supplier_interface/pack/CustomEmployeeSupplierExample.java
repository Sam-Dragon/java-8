package supplier_interface.pack;

public class CustomEmployeeSupplierExample {

    public static void main(String[] args) {
        SupplierInterface employee = model.pack.EmployeeObj::new;
        System.out.println(employee.instance());
    }
}
