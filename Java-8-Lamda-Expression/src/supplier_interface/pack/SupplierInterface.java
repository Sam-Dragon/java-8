package supplier_interface.pack;

import model.pack.Employee;

@FunctionalInterface
public interface SupplierInterface {
    Employee instance();
}
