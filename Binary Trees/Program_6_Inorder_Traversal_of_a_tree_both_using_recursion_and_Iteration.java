import java.util.Stack;

public class Program_6_Inorder_Traversal_of_a_tree_both_using_recursion_and_Iteration {
    static class Node {
        int data;
        Node left, right;

        public Node(int key) {
            data = key;
            left = right = null;
        }
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void inorderIterative(Node root)
    {
        Stack<Node> stack = new Stack();    
        Node curr = root;
    
        while (!stack.empty() || curr != null)
        {
            if (curr != null)
            {
                stack.push(curr);
                curr = curr.left;
            }
            else {
                curr = stack.pop();
                System.out.print(curr.data + " ");
    
                curr = curr.right;
            }
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

        inorder(root);
        System.out.println();
        inorderIterative(root);
    }
}
