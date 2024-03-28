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

    public static List<model.pack.DishObj> menu() {
        return Arrays.asList(new model.pack.DishObj("pork", false, 800, model.pack.DishObj.Type.MEAT), new model.pack.DishObj("beef", false, 700, model.pack.DishObj.Type.MEAT),
                new model.pack.DishObj("chicken", false, 400, model.pack.DishObj.Type.MEAT), new model.pack.DishObj("french fries", true, 530, model.pack.DishObj.Type.OTHER),
                new model.pack.DishObj("rice", true, 350, model.pack.DishObj.Type.OTHER), new model.pack.DishObj("season", true, 120, model.pack.DishObj.Type.OTHER),
                new model.pack.DishObj("pizza", true, 550, model.pack.DishObj.Type.OTHER), new model.pack.DishObj("prawns", false, 300, model.pack.DishObj.Type.FISH),
                new model.pack.DishObj("salmon", false, 450, model.pack.DishObj.Type.FISH));

    }
}
