import java.util.*;

public class Program_32_Minimum_Cost_of_ropes {
    
    static long minCost(int arr[], int n) 
    {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        
        for(int i = 0 ; i < arr.length;i++)
        pq.add((long) arr[i]);
        long sum = 0;
        while(pq.size()>=2){
            long min1 = pq.poll();
            long min2 = pq.poll();
            pq.add(min1+min2);
            sum += (min1+min2);
        }
        return sum;
    }
    public static void main(String args[])
    {
        int len[] = { 4, 3, 2, 6 };
        int size = len.length;

        System.out.println("Total cost for connecting ropes is " + minCost(len, size));
    }
}
