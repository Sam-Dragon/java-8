package src.optionals.learn.java8.optional.chaining.methods;

import src.model.Car;
import src.model.Insurance;
import src.model.Person;

import java.util.Optional;

public class MapVsFlatMap {

    public static void main(String[] args) {
        Person person = new Person(Optional.empty());

        String insurance = Optional.ofNullable(person)
                .flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("No Insurance");
        System.out.println("FlatMap Insurance :: " + insurance);

        Optional<Person> optionalPerson = Optional.of(new Person());
        Optional<Car> optionalCar = Optional.of(new Car());
        insurance = (String) optionalPerson.map(p -> optionalCar.map(car -> findResult(p, car))
                        .orElse("Car Empty"))
                .orElse("Person Empty");
        System.out.println("FlatMap Insurance :: " + insurance);
    }

    private static Object findResult(Person p, Car car) {
        return null;
    }
}
