import java.util.HashSet;
import java.util.Set;

public class Array_21_Find_if_there_is_any_subarray_with_sum_equal_to_zero {
	
	static boolean findsum(int arr[])
	{
	    //Your code here
	    Set<Integer> hs = new HashSet<Integer>();  
	        // Initialize sum of elements 
	        int sum = 0;      
	        // Traverse through the given array 
	        for (int i = 0; i < arr.length; i++) 
	        {  
	            // Add current element to sum 
	            sum += arr[i]; 
	      
	            if (arr[i] == 0 || sum == 0 || hs.contains(sum))                          
	                return true; 
	              
	            // Add sum to hash set 
	            hs.add(sum); 
	        }  
	        return false; 
	}
	
	public static void main(String args[]) {
		int arr[] = {4, 2, -3, 1, 6};
		boolean b = findsum(arr);
		System.out.println(b);
	}
}
