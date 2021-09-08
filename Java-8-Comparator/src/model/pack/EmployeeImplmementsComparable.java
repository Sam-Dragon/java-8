package model.pack;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EmployeeImplmementsComparable implements Comparable<EmployeeImplmementsComparable> {

    private Long id;
    private String name;
    private String mobile;
    private BigDecimal salary;

    public EmployeeImplmementsComparable() {
        System.out.println("EmployeeImplmementsComparable()");
    }

    public EmployeeImplmementsComparable(Long id, String name, String mobile, BigDecimal salary) {
        super();
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.salary = salary;
        System.out.println("EmployeeImplmementsComparable(id, name, mobile, salary)");
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

    public static List<EmployeeImplmementsComparable> employees() {
        return List.of(new EmployeeImplmementsComparable(1L, "Rahul", "+919663374604", BigDecimal.valueOf(15000000)),
                new EmployeeImplmementsComparable(2L, "Khushboo", "+918770133516", BigDecimal.valueOf(2500000)),
                new EmployeeImplmementsComparable(3L, "Ronak", "+919738318927", BigDecimal.valueOf(55000)),
                new EmployeeImplmementsComparable(4L, "Julie", "+919380585761", BigDecimal.valueOf(7500000)),
                new EmployeeImplmementsComparable(5L, "Khushboo", "+919380585762", BigDecimal.valueOf(2500000)));
    }

    public static List<EmployeeImplmementsComparable> employeeList() {
        return new ArrayList<EmployeeImplmementsComparable>() {
            {
                add(new EmployeeImplmementsComparable(7L, "Dragon", "+918770133516", BigDecimal.valueOf(45000)));
                add(new EmployeeImplmementsComparable(6L, "Sam", "+919663374604", BigDecimal.valueOf(35000)));
                add(new EmployeeImplmementsComparable(9L, "Pragon", "+919380585761", BigDecimal.valueOf(85008)));
                add(new EmployeeImplmementsComparable(8L, "Sam", "+919738318927", BigDecimal.valueOf(65000)));
//                add(null);
            }
        };
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EmployeeImplmementsComparable other = (EmployeeImplmementsComparable) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int compareTo(EmployeeImplmementsComparable o) {
        return this.name.compareTo(o.name);
    }

}
