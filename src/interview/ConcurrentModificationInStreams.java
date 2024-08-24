package interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConcurrentModificationInStreams {
    public static void main(String[] args) {
        var list = Arrays.asList("Ram", "Sam", "Tom", "Tim");

        list.stream()
                .map(n -> {
                    if (n.equalsIgnoreCase("RAM"))
                        list.remove(n);

                    return n.toLowerCase();
                })
                .collect(Collectors.toList());

    }
}
