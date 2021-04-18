public class Program_10_Right_View_of_Tree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;
    static int max_level = 0;

    void rightViewUtil(Node node, int level) {
        if (node == null)
            return;

        if (max_level < level) {
            System.out.print(" " + node.data);
            max_level = level;
        }

        rightViewUtil(node.right, level + 1);
        rightViewUtil(node.left, level + 1);
    }

    void rightView() {
        rightViewUtil(root, 1);
    }

    public static void main(String args[]) {
        Program_10_Right_View_of_Tree tree = new Program_10_Right_View_of_Tree();
        tree.root = new Node(12);
        tree.root.left = new Node(10);
        tree.root.right = new Node(30);
        tree.root.right.left = new Node(25);
        tree.root.right.right = new Node(40);

        tree.rightView();
    }
}

