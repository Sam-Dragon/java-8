package learn.java8.optional;

import java.util.Optional;

import learn.java8.optional.model.Insurance;

public class RejectingOptionalsUsingFilter {

	public static void main(String[] args) {

		Optional<Insurance> optionalInsurance = Optional.empty();
		optionalInsurance.filter(insurance -> insurance.getName().equalsIgnoreCase("Apple")).ifPresentOrElse(
				insurance -> System.out.println(insurance.getName()), () -> System.out.println("Not Ok"));

		optionalInsurance = Optional.ofNullable(new Insurance("Apple"));
		optionalInsurance.filter(insurance -> insurance.getName().equalsIgnoreCase("Apple")).ifPresentOrElse(
				insurance -> System.out.println(insurance.getName()), () -> System.out.println("Not Apple"));
		
		optionalInsurance = Optional.ofNullable(null);
		optionalInsurance.filter(insurance -> insurance.getName().equalsIgnoreCase("Pineapple")).ifPresentOrElse(
				insurance -> System.out.println(insurance.getName()), () -> System.out.println("Not Pineapple"));
	}
}
