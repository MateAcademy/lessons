package mate.academy.less03.myLinkedList;

public class MyLinkedList<T> {

    private Node firstNode;
    private Node lastNode;
    private int size;

    public MyLinkedList() {
        this.size = 0;
    }

    public void add(T value) {
        if (size == 0) {
            firstNode = new Node(null, null, value);
            lastNode = firstNode;
            size++;
        } else {
            Node<T> currNode = new Node(lastNode,null, value);
            lastNode = currNode;
            size++;
        }

    }

    @Override
    public String toString() {
        Node<T> currentNode = firstNode;
        StringBuilder result = new StringBuilder(currentNode.value.toString());
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            result.append(",").append(currentNode.value.toString());
        }
        return result.toString();
    }

    class Node<T> {
        Node prev;
        Node next;
        T value;

        public Node(Node prev, Node next, T value) {
            this.prev = prev;
            this.next = next;
            this.value = value;
        }
    }
}

