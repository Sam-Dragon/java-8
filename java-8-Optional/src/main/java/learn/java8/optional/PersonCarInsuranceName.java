package learn.java8.optional;

import java.util.Optional;

import learn.java8.optional.model.Car;
import learn.java8.optional.model.Insurance;
import learn.java8.optional.model.Person;

public class PersonCarInsuranceName {

	public static void main(String[] args) {
		Person person = new Person(Optional.empty());
		System.out.println(getInsuranceOfPersonOptionally(person));

		System.out.println();
		
		person = new Person();
		System.out.println(getInsuranceOfPersonOptionally(person));

		// System.out.println(getInsuranceOfPerson(person));
	}

	// Normal Way
	private static String getInsuranceOfPerson(Person person) {
		return person.getCar().get().getInsurance().get().getName();
	}

	// Optional Way
	private static String getInsuranceOfPersonOptionally(Person person) {
		Optional<Person> optionalPerson = Optional.ofNullable(person);
		System.out.println("Optional Person >> " + optionalPerson);

		Optional<Car> optionalCar = optionalPerson.flatMap(Person::getCar);
		System.out.println("Optional Car >> " + optionalCar);

		Optional<Insurance> optionalInsurance = optionalCar.flatMap(Car::getInsurance);
		System.out.println("Optional Insurance >> " + optionalInsurance);

		return optionalInsurance.map(Insurance::getName).orElse("No Insurance");
	}
}
