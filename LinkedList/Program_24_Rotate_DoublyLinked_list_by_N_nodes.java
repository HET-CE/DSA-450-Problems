public class Program_24_Rotate_DoublyLinked_list_by_N_nodes {
    static class Node {
        char data;
        Node prev;
        Node next;
    }

    static Node head = null;

    static void push(char new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.prev = null;
        new_node.next = (head);
        if ((head) != null)
            (head).prev = new_node;
        head = new_node;
    }

    static void rotate(int n){
        Node temp_last = head;
        Node temp_first = head;
        while(temp_last.next != null){
            temp_last = temp_last.next;
        }
        for(int i = 1 ; i <=n ; i++){
            head = head.next;
            head.prev = null;
            temp_last.next = temp_first;
            temp_first.prev = temp_last;
            temp_first.next = null;
            temp_last = temp_first;
            temp_first = head;
        }
    }

    /* Function to print linked list */
    static void printList(Node node) {
        while (node != null && node.next != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        if (node != null)
            System.out.print(node.data);
    }

    // Driver's Code
    public static void main(String[] args) {
        /* Start with the empty list */
        // Node head = null;

        /*
         * Let us create the doubly linked list a<->b<->c<->d<->e
         */
        push('e');
        push('d');
        push('c');
        push('b');
        push('a');

        int N = 2;

        System.out.println("Given linked list ");
        printList(head);
        rotate(N);
        System.out.println();
        System.out.println("Rotated Linked list ");
        printList(head);
    }
}
