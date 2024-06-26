public class Program_21_Largest_BST_in_a_Binary_Tree_V_V_V_V_V_IMP {
    static class Node {
        int data;
        Node left, right;
      
        Node(int d) {
            data = d;
            left = right = null;
        }
    }
    static class Value {
        int max_size = 0; 
        boolean is_bst = false;
        int min = Integer.MAX_VALUE; 
        int max = Integer.MIN_VALUE; 
    }

    static Node root;
    Value val = new Value();
  
    int largestBST(Node node) {
  
        largestBSTUtil(node, val, val, val, val);
  
        return val.max_size;
    }
  
    int largestBSTUtil(Node node, Value min_ref, Value max_ref, Value max_size_ref, Value is_bst_ref) {
  
        if (node == null) {
            is_bst_ref.is_bst = true; 
            return 0;    
        }
  
        int min = Integer.MAX_VALUE;

        boolean left_flag = false;
  
        boolean right_flag = false;
  
        int ls, rs; 

        max_ref.max = Integer.MIN_VALUE;
        ls = largestBSTUtil(node.left, min_ref, max_ref, max_size_ref, is_bst_ref);
        if (is_bst_ref.is_bst == true && node.data > max_ref.max) {
            left_flag = true;
        }
  
        min = min_ref.min;
  
        min_ref.min = Integer.MAX_VALUE;
        rs = largestBSTUtil(node.right, min_ref, max_ref, max_size_ref, is_bst_ref);
        if (is_bst_ref.is_bst == true && node.data < min_ref.min) {
            right_flag = true;
        }
  
        if (min < min_ref.min) {
            min_ref.min = min;
        }
        if (node.data < min_ref.min) 
        {
            min_ref.min = node.data;
        }
        if (node.data > max_ref.max) {
            max_ref.max = node.data;
        }
  
        if (left_flag && right_flag) {
            if (ls + rs + 1 > max_size_ref.max_size) {
                max_size_ref.max_size = ls + rs + 1;
            }
            return ls + rs + 1;
        } else {
            is_bst_ref.is_bst = false;
            return 0;
        }
    }
  
    public static void main(String[] args) {
  
        Program_21_Largest_BST_in_a_Binary_Tree_V_V_V_V_V_IMP tree = new Program_21_Largest_BST_in_a_Binary_Tree_V_V_V_V_V_IMP();
        tree.root = new Node(50);
        tree.root.left = new Node(10);
        tree.root.right = new Node(60);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(20);
        tree.root.right.left = new Node(55);
        tree.root.right.left.left = new Node(45);
        tree.root.right.right = new Node(70);
        tree.root.right.right.left = new Node(65);
        tree.root.right.right.right = new Node(80);
  
        System.out.println("Size of largest BST is " + tree.largestBST(root));
    }
}
