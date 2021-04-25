public class Program_22_Flatten_BST_to_sorted_list__LEFT {
    
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static Node root;

    Program_22_Flatten_BST_to_sorted_list__LEFT() {
        root = null;
    }

    static Node prev = root;
    static void inorder(Node curr){
        if(curr == null){
            return;
        }
        inorder(curr.left);
        prev.right = curr;
        prev.left = null;
        prev= curr;
        inorder(curr.right);
    }

    static void display(Node root){
        if(root == null){
            return;
        }
        display(root.left);
        System.out.println(root.data);
        display(root.right);
    }
    public static void main(String[] args) {
        Program_22_Flatten_BST_to_sorted_list__LEFT tree = new Program_22_Flatten_BST_to_sorted_list__LEFT();

        tree.root = new Node(10);
        tree.root.left = new Node(5);
        tree.root.right = new Node(50);
        tree.root.left.left = new Node(1);
        tree.root.right.left = new Node(40);
        tree.root.right.right = new Node(100);
        
        inorder(tree.root);
        display(tree.root);
    }
}
