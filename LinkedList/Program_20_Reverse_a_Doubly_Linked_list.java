public class Program_20_Reverse_a_Doubly_Linked_list {
   
    static Node head;

    static class Node {
  
        int data;
        Node next, prev;
  
        Node(int d) {
            data = d;
            next = prev = null;
        }
    }

    void printList(Node node) {
        Node temp = node;
        if (node != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != node);
        }
    }

    public Node reverseDLL(Node head) {

        Node temp = head;
        int cn = 0;
        while (temp.next != null) {
            temp = temp.next;
            cn++;
        }
        System.out.println(cn);
        Node last = temp;
        int t;
        Node front = head;
        for (int i = 0; i <= cn/2; i++) {
            t = front.data;
            front.data = last.data;
            last.data = t;
            front = front.next;
            last = last.prev;
        }
        return head;
    }

    void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.prev = null;
 
        new_node.next = head;
 
        if (head != null) {
            head.prev = new_node;
        }
        head = new_node;
    }
    public static void main(String[] args) {
        Program_20_Reverse_a_Doubly_Linked_list list = new Program_20_Reverse_a_Doubly_Linked_list();
  
        list.push(2);
        list.push(4);
        list.push(8);
        list.push(10);

        System.out.println("Original Circular Linked list ");
        list.printList(head);
        head = list.reverseDLL(head);
        list.printList(head);
    }
}
