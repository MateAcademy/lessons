package mate.academy.less02.tutorials;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class ReferenceBook<K, V> {

    private Node<K, V>[] hashTable;
    private int size = 0;
    private float threshold;

    private void add(K key, V value) {
        Node<K, V> newNode = new Node<>(key, value);
       // int index = hash(newNode);
    }

    private int hash(Node<K, V> node) {
        return node.hashCode() % hashTable.length;
    }

    private int hash(final K key) {
        int hash = 31;
        hash = hash*17 + key.hashCode();
        return hash % hashTable.length;

    }

    private class Node<K, V> {
        private List<Node<K, V>> nodes;
        private int hash;
        private K key;
        private V value;


        private Node(K key, V value) {
            this.key = key;
            this.value = value;
            nodes = new LinkedList<Node<K, V>>();
        }

        private List<Node<K, V>> getNodes() {
            return nodes;
        }

        private int hash() {
            return hashCode() % hashTable.length;
        }

        private K getKey() {
            return key;
        }

        private V getValue() {
            return value;
        }

        private void setValue(V value) {
            this.value = value;
        }

        @Override
        public int hashCode() {
            hash = 31;
            hash = hash * 17 + key.hashCode();
            hash = hash * 17 + value.hashCode();
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;

            if (obj instanceof Node) {
                Node<K, V> node = (Node) obj;
                return (Objects.equals(key, node.getKey()) &&
                        Objects.equals(value, node.getValue()) ||
                        Objects.equals(hash, node.hashCode()));
            }
            return false;
        }
    }
}
