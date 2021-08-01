package collectors_basics.pack;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import model.pack.Employee;

public class CollectionsConversions {

    public static void main(String[] args) {
        List<Employee> list = Employee.employees();
        Set<Employee> set = new HashSet<>(Employee.employeeList());
        Map<String, Employee> map = new HashMap<>();
        map.put("Meena", new Employee(10L, "Meena", "+919663374633", BigDecimal.valueOf(565656)));
        map.put("Meena", new Employee(11L, "Reena", "+919663374644", BigDecimal.valueOf(6565656)));
        map.put("Sheena", new Employee(12L, "Sheena", "+919663374655", BigDecimal.valueOf(7878787)));

        System.out.println("\nConvert List to Set");
        convertListToSet(list);

        System.out.println("\nConvert List to Map");
        convertListToMap(list);

        System.out.println("\nConvert Set to List");
        convertSetToList(set);

        System.out.println("\nConvert Set to Map");
        convertSetToMap(set);

        System.out.println("\nConvert Map to List");
        convertMapToList(map);

        System.out.println("\nConvert Map to Set");
        convertMapToSet(map);

        System.out.println("\nConvert List to Collection");
        convertListToCollection(list);
    }

    private static void convertListToSet(List<Employee> list) {
        Set<Employee> employees = list.stream().collect(Collectors.toSet());
        System.out.println(employees);
    }

    private static void convertListToMap(List<Employee> list) {
        Map<Long, Employee> employees = list.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));
        System.out.println(employees);
    }

    private static void convertSetToList(Set<Employee> set) {
        List<Employee> employees = set.stream().collect(Collectors.toList());
        System.out.println(employees);
    }

    private static void convertSetToMap(Set<Employee> set) {
        Map<Long, Employee> employees = set.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));
        System.out.println(employees);
    }

    private static void convertMapToList(Map<String, Employee> map) {
        List<Employee> employees = map.values().stream().collect(Collectors.toList());
        System.out.println(employees);
    }

    private static void convertMapToSet(Map<String, Employee> map) {
        Set<Employee> employees = map.values().stream().collect(Collectors.toSet());
        System.out.println(employees);
    }

    private static void convertListToCollection(List<Employee> list) {
        Collection<Employee> employees = list.stream().collect(Collectors.toCollection(LinkedList::new));
        System.out.println(employees);
    }
}
