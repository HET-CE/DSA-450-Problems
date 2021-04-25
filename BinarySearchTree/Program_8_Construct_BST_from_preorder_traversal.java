public class Program_8_Construct_BST_from_preorder_traversal {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static class Index {
        int index = 0;
    }

    Index index = new Index();

    Node constructTreeUtil(int pre[], Index preIndex, int key, int min, int max, int size) {

        if (preIndex.index >= size) {
            return null;
        }

        Node root = null;

        if (key > min && key < max) {
            root = new Node(key);
            preIndex.index = preIndex.index + 1;

            if (preIndex.index < size) {
                root.left = constructTreeUtil(pre, preIndex, pre[preIndex.index], min, key, size);
            }
            if (preIndex.index < size) {
                root.right = constructTreeUtil(pre, preIndex, pre[preIndex.index], key, max, size);
            }
        }
        return root;
    }

    Node constructTree(int pre[], int size) {
        int preIndex = 0;
        return constructTreeUtil(pre, index, pre[0], Integer.MIN_VALUE, Integer.MAX_VALUE, size);
    }

    void printInorder(Node node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }
    public static void main(String[] args) {
        Program_8_Construct_BST_from_preorder_traversal tree = new Program_8_Construct_BST_from_preorder_traversal();
        int pre[] = new int[] { 10, 5, 1, 7, 40, 50 };
        int size = pre.length;

        Node root = tree.constructTree(pre, size);
        System.out.println("Inorder traversal of the constructed tree is ");
        tree.printInorder(root);
    }
}