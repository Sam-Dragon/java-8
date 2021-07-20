package learn.java8.optional;

import java.util.Optional;

public class ThrowingExceptionForOptional {

	public static void main(String[] args) {

		String input = "11";
		System.out.println("Input = " + input);
		Optional<Integer> optionalResult = findResult(input);

		System.out.println("Square Result = " + optionalResult.map(result -> result * result).orElse(0));
		System.out.println();

		input = "Rahul";
		System.out.println("Input = " + input);
		optionalResult = findResult(input);

		System.out.println("Square Result = " + optionalResult.map(result -> result * result).orElse(0));
	}

	private static Optional<Integer> findResult(String input) {
		Optional<Integer> result = Optional.empty();
		try {
			return Optional.ofNullable(Integer.parseInt(input));
		} catch (Exception e) {
//			System.out.println(e);
			return result;
		}
	}
}
