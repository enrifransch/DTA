package datastructures;

public class Main {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.insert(5);
        tree.insert(8);
        tree.insert(9);
        tree.insert(6);
//        tree.insert(3);
//        tree.insert(2);
//        tree.insert(90);
//        tree.insert(7);
//        tree.insert(9);
//        tree.insert(7);
//        tree.insert(9);
//        tree.insert(7);
//        tree.insert(9);

        int size = tree.size();
        int min = tree.minValue();
        int max = tree.maxValue();
        int depth = tree.maxDepth();

        System.out.println(size);
        System.out.println(min);
        System.out.println(max);
        System.out.println(depth);

    }
}
