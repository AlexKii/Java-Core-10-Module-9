package myQueue;
import java.util.StringJoiner;

public class MyQueue<T> {
    private Node<T> head;

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (this.head == null) head = newNode;
        else {
            Node<T> currentNode = head;
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(newNode);
        }
    }

    public void addHead(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.setNextNode(head);
        head = newNode;
    }

    public T poll() {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        Node<T> pollNode = head;
        head = head.getNextNode();
        return pollNode.getValue();
    }

    public void clear() {
        head = null;
    }

    public int size() {
        if (head == null) return 0;
        int count = 1;
        Node<T> last = head;
        while (last.getNextNode() != null) {
            last = last.getNextNode();
            count++;
        }
        return count;
    }

    public T peek() {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        return head.getValue();
    }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        Node<T> last = head;
        for (int i = 0; i < size(); i++) {
            result.add(last.getValue().toString());
            last = last.getNextNode();
        }
        return "[" + result + "]";
    }

    public void display() {
        if (head != null) {
            Node<T> currentNode = head;
            while (currentNode.getNextNode() != null) {
                System.out.println(currentNode.getValue());
                currentNode = currentNode.getNextNode();
            }
            System.out.println(currentNode.getValue());
        }
    }
}