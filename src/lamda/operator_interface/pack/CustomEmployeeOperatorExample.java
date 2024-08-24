package lamda.operator_interface.pack;

public class CustomEmployeeOperatorExample {

    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        TriOperatorInterface<Integer, Integer, Integer> integerTriOperator = (i, j, k) -> i + j + k;
        System.out.println("Sum (" + a + " + " + b + " + " + c + ") = " + integerTriOperator.apply(a, b, c));
    }

}
