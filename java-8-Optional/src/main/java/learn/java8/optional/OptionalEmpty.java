package learn.java8.optional;

import java.util.Optional;

public class OptionalEmpty {

	public static void main(String[] args) {
		
		Optional<String> emptyString = Optional.empty();
		System.out.println(emptyString);

		Optional<Integer> emptyInteger = Optional.empty();
		System.out.println(emptyInteger);
	}
}
