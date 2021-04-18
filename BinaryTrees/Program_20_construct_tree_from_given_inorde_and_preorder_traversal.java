import java.util.Stack;
import java.util.HashSet;
import java.util.Set;

public class Program_20_construct_tree_from_given_inorde_and_preorder_traversal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    static Set<TreeNode> set = new HashSet<>();
    static Stack<TreeNode> stack = new Stack<>();
 
    public TreeNode buildTree(int[] preorder, int[] inorder)
    {
 
        TreeNode root = null;
        for (int pre = 0, in = 0; pre < preorder.length;) {
 
            TreeNode node = null;
            do {
                node = new TreeNode(preorder[pre]);
                if (root == null) {
                    root = node;
                }
                if (!stack.isEmpty()) {
                    if (set.contains(stack.peek())) {
                        set.remove(stack.peek());
                        stack.pop().right = node;
                    }
                    else {
                        stack.peek().left = node;
                    }
                }
                stack.push(node);
            } while (preorder[pre++] != inorder[in] && pre < preorder.length);
 
            node = null;
            while (!stack.isEmpty() && in < inorder.length &&
                    stack.peek().val == inorder[in]) {
                node = stack.pop();
                in++;
            }
 
            if (node != null) {
                set.add(node);
                stack.push(node);
            }
        }
 
        return root;
    }
 
    // Function to print tree in Inorder
    void printInorder(TreeNode node)
    {
        if (node == null)
            return;
 
        /* first recur on left child */
        printInorder(node.left);
 
        /* then print the data of node */
        System.out.print(node.val + " ");
 
        /* now recur on right child */
        printInorder(node.right);
    }
 
    // driver program to test above functions
    public static void main(String args[])
    {
        Program_20_construct_tree_from_given_inorde_and_preorder_traversal tree = new Program_20_construct_tree_from_given_inorde_and_preorder_traversal();
 
        int in[] = new int[] { 9, 8, 4, 2, 10, 5, 10, 1, 6, 3, 13, 12, 7 };
        int pre[] = new int[] { 1, 2, 4, 8, 9, 5, 10, 10, 3, 6, 7, 12, 13 };
        int len = in.length;
 
        TreeNode root = tree.buildTree(pre, in);
 
        tree.printInorder(root);
    }
}