package src.optionals.learn.java8.optional.combine.methods;

import src.model.Car;
import src.model.Person;

import java.util.Optional;

public class CombiningOptionalOneAfterAnotherUsingMapMethod {
    public static void main(String[] args) {
        Optional<Person> person = Optional.of(new Person());
//		Optional<Car> car = Optional.ofNullable(new Car());
        Optional<Car> car = Optional.of(new Car());

        String result = checkTheResult(person, car);
        System.out.println("Actual Result >> " + result);

        result = checkTheEquivalentResult(person, car);
        System.out.println("Equivalent Result >> " + result);
    }

    private static String checkTheResult(Optional<Person> person, Optional<Car> car) {
        if (car.isEmpty())
            if (person.isEmpty())
                return "Person Empty";
            else
                return "Car Empty";
        else
            return findResult(person.get(), car.get());
    }

    private static String checkTheEquivalentResult(Optional<Person> optionalPerson, Optional<Car> optionalCar) {
        return optionalPerson.map(person -> optionalCar.map(car -> findResult(person, car)).orElse("Car Empty"))
                .orElse("Person Empty");
    }

    private static String findResult(Person person, Car car) {
        return "Not Empty";
    }
}
