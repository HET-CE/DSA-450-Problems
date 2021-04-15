public class Program_14_Check_if_a_tree_is_balanced_or_not {
    static class Node {
        int data;
        Node left, right;
        Node(int d)
        {
            data = d;
            left = right = null;
        }
    }
    static class Height {
        int height = 0;
    }
      
    Node root;
  
    boolean isBalanced(Node root, Height height)
    {
        if (root == null) {
            height.height = 0;
            return true;
        }
  
        Height lheight = new Height(), rheight = new Height();
        boolean l = isBalanced(root.left, lheight);
        boolean r = isBalanced(root.right, rheight);
        int lh = lheight.height, rh = rheight.height;
  
        height.height = (lh > rh ? lh : rh) + 1;
  
        if (Math.abs(lh - rh) >= 2)
            return false;
        else
            return l && r;
    }
  
    public static void main(String args[])
    {
        Height height = new Height();
        Program_14_Check_if_a_tree_is_balanced_or_not tree = new Program_14_Check_if_a_tree_is_balanced_or_not();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.left.left.left = new Node(7);
  
        if (tree.isBalanced(tree.root, height))
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");
    }
}