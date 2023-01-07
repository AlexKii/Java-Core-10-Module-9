package myHashMap;

public class Node<K, V> {
    private K key;
    private V value;
    private Node<K, V> node;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
    public Node<K, V> getNextNode() {
        return node;
    }
    public void setNextNode(Node<K, V> node) {
        this.node = node;
    }
}