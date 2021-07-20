package learn.java8.optional;

import java.util.Optional;

public class OptionalOf {

	public static void main(String[] args) {

		Optional<String> string = Optional.of("Rahul");
		System.out.println(string);

		Optional<Integer> nullPointerException = Optional.of(null);
		System.out.println(nullPointerException);
	}
}
