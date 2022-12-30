package MyHashMap;

public class MyHashMap<K, V> {
    private Node<K, V> head;


    public void put(K key, V value) {
        Node<K, V> newNode = new Node<K, V>(key, value);
        if (head == null) head = newNode;
        else {
            Node currentNode = head;
            boolean temp = true;
            while (currentNode.getNextNode() != null) {
                if (newNode.getKey().equals(currentNode.getKey())) {
                    temp = false;
                    break;
                }
                currentNode = currentNode.getNextNode();

            }
            if (temp) {
                currentNode = head;
                while (currentNode.getNextNode() != null && temp) {
                    currentNode = currentNode.getNextNode();

                }
                currentNode.setNextNode(newNode);
            }
        }
    }

    public void remove(K key) {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        if (key.equals(head.getKey())) head = head.getNextNode();
        else {
            Node<K, V> removeNode = head;
            while (true) {
                if (removeNode == null) {
                    throw new IndexOutOfBoundsException("Invalid key: " + key);
                }
                if (key.equals(removeNode.getNextNode().getKey())) {
                    break;
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
        Node<K, V> last = head;
        while (last.getNextNode() != null) {
            last = last.getNextNode();
            count++;
        }

        return count;
    }

    public void get(K key) {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        if (key.equals(head.getKey())) System.out.println("head.getValue() = " + head.getValue());
        else {
            Node<K, V> searcheNode = head;
            while (true) {
                if (searcheNode == null) {
                    throw new IndexOutOfBoundsException("Invalid key: " + key);
                }
                if (key.equals(searcheNode.getNextNode().getKey())) {
                    break;
                }
                searcheNode = searcheNode.getNextNode();
            }
            searcheNode = searcheNode.getNextNode();
            System.out.println("searcheNode.getValue(" + key + ") = " + searcheNode.getValue());

        }
    }

    public void display() {
        if (head != null) {
            Node currentNode = head;
            while (currentNode.getNextNode() != null) {
                System.out.println(currentNode.getKey() + " = " + currentNode.getValue());
                currentNode = currentNode.getNextNode();
            }
            System.out.println(currentNode.getKey() + " = " + currentNode.getValue());
        }
    }
}


