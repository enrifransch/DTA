package datastructures;

public class BinaryTree {

    public BTNode root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int value) {

        if (root == null) {
            this.root = new BTNode(value);
            return;
        }

        if (value > this.root.value) {
            insertRight(this.root, value);

        } else {
            insertLeft(this.root, value);
        }
    }

    private void insertLeft(BTNode BTNode, int value) {

        if (BTNode.left == null) {
            BTNode.left = new BTNode(value);
            return;
        }

        if (value > BTNode.left.value) {
            insertRight(BTNode.left, value);
        } else {
            insertLeft(BTNode.left, value);
        }
    }

    private void insertRight(BTNode BTNode, int value) {

        if (BTNode.right == null) {
            BTNode.right = new BTNode(value);
            return;
        }

        if (value > BTNode.right.value) {
            insertRight(BTNode.right, value);
        } else {
            insertLeft(BTNode.right, value);
        }
    }

    public boolean contains(int value) {

        BTNode temp = this.root;

        if (this.root == null) {
            return false;
        }

        while (temp != null) {

            if (temp.value == value) {
                return true;
            }

            if (value > temp.value) {
                temp = temp.right;
            } else {
                temp = temp.left;
            }
        }

        return false;

    }

    public int size() {

        BTNode temp = this.root;

        return size(temp);
    }

    private int size(BTNode node) {

        if (node == null) {
            return 0;
        }

        return 1 + size(node.left) + size(node.right);
    }

    public int minValue() {

        BTNode temp = this.root;

        if (temp == null) {
            return 0;
        }

        while (temp.left != null) {
            temp = temp.left;
        }

        return temp.value;
    }

    public int maxValue() {


        BTNode temp = this.root;

        if (temp == null) {
            return 0;
        }

        while (temp.right != null) {
            temp = temp.right;
        }

        return temp.value;
    }

    public int maxDepth() {

        BTNode temp = this.root;
        int cont = 0;

        if (temp == null) {
            return cont;
        }

        int left = maxDepth(temp.left, cont++);
        int right = maxDepth(temp.right, cont++);

        if (left > right) {
            return left;
        } else {
            return right;
        }
    }

    private int maxDepth(BTNode node, int cont) {

        if (node == null) {
            return cont;
        }

        int left = maxDepth(node.left, cont++);
        int right = maxDepth(node.right, cont++);

        if (left > right) {
            return left;
        } else {
            return right;
        }

    }

}
