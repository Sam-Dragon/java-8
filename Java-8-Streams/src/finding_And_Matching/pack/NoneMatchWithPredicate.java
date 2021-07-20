package finding_And_Matching.pack;

import java.math.BigDecimal;

import model.pack.Employee;

public class NoneMatchWithPredicate {

    public static void main(String[] args) {
        boolean allMatched = Employee.employees().stream()
                .noneMatch(e -> e.getSalary().compareTo(BigDecimal.valueOf(55000000)) > 0);
        System.out.println(allMatched);
    }
}
