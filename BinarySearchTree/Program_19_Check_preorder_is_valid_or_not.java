import java.util.Stack;
/* Checking is Valid Preorder Traversal Or Not*/

public class Program_19_Check_preorder_is_valid_or_not {

    boolean canRepresentBST(int pre[], int n) {
        Stack<Integer> s = new Stack<Integer>();

        int root = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (pre[i] < root) {
                return false;
            }

            while (!s.empty() && s.peek() < pre[i]) {
                root = s.peek();
                s.pop();
            }
            s.push(pre[i]);
        }
        return true;
    }

    public static void main(String args[]) {
        Program_19_Check_preorder_is_valid_or_not bst = new Program_19_Check_preorder_is_valid_or_not();
        int[] pre1 = new int[] { 40, 30, 35, 80, 100 };
        int n = pre1.length;
        if (bst.canRepresentBST(pre1, n) == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        int[] pre2 = new int[] { 40, 30, 35, 20, 80, 100 };
        int n1 = pre2.length;
        if (bst.canRepresentBST(pre2, n) == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

/* To get Inorder Traversal of constructed tree from Preorder traversal */

// public class Program_19_Check_preorder_is_valid_or_not {
// static class Node {

// int data;
// Node left, right;

// Node(int d) {
// data = d;
// left = right = null;
// }
// }

// Node constructTree(int pre[], int size) {

// Node root = new Node(pre[0]);

// Stack<Node> s = new Stack<Node>();

// s.push(root);

// for (int i = 1; i < size; ++i) {
// Node temp = null;
// while (!s.isEmpty() && pre[i] > s.peek().data) {
// temp = s.pop();
// }

// if (temp != null) {
// temp.right = new Node(pre[i]);
// s.push(temp.right);
// }

// else {
// temp = s.peek();
// temp.left = new Node(pre[i]);
// s.push(temp.left);
// }
// }

// return root;
// }

// void printInorder(Node node) {
// if (node == null) {
// return;
// }
// printInorder(node.left);
// System.out.print(node.data + " ");
// printInorder(node.right);
// }
// public static void main(String[] args) {
// Program_19_Check_preorder_is_valid_or_not tree = new
// Program_19_Check_preorder_is_valid_or_not();
// int pre[] = new int[]{10, 5, 1, 7, 40, 50};
// int size = pre.length;
// Node root = tree.constructTree(pre, size);
// System.out.println("Inorder traversal of the constructed tree is ");
// tree.printInorder(root);
// }
// }