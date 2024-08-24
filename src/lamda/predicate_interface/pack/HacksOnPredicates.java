package lamda.predicate_interface.pack;

import java.util.function.Predicate;

public class HacksOnPredicates {

    public static void main(String[] args) {
        // Expression must be defined which result boolean, but here we have defined
        // default
        Predicate<String> result = i -> true;
        System.out.println(result.test("True"));
        System.out.println(result.test("false"));
    }
}
