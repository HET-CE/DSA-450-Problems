public class Program_15_middle_of_the_Linked_List {
    
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

    public Node middleNode() {
        Node temp = head;
        Node temp2 = head;
        int cn = 0;
        while(temp != null){
            cn++;
            temp = temp.next;
        }
        for(int i = 1 ; i <= (cn/2) ; i++){
            temp2 = temp2.next;
        }
        return temp2;
    }

    public static void main(String[] args) {
        Program_15_middle_of_the_Linked_List llist = new Program_15_middle_of_the_Linked_List();         
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        llist.printList();
        Node middle = llist.middleNode();
        System.out.println(middle.data);
    }
}
