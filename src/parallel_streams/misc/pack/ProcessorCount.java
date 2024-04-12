package src.parallel_streams.misc.pack;

public class ProcessorCount {

    public static void main(String[] args) {
        System.out.println("No. of processors :: " + Runtime.getRuntime()
                .availableProcessors());
    }
}
