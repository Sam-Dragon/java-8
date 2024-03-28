package streams_features.pack;

import java.util.List;

public class StreamsSupportsInternalIteration {

    public static void main(String[] args) {
        System.out.println("External Iteration");
        externalIteration(model.pack.DishObj.menu());

        System.out.println("\n\nInternal Iteration");
        internalIteration(model.pack.DishObj.menu());
    }

    private static void internalIteration(List<model.pack.DishObj> menu) {
        menu.forEach(dish -> System.out.print(dish.getName() + ", "));
    }

    public static void externalIteration(List<model.pack.DishObj> list) {
        for (model.pack.DishObj dish : list) {
            System.out.print(dish.getName() + ", ");
        }
    }
}
