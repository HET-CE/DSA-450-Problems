import java.util.ArrayList;
import java.util.Scanner;

public class Array_32_Three_way_partitioning_of_an_array_around_a_given_value {
	public static void main() {
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		int arr1[] = {1,2,3,4,5};
		System.out.println("Enter a number");
		Scanner myObj = new Scanner(System.in);
		int a = myObj.nextInt();
		int b = myObj.nextInt();
		
		for(int i = 0 ; i< arr1.length ; i++) {
			if(arr1[i] <= a) {
				arr2.add(arr1[i]);
			}
		}
	
		for(int i = 0 ; i< arr1.length ; i++) {
			if(arr1[i] >= b) {
				arr2.add(arr1[i]);
			}
		}
		for(int i : arr2) {
			System.out.println(i);
		}
	}
}
