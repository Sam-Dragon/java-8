package src.optionals.learn.java8.optional.misc;

import java.util.Optional;
import java.util.Properties;

public class ReadDuration {

    public static void main(String[] args) {

        Properties properties = new Properties();
        properties.setProperty("three", "3");
        properties.setProperty("boolean", "true");
        properties.setProperty("minusthree", "-3");

        String name = "three";
        System.out.println("Result of(" + name + ") >> " + readDuration(properties, name));

        name = "boolean";
        System.out.println("Result of(" + name + ") >> " + readDuration(properties, name));

        name = "minusthree";
        System.out.println("Result of(" + name + ") >> " + readDuration(properties, name));
    }

    private static Integer readDuration(Properties properties, String name) {
//		return Optional.ofNullable(name).map(properties::getProperty).map(ReadDuration::parseStringToNumber).orElse(0);

        return Optional.ofNullable(name)
                .map(properties::getProperty)
                .flatMap(ReadDuration::stringToNumber)
                .filter(i -> i > 0)
                .orElse(0);
    }

    private static Optional<Integer> stringToNumber(String input) {
        try {
            return Optional.of(Integer.parseInt(input));
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}
