import java.util.Queue;
import java.util.LinkedList;

public class Program_37_Queue_based_approach_or_first_non_repeating_character_in_a_stream {
    final static int MAX_CHAR = 26;
  
    static void firstNonRepeating(String str)
    {
        int[] charCount = new int[MAX_CHAR];
  
        Queue<Character> q = new LinkedList<Character>();
  
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
  
            q.add(ch);
  
            charCount[ch - 'a']++;
  
            while (!q.isEmpty()) {
                if (charCount[q.peek() - 'a'] > 1)
                    q.remove();
                else {
                    System.out.print(q.peek() + " ");
                    break;
                }
            }
            if (q.isEmpty())
                System.out.print(-1 + " ");
        }
        System.out.println();
    }
  
    public static void main(String[] args)
    {
        String str = "aabc";
        firstNonRepeating(str);
    }
}