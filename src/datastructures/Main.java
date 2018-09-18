package datastructures;

public class Main {

    public static void main(String[] args) {

        SingleLinkedList list = new SingleLinkedList();

        list.add(2);
        list.add(3);
        list.add(8);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(8);
        list.add(15);
        list.add(18);
        list.add(19);

        Node cycle = list.detectCycle(list.getFirst());

        if (cycle == null) {
            System.out.println(cycle);
        } else {
            System.out.println(cycle.value);
        }

    }
}
