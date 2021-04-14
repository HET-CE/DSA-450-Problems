public class Program_29_Multiply_2_no_represented_by_LL {

    static class node {
        int data;
        node next;
    };

    // Function to create a new node
    // with given data
    static node newNode(int data) {
        node new_node = new node();
        new_node.data = data;
        new_node.next = null;
        return new_node;
    }

    // Function to insert a node at the
    // beginning of the Linked List
    static node push(node head_ref, int new_data) {
        // allocate node
        node new_node = newNode(new_data);

        // link the old list off the new node
        new_node.next = (head_ref);

        // move the head to point to the new node
        (head_ref) = new_node;
        return head_ref;
    }

    static long multiplyTwoLists(node l1, node l2){
        int num1 = 0, num2 = 0; 
      
        // Generate numbers from linked lists 
        while (l1 != null || l2 != null) 
        { 
            if (l1 != null) 
            { 
                num1 = num1*10 + l1.data; 
                l1 = l1.next; 
            } 
            if (l2 != null) 
            { 
                num2 = num2*10 + l2.data; 
                l2 = l2.next; 
            } 
        } 
        return num1*num2; 
    }
    static void printList(node node) {
        while (node != null) {
            System.out.printf("%d", node.data);
            if (node.next != null)
                System.out.printf("->");
            node = node.next;
        }
        System.out.printf("\n");
    }

    // Driver code
public static void main(String args[])
{ 
    node first = null; 
    node second = null; 
  
    // create first list 9.4.6 
    first = push(first, 6); 
    first = push(first, 4); 
    first = push(first, 9); 
    System.out.printf("First List is: "); 
    printList(first); 
  
    // create second list 8.4 
    second = push(second, 4); 
    second = push(second, 8); 
    System.out.printf("Second List is: "); 
    printList(second); 
  
    // Multiply the two lists and see result 
    System.out.printf("Result is: "); 
    System.out.println(multiplyTwoLists(first, second)); 
}
}
