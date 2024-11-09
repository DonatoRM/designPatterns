package behaviour.iterator.models;

public interface Collection<T> {
    Iterator<T> createIterator();
}
