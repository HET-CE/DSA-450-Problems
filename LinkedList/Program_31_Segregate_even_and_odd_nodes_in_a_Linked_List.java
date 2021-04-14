public class Program_31_Segregate_even_and_odd_nodes_in_a_Linked_List {

    static Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void push(int new_data) {

        Node new_node = new Node(new_data);

        new_node.next = head;

        head = new_node;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    Node segregateEvenOdd() {
        Node end = head;
        Node prev = null;
        Node curr = head;

        while (end.next != null)
            end = end.next;

        Node new_end = end;

        while (curr.data % 2 != 0 && curr != end) {
            new_end.next = curr;
            curr = curr.next;
            new_end.next.next = null;
            new_end = new_end.next;
        }

        if (curr.data % 2 == 0) {
            head = curr;

            while (curr != end) {
                if (curr.data % 2 == 0) {
                    prev = curr;
                    curr = curr.next;
                } else {
                    prev.next = curr.next;
                    curr.next = null;
                    new_end.next = curr;
                    new_end = curr;
                    curr = prev.next;
                }
            }
        }

        else
            prev = curr;

        if (new_end != end && end.data % 2 != 0) {
            prev.next = end.next;
            end.next = null;
            new_end.next = end;
        }
        return head;

        /* Optimized approach */
        // Node evenStart = null;
        // Node evenEnd = null;
        // Node oddStart = null;
        // Node oddEnd = null;
        // Node currentNode = head;

        // while(currentNode != null) {
        // int element = currentNode.data;

        // if(element % 2 == 0) {

        // if(evenStart == null) {
        // evenStart = currentNode;
        // evenEnd = evenStart;
        // } else {
        // evenEnd.next = currentNode;
        // evenEnd = evenEnd.next;
        // }

        // } else {

        // if(oddStart == null) {
        // oddStart = currentNode;
        // oddEnd = oddStart;
        // } else {
        // oddEnd.next = currentNode;
        // oddEnd = oddEnd.next;
        // }
        // }
        // // Move head pointer one step in forward direction
        // currentNode = currentNode.next;
        // }

        // if(oddStart == null || evenStart == null) {
        // return head;
        // }

        // evenEnd.next = oddStart;
        // oddEnd.next = null;
        // head=evenStart;
        // return head;
    }

    public static void main(String args[]) {
        Program_31_Segregate_even_and_odd_nodes_in_a_Linked_List llist = new Program_31_Segregate_even_and_odd_nodes_in_a_Linked_List();
        llist.push(11);
        llist.push(10);
        llist.push(8);
        llist.push(6);
        llist.push(5);
        llist.push(2);
        llist.push(0);
        System.out.println("Origional Linked List");
        llist.printList();

        head = llist.segregateEvenOdd();

        System.out.println("Modified Linked List");
        llist.printList();
    }
}