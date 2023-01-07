package myLinkedList;

import java.util.StringJoiner;

public class MyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = tail = newNode;
            head.setPrevNode(null);
            tail.setNextNode(null);
        } else {
            tail.setNextNode(newNode);
            newNode.setPrevNode(tail);
            tail = newNode;
            tail.setNextNode(null);
        }
    }

    public void remove(int index) {
        if (head == null) throw new IndexOutOfBoundsException("List is empty");
        if (index < 0 || index > size() - 1) throw new IndexOutOfBoundsException("Invalid index: " + index);
        if (index == 0 && size() == 1) head = tail = null;
        if (index == 0 && size() > 1) {
            head = head.getNextNode();
            head.setPrevNode(null);
        } else if (index == size() - 1 && size() > 1) {
            tail = tail.getPrevNode();
            tail.setNextNode(null);
        } else {
            Node<T> removeNode = head;
            for (int i = 1; i < index; i++) {
                removeNode = removeNode.getNextNode();
            }
            removeNode.setNextNode(removeNode.getNextNode().getNextNode());
            removeNode = removeNode.getNextNode();
            removeNode.setPrevNode(removeNode.getPrevNode().getPrevNode());
        }
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

    public T get(int index) {
        if (head == null) throw new IndexOutOfBoundsException("List is empty");
        if (index < 0 || index > size() - 1) throw new IndexOutOfBoundsException("Invalid index: " + index);
        Node<T> search = head;
        for (int i = 0; i < index; i++) {
            search = search.getNextNode();
        }
        return search.getValue();
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
}
