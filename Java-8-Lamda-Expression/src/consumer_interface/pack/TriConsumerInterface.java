package consumer_interface.pack;

@FunctionalInterface
public interface TriConsumerInterface<T, Q, R> {
    void recieve(T t, Q q, R r);
}
