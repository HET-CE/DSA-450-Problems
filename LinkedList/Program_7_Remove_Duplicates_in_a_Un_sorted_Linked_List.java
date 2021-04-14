public class Program_7_Remove_Duplicates_in_a_Un_sorted_Linked_List {
    
    Node head;

    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public void push(int d){
        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;
    }


                /*  Function in solution    */

    // void removeDuplicate(){
    //     Node ptr1 = null, ptr2 = null, dup = null;
    //     ptr1 = head;
 
    //     /* Pick elements one by one */
    //     while (ptr1 != null && ptr1.next != null) {
    //         ptr2 = ptr1;
 
    //         /* Compare the picked element with rest
    //             of the elements */
    //         while (ptr2.next != null) {
 
    //             /* If duplicate then delete it */
    //             if (ptr1.data == ptr2.next.data) {
 
    //                 /* sequence of steps is important here */
    //                 dup = ptr2.next;
    //                 ptr2.next = ptr2.next.next;
    //                 System.gc();
    //             } else /* This is tricky */ {
    //                 ptr2 = ptr2.next;
    //             }
    //         }
    //         ptr1 = ptr1.next;
    //     }
    // }


            /*      My Approach    */
    void removeDuplicate(){
        Node temp = head;
        Node curr = head;
        while(curr.next != null){
            temp = curr.next;
            while(curr.data != temp.data && temp.next != null){
                temp = temp.next;
            }
            if(curr.data == temp.data && temp.next == null){
                curr.next = null;
            }
            if(temp.next != null){
                curr.next = temp.next;
            }
            if(temp.next == null && curr.next != null)
            curr = curr.next;
        }
    }

    void printList() {
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Program_7_Remove_Duplicates_in_a_Un_sorted_Linked_List llist = new Program_7_Remove_Duplicates_in_a_Un_sorted_Linked_List();
        // llist.push(2);
        // llist.push(2);
        // llist.push(2);
        // llist.push(2);
        // llist.push(2);

        llist.push(4);
        llist.push(2);
        llist.push(2);
        llist.push(5);

        llist.removeDuplicate();

        llist.printList();
    }
}
