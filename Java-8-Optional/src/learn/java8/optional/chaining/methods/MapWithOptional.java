package learn.java8.optional.chaining.methods;

import java.util.Optional;

import learn.java8.optional.model.Insurance;

public class MapWithOptional {

    public static void main(String[] args) {

        Optional<Insurance> stringOptional = Optional.ofNullable(new Insurance("Private Insurance"));
        String insuranceName = stringOptional.map(Insurance::getName).orElse("Unknown");
        System.out.println("Name of insurance :: " + insuranceName);
    }
}
