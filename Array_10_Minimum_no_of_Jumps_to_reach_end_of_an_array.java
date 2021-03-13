
public class Array_10_Minimum_no_of_Jumps_to_reach_end_of_an_array {
	
	//      OPTIMAL PROGRAM   1
	
	
	
//	 static int minJumps(int arr[]) 
//	    { 
//	        if (arr.length <= 1) 
//	            return 0; 
//	  
//	        // Return -1 if not possible to jump 
//	        if (arr[0] == 0) 
//	            return -1; 
//	  
//	        // initialization 
//	        int maxReach = arr[0]; 
//	        int step = arr[0]; 
//	        int jump = 1; 
//	  
//	        // Start traversing array 
//	        for (int i = 1; i < arr.length; i++) { 
//	            // Check if we have reached  
//	// the end of the array 
//	            if (i == arr.length - 1) 
//	                return jump; 
//	  
//	            // updating maxReach 
//	            maxReach = Math.max(maxReach, i + arr[i]); 
//	  
//	            // we use a step to get to the current index 
//	            step--; 
//	  
//	            // If no further steps left 
//	            if (step == 0) { 
//	                // we must have used a jump 
//	                jump++; 
//	  
//	                // Check if the current  
//	// index/position or lesser index 
//	                // is the maximum reach point  
//	// from the previous indexes 
//	                if (i >= maxReach) 
//	                    return -1; 
//	  
//	                // re-initialize the steps to the amount 
//	                // of steps to reach maxReach from position i. 
//	                step = maxReach - i; 
//	            } 
//	        } 
//	  
//	        return -1; 
//	    } 
//	  
//	    // Driver method to test the above function 
//	    public static void main(String[] args) 
//	    { 
//	        int arr[] = new int[] { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 }; 
//	  
//	        // calling minJumps method 
//	        System.out.println(minJumps(arr)); 
//	    } 
	
	
//         OPTIMAL PROGRAM 2	
	
	
//	 static int minJumps(int arr[], int l, int h)
//	    {
//	        // Base case: when source
//	        // and destination are same
//	        if (h == l)
//	            return 0;
//	 
//	        // When nothing is reachable
//	        // from the given source
//	        if (arr[l] == 0)
//	            return Integer.MAX_VALUE;
//	 
//	        // Traverse through all the points
//	        // reachable from arr[l]. Recursively
//	        // get the minimum number of jumps
//	        // needed to reach arr[h] from these
//	        // reachable points.
//	        int min = Integer.MAX_VALUE;
//	        for (int i = l + 1; i <= h
//	                            && i <= l + arr[l];
//	             i++) {
//	            int jumps = minJumps(arr, i, h);
//	            if (jumps != Integer.MAX_VALUE && jumps + 1 < min)
//	                min = jumps + 1;
//	        }
//	        return min;
//	    }
//	 
//	    // Driver code
//	    public static void main(String args[])
//	    {
//	        int arr[] = { 1, 3, 6, 3, 2, 3, 6, 8, 9, 5 };
//	        int n = arr.length;
//	        System.out.print("Minimum number of jumps to reach end is "
//	                         + minJumps(arr, 0, n - 1));
//	    }
	
	public static void main(String args[]) {
		int i = 0;
		int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
//		int arr[] = {1, 4, 3, 2, 6, 7};
		int length = arr.length;
		int sum = arr[0];
		if(arr[0] == 0){
		    System.out.println(-1);
		}
		else {
		  for(i=0; i<arr.length ; i++) {
			 sum += arr[i];
//			 jump++;
		      if(sum >= length) {
				break;
			  } 
		     }
		if(sum == length)
		  System.out.println(++i);
		else
			System.out.println(i);
	    }
	}
}
