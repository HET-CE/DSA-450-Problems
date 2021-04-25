import Program_1_Find_a_value_in_a_tree.Node;

public class Program_3_Find_min_and_max_value_in_a_BST {
    int minValue(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node.data;
    }

    int maxValue(Node node) {
        while (node.right != null) {
            node = node.right;
        }
        return node.data;
    }
}
