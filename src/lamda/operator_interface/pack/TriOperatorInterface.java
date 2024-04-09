package src.lamda.operator_interface.pack;

@FunctionalInterface
public interface TriOperatorInterface<T, Q, R> {
    T apply(T t, Q q, R r);
}
