
public class Array_23_find_maximum_product_subarray {
	
	 static int maxProduct(int arr[], int n) 
	    { 
	        int minVal = arr[0]; 
	        int maxVal = arr[0]; 
	      
	        int maxProduct = arr[0]; 
	      
	        for (int i = 1; i < n; i++) 
	        { 
	            if (arr[i] < 0) 
	            { 
	                int temp = maxVal; 
	                maxVal = minVal; 
	                minVal =temp; 
	              
	            } 
	            maxVal = Math.max(arr[i], maxVal * arr[i]); 
	            minVal = Math.min(arr[i], minVal * arr[i]); 
	      
	            maxProduct = Math.max(maxProduct, maxVal); 
	        } 
	      
	        return maxProduct; 
	    } 
	      
	    // Driver Code 
	    public static void main (String[] args) 
	    { 
	        int arr[] = { 6, -3, -10, 0, 2 };  
	        int n = arr.length; 
	      
	        System.out.println( "Maximum Subarray product is "+ maxProduct(arr, n)); 
	    } 
}
