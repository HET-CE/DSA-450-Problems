import java.util.ArrayList;

public class Program_13_Find_Kth_smallest_element_in_a_BST {
    static class Node {

        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    /* My Approach */
    static ArrayList arr = new ArrayList();
    
    public static void kthSmallest_my(Node root) {
        if (root == null) {
            return;
        }
        kthSmallest_my(root.left);
        arr.add(root.data);
        kthSmallest_my(root.right);
    }

    Node root;

    Program_13_Find_Kth_smallest_element_in_a_BST() {
        root = null;
    }

    public void insert(int data) {
        this.root = this.insertRec(this.root, data);
    }

    Node insertRec(Node node, int data) {
        if (node == null) {
            this.root = new Node(data);
            return this.root;
        }

        if (data == node.data) {
            return node;
        }

        if (data < node.data) {
            node.left = this.insertRec(node.left, data);
        } else {
            node.right = this.insertRec(node.right, data);
        }
        return node;
    }


    static int count = 0;
    // Recursive function to insert an key into BST
    public static Node insert(Node root, int x)
    {
        if (root == null)
            return new Node(x);
        if (x < root.data)
            root.left = insert(root.left, x);
        else if (x > root.data)
            root.right = insert(root.right, x);
        return root;
    }
      
    // Function to find k'th largest element in BST
    // Here count denotes the number
    // of nodes processed so far
    public static Node kthSmallest(Node root, int k)
    {
        // base case
        if (root == null)
            return null;
      
        // search in left subtree
        Node left = kthSmallest(root.left, k);
      
        // if k'th smallest is found in left subtree, return it
        if (left != null)
            return left;
      
        // if current element is k'th smallest, return it
        count++;
        if (count == k)
            return root;
      
        // else search in right subtree
        return kthSmallest(root.right, k);
    }
      
    // Function to find k'th largest element in BST
    public static void printKthSmallest(Node root, int k)
    {
        // maintain an index to count number of
        // nodes processed so far
        count = 0;
         
        Node res = kthSmallest(root, k);
        if (res == null)
            System.out.println("There are less "
                        + "than k nodes in the BST");
        else
            System.out.println("K-th Smallest"
                    + " Element is " + res.data);
    }
         
    public static void main (String[] args) {
         
        Node root = null;
        int keys[] = { 20, 8, 22, 4, 12, 10, 14 };
        int k = 5;

        for (int x : keys)
            root = insert(root, x);
         
        printKthSmallest(root, k);
        
        kthSmallest_my(root);
        System.out.println(arr.get(k-1));
        }
}