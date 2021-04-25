import java.util.ArrayList;

public class Program_16_Count_BST_ndoes_that_lie_in_a_given_range {

    /* Approach in solution */
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    Program_16_Count_BST_ndoes_that_lie_in_a_given_range() {
        root = null;
    }

    int getCount(Node node, int low, int high) {
        if (node == null)
            return 0;

        if (node.data >= low && node.data <= high)
            return 1 + this.getCount(node.left, low, high) + this.getCount(node.right, low, high);

        else if (node.data < low)
            return this.getCount(node.right, low, high);

        else
            return this.getCount(node.left, low, high);
    }

    /* My Approach */
    static ArrayList arr = new ArrayList();

    static void inorder(Node root, int l, int h) {
        if (root == null) {
            return;
        }
        inorder(root.left, l, h);
        if (root.data >= l && root.data <= h)
            arr.add(root.data);
        inorder(root.right, l, h);
    }

    static int getCount_my(Node root, int l, int h) {
        inorder(root, l, h);
        return arr.size();
    }

    public static void main(String[] args) {
        Program_16_Count_BST_ndoes_that_lie_in_a_given_range tree = new Program_16_Count_BST_ndoes_that_lie_in_a_given_range();

        tree.root = new Node(10);
        tree.root.left = new Node(5);
        tree.root.right = new Node(50);
        tree.root.left.left = new Node(1);
        tree.root.right.left = new Node(40);
        tree.root.right.right = new Node(100);

        int l = 5;
        int h = 45;
        System.out.println("Count of nodes between [" + l + ", " + h + "] is " + tree.getCount(tree.root, l, h));
        System.out.println("Count of nodes between [" + l + ", " + h + "] is " + tree.getCount_my(tree.root, l, h));
    }
}