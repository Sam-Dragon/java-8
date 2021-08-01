package model.pack;

import java.util.Arrays;
import java.util.List;

public class Dish {

    private final String name;
    private final boolean vegeterian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegeterian, int calories, Type type) {
        super();
        this.name = name;
        this.vegeterian = vegeterian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type {
        MEAT, FISH, OTHER
    }

    public static List<Dish> menu() {
        return Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT), new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT), new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER), new Dish("season", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER), new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH));

    }

    @Override
    public String toString() {
        return "Dish [name=" + name + ", vegeterian=" + vegeterian + ", calories=" + calories + ", type=" + type + "]";
    }
    
    
}
