package learn.java8.optional.chaining.methods;

import java.util.Optional;

import learn.java8.optional.model.Car;
import learn.java8.optional.model.Insurance;
import learn.java8.optional.model.Person;

public class MapVsFlatMap {

    public static void main(String[] args) {
        Person person = new Person(Optional.empty());

        String insurance = Optional.ofNullable(person).flatMap(Person::getCar).flatMap(Car::getInsurance)
                .map(Insurance::getName).orElse("No Insurance");
        System.out.println("FlatMap Insurance :: " + insurance);
        
//        insurance = Optional.ofNullable(person).map(Person::getCar).orElse(Car::new).map(Car::getInsurance).or
//                .map(Insurance::getName).orElse("No Insurance");
        System.out.println("FlatMap Insurance :: " + insurance);

    }
}
