public class Program_22_Count_triplets_in_a_sorted_DLL_whose_sum_is_equal_to_given_value_X {

    /* My approach */

    static class Node {
        int data;
        Node next, prev;

        Node(int val) {
            data = val;
            prev = null;
            next = null;
        }
    };

    static int countTriplets(Node head, int x) {
        Node ptr1, ptr2, ptr3;
        int count = 0;

        for (ptr1 = head; ptr1 != null; ptr1 = ptr1.next)
            for (ptr2 = ptr1.next; ptr2 != null; ptr2 = ptr2.next)
                for (ptr3 = ptr2.next; ptr3 != null; ptr3 = ptr3.next)
                    if ((ptr1.data + ptr2.data + ptr3.data) == x)
                        count++;

        return count;
    }

    static Node insert(Node head, int val) {

        Node temp = new Node(val);

        if (head == null)
            head = temp;

        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }

        return head;
    }

    public static void main(String args[]) {
        Node head = null;

        head = insert(head, 9);
        head = insert(head, 8);
        head = insert(head, 6);
        head = insert(head, 5);
        head = insert(head, 4);
        head = insert(head, 2);
        head = insert(head, 1);

        int x = 17;
        System.out.println("count = " + countTriplets(head, x));
    }

    /* Optimized approach */

    // static class Node {
    // int data;
    // Node next, prev;
    // };

    // static int countPairs(Node first, Node second, int value) {
    // int count = 0;

    // while (first != null && second != null && first != second && second.next !=
    // first) {

    // if ((first.data + second.data) == value) {

    // count++;
    // first = first.next;
    // second = second.prev;
    // }

    // else if ((first.data + second.data) > value)
    // second = second.prev;

    // else
    // first = first.next;
    // }

    // return count;
    // }

    // static int countTriplets(Node head, int x) {
    // if (head == null)
    // return 0;

    // Node current, first, last;
    // int count = 0;

    // last = head;
    // while (last.next != null)
    // last = last.next;

    // for (current = head; current != null; current = current.next) {

    // first = current.next;

    // count += countPairs(first, last, x - current.data);
    // }

    // return count;
    // }

    // static Node insert(Node head, int data) {

    // Node temp = new Node();

    // temp.data = data;
    // temp.next = temp.prev = null;

    // if ((head) == null)
    // (head) = temp;
    // else {
    // temp.next = head;
    // (head).prev = temp;
    // (head) = temp;
    // }
    // return head;
    // }

    // public static void main(String[] args) {
    // Node head = null;

    // head = insert(head, 9);
    // head = insert(head, 8);
    // head = insert(head, 6);
    // head = insert(head, 5);
    // head = insert(head, 4);
    // head = insert(head, 2);
    // head = insert(head, 1);

    // int x = 17;

    // System.out.print("Count = " + countTriplets(head, x));
    // }
}