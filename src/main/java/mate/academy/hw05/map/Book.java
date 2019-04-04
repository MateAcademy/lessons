package mate.academy.hw05.map;

public interface Book<K, V> extends Iterable<V>{
    boolean insert(K key, V value);
    boolean delete(K key);
    V get(K key);
    int size();
}
