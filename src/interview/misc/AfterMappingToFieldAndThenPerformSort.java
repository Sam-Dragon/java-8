package interview.misc;

import model.Employee;

import java.util.Collections;

public class AfterMappingToFieldAndThenPerformSort {

    public static void main(String[] args) {

        Employee.employees()
                .stream()
                .map(Employee::getName)
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
    }
}
