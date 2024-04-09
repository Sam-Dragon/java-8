package src.interview;


import src.model.Dish;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GetMenuWithBothTypeOfDishes {

    public static void main(String[] args) {
        Map<Boolean, List<String>> menu = Dish.menu().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian,
                        Collectors.mapping(Dish::getName, Collectors.toList())));

        System.out.println(menu);
    }
}
