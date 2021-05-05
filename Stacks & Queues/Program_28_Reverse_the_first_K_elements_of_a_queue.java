import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Program_28_Reverse_the_first_K_elements_of_a_queue {
    
    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
      //add code here.
      Stack<Integer> st = new Stack();
      Queue<Integer> que = new LinkedList();
      
      for(int i = 1 ; i <= k ; i++){
          st.push(q.peek());
          q.remove();
      }
      while(!q.isEmpty()){
          que.add(q.peek());
          q.remove();
      }
      while(!st.isEmpty()){
          q.add(st.peek());
          st.pop();
      }
      while(!que.isEmpty()){
          q.add(que.peek());
          que.remove();
      }
      return q;
    }

    public static void main(String[] args) {
        Queue queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);

        queue = modifyQueue(queue, 3);

        while (!queue.isEmpty()) {
            int x = (int) queue.peek();
            queue.poll();
            System.out.print(x + " ");
        }
    }
}
