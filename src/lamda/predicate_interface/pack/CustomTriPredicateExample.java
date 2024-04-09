package src.lamda.predicate_interface.pack;

public class CustomTriPredicateExample {

    public static void main(String[] args) {

        final int sum = 100;
        TriPredicateInterface<Integer, Integer, Integer> numberTriPredicate = (a, b, c) -> a + b + c > sum;
        int aa = 10, bb = 20, cc = 10;
        System.out.println(aa + " + " + bb + " + " + cc + " > " + sum + " ? " + numberTriPredicate.test(aa, bb, cc));

        final int stringLength = 5;
        String s1 = "S1", s2 = "S2", s3 = "S3";
        TriPredicateInterface<String, String, String> stringTriPredicate = (a, b,
                c) -> (a + b + c).length() > stringLength;
        System.out.println(s1 + " + " + s2 + " + " + s3 + " .length() > " + stringLength + " ? "
                + stringTriPredicate.test(s1, s2, s3));
    }
}
