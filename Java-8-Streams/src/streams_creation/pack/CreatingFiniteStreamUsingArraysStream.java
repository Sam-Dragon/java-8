package streams_creation.pack;

import java.util.Arrays;

public class CreatingFiniteStreamUsingArraysStream {

    public static void main(String[] args) {
        Arrays.stream(model.pack.EmployeeObj.employees().toArray()).forEach(System.out::println);
    }
}
