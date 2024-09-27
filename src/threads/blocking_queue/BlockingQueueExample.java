package threads.blocking_queue;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueExample {

    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please select the option");
            int option = sc.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println("Please enter the element");
                    int element = sc.nextInt();

                    System.out.println("Adding a number to the queue");
                    add(queue, element);
                }
                case 2 -> {
                    System.out.println("Please enter the element");
                    int element = sc.nextInt();

                    System.out.println("putting a number to the queue");
                    put(queue, element);
                }
                case 3 -> {
                    System.out.println("taking a number to the queue");
                    take(queue);
                }
                case 4 -> {
                    System.out.println("polling a number to the queue");
                    poll(queue);
                }
                case 5 -> {
                    System.out.println("Display queue");
                    display(queue);
                }
                default -> System.exit(1);
            }
            System.out.println();
        }
    }

    /**
     * Add - fails beyond capacity
     */
    public static void add(ArrayBlockingQueue<Integer> queue, int number) {
        // Add
        queue.add(number);
        System.out.println("Size :: " + queue.size());
    }

    /**
     * put - waits beyond capacity
     */
    public static void put(ArrayBlockingQueue<Integer> queue, int number) {
        // put
        try {
            queue.put(number);
            System.out.println("Size :: " + queue.size());
        } catch (InterruptedException e) {
            throw new RuntimeException("put exception :: " + e);
        }
    }

    /**
     * take - waits beyond capacity
     */
    public static void take(ArrayBlockingQueue<Integer> queue) {
        // take
        try {
            queue.take();
        } catch (InterruptedException e) {
            throw new RuntimeException("take exception :: " + e);
        }
        System.out.println("Size :: " + queue.size());
    }

    /**
     * poll - waits beyond capacity
     */
    public static void poll(ArrayBlockingQueue<Integer> queue) {
        // take
        try {
            queue.poll(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException("poll exception :: " + e);
        }
        System.out.println("Size :: " + queue.size());
    }

    /**
     * poll - waits beyond capacity
     */
    public static void display(ArrayBlockingQueue<Integer> queue) {
        // take
        queue.stream()
            .iterator()
            .forEachRemaining(System.out::println);
    }
}
