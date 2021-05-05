import java.util.Queue;
import java.util.LinkedList;

public class Program_20_implement_Stack_using_queue {

    /* By making push operation costly */
    // static class Stack {
    // static Queue<Integer> q1 = new LinkedList<Integer>();
    // static Queue<Integer> q2 = new LinkedList<Integer>();

    // static int curr_size;

    // Stack() {
    // curr_size = 0;
    // }

    // static void push(int x) {
    // curr_size++;

    // q2.add(x);

    // while (!q1.isEmpty()) {
    // q2.add(q1.peek());
    // q1.remove();
    // }

    // Queue<Integer> q = q1;
    // q1 = q2;
    // q2 = q;
    // }

    // static void pop() {
    // if (q1.isEmpty())
    // return;
    // q1.remove();
    // curr_size--;
    // }

    // static int top() {
    // if (q1.isEmpty())
    // return -1;
    // return q1.peek();
    // }

    // static int size() {
    // return curr_size;
    // }
    // }

    // public static void main(String[] args) {
    // Stack s = new Stack();
    // s.push(1);
    // s.push(2);
    // s.push(3);

    // System.out.println("current size: " + s.size());
    // System.out.println(s.top());
    // s.pop();
    // System.out.println(s.top());
    // s.pop();
    // System.out.println(s.top());

    // System.out.println("current size: " + s.size());
    // }







    
    /* By making pop operation costly */

    Queue<Integer> q1 = new LinkedList<>(), q2 = new LinkedList<>();
    int curr_size;

    public Program_20_implement_Stack_using_queue() {
        curr_size = 0;
    }

    void remove() {
        if (q1.isEmpty())
            return;

        while (q1.size() != 1) {
            q2.add(q1.peek());
            q1.remove();
        }

        q1.remove();
        curr_size--;

        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }

    void add(int x) {
        q1.add(x);
        curr_size++;
    }

    int top() {
        if (q1.isEmpty())
            return -1;

        while (q1.size() != 1) {
            q2.add(q1.peek());
            q1.remove();
        }

        int temp = q1.peek();

        q1.remove();

        q2.add(temp);

        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
        return temp;
    }

    int size() {
        return curr_size;
    }
    public static void main(String[] args) {
        Program_20_implement_Stack_using_queue s = new Program_20_implement_Stack_using_queue();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);

        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.remove();
        System.out.println(s.top());
        s.remove();
        System.out.println(s.top());
        System.out.println("current size: " + s.size());
    }
}
