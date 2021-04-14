public class Program_8_Write_a_Program_to_Move_the_last_element_to_Front_in_a_Linked_List {
    
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

    void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void moveLast(){
        Node temp = head;
        Node preTemp = temp;
        while(temp.next != null){
            preTemp = temp;
            temp = temp.next;
        }
        preTemp.next = null;
        temp.next = head;
        head = temp;
    }
    public static void main(String[] args) {
        Program_8_Write_a_Program_to_Move_the_last_element_to_Front_in_a_Linked_List llist = new Program_8_Write_a_Program_to_Move_the_last_element_to_Front_in_a_Linked_List();         
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        llist.printList();
        llist.moveLast();
        llist.printList();
    }
}
