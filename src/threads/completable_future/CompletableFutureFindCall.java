package src.threads.completable_future;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFutureFindCall {

    List<Shop> shops = Arrays.asList(
            new Shop("BestPrice"),
            new Shop("LetsSaveBig"),
            new Shop("MyFavoriteShop"),
            new Shop("BuyItAll"),
            // Increased the shops for checking performance
            new Shop("BestFinder"),
            new Shop("BigSave"),
            new Shop("FavoriteShop"),
            new Shop("BuyAll"),
            new Shop("ShopEasy"),
            new Shop("BestPrice"),
            new Shop("LetsSaveBig"),
            new Shop("MyFavoriteShop"),
            new Shop("BuyItAll"),
            // Increased the shops for checking performance
            new Shop("BestFinder"),
            new Shop("BigSave"),
            new Shop("FavoriteShop"),
            new Shop("BuyAll"),
            new Shop("ShopEasy")
    );

    public static void main(String[] args) {
        CompletableFutureFindCall call = new CompletableFutureFindCall();

        System.out.println(Thread.currentThread()
                .getName() + " > Sequential Invocation returned after :: " +
                call.sequentialExecution(call) + " in milli seconds");
        System.out.println();

        System.out.println(Thread.currentThread()
                .getName() + " > Parallel Invocation returned after :: " +
                call.parallelExecution(call) + " in milli seconds");
        System.out.println();

        System.out.println(Thread.currentThread()
                .getName() + " > Completable Future Invocation returned after :: " +
                call.completableFutureExecution(call) + " in milli seconds");

        System.out.println(Thread.currentThread()
                .getName() + " > Completable Future Invocation returned after :: " +
                call.completableFutureWithCustomExecutorExecution(call) + " in milli seconds");
    }

    private long sequentialExecution(CompletableFutureFindCall call) {
        var start = System.nanoTime();
        System.out.println(call.findPricesSequential("Iphone 14s"));
        return (System.nanoTime() - start) / 1_000_000;
    }

    private long parallelExecution(CompletableFutureFindCall call) {
        var start = System.nanoTime();
        System.out.println(call.findPricesParallel("Iphone 14s"));
        return (System.nanoTime() - start) / 1_000_000;
    }

    private long completableFutureExecution(CompletableFutureFindCall call) {
        var start = System.nanoTime();
        System.out.println(call.findPricesCompletableFuture("Iphone 14s"));
        return (System.nanoTime() - start) / 1_000_000;
    }

    private long completableFutureWithCustomExecutorExecution(CompletableFutureFindCall call) {
        var start = System.nanoTime();
        System.out.println(call.findPricesCompletableFutureWithCustomExecutor("Iphone 14s"));
        return (System.nanoTime() - start) / 1_000_000;
    }

    public List<String> findPricesSequential(String product) {
        return shops.stream()
                .map(s -> String.format("%s price is %.2f", s.shopName(), s.getPrice(product)))
                .collect(Collectors.toList());
    }

    public List<String> findPricesParallel(String product) {
        return shops.parallelStream()
                .map(s -> String.format("%s price is %.2f", s.shopName(), s.getPrice(product)))
                .collect(Collectors.toList());
    }

    public List<String> findPricesCompletableFuture(String product) {
        List<CompletableFuture<String>> priceFutures = shops.stream()
                .map(s -> CompletableFuture.supplyAsync(
                        () -> s.shopName() + " price is " + s.getPrice(product)))
                .toList();

        return priceFutures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());
    }

    public List<String> findPricesCompletableFutureWithCustomExecutor(String product) {
        Executor executor = Executors.newFixedThreadPool(Math.min(shops.size(), 100), r -> {
                    Thread thread = new Thread(r);
                    thread.setDaemon(true);
                    return thread;
                }
        );

        List<CompletableFuture<String>> priceFutures = shops.stream()
                .map(s -> CompletableFuture.supplyAsync(
                        () -> s.shopName() + " price is " + s.getPrice(product), executor))
                .toList();

        return priceFutures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());
    }
}

