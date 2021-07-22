package streams_creation.pack;

import java.util.Arrays;

import model.pack.Employee;

public class CreatingFiniteStreamUsingArraysStream {

    public static void main(String[] args) {
        Arrays.stream(Employee.employees().toArray()).forEach(System.out::println);
    }
}
