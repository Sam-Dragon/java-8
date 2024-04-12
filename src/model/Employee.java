package src.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Employee {

    private Long id;
    private String name;
    private String mobile;
    private BigDecimal salary;

    public Employee() {
        System.out.println("Employee()");
    }

    public Employee(Long id, String name, String mobile, BigDecimal salary) {
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

    public static List<Employee> employees() {
        return List.of(new Employee(1L, "Rahul", "+919663374604", BigDecimal.valueOf(15000000)),
                new Employee(2L, "Khushboo", "+918770133516", BigDecimal.valueOf(2500000)),
                new Employee(3L, "Ronak", "+919738318927", BigDecimal.valueOf(55000)),
                new Employee(4L, "Julie", "+919380585761", BigDecimal.valueOf(7500000)),
                new Employee(5L, "Khushboo", "+919380585762", BigDecimal.valueOf(2500000)),
                new Employee(6L, "Ronak", "+919738318927", BigDecimal.valueOf(230000)),
                new Employee(7L, "Julie", "+919380585761", BigDecimal.valueOf(34000)),
                new Employee(8L, "Khushboo", "+919380585762", BigDecimal.valueOf(56000)));
    }

    public static List<Employee> employeeList() {
        return new ArrayList<Employee>() {
            /**
             *
             */
            private static final long serialVersionUID = 1L;

            {
                add(new Employee(6L, "Sam", "+919663374604", BigDecimal.valueOf(35000)));
                add(new Employee(7L, "Dragon", "+918770133516", BigDecimal.valueOf(45000)));
                add(new Employee(8L, "Sam", "+919738318927", BigDecimal.valueOf(65000)));
                add(new Employee(9L, "Pragon", "+919380585761", BigDecimal.valueOf(85008)));
            }
        };
    }
}
