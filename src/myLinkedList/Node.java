package myLinkedList;


public class Node<T> {
    private T value;
    private Node<T> next;
    private Node<T> prev;

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public Node<T> getNextNode() {
        return next;
    }
    public void setNextNode(Node<T> node) {
        this.next = node;
    }

    public Node<T> getPrevNode() {
        return prev;
    }

    public void setPrevNode(Node<T> prev) {
        this.prev = prev;
    }
}
