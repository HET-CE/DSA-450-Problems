import java.io.*;
import java.util.*;
    
class Program_25_Rotate_a_Doubly_Linked_list_in_group_of_Given_Size_Very_IMP
{
    static class Node
    {
        int data;
        Node next, prev;
    }

    static Node getNode(int data)
    {
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = new_node.prev = null;
  
        return new_node;
    }

    static Node push(Node head, Node new_node) 
    {
        new_node.prev = null;
  
        new_node.next = head;
  
        if (head != null)
            head.prev = new_node;
  
        head = new_node;
        return head;
    }
  
    static Node revListInGroupOfGivenSize(Node head, int k)
    {
        Node current = head;
        Node next = null;
        Node newHead = null;
        int count = 0;
  
        while (current != null && count < k)
        {
            next = current.next;
            newHead = push(newHead, current);
            current = next;
            count++;
        }
  
        if (next != null)
        {
            head.next = revListInGroupOfGivenSize(next, k); 
            head.next.prev = head;
        }
  
        return newHead; 
    }
  
    static void printList(Node head)
    {
        while (head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
  
    public static void main(String args[])
    {
        Node head = null; 
              
        head = push(head, getNode(2));
        head = push(head, getNode(4));
        head = push(head, getNode(8));
        head = push(head, getNode(10));
  
        int k = 2;
              
        System.out.print("Original list: ");
        printList(head);
        
        head = revListInGroupOfGivenSize(head, k); 
  
        System.out.print("\nModified list: ");
        printList(head);
    }
}