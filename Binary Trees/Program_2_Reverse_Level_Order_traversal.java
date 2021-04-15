public class Program_2_Reverse_Level_Order_traversal {
    Node root;

    static class Node {
        int data;
        Node left, right;
    
        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    void printLevelOrderReverse(){
        int h = height(root);
        int i;
        for (i = h; i >= 1; i--)
            printGivenLevel(root, i);
    }

    int height(Node root) {
        if (root == null)
            return 0;
        else {
            int lheight = height(root.left);
            int rheight = height(root.right);

            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }

    void printGivenLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }    

    public static void main(String args[]) {
        Program_2_Reverse_Level_Order_traversal tree = new Program_2_Reverse_Level_Order_traversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.right = new Node(6);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Level order traversal of binary tree is ");
        tree.printLevelOrderReverse();
        System.out.println();
        // tree.levelOrder(tree.root);
    }
}
