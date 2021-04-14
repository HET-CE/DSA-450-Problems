public class Program_16_Check_if_a_linked_list_is_a_circular_linked_list {

    static Node head;

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

    void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    boolean isCircular(){
        if (head == null)
            return true;
  
        Node node = head.next;
  
        while (node != null && node != head)
            node = node.next;
  
        return (node == head);
    }
    public static void main(String[] args) {
        Program_16_Check_if_a_linked_list_is_a_circular_linked_list llist = new Program_16_Check_if_a_linked_list_is_a_circular_linked_list();         
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        llist.printList();
        System.out.println(llist.isCircular());
    }
}