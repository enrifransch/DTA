package datastructures;

public class Node {

    public Node next;
    public int value;

    public Node(int value) {
        this.next = null;
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
