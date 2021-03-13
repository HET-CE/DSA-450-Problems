import java.util.Scanner;

public class Array_1_Reverse_the_Array {
	
	static void revereseArray(int arr[], int arrSize) {
		int temp;
		int start = 0 , end = arrSize-1;
		while(start < end ) {
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp; 
		start ++;
		end--;
		}	
	}
	
	static void printArray(int arr[], int arrSize) {
		for(int i = 0 ; i < arrSize ; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	public static void main(String[] args) {

		System.out.println("Enter the Size");
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    int arrSize = myObj.nextInt();  // Read user input
	    
	    int arr[] = new int[arrSize];
	    
	    System.out.println("Enter The Elements");
	    for(int i = 0 ; i < arrSize ; i++) {
	    	arr[i] = myObj.nextInt();
	    }
	    
		System.out.println("Reverse array:");
		revereseArray(arr, arrSize);
	    printArray(arr, arrSize);
//	    System.out.println("Username is: " + arrSize);
	    
	}

}
