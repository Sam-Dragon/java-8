package finding_and_matching.pack;

import java.math.BigDecimal;

public class NoneMatchWithPredicate {

    public static void main(String[] args) {
        boolean allMatched = model.pack.EmployeeObj.employees().stream()
                .noneMatch(e -> e.getSalary().compareTo(BigDecimal.valueOf(55000000)) > 0);
        System.out.println(allMatched);
    }
}
