package learn.java8.optional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetUniqueLettersFromWords {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("JavaDevJournal", "Java");
		System.out.println(words);

		System.out.println(
				words.stream().map(s -> s.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()));
	}

}
