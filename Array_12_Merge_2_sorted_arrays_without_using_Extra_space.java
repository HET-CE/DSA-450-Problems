import java.util.Arrays;

public class Array_12_Merge_2_sorted_arrays_without_using_Extra_space {
	public static void main(String args[]) {
		int arr1[] = {1, 3, 5, 7};
		int arr2[] = {0, 2, 6, 8, 9};
		
//		((len1<len2)?len1:len2)
		for( int i = 0 ; i < arr2.length ; i++) {
			for(int j = 0 ; j < arr1.length  ; j++) {
				if(arr2[i] < arr1[j]) {
					int temp = arr2[i];
					arr2[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		Arrays.sort(arr2);
		
		for(int i = 0 ; i < arr1.length ; i++)
		System.out.print(arr1[i] + " ");
		for(int i = 0 ; i < arr2.length ; i++)
		System.out.print(arr2[i] + " ");
	}
}
