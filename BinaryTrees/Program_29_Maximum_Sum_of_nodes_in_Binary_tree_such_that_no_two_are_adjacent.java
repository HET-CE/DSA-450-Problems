public class Program_29_Maximum_Sum_of_nodes_in_Binary_tree_such_that_no_two_are_adjacent {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    };

    static class Pair {
        int first, second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static Pair maxSumHelper(Node root) {
        if (root == null) {
            Pair sum = new Pair(0, 0);
            return sum;
        }
        Pair sum1 = maxSumHelper(root.left);
        Pair sum2 = maxSumHelper(root.right);
        Pair sum = new Pair(0, 0);

        sum.first = sum1.second + sum2.second + root.data;

        sum.second = Math.max(sum1.first, sum1.second) + Math.max(sum2.first, sum2.second);

        return sum;
    }

    public static int maxSum(Node root) {
        Pair res = maxSumHelper(root);
        return Math.max(res.first, res.second);
    }

    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(1);
        root.left.left = new Node(2);
        root.left.left.left = new Node(1);
        root.left.right = new Node(3);
        root.left.right.left = new Node(4);
        root.left.right.right = new Node(5);
        System.out.print(maxSum(root));
    }
}
