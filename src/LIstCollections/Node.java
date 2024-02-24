package LIstCollections;

public class Node <T> {
    private Node<T> next;
    private T value;
    public Node(T e) {
        this.value = e;
    }
    public Node<T> getNext() {
        return next;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }
    public T getValue() {
        return value;
    }
}

