public class Program_32_Program_for_nth_node_from_the_end_of_a_Linked_List {
    Node head; // head of the list
 
    /* Linked List node */
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public int printNthFromLast(int n){
        Node temp = head;
        int cn = 0;
        while(temp != null){
            temp = temp.next;
            cn++;
        }
        temp = head;
        for(int i = 1 ; i <= cn-n ; i++){
            temp = temp.next;
        }
        return temp.data;
    }



    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public static void main(String[] args)
    {
        Program_32_Program_for_nth_node_from_the_end_of_a_Linked_List llist = new Program_32_Program_for_nth_node_from_the_end_of_a_Linked_List();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(35);
 
        System.out.println(llist.printNthFromLast(4));
    }
}
