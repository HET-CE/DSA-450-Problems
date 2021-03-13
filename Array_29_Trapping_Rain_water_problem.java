
public class Array_29_Trapping_Rain_water_problem {
	
	
	//	Time Complexity: O(n2). 
	//		There are two nested loops traversing the array, So time Complexity is O(n2).
	//	Space Complexity: O(1). 
	//		No extra space required.
	
	// Function to return the maximum
	// water that can be stored
	public static int maxWater(int[] arr, int n) 
	{
	     
	    // To store the maximum water
	    // that can be stored
	    int res = 0;
	 
	    // For every element of the array
	    // except first and last element
	    for(int i = 1; i < n - 1; i++)
	    {
	         
	        // Find maximum element on its left
	        int left = arr[i];
	        for(int j = 0; j < i; j++)
	        {
	            left = Math.max(left, arr[j]);
	        }
	 
	        // Find maximum element on its right
	        int right = arr[i];
	        for(int j = i + 1; j < n; j++)
	        {
	            right = Math.max(right, arr[j]);
	        }
	 
	        // Update maximum water value
	        res += Math.min(left, right) - arr[i];
	    }
	    return res;
	}
	 
	// Driver code
	public static void main(String[] args)
	{
	    int[] arr = { 0, 1, 0, 2, 1, 0, 
	                  1, 3, 2, 1, 2, 1 };
	    int n = arr.length;
	 
	    System.out.print(maxWater(arr,n));
	}
	
	
	
//	Time Complexity: O(n). 
//		Only one traversal of the array is needed, So time Complexity is O(n).
//	Space Complexity: O(n). 
//		Two extra array is needed each of size n.
	
	
	
	
//	static int arr[] = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
//	 
//    // Method for maximum amount of water
//    static int findWater(int n)
//    {
//        // left[i] contains height of tallest bar to the
//        // left of i'th bar including itself
//        int left[] = new int[n];
// 
//        // Right [i] contains height of tallest bar to
//        // the right of ith bar including itself
//        int right[] = new int[n];
// 
//        // Initialize result
//        int water = 0;
// 
//        // Fill left array
//        left[0] = arr[0];
//        for (int i = 1; i < n; i++)
//            left[i] = Math.max(left[i - 1], arr[i]);
// 
//        // Fill right array
//        right[n - 1] = arr[n - 1];
//        for (int i = n - 2; i >= 0; i--)
//            right[i] = Math.max(right[i + 1], arr[i]);
// 
//        // Calculate the accumulated water element by element
//        // consider the amount of water on i'th bar, the
//        // amount of water accumulated on this particular
//        // bar will be equal to min(left[i], right[i]) - arr[i] .
//        for (int i = 0; i < n; i++)
//            water += Math.min(left[i], right[i]) - arr[i];
// 
//        return water;
//    }
// 
//    // Driver method to test the above function
//    public static void main(String[] args)
//    {
// 
//        System.out.println("Maximum water that can be accumulated is " + findWater(arr.length));
//    }

	
	
	
//	Time Complexity: O(n). 
//		Only one traversal of the array is needed.
//	Auxiliary Space: O(1). 
//		As no extra space is required.
	
	
//	 static int findWater(int arr[], int n)
//	    {
//	        // initialize output
//	        int result = 0;
//	 
//	        // maximum element on left and right
//	        int left_max = 0, right_max = 0;
//	 
//	        // indices to traverse the array
//	        int lo = 0, hi = n - 1;
//	 
//	        while (lo <= hi) {
//	            if (arr[lo] < arr[hi]) {
//	                if (arr[lo] > left_max)
//	 
//	                    // update max in left
//	                    left_max = arr[lo];
//	                else
//	 
//	                    // water on curr element =
//	                    // max - curr
//	                    result += left_max - arr[lo];
//	                lo++;
//	            }
//	            else {
//	                if (arr[hi] > right_max)
//	 
//	                    // update right maximum
//	                    right_max = arr[hi];
//	 
//	                else
//	                    result += right_max - arr[hi];
//	                hi--;
//	            }
//	        }
//	 
//	        return result;
//	    }
//	 
//	    /* Driver program to test above function */
//	    public static void main(String[] args)
//	    {
//	        int arr[] = { 0, 1, 0, 2, 1, 0, 1,
//	                      3, 2, 1, 2, 1 };
//	        int n = arr.length;
//	 
//	        System.out.println("Maximum water that "
//	                           + "can be accumulated is "
//	                           + findWater(arr, n));
//	    }

	
	
	
//	Time Complexity: O(n). 
//		As only one traversal of the array is needed.
//	Auxiliary Space: O(1). 
//		As no extra space is required.

	
	
//	// Function to return the maximum
//    // water that can be stored
//    public static int maxWater(int arr[], int n)
//    {
//        int size = n - 1;
// 
//        // Let the first element be stored as
//        // previous, we shall loop from index 1
//        int prev = arr[0];
// 
//        // To store previous wall's index
//        int prev_index = 0;
//        int water = 0;
// 
//        // To store the water until a larger wall
//        // is found, if there are no larger walls
//        // then delete temp value from water
//        int temp = 0;
//        for (int i = 1; i <= size; i++) {
// 
//            // If the current wall is taller than
//            // the previous wall then make current
//            // wall as the previous wall and its
//            // index as previous wall's index
//            // for the subsequent loops
//            if (arr[i] >= prev) {
//                prev = arr[i];
//                prev_index = i;
// 
//                // Because larger or same height wall is found
//                temp = 0;
//            }
//            else {
// 
//                // Since current wall is shorter than
//                // the previous, we subtract previous
//                // wall's height from the current wall's
//                // height and add it to the water
//                water += prev - arr[i];
// 
//                // Store the same value in temp as well
//                // If we dont find any larger wall then
//                // we will subtract temp from water
//                temp += prev - arr[i];
//            }
//        }
// 
//        // If the last wall was larger than or equal
//        // to the previous wall then prev_index would
//        // be equal to size of the array (last element)
//        // If we didn't find a wall greater than or equal
//        // to the previous wall from the left then
//        // prev_index must be less than the index
//        // of the last element
//        if (prev_index < size) {
// 
//            // Temp would've stored the water collected
//            // from previous largest wall till the end
//            // of array if no larger wall was found then
//            // it has excess water and remove that
//            // from 'water' var
//            water -= temp;
// 
//            // We start from the end of the array, so previous
//            // should be assigned to the last element
//            prev = arr[size];
// 
//            // Loop from the end of array up to the 'previous index'
//            // which would contain the "largest wall from the left"
//            for (int i = size; i >= prev_index; i--) {
// 
//                // Right end wall will be definitely smaller
//                // than the 'previous index' wall
//                if (arr[i] >= prev) {
//                    prev = arr[i];
//                }
//                else {
//                    water += prev - arr[i];
//                }
//            }
//        }
// 
//        // Return the maximum water
//        return water;
//    }
// 
//    // Driver code
//    public static void main(String[] args)
//    {
//        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
//        int n = arr.length;
//        System.out.print(maxWater(arr, n));
//    }
	

	
	
//	Time Complexity: O(n)
//
//	Auxiliary Space: O(n) 





//    // Function to return the maximum
//    // water that can be stored
//    public static int maxWater(int[] height)
//    {
//        // Stores the indices of the bars
//        Stack<Integer> stack = new Stack<>();
// 
//        // size of the array
//        int n = height.length;
// 
//        // Stores the final result
//        int ans = 0;
// 
//        // Loop through the each bar
//        for (int i = 0; i < n; i++) {
// 
//            // Remove bars from the stack
//            // until the condition holds
//            while ((!stack.isEmpty())
//                   && (height[stack.peek()] < height[i])) {
// 
//                // store the height of the top
//                // and pop it.
//                int pop_height = height[stack.peek()];
//                stack.pop();
// 
//                // If the stack does not have any
//                // bars or the the popped bar
//                // has no left boundary
//                if (stack.isEmpty())
//                    break;
// 
//                // Get the distance between the
//                // left and right boundary of
//                // popped bar
//                int distance = i - stack.peek() - 1;
// 
//                // Calculate the min. height
//                int min_height
//                    = Math.min(height[stack.peek()],
//                               height[i])
//                      - pop_height;
// 
//                ans += distance * min_height;
//            }
// 
//            // If the stack is either empty or
//            // height of the current bar is less than
//            // or equal to the top bar of stack
//            stack.push(i);
//        }
// 
//        return ans;
//    }
//    // Driver code
//    public static void main(String[] args)
//    {
//        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
//        System.out.print(maxWater(arr));
//    }

	
	
}
