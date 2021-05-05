import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Program_29_Interleave_the_first_half_of_the_queue_with_second_half {

    static Queue<Integer> interLeaveQueue(Queue<Integer> q) {
        if (q.size() % 2 != 0)
            System.out.println("Input even number of integers.");

        Stack<Integer> s = new Stack<>();
        int halfSize = q.size() / 2;

        for (int i = 0; i < halfSize; i++) {
            s.push(q.peek());
            q.poll();
        }

        while (!s.empty()) {
            q.add(s.peek());
            s.pop();
        }

        for (int i = 0; i < halfSize; i++) {
            q.add(q.peek());
            q.poll();
        }

        for (int i = 0; i < halfSize; i++) {
            s.push(q.peek());
            q.poll();
        }

        while (!s.empty()) {
            q.add(s.peek());
            s.pop();
            q.add(q.peek());
            q.poll();
        }
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList();
        q.add(11);
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);
        q.add(17);
        q.add(18);
        q.add(19);
        q.add(20);
        q = interLeaveQueue(q);
        int length = q.size();
        for (int i = 0; i < length; i++) {
            System.out.print(q.peek() + " ");
            q.poll();
        }
    }
}