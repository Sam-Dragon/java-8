package lamda.method_references.pack;

@FunctionalInterface
public interface QuadFunction<T, U, V, S, R> {
    R apply(T t, U u, V v, S s);
}