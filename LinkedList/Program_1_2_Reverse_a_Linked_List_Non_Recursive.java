import java.util.Stack;

public class Program_1_2_Reverse_a_Linked_List_Non_Recursive {

    static class Node {
        int data;
        Node next;
    };

    static Node head = null;

    static void reverseLL() {

        Stack<Node> s = new Stack<>();
        Node temp = head;
        while (temp.next != null) {
            s.add(temp);
            temp = temp.next;
        }
        head = temp;

        while (!s.isEmpty()) {
            temp.next = s.peek();
            s.pop();
            temp = temp.next;
        }
        temp.next = null;
    }

    static void printlist(Node temp) {
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static void insert_back(int value) {
        Node temp = new Node();
        temp.data = value;
        temp.next = null;
        if (head == null) {
            head = temp;
            return;
        } else {
            Node last_node = head;
            while (last_node.next != null) {
                last_node = last_node.next;
            }
            last_node.next = temp;
            return;
        }
    }

    public static void main(String[] args) {
        insert_back(1);
        insert_back(2);
        insert_back(3);
        insert_back(4);
        System.out.print("Given linked list\n");
        printlist(head);
        reverseLL();
        System.out.print("\nReversed linked list\n");
        printlist(head);
    }
}
