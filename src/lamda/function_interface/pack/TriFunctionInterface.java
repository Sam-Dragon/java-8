package src.lamda.function_interface.pack;

import java.util.List;

@FunctionalInterface
public interface TriFunctionInterface<T, Q, R> {
    List<T> apply(T t, Q q, R r);
}
