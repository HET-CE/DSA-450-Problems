public class Program_9_Add_1_to_a_number_represented_as_a_Linked_List {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int d) {
        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void addOne() {
        Node last = null;
        Node cur = head;
        while (cur.next != null) {
            if (cur.data != 9) {
                last = cur;
            }
            cur = cur.next;
        }
        if (cur.data != 9) {
            cur.data++;
            return;
        }
        if (last == null) {
            last = new Node(0);
            last.next = head;
            head = last;
        }
        last.data++;
        last = last.next;

        while (last != null) {
            last.data = 0;
            last = last.next;
        }
    }

    public static void main(String[] args) {
        Program_9_Add_1_to_a_number_represented_as_a_Linked_List llist = new Program_9_Add_1_to_a_number_represented_as_a_Linked_List();
        llist.push(9);
        llist.push(9);
        llist.push(9);
        llist.push(4);
        llist.push(8);

        // llist.push(3);
        // llist.push(2);
        // llist.push(1);

        llist.printList();
        llist.addOne();
        llist.printList();
    }
}