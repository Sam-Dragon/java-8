package src.optionals.learn.java8.optional.combine.methods;

import src.model.Car;
import src.model.Person;

import java.util.Optional;

public class CombiningOptionalOneAfterAnotherUsingFlatMapMethod {

    public static void main(String[] args) {
//		Optional<Person> person = Optional.empty();
//		Optional<Car> car = Optional.empty();

        Optional<Person> person = Optional.ofNullable(new Person());
        Optional<Car> car = Optional.empty();

//		Optional<Person> person = Optional.ofNullable(new Person(Optional.empty()));
//		Optional<Car> car = Optional.ofNullable(new Car());

        String result;
        result = checkTheResult(person, car);
        System.out.println("Actual Result >> " + result);

        result = checkTheEquivalentResult(person, car);
        System.out.println("Equivalent Result >> " + result);
    }

    private static String checkTheResult(Optional<Person> person, Optional<Car> car) {
        if (person.isPresent() && car.isPresent())
            return findResult(person.get(), car.get());
        else
            return "Empty";
    }

    private static String checkTheEquivalentResult(Optional<Person> optionalPerson, Optional<Car> optionalCar) {
        return optionalPerson.flatMap(person -> optionalCar.map(car -> findResult(person, car)))
                .orElse("Empty");
    }

    private static String findResult(Person person, Car car) {
        return "Not Empty";
    }
}
