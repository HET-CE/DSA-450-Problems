public class Program_11_Intersection_of_two_Sorted_Linked_List {
    
    static Node head1, head2;
    // static Node a = null, b = null; // Used in optimized approach

    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    void printList(Node head)
    {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("");
    }

    void intersectionOfLists(Node first , Node Second){
        
        /*  My Approach  */
        Node temp1 = first;
        Node temp2 = Second;
        while(temp1 != null){
            temp2 = Second;
            while(temp2 != null){
                if(temp1.data == temp2.data){
                    System.out.println(temp1.data);
                    break;
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }

        /*  (Optimized) Approach in solution */
        // Node p = first,q = Second;
        // while(p != null  &&  q != null)
        // {
        //     if(p.data == q.data)
        //     {
        //         // add to dummy list
        //         System.out.println(p.data);
        //         p = p.next;
        //         q = q.next;
        //     }
        //     else if(p.data < q.data)
        //         p = p.next;
        //     else
        //         q= q.next;
        // }
    }
    public static void main(String[] args) {
        Program_11_Intersection_of_two_Sorted_Linked_List list = new Program_11_Intersection_of_two_Sorted_Linked_List();

        list.head1 = new Node(6);
        list.head1.next = new Node(4);
        list.head1.next.next = new Node(3);
        list.head1.next.next.next = new Node(2);
        list.head1.next.next.next.next = new Node(1);

        System.out.print("First List is ");
        list.printList(head1);

        list.head2 = new Node(8);
        list.head2.next = new Node(6);
        list.head2.next.next = new Node(4);
        list.head2.next.next.next = new Node(2);
        System.out.print("Second List is ");
        list.printList(head2);

        list.intersectionOfLists(head1, head2);
    }
}