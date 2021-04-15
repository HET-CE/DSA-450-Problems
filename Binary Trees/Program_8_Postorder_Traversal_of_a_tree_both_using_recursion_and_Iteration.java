import java.util.Stack;

public class Program_8_Postorder_Traversal_of_a_tree_both_using_recursion_and_Iteration {

    static class Node {
        int data;
        Node left, right;

        // Function to create a new binary tree node having a given key
        public Node(int key) {
            data = key;
            left = right = null;
        }
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void Iterativepostorder(Node root) {
        Stack<Node> stack = new Stack();
        stack.push(root);

        Stack<Integer> out = new Stack();

        while (!stack.empty()) {
            Node curr = stack.pop();
            out.push(curr.data);

            if (curr.left != null) {
                stack.push(curr.left);
            }
            if (curr.right != null) {
                stack.push(curr.right);
            }
        }
        while (!out.empty()) {
            System.out.print(out.pop() + " ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);

        postorder(root);
        System.out.println();
        Iterativepostorder(root);
    }
}
