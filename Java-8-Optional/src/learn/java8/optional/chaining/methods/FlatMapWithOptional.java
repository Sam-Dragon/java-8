package learn.java8.optional.chaining.methods;

import java.util.Optional;

import learn.java8.optional.model.Car;
import learn.java8.optional.model.Insurance;

public class FlatMapWithOptional {

    public static void main(String[] args) {

        Optional<Insurance> insurance = Optional.empty();
        Car car = new Car(insurance);
        Optional<Car> optCar = Optional.ofNullable(car);
        
        String result = optCar.flatMap(Car::getInsurance).map(Insurance::getName).orElse("Unknown");
        System.out.println("Name >> " + result);
    }
}
