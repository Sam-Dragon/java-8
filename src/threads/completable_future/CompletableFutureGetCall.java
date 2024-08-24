package threads.completable_future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CompletableFutureGetCall {

    public static void main(String[] args) {
        Shop shop = new Shop("Best Shop");
        var start = System.nanoTime();
        /*
         * Basic version with completable_future
         */
        // Future<Double> futurePrice = shop.getPriceAsync("My Favorite Product");

        /*
         * Enhanced version with completable future [using utility methods]
         */
        Future<Double> futurePrice = shop.getPriceAsync_using_utility_methods("My Favorite Product");

        var end = System.nanoTime();
        var difference = (end - start) / 1_000_000;
        System.out.println(Thread.currentThread()
                .getName() + " > Invocation returned after :: " + difference + " in milli seconds");

        try {
            /*
             * Basic way [Not Recommended ]: Future result
             */
            // double price = futurePrice.get();
            /*
             * Standard way [Recommended ]: Future result
             */
            double price = futurePrice.get(5, TimeUnit.SECONDS);

            System.out.println(Thread.currentThread()
                    .getName() + " > Price is :: " + price);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            System.out.println("Exception :: " + e.getMessage());
            throw new RuntimeException(e);
        }

        end = System.nanoTime();
        difference = (end - start) / 1_000_000;
        System.out.println(Thread.currentThread()
                .getName() + " > Price returned after :: " + difference + " in milli seconds");
    }

}
