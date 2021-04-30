import java.util.*;

public class Program_10_Find_the_minimum_and_maximum_amount_to_buy_all_N_candies {
    
    static ArrayList<Integer> candyStore(int candies[],int N,int K){
        ArrayList arr = new ArrayList();
        
        Arrays.sort(candies);
        int min_sum = 0,max_sum = 0;
    
        int i = 0 ,j = candies.length-1;
        while(i <= j){
            min_sum += candies[i];
            i++;
            j = j - K;
        }
        
        int m = candies.length-1 ,l = 0;
        while(m >= l){
            max_sum += candies[m];
            m--;
            l = l + K;
        }

        arr.add(min_sum);
        arr.add(max_sum);
        return arr;
    }
 
    public static void main(String[] args)
    {
        int arr[] = { 3, 2, 1, 4 };
        int n = arr.length;
        int k = 2;
 
        System.out.println(candyStore(arr,n,k));
    }
}