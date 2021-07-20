package creating_streams.pack;

import java.util.Arrays;

import model.pack.Employee;

public class CreatingStreamUsingArraysStream {

    public static void main(String[] args) {

        Arrays.stream(Employee.employees().toArray()).forEach(System.out::println);
    }
}
