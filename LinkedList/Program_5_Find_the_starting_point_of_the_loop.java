public class Program_5_Find_the_starting_point_of_the_loop {

    static class Node {
        int key;
        Node next;
    };

    static Node newNode(int key) {
        Node temp = new Node();
        temp.key = key;
        temp.next = null;
        return temp;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.key + " ");
            head = head.next;
        }
        System.out.println();
    }

    static Node detectLoop(Node head) {

        Node temp = new Node();
        while (head != null) {

            if (head.next == null) {
                return null;
            }

            if (head.next == temp) {
                break;
            }

            Node nex = head.next;

            head.next = temp;

            head = nex;
        }

        return head;
    }

    public static void main(String[] args) {
        Node head = newNode(50);
        head.next = newNode(20);
        head.next.next = newNode(15);
        head.next.next.next = newNode(4);
        head.next.next.next.next = newNode(10);

        head.next.next.next.next.next = head.next.next;

        Node res = detectLoop(head);
        if (res == null)
            System.out.print("Loop does not exist");
        else
            System.out.print("Loop starting node is " + res.key);

    }
}