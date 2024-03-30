package interview.misc;

import interview.model.EmployeeModel;

import java.util.Collections;

public class AfterMappingToFieldAndThenPerformSort {

    public static void main(String[] args) {

        EmployeeModel.employees()
                .stream()
                .map(EmployeeModel::getName)
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
    }
}
