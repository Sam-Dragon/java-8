package model;

import java.util.Arrays;
import java.util.List;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final Integer calories;
    private final Type type;

    public Dish(String name, boolean vegaterian, Integer calories, Type type) {
        super();
        this.name = name;
        this.vegetarian = vegaterian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public Integer getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type {
        MEAT, FISH, OTHER, NONE
    }

    public static List<Dish> menu() {
        return Arrays.asList(new Dish("pork", false, 800, Type.MEAT), new Dish("beef", false, 700, Type.MEAT),
                new Dish("chicken", false, 400, Type.MEAT), new Dish("french fries", true, 530, Type.OTHER),
                new Dish("rice", true, 350, Type.OTHER), new Dish("season", true, 120, Type.OTHER),
                new Dish("pizza", true, 550, Type.OTHER), new Dish("prawns", false, 300, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH));

    }

    public static List<Dish> menuUpdated() {
        return Arrays.asList(new Dish("pork", false, 800, Type.MEAT), new Dish("beef", false, 700, Type.MEAT),
                new Dish("chicken", false, 400, Type.MEAT), new Dish("french fries", true, 530, Type.OTHER),
                new Dish("rice", true, 350, Type.OTHER), new Dish("season", true, 120, Type.OTHER),
                new Dish("pizza", true, 550, Type.OTHER), new Dish("prawns", false, 300, Type.FISH),
                new Dish("salmon", false, null, Type.NONE));

    }

    @Override
    public String toString() {
        return "Dish [name=" + name + ", vegetarian=" + vegetarian + ", calories=" + calories + ", type=" + type + "]";
    }


}
