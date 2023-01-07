package myStack;

public class Node<T> {
    private T value;
    private Node<T> node;

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
        return node;
    }

    public void setNextNode(Node<T> node) {
        this.node = node;
    }
}