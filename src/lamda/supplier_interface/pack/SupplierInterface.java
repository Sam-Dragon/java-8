package lamda.supplier_interface.pack;

import model.Employee;

@FunctionalInterface
public interface SupplierInterface {
    Employee instance();
}
