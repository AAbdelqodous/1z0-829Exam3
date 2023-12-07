package q16;

public interface Creator<T, R> {
    R create(T t);
}
