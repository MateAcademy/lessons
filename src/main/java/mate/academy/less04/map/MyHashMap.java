package mate.academy.less04.map;

public class MyHashMap<K, V> implements Book<K, V> {
    final int CAPACITY = 16;
    private int size;
    private Node[] arrOfNodes;

    public MyHashMap() {
        arrOfNodes = new Node[CAPACITY];
    }

    class Node<K, V> {
        int hash;
        K key;
        V value;
        Node next;

        public Node(int hash, K key, V value, Node next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % arrOfNodes.length;
    }

    @Override
    public V put(K key, V value) {
        int hash = key.hashCode();
        int index = getIndex(key);
        Node newNode = new Node(hash, key, value, null);
        if (arrOfNodes[index] == null) {
            arrOfNodes[index] = newNode;
            size++;
        } else {
            Node currentNode = arrOfNodes[index];
            while (currentNode != null) {
                if (currentNode.key == key) {
                    currentNode.value = value;
                    break;
                }
                if (currentNode.next == null) {
                    currentNode = newNode;
                }
                currentNode = currentNode.next;
            }
        }
        return value;
    }

    @Override
    public V remove(K key) {
        int index = getIndex(key);
        V removedValue = null;
        Node<K, V> currentNode = arrOfNodes[index];
        while (currentNode != null) {
            if (currentNode.key == key) {
                removedValue = currentNode.value;
                arrOfNodes[index] = null;
                size--;
            } else {
                currentNode = currentNode.next;
            }
        }

        return removedValue;
    }

    @Override
    public void clear() {
        for (int i = 0; i < arrOfNodes.length; i++) {
            arrOfNodes[i] = null;
        }
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public V get(K key) {
        int index = getIndex(key);
        V receivedValue = null;
        Node<K, V> currentNode = arrOfNodes[index];
        while (currentNode != null) {
            if (currentNode.key == key) {
                receivedValue = currentNode.value;
                break;
            } else {
                currentNode = currentNode.next;
            }
        }
        return receivedValue;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{ ");
        for (int i = 0; i < arrOfNodes.length; i++) {
            if (arrOfNodes[i] != null) {
                stringBuilder.append("[").append(arrOfNodes[i].key).append(", ");
                stringBuilder.append(arrOfNodes[i].value).append("]").append(" ");
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}