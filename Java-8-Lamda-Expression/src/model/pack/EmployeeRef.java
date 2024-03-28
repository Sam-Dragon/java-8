package model.pack;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRef {

    private Long id;
    private String name;
    private String mobile;
    private BigDecimal salary;

    public EmployeeRef() {
        System.out.println("Employee()");
    }

    public EmployeeRef(Long id, String name, String mobile, BigDecimal salary) {
        super();
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.salary = salary;
        System.out.println("Employee(id, name, mobile, salary)");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", mobile=" + mobile + ", salary=" + salary + "]";
    }

    public static List<model.pack.EmployeeObj> employees() {
        return List.of(new model.pack.EmployeeObj(1L, "Rahul", "+919663374604", BigDecimal.valueOf(15000000)),
                new model.pack.EmployeeObj(2L, "Khushboo", "+918770133516", BigDecimal.valueOf(2500000)),
                new model.pack.EmployeeObj(3L, "Ronak", "+919738318927", BigDecimal.valueOf(55000)),
                new model.pack.EmployeeObj(4L, "Julie", "+919380585761", BigDecimal.valueOf(7500000)),
                new model.pack.EmployeeObj(5L, "Khushboo", "+919380585762", BigDecimal.valueOf(2500000)));
    }

    public static List<model.pack.EmployeeObj> employeeList() {
        return new ArrayList<model.pack.EmployeeObj>() {
            {
                add(new model.pack.EmployeeObj(6L, "Sam", "+919663374604", BigDecimal.valueOf(35000)));
                add(new model.pack.EmployeeObj(7L, "Dragon", "+918770133516", BigDecimal.valueOf(45000)));
                add(new model.pack.EmployeeObj(8L, "Sam", "+919738318927", BigDecimal.valueOf(65000)));
                add(new model.pack.EmployeeObj(9L, "Pragon", "+919380585761", BigDecimal.valueOf(85008)));
            }
        };
    }
}
