import java.util.Scanner;

public class Array_27_find_whether_array__is_a_subset_of_another_array {
	
	static boolean subset(int arr1[], int arr2[]) {
		int j = 0;
		for(int i = 0 ; i < arr2.length ; i++) {
			for(j = 0 ; j < arr1.length ; j++) {
				if(arr2[i] == arr1[j]) {
					break;
				}
			}
			if(j == arr1.length) {
				return (false);
			}
		}
		return(true);
	}
	public static void main(String args[]) {
//		int arr1[] = {11, 1, 13, 21, 3 ,7};
//		int arr2[] = {11, 3, 7, 1};
//		int arr1[] = {1, 2, 3 ,4, 5, 6};
//		int arr2[] = {1, 2, 4}; 
//		int arr1[] = {10, 5, 2, 23, 19};
//		int arr2[] = {19, 5, 3};
		
		System.out.println("Enter Test cases");
		Scanner st = new Scanner(System.in);
		int test = st.nextInt();
		
		for(int i = 0 ; i < test ; i++) {
			
		System.out.println("Enter size of superset array");
		int size1 = st.nextInt();
		
		System.out.println("Enter size of subset array");
		int size2 = st.nextInt();
		
		int arr1[] = new int[size1];
		int arr2[] = new int[size2];
		
		System.out.println("Enter in array 1 ");
			for(int j = 0 ; j < size1 ; j++) {
				arr1[j] = st.nextInt();
			}
			
		System.out.println("Enter in array 2 ");
			for(int j = 0 ; j < size2 ; j++) {
				arr2[j] = st.nextInt();
			}
			
		boolean b = subset(arr1, arr2);
		System.out.println(b);	
		}
		st.close();
	}
}
