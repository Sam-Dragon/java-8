package streams.finding_and_matching.pack;

import model.Employee;

import java.math.BigDecimal;

public class AnyMatchWithPredicate {

    public static void main(String[] args) {
        boolean allMatched = Employee.employees()
                .stream()
                .anyMatch(e -> e.getSalary()
                        .compareTo(BigDecimal.valueOf(55000)) > 0);
        System.out.println(allMatched);
    }
}
