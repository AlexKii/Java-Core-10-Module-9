package MyLinkedList;
import java.util.StringJoiner;

public class MyLinkedList<T> {
    private Node<T> head;
    public void add(T value) {
        Node<T> newNode = new Node<T>(value);
        if (this.head == null) head = newNode;
        else {
            Node<T> currentNode = head;
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(newNode);
        }
    }
    public void addHead(T value){
        Node<T> newNode = new Node<T>(value);
        newNode.setNextNode(head);
        head = newNode;
    }
    public void remove(int index) {
        if (index < 0) throw new IndexOutOfBoundsException("Invalid index: " + index);
        if (head == null) {
            throw new IndexOutOfBoundsException("Invalid index: " + index + ", list is empty");
        }
        if (index == 0) head = head.getNextNode();
        else {
            Node<T> removeNode = head;
            for (int i = 1; i < index; i++) {
                if (removeNode == null) {
                    throw new IndexOutOfBoundsException("Invalid index: " + index + ", Size: " + size());
                }
                removeNode = removeNode.getNextNode();
            }
            removeNode.setNextNode(removeNode.getNextNode().getNextNode());
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
        if (index < 0) throw new IndexOutOfBoundsException("Invalid index: " + index);
        if (head == null) {
            throw new IndexOutOfBoundsException("Invalid index: " + index + ", list is empty");
        }
        Node<T> search = head;
        for (int i = 0; i < index; i++) {
            if (search == null) {
                throw new IndexOutOfBoundsException("Invalid index: " + index + ", Size: " + size());
            }
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
    public void display(){
        if(head != null){
            Node<T> currentNode = head;
            while(currentNode.getNextNode()!= null){
                System.out.println(currentNode.getValue());
                currentNode = currentNode.getNextNode();
            }
            System.out.println(currentNode.getValue());
        }
    }
}
