package learn.java8.optional;

import java.util.Optional;

public class OptionalMethods {

	public static void main(String[] args) {

		Optional<String> empty = Optional.empty();
		System.out.println("isEmpty :: Is Optional <" + empty + "> Empty = " + empty.isEmpty());
		System.out.println("isPresent :: Is Optional <" + empty + "> Present = " + empty.isPresent());
		System.out.println("ofNullable :: Is Optional <" + empty + "> Nullable = " + Optional.of(empty));
		empty.ifPresent(ref -> System.out.println("Is Optional <" + empty + "> Present = " + ref));
//		System.out.println("input_one <" + empty + "> get = " + empty.get()); // NoSuchElementException
		System.out.println();

		Optional<String> input_one = Optional.of("Rahul");
		System.out.println("isEmpty :: input_one <" + input_one + "> Empty = " + input_one.isEmpty());
		System.out.println("isPresent :: input_one <" + input_one + "> Present = " + input_one.isPresent());
		input_one.ifPresent(
				ref -> System.out.println("ifPresent :: Is input_one <" + input_one + ">  Present = " + ref));
		System.out.println("get :: input_one <" + input_one + "> get = " + input_one.get());
		System.out.println();

		Optional<String> optional_two = Optional.of("Rahul");
		System.out.println("optional_two = " + optional_two);
		System.out.println();

		Optional<String> nullRefernce = null;
		System.out.println(
				"ofNullable :: Is Optional.ofNullable <" + nullRefernce + "> = " + Optional.ofNullable(nullRefernce));
//		System.out.println("of :: Is Optional.ofNullable <" + nullRefernce + "> = " + Optional.of(nullRefernce)); // NullPointerException
		System.out.println();

		Optional<String> filter = Optional.of("Rahul");
		System.out.println("or :: <" + filter + "> = " + filter.or(() -> Optional.of("Default or")));

		System.out.println("orElse :: <" + filter + "> = " + filter.orElse("Default orElse"));
		System.out.println("orElse :: <" + filter + "> = " + filter.orElseGet(() -> "Default or"));
		System.out.println();

//		Optional<String> emptyInput = Optional.empty();
//		System.out.println(
//				"orElse :: <" + emptyInput + "> = " + emptyInput.orElseThrow(() -> new RuntimeException("Exception"))); // Custom Exception

		Optional<Integer> number = Optional.empty();
		System.out.println("filter:: <" + number + "> = " + number.filter(n -> n > 0).orElse(-1));
		
		number = Optional.of(100);
		System.out.println("filter:: <" + number + "> = " + number.filter(n -> n > 0).orElse(-1));
		
		System.out.println();
	}
}
