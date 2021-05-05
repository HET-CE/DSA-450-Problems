import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Program_27_Reverse_a_Queue_using_recursion {

    static Queue<Integer> rev(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty()) {
            st.push(q.peek());
            q.remove();
        }
        while (!st.isEmpty()) {
            q.add(st.peek());
            st.pop();
        }
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);

        q = rev(q);

        while (!q.isEmpty()) {
            int x = q.peek();
            q.poll();
            System.out.print(x + " ");
        }
    }


    

    /* Using Recursion */

    // static Queue<Integer> queue;

    // static void Print() {
    // while (!queue.isEmpty()) {
    // System.out.print(queue.peek() + " ");
    // queue.remove();
    // }
    // }

    // static Queue<Integer> reverseQueue(Queue<Integer> q) {
    // if (q.isEmpty())
    // return q;

    // int data = q.peek();
    // q.remove();

    // q = reverseQueue(q);

    // q.add(data);

    // return q;
    // }

    // public static void main(String args[]) {
    // queue = new LinkedList<Integer>();
    // queue.add(56);
    // queue.add(27);
    // queue.add(30);
    // queue.add(45);
    // queue.add(85);
    // queue.add(92);
    // queue.add(58);
    // queue.add(80);
    // queue.add(90);
    // queue.add(100);
    // queue = reverseQueue(queue);
    // Print();
    // }
}
