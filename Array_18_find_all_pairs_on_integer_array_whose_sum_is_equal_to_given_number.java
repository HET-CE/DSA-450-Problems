
public class Array_18_find_all_pairs_on_integer_array_whose_sum_is_equal_to_given_number {
public static void main(String args[]) {
//	int arr[] = {1, 5, 7, 1};
	int arr[] = {1, 1, 1, 1};
	int k =2;
	int count = 0;
	for(int i = 0 ; i < arr.length-1 ; i++) {
		for(int j = i+1 ; j < arr.length ; j++) {
			if(arr[i]+arr[j] == k) {
				count++;
			}
		}
	}
	System.out.println(count);
  }
}
