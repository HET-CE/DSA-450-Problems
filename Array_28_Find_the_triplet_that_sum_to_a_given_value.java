import java.util.Scanner;

public class Array_28_Find_the_triplet_that_sum_to_a_given_value {
	
	static int triplet(int arr[], int sum) {
		int len = arr.length;
		for(int i = 0 ; i < len-2 ; i++) {
			for(int j = i+1 ; j < len-1 ; j++) {
				for(int k = j+1 ; k < len ; k++) {
					if((arr[i] + arr[j] + arr[k]) == sum) {
						return(1);
					}
				}
			}
		}
		return(0);
	}
	public static void main(String args[]) {
//		int arr[] = {1, 4, 45, 6, 10, 8};
//		int sum = 13;
		System.out.println("Enter Test cases");
		Scanner st = new Scanner(System.in);
		int test = st.nextInt();
		
		for(int i = 0 ; i < test ; i++) {
			
		System.out.println("Enter size of array");
		int size = st.nextInt();
		
		System.out.println("Enter sum");
		int sum = st.nextInt();
		
		int arr[] = new int[size];

		System.out.println("Enter in array ");
		for(int j = 0 ; j < size ; j++) {
			arr[j] = st.nextInt();
		}

		int b = triplet(arr, sum);
		System.out.println(b);
    }
  }
}
