import java.util.*;

public class Program_16_Maximize_array_sum_after_K_negations {
    
    public static long summation(long a[]){
        int sum = 0;
        for(int i = 0 ; i < a.length ; i++){
            sum += a[i];
        }
        return sum;
    }
    
    public static long maximizeSum(long a[], int n, int k)
    {
        // Your code goes here
        Arrays.sort(a);
        
        long t;
        for (int l = 0; l < n / 2; l++) {
            t = a[l];
            a[l] = a[n - l - 1];
            a[n - l - 1] = t;
        }
        
        int i = 0;
            while(k > 0 && i < a.length){
                if(a[i]<0)
                    k--;
                a[i] = Math.abs(a[i]);
                i++;
        }
        long sum = summation(a);
        Arrays.sort(a);
        long min = a[0];
        if(k%2==0){
            return sum;
        }
        
        else{
            return sum-min;
        }
    }
    public static void main(String[] args) {
        long arr[] = {5, -2, 5, -4, 5, -12, 5, 5, 5, 20};
        int n = 10;
        int k = 5;
        System.out.println(maximizeSum(arr, n, k));
    }
}
