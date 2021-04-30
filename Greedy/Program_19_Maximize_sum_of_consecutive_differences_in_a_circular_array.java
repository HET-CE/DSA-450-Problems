import java.util.*; 

public class Program_19_Maximize_sum_of_consecutive_differences_in_a_circular_array {
    static int maxSum(int arr[], int n)
    {
        int sum = 0;
  
        Arrays.sort(arr);
      
        for (int i = 0; i < n/2; i++)
        {
            sum -= (2 * arr[i]);
            sum += (2 * arr[n - i - 1]);
        }
      
        return sum;
    }
 
    public static void main (String[] args)
    {
        int arr[] = { 4, 2, 1, 8 };
        int n = arr.length;
        System.out.println(maxSum(arr, n));
    }
}