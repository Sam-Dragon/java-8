package learn.java8.optional.create.methods;

import java.util.Optional;

public class OptionalOfNullable {

	public static void main(String[] args) {

		Optional<String> string = Optional.of("Rahul");
		System.out.println(string);

		Optional<Integer> optionalEmpty = Optional.ofNullable(null);
		System.out.println(optionalEmpty);
	}
}
