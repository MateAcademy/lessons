package mate.academy.less04.map;

public interface Book<K, V> {
    V put(K key, V value);

    V remove(K key);

    void clear();

    int size();

    V get(K key);
}
