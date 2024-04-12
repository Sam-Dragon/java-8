package src.collectors.collectors_grouping.pack;


import src.model.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsGrouping {

    public static void main(String[] args) {

        System.out.println("Single Grouping By Employee Name");
        Map<String, List<Employee>> employeeMap = Employee.employees()
                .stream()
                .collect(Collectors.groupingBy(Employee::getName));

        employeeMap.forEach((k, v) -> System.out.println(k + " : " + v));
//      employeeMap.forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println("\n<< Key Set >>");
        Set<String> keySet = employeeMap.keySet();
        System.out.println("Key Set " + keySet);

        System.out.println("\n<< Value Set >>");
        Collection<List<Employee>> valueSet = employeeMap.values();
        System.out.println("Value Set " + valueSet);

        System.out.println("\n<< Entry Set >>");
        Collection<Entry<String, List<Employee>>> entrySet = employeeMap.entrySet();
        System.out.println("Value Set " + entrySet);

        System.out.println("\n<< List for Rahul >>");
        List<Employee> rahulEmployees = employeeMap.get("Rahul");
        System.out.println("Rahul Employees " + rahulEmployees);
    }
}
