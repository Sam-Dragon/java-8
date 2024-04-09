package src.lamda.consumer_interface.pack;

import java.util.function.Consumer;

public class HacksOnConsumer {

    public static void main(String[] args) {
       
        Consumer<String> consumer = e -> {
            method();
        };

        consumer.accept("Samual");
    }
    
    public static void method() {
//        System.out.println("Method");
    }
}
