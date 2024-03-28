package collectors_grouping.pack;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsMultiLevelGrouping {

    public static void main(String[] args) {
        System.out.println("Multi Level Grouping By Employee Name Then by Mobile");
        Map<String, Map<String, List<model.pack.EmployeeObj>>> employeeMap = model.pack.EmployeeObj.employees().stream()
                .collect(Collectors.groupingBy(model.pack.EmployeeObj::getName, Collectors.groupingBy(model.pack.EmployeeObj::getMobile)));

        employeeMap.forEach((k, v) -> System.out.println(k + " : " + v));
//      employeeMap.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
