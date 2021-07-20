package learn.java8.optional;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlatMap {

	public static void main(String[] args) {
		List<String> myList = Stream.of("a", "b").map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(myList);

		List<List<String>> list = Arrays.asList(Arrays.asList("a"), Arrays.asList("b"));
		System.out.println(list.stream()
				.map(stringList -> stringList.stream().map(String::toUpperCase).collect(Collectors.toList())));

		// FlatMap
		System.out.println(list.stream().flatMap(Collection::stream).collect(Collectors.toList()));
		System.out.println(list.stream().flatMap(inputList -> inputList.stream()).collect(Collectors.toList()));

		// Example 1
		List<List<Integer>> combinedList = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));

		// Find sum of numbers from combinedList
		System.out.println("Total = "
				+ combinedList.stream().flatMap(combined -> combined.stream()).mapToInt(Integer::valueOf).sum());

		// Example 2
		List<String> words = Arrays.asList("Java Dev Journal", "Java", "Spring Boot", "Java 8");

		System.out.println("Array");
		words.stream().mapToInt(String::length).forEach(System.out::println);
		System.out.println("Total = " + words.stream().mapToInt(String::length).sum());
		System.out.println("Total = " + words.stream().mapToInt(String::length).sum());

		// Example 3
		words = Arrays.asList("JavaDevJournal", "Java");
		System.out.println(words.stream().collect(Collectors.toList()));
		System.out.println(words.stream().map(s -> s.split("")).flatMap(Arrays::stream).collect(Collectors.toList()));
	}
}
