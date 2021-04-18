import java.util.LinkedList;
import java.util.Queue;

public class Program_9_Left_View_of_a_tree {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Program_9_Left_View_of_a_tree.Node root;
    static int max_level = 0;

    void leftViewUtil(Node node, int level) {
        if (node == null)
            return;

        if (max_level < level) {
            System.out.print(" " + node.data);
            max_level = level;
        }

        leftViewUtil(node.left, level + 1);
        leftViewUtil(node.right, level + 1);
    }

    void leftView() {
        leftViewUtil(root, 1);
    }


    /*  No recursion */
    private static void printLeftView(Node root)
    {
        if (root == null)
            return;
 
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
 
        while (!queue.isEmpty()) {
            int n = queue.size();
 
            for (int i = 1; i <= n; i++) {
                Node temp = queue.poll();
 
                if (i == 1)
                    System.out.print(temp.data + " ");
 
                if (temp.left != null)
                    queue.add(temp.left);
 
                if (temp.right != null)
                    queue.add(temp.right);
            }
        }
    }


    public static void main(String args[]) {
        Program_9_Left_View_of_a_tree tree = new Program_9_Left_View_of_a_tree();
        tree.root = new Node(12);
        tree.root.left = new Node(10);
        tree.root.right = new Node(30);
        tree.root.right.left = new Node(25);
        tree.root.right.right = new Node(40);

        tree.leftView();
        System.out.println();
        tree.printLeftView(tree.root);
    }
}