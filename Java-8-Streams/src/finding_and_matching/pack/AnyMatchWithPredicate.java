package finding_and_matching.pack;

import java.math.BigDecimal;

public class AnyMatchWithPredicate {

    public static void main(String[] args) {
        boolean allMatched = model.pack.EmployeeObj.employees().stream()
                .anyMatch(e -> e.getSalary().compareTo(BigDecimal.valueOf(55000)) > 0);
        System.out.println(allMatched);
    }
}
