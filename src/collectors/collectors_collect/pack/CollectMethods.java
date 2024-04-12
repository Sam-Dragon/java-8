package src.collectors.collectors_collect.pack;


import src.model.Employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class CollectMethods {

    public static void main(String[] args) {

        System.out.println("\ncollectToDifferentCollection");
        collectToDifferentCollection();

        System.out.println("\ncollectToUnmodifiableCollection");
        collectToUnmodifiableCollection();

        System.out.println("\ncollectToConcurrentMap");
        collectToConcurrentMap();

        System.out.println("\ncollectUsingToCollect");
        collectUsingToCollect();

    }

    private static void collectUsingToCollect() {
        System.out.println();
        Employee.employeeList()
                .stream()
                .collect(Collectors.toCollection(LinkedList::new))
                .forEach(System.out::println);

        System.out.println();
        Employee.employeeList()
                .stream()
                .collect(Collectors.toCollection(ArrayList::new))
                .forEach(System.out::println);

        System.out.println();
        Employee.employeeList()
                .stream()
                .collect(Collectors.toCollection(HashSet::new))
                .forEach(System.out::println);

//        Calling on objects is dangerous as it needs field to sort        
//        System.out.println();
//        Employee.employeeList().stream().collect(Collectors.toCollection(TreeSet::new)).forEach(System.out::println);

        System.out.println();
        Employee.employeeList()
                .stream()
                .collect(Collectors.toCollection(LinkedHashSet::new))
                .forEach(System.out::println);

//        Not applicable for Maps
//        Employee.employeeList().stream().collect(Collectors.toCollection(HashMap::new));
    }

    private static void collectToConcurrentMap() {
        System.out.println();
        Employee.employeeList()
                .stream()
                .collect(Collectors.toConcurrentMap(Employee::getId, Employee::getName))
                .forEach((k, v) -> System.out.println(k + " : " + v));
    }

    private static void collectToUnmodifiableCollection() {
        System.out.println();
        Employee.employeeList()
                .stream()
                .map(Employee::getName)
                .collect(Collectors.toUnmodifiableList())
                .forEach(System.out::println);

        System.out.println();
        Employee.employeeList()
                .stream()
                .map(Employee::getName)
                .collect(Collectors.toUnmodifiableSet())
                .forEach(System.out::println);

        System.out.println();
        Employee.employeeList()
                .stream()
                .collect(Collectors.toUnmodifiableMap(Employee::getId, Employee::getName))
                .forEach((k, v) -> System.out.println(k + " : " + v));
    }

    private static void collectToDifferentCollection() {
        System.out.println();
        Employee.employeeList()
                .stream()
                .map(Employee::getName)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println();
        Employee.employeeList()
                .stream()
                .map(Employee::getName)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println();
        Employee.employeeList()
                .stream()
                .collect(Collectors.toMap(Employee::getId, Employee::getName))
                .forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
