package src.threads.completable_future;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public record Shop(String shopName) {

    public double getPrice(String product) {
        return calculatePrice(product);
    }

    public Future<Double> getPriceAsync(String product) {
        System.out.println(Thread.currentThread()
                .getName() + " > [Start] getPriceAsync()");
        CompletableFuture<Double> futurePrice = new CompletableFuture<>();
        new Thread(() -> {
            try {
                System.out.println(Thread.currentThread()
                        .getName() + " > [Start] getPriceAsync() -> calculatePrice()");
                System.out.println();
                var price = calculatePrice(product);
                System.out.println(Thread.currentThread()
                        .getName() + " > [End] getPriceAsync() -> calculatePrice(). Price :: " + price);
                System.out.println();
                futurePrice.complete(price);
            } catch (Exception e) {
                System.out.println("Future Exception :: " + e);
                futurePrice.completeExceptionally(e);
            }
        }).start();

        System.out.println(Thread.currentThread()
                .getName() + " > [End] getPriceAsync()");
        System.out.println();
        return futurePrice;
    }

    public Future<Double> getPriceAsync_using_utility_methods(String product) {
        System.out.println(Thread.currentThread()
                .getName() + " > [Start] getPriceAsync()");
        CompletableFuture<Double> futurePrice = CompletableFuture.supplyAsync(() -> calculatePrice(product));

        System.out.println(Thread.currentThread()
                .getName() + " > [End] getPriceAsync()");
        System.out.println();
        return futurePrice;
    }

    private double calculatePrice(String product) {
        System.out.println(Thread.currentThread()
                .getName() + " > [Start] calculatePrice()");
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        var value = new Random().nextDouble() * product.charAt(0) + product.charAt(1);
        System.out.println(Thread.currentThread()
                .getName() + " > [Result] calculatePrice(). Price :: " + value);
        System.out.println(Thread.currentThread()
                .getName() + " > [End] calculatePrice()");
        System.out.println();
        /*
         * Exception Condition for testing
         */
        // System.out.println("Creating Exception" + (1 / 0));

        return value;
    }

}
