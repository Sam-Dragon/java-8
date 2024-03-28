package model.pack;

import java.util.Arrays;
import java.util.List;

public class DishInstance {

    private final String name;
    private final boolean vegeterian;
    private final Integer calories;
    private final Type type;

    public DishInstance(String name, boolean vegeterian, Integer calories, Type type) {
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

    public Integer getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type {
        MEAT, FISH, OTHER, NONE
    }

    public static List<model.pack.DishInstance> menu() {
        return Arrays.asList(new model.pack.DishInstance("pork", false, 800, model.pack.DishInstance.Type.MEAT), new model.pack.DishInstance("beef", false, 700, model.pack.DishInstance.Type.MEAT),
                new model.pack.DishInstance("chicken", false, 400, model.pack.DishInstance.Type.MEAT), new model.pack.DishInstance("french fries", true, 530, model.pack.DishInstance.Type.OTHER),
                new model.pack.DishInstance("rice", true, 350, model.pack.DishInstance.Type.OTHER), new model.pack.DishInstance("season", true, 120, model.pack.DishInstance.Type.OTHER),
                new model.pack.DishInstance("pizza", true, 550, model.pack.DishInstance.Type.OTHER), new model.pack.DishInstance("prawns", false, 300, model.pack.DishInstance.Type.FISH),
                new model.pack.DishInstance("salmon", false, 450, model.pack.DishInstance.Type.FISH));

    }

    public static List<model.pack.DishInstance> menuUpdated() {
        return Arrays.asList(new model.pack.DishInstance("pork", false, 800, model.pack.DishInstance.Type.MEAT), new model.pack.DishInstance("beef", false, 700, model.pack.DishInstance.Type.MEAT),
                new model.pack.DishInstance("chicken", false, 400, model.pack.DishInstance.Type.MEAT), new model.pack.DishInstance("french fries", true, 530, model.pack.DishInstance.Type.OTHER),
                new model.pack.DishInstance("rice", true, 350, model.pack.DishInstance.Type.OTHER), new model.pack.DishInstance("season", true, 120, model.pack.DishInstance.Type.OTHER),
                new model.pack.DishInstance("pizza", true, 550, model.pack.DishInstance.Type.OTHER), new model.pack.DishInstance("prawns", false, 300, model.pack.DishInstance.Type.FISH),
                new model.pack.DishInstance("salmon", false, null, model.pack.DishInstance.Type.NONE));

    }

    @Override
    public String toString() {
        return "Dish [name=" + name + ", vegeterian=" + vegeterian + ", calories=" + calories + ", type=" + type + "]";
    }


}
