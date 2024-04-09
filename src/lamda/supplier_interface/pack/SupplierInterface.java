package src.lamda.supplier_interface.pack;

import src.model.Employee;

@FunctionalInterface
public interface SupplierInterface {
    Employee instance();
}
