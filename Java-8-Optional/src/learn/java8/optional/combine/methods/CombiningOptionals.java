package learn.java8.optional.combine.methods;

import java.util.Optional;

import learn.java8.optional.model.Car;
import learn.java8.optional.model.Insurance;
import learn.java8.optional.model.Person;

public class CombiningOptionals {

    public static void main(String[] args) {
        CombiningOptionals combiningOptionals = new CombiningOptionals();
        Optional<Person> person = Optional.of(new Person());
        Optional<Car> car = Optional.of(new Car());

        String insurance = combiningOptionals.getCheapInsuranceUsingFlatMap(person, car).map(Insurance::getName)
                .orElse("++ Empty");
        System.out.println(insurance);

        insurance = combiningOptionals.getCheapInsuranceUsingFlatMap(Optional.empty(), Optional.empty())
                .map(Insurance::getName).orElse(">> Empty");
        System.out.println(insurance);

        insurance = combiningOptionals.getCheapInsuranceUsingFlatMap(null, null).map(Insurance::getName)
                .orElse("<< Empty");
        System.out.println(insurance);
    }

    // Normal
    public Optional<Insurance> getCheapInsurance(Optional<Person> person, Optional<Car> car) {
        if (person.isPresent() && car.isPresent())
            return Optional.of(findInsurance(person.get(), car.get()));
        else
            return Optional.empty();
    }

    // Using Optional Effectively
    public Optional<Insurance> getCheapInsuranceUsingFlatMap(Optional<Person> person, Optional<Car> car) {
        return person.flatMap(p -> car.map(c -> findInsurance(p, c)));
    }

    private Insurance findInsurance(Person person, Car car) {
        return new Insurance("Private Insurance");
    }
}
