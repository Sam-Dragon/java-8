package interview.model;

import java.util.Arrays;
import java.util.List;

public class DishModel {

    private final String name;
    private final boolean vegeterian;
    private final int calories;
    private final Type type;

    public DishModel(String name, boolean vegeterian, int calories, Type type) {
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

    public static List<DishModel> menu() {
        return Arrays.asList(new DishModel("pork", false, 800, DishModel.Type.MEAT), new DishModel("beef", false, 700, DishModel.Type.MEAT),
                new DishModel("chicken", false, 400, DishModel.Type.MEAT), new DishModel("french fries", true, 530, DishModel.Type.OTHER),
                new DishModel("rice", true, 350, DishModel.Type.OTHER), new DishModel("season", true, 120, DishModel.Type.OTHER),
                new DishModel("pizza", true, 550, DishModel.Type.OTHER), new DishModel("prawns", false, 300, DishModel.Type.FISH),
                new DishModel("salmon", false, 450, DishModel.Type.FISH));

    }
}
