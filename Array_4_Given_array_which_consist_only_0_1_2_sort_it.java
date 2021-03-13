import java.util.Arrays;

public class Array_4_Given_array_which_consist_only_0_1_2_sort_it {
	public static void main(String[] args) {
		int a[] = {0,0,2,0,1};
		Arrays.sort(a);
	}
}


//    SOLUTION 1

// Time Complexity: O(n).
//         Only one traversal of the array is needed.
// Space Complexity: O(1).
// No extra space is required.

//class countzot { 
//  
//    // Sort the input array, the array is assumed to 
//    // have values in {0, 1, 2} 
//    static void sort012(int a[], int arr_size) 
//    { 
//        int lo = 0; 
//        int hi = arr_size - 1; 
//        int mid = 0, temp = 0; 
//        while (mid <= hi) { 
//            switch (a[mid]) { 
//            case 0: { 
//                temp = a[lo]; 
//                a[lo] = a[mid]; 
//                a[mid] = temp; 
//                lo++; 
//                mid++; 
//                break; 
//            } 
//            case 1: 
//                mid++; 
//                break; 
//            case 2: { 
//                temp = a[mid]; 
//                a[mid] = a[hi]; 
//                a[hi] = temp; 
//                hi--; 
//                break; 
//            } 
//            } 
//        } 
//    } 
//  
//    /* Utility function to print array arr[] */
//    static void printArray(int arr[], int arr_size) 
//    { 
//        int i; 
//        for (i = 0; i < arr_size; i++) 
//            System.out.print(arr[i] + " "); 
//        System.out.println(""); 
//    } 
//  
//    /*Driver function to check for above functions*/
//    public static void main(String[] args) 
//    { 
//        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 }; 
//        int arr_size = arr.length; 
//        sort012(arr, arr_size); 
//        System.out.println("Array after seggregation "); 
//        printArray(arr, arr_size); 
//    } 
//} 


//		SOLUTION 2

//		Time Complexity: O(n).
//		Only two traversals of the array is needed.
//		Space Complexity: O(1).
//		As no extra space is required.


//class GFG { 
//    // Utility function to print the contents of an array 
//    static void printArr(int arr[], int n) 
//    { 
//        for (int i = 0; i < n; i++) 
//            System.out.print(arr[i] + " "); 
//    } 
//      
//    // Function to sort the array of 0s, 1s and 2s 
//    static void sortArr(int arr[], int n) 
//    { 
//        int i, cnt0 = 0, cnt1 = 0, cnt2 = 0; 
//      
//        // Count the number of 0s, 1s and 2s in the array 
//        for (i = 0; i < n; i++) { 
//            switch (arr[i]) { 
//            case 0: 
//                cnt0++; 
//                break; 
//            case 1: 
//                cnt1++; 
//                break; 
//            case 2: 
//                cnt2++; 
//                break; 
//            } 
//        } 
//      
//        // Update the array 
//        i = 0; 
//      
//        // Store all the 0s in the beginning 
//        while (cnt0 > 0) { 
//            arr[i++] = 0; 
//            cnt0--; 
//        } 
//      
//        // Then all the 1s 
//        while (cnt1 > 0) { 
//            arr[i++] = 1; 
//            cnt1--; 
//        } 
//      
//        // Finally all the 2s 
//        while (cnt2 > 0) { 
//            arr[i++] = 2; 
//            cnt2--; 
//        } 
//      
//        // Print the sorted array 
//        printArr(arr, n); 
//    } 
//      
//    // Driver code 
//    public static void main(String[] args) 
//    { 
//        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 }; 
//        int n = arr.length; 
//        sortArr(arr, n); 
//    } 
//} 
//  