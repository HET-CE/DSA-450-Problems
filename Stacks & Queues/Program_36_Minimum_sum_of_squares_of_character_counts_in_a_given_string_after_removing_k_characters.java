import java.util.Collections;
import java.util.PriorityQueue;

public class Program_36_Minimum_sum_of_squares_of_character_counts_in_a_given_string_after_removing_k_characters {
    static final int MAX_CHAR = 26;
 
    static int minStringValue(String str, int k)
    {
        int l = str.length(); 

        if (k >= l)
            return 0;
 
        int[] frequency = new int[MAX_CHAR];
        for (int i = 0; i < l; i++)
            frequency[str.charAt(i) - 'a']++;
 
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
 
        for (int i = 0; i < MAX_CHAR; i++) {
            if (frequency[i] != 0)
                q.add(frequency[i]);
        }
 
        while (k != 0) {
            q.add(q.poll() - 1);
            k--;
        }
 
        int result = 0; 
        while (!q.isEmpty()) {
            result += q.peek() * q.poll();
        }
 
        return result;
    }
 
    public static void main(String args[])
    {
        String str = "abbccc";
        int k = 2;
        System.out.println(minStringValue(str, k));
 
        str = "aaab"; 
        k = 2;
        System.out.println(minStringValue(str, k));
    }
}