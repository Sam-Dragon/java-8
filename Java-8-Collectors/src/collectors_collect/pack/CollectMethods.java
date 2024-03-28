package collectors_collect.pack;

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
        model.pack.EmployeeObj.employeeList().stream().collect(Collectors.toCollection(LinkedList::new)).forEach(System.out::println);

        System.out.println();
        model.pack.EmployeeObj.employeeList().stream().collect(Collectors.toCollection(ArrayList::new)).forEach(System.out::println);

        System.out.println();
        model.pack.EmployeeObj.employeeList().stream().collect(Collectors.toCollection(HashSet::new)).forEach(System.out::println);

//        Calling on objects is dangerous as it needs field to sort        
//        System.out.println();
//        Employee.employeeList().stream().collect(Collectors.toCollection(TreeSet::new)).forEach(System.out::println);

        System.out.println();
        model.pack.EmployeeObj.employeeList().stream().collect(Collectors.toCollection(LinkedHashSet::new))
                .forEach(System.out::println);

//        Not applicable for Maps
//        Employee.employeeList().stream().collect(Collectors.toCollection(HashMap::new));
    }

    private static void collectToConcurrentMap() {
        System.out.println();
        model.pack.EmployeeObj.employeeList().stream().collect(Collectors.toConcurrentMap(model.pack.EmployeeObj::getId, model.pack.EmployeeObj::getName))
                .forEach((k, v) -> System.out.println(k + " : " + v));
    }

    private static void collectToUnmodifiableCollection() {
        System.out.println();
        model.pack.EmployeeObj.employeeList().stream().map(model.pack.EmployeeObj::getName).collect(Collectors.toUnmodifiableList())
                .forEach(System.out::println);

        System.out.println();
        model.pack.EmployeeObj.employeeList().stream().map(model.pack.EmployeeObj::getName).collect(Collectors.toUnmodifiableSet())
                .forEach(System.out::println);

        System.out.println();
        model.pack.EmployeeObj.employeeList().stream().collect(Collectors.toUnmodifiableMap(model.pack.EmployeeObj::getId, model.pack.EmployeeObj::getName))
                .forEach((k, v) -> System.out.println(k + " : " + v));
    }

    private static void collectToDifferentCollection() {
        System.out.println();
        model.pack.EmployeeObj.employeeList().stream().map(model.pack.EmployeeObj::getName).collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println();
        model.pack.EmployeeObj.employeeList().stream().map(model.pack.EmployeeObj::getName).collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println();
        model.pack.EmployeeObj.employeeList().stream().collect(Collectors.toMap(model.pack.EmployeeObj::getId, model.pack.EmployeeObj::getName))
                .forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
