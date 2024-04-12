package src.optionals.learn.java8.optional.chaining.methods;

import src.model.Insurance;

import java.util.Optional;

public class MapWithOptional {

    public static void main(String[] args) {

        Optional<Insurance> stringOptional = Optional.ofNullable(new Insurance("Private Insurance"));
        String insuranceName = stringOptional.map(Insurance::getName)
                .orElse("Unknown");
        System.out.println("Name of insurance :: " + insuranceName);
    }
}
