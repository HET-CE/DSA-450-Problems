public class Program_3_Write_a_program_to_detect_a_loop_in_a_Linked_List {
    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    // Function that detects loop in the list
    public static boolean detectLoop(Node node)
    {
        while (node != null) {
            node = node.next;
        }
        if(node.data == 0){
            return false;
        }
        else{
            return true;
        }
    }


    // Function to print the linked list
    public static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        Program_3_Write_a_program_to_detect_a_loop_in_a_Linked_List list = new Program_3_Write_a_program_to_detect_a_loop_in_a_Linked_List();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);

        // Creating a loop for testing
        head.next.next.next.next.next = head.next.next;
        System.out.println(list.detectLoop(head));
    }
}