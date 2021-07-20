package learn.java8.optional;

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
		
		insurance = combiningOptionals.getCheapInsuranceUsingFlatMap(null, null)
				.map(Insurance::getName).orElse("<< Empty");
		System.out.println(insurance);

//		Optional<Person> person = Optional.ofNullable(new Person(Optional.empty()));
//		Optional<Car> car = Optional.ofNullable(new Car(new Insurance("Name")));
//		System.out.println("Result 2 >> " + getCheapInsurance(person, car));
	}

	// Normal
	public Optional<Insurance> getCheapInsurance(Optional<Person> person, Optional<Car> car) {
		if (person.isPresent() && car.isPresent())
			return Optional.of(findInsurance(person.get(), car.get()));
		else
			return Optional.empty();
	}

	// Advance
	public Optional<Insurance> getCheapInsuranceUsingFlatMap(Optional<Person> person, Optional<Car> car) {
		return person.flatMap(p -> car.map(c -> findInsurance(p, c)));
	}

	private Insurance findInsurance(Person person, Car car) {
		System.out.println("Coming");
		return new Insurance(null);
	}
}
