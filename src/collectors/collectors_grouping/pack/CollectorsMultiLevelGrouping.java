package src.collectors.collectors_grouping.pack;


import src.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsMultiLevelGrouping {

    public static void main(String[] args) {
        System.out.println("Multi Level Grouping By Employee Name Then by Mobile");
        Map<String, Map<String, List<Employee>>> employeeMap = Employee.employees().stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.groupingBy(Employee::getMobile)));

        employeeMap.forEach((k, v) -> System.out.println(k + " : " + v));
//      employeeMap.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
