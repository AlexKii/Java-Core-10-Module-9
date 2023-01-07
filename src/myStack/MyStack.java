package myStack;
import java.util.StringJoiner;

public class MyStack<T> {
    private Node<T> head;
    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.setNextNode(head);
        head = newNode;
    }
    public void remove(int index) {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        if (index < 0 || index > size() - 1) throw new IndexOutOfBoundsException("Invalid index: " + index);
        if (index == 0) head = head.getNextNode();
        else {
            Node<T> removeNode = head;
            for (int i = 1; i < index; i++) {
                removeNode = removeNode.getNextNode();
            }
            removeNode.setNextNode(removeNode.getNextNode().getNextNode());
        }
    }

    public T pop() {
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