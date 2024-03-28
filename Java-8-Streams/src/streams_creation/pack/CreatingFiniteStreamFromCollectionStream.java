package streams_creation.pack;

public class CreatingFiniteStreamFromCollectionStream {

    public static void main(String[] args) {
        model.pack.DishObj.menu().stream().map(model.pack.DishObj::getName).forEach(System.out::println);
    }
}
