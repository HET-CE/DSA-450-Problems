
public class Array_11_find_duplicate_in_an_array_of_Integers {
	
	static int findDuplicate(int arr[]) {
		int match = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = (i+1) ; j < arr.length ; j++) {
				if(arr[i] == arr[j]) {
					match=arr[i];
					break;
				}
			}
			if(match != 0) {
				break;
			}
		}
		return(match);
	}
	public static void main(String args[]) {
		int arr[] = {1,3,4,2,2};
//		int arr[] = {3,1,3,4,2};
		int r = findDuplicate(arr);
		System.out.println(r);
	}
}
