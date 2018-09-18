package datastructures;

import java.util.HashSet;
import java.util.NoSuchElementException;

public class SingleLinkedList {

    private Node head;

    public SingleLinkedList() {
        this.head = null;
    }

    /*adds element at the beginning of the list*/
    public void push(int value) {

        Node tempNode = new Node(value);
        tempNode.setNext(this.head);
        this.head = tempNode;

    }

    /*adds element at the end of the list*/
    public void add(int value) {

        Node tempNode = new Node(value);

        if (this.head == null) {
            this.head = tempNode;
            return;
        }

        Node p = this.head;

        while(p.getNext() != null) {
            p = p.getNext();
        }

        p.setNext(tempNode);
    }

    public Node getFirst() {
        if (this.head == null) {
            throw  new NoSuchElementException();
        }

        return this.head;
    }

    public void size() {
        int cont = 0;
        Node tempNode = this.head;

        while(tempNode != null) {
            tempNode = tempNode.getNext();
            cont ++;
        }

        System.out.println("The size of the list is: " + cont);
    }

    public Node deleteDuplicates(Node a) {

        Node temp = a;

        if (temp.next == null) return temp;

        while(temp.next != null) {

            Node iter = temp.next;

            while (temp.value == iter.value) {
                iter = iter.next;

                if (iter == null) break;
            }

            temp.next = iter;

            if (iter == null) break;

            temp = temp.next;

        }

        return a;
    }

    public Node detectCycle(Node a) {

        HashSet<Integer> hash = new HashSet<>();

        Node temp = a;

        if (a == null) return null;

        while(a!=null) {
            if (hash.contains(a.value)) return a;
            hash.add(a.value);
            a = a.next;
        }

        return null;

    }


    public void print() {
        Node tempNode = this.head;
        StringBuilder str = new StringBuilder();
        str.append("Printing list:\n");

        while(tempNode != null) {
            str.append(" " + tempNode.getValue() + " ");
            tempNode = tempNode.getNext();
        }

        System.out.println(str.toString());
        return;
    }
}
