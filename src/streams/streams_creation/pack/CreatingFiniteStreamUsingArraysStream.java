package src.streams.streams_creation.pack;

import src.model.Employee;

import java.util.Arrays;

public class CreatingFiniteStreamUsingArraysStream {

    public static void main(String[] args) {
        Arrays.stream(Employee.employees()
                        .toArray())
                .forEach(System.out::println);
    }
}
