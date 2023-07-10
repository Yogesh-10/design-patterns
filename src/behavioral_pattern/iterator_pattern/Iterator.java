package behavioral_pattern.iterator_pattern;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
