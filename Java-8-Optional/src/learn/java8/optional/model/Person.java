package learn.java8.optional.model;

import java.util.Optional;

public class Person {

    private Optional<Car> car = Optional.empty();

    public Person() {
    }

    public Person(Optional<Car> car) {
        super();
        this.car = car;
    }

    public Optional<Car> getCar() {
        return car;
    }

    public void setCar(Optional<Car> car) {
        this.car = car;
    }

}
