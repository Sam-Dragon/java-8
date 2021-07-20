package method_references.pack;

import java.util.Comparator;
import java.util.function.BiFunction;

public class MethodReferencesApplicable {

    public static void main(String[] args) {

    }

    public void compare() {
        Comparator<Integer> compareString = (a, b) -> a.compareTo(b);
        int result = compareString.compare(10, 10);
        System.out.println("(a > b) ? " + (result >= 0));

//        BiFunction<Integer, Integer, Integer> function = Comparator::comparing;
    }
}
