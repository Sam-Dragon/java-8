package streams_features.pack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProofThatCollectionModificationWontHappenWhileStream {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Before Streaming :: " + numbers);

        System.out.println("Applying Streams");
        numbers.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());

        System.out.println("After Streaming :: " + numbers);
    }
}
