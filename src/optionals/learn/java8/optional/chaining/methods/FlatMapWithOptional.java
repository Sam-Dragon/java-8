package optionals.learn.java8.optional.chaining.methods;

import model.Car;
import model.Insurance;

import java.util.Optional;

public class FlatMapWithOptional {

    public static void main(String[] args) {

        Optional<Insurance> insurance = Optional.empty();
        Car car = new Car(insurance);
        Optional<Car> optCar = Optional.ofNullable(car);

        String result = optCar.flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("Unknown");
        System.out.println("Name >> " + result);
    }
}
