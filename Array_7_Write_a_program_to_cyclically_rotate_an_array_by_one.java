import java.util.Scanner;

public class Array_7_Write_a_program_to_cyclically_rotate_an_array_by_one {
	
	public static void main(String args[]) {
		System.out.println("Enter The test case");
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for(int i = 0 ; i < testCase ; i++) {
			System.out.println("Enter the size of array");
			int size1 = sc.nextInt();
			int arr1[] = new int[size1];
			System.out.println("Enter Elements");
			for(int j = 0 ; j < size1 ; j++) {
				arr1[j] = sc.nextInt();
			}
			for(int k = 1 ; k < arr1.length ; k++) {
				int temp = arr1[0];
				arr1[0] = arr1[k];
				arr1[k] = temp;	
			}
			for(int p = 0 ; p < arr1.length ; p++) {
				System.out.print(arr1[p] + " ");
			}
		}
	}
}
