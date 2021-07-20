package predicate_interface.pack;

@FunctionalInterface
public interface TriPredicateInterface<T, Q, R> {
    boolean test(T t, Q q, R r);
}
