package streams.finding_and_matching.pack;

import model.Employee;

import java.math.BigDecimal;

public class AllMatchWithPredicate {

    public static void main(String[] args) {
        boolean allMatched = Employee.employees()
                .stream()
                .allMatch(e -> e.getSalary()
                        .compareTo(BigDecimal.valueOf(54000)) > 0);
        System.out.println(allMatched);
    }
}
