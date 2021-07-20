package learn.java8.optional;

import java.util.Optional;

import learn.java8.optional.model.Car;
import learn.java8.optional.model.Insurance;

public class FlatMapWithOptional {

	public static void main(String[] args) {

		Optional<Insurance> insurance = Optional.empty();
		Car car = new Car(insurance);
		Optional<Car> optCar = Optional.ofNullable(car);
		String result = optCar.flatMap(Car::getInsurance).map(Insurance::getName)
				.filter(r -> r.equalsIgnoreCase("Same")).orElse("Unknown");
		System.out.println("Name >> " + result);

		insurance = Optional.ofNullable(new Insurance("Same"));
		car = new Car(insurance);
		optCar = Optional.ofNullable(car);
		result = optCar.flatMap(Car::getInsurance).map(Insurance::getName).filter(r -> r.equalsIgnoreCase("Same"))
				.orElse("Unknown");
		System.out.println("Name >> " + result);
		
		insurance = Optional.ofNullable(null);
		car = new Car(insurance);
		optCar = Optional.ofNullable(car);
		result = optCar.flatMap(Car::getInsurance).map(Insurance::getName).filter(r -> r.equalsIgnoreCase("Same"))
				.orElse("Unknown");
		System.out.println("Name >> " + result);
	}
}
