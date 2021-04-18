public class Program_18_Convert_Binary_tree_into_Doubly_Linked_List {
    
    static Node head, root;
    static class Node{
        int data;
        Node left = null, right = null;
        Node(int k){
            data = k;
            left = right = null;
        }
    }

    static Node curr = head;
    static void addNode(Node temp){
        if(head == null){ 
           head = new Node(temp.data);
           head.left = null;
           head.right = null;
           curr = head;
        }
        else{
            Node temp_list = new Node(temp.data);
            temp_list.left = curr;
            curr.right = temp_list;
            temp_list.right = null; 
            curr = curr.right;
        }
    }

    static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        addNode(root);
        System.out.print(root.data +" ");
        inOrder(root.right);
    }

    static void printlist(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.right;
        }
    }

    public static void main(String[] args) {
        Program_18_Convert_Binary_tree_into_Doubly_Linked_List tree = new Program_18_Convert_Binary_tree_into_Doubly_Linked_List();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        tree.root.right = new Node(22);
        tree.root.right.right = new Node(25);
        inOrder(root);
        System.out.println();
        printlist();
    }
}