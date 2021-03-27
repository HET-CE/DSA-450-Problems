
public class Array_5_Move_all_the_negative_elements_to_one_side {
	
	static void arrangeArray(int arr[]) {
		int j = 0;
		int k = arr.length-1;
		int newarr[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < 0) {
				newarr[j] = arr[i];
				j++;
			}
			else {
				newarr[k] = arr[i];
				k--;
			}
		}
		for (int i = 0; i < newarr.length; i++) {
			System.out.println(newarr[i]);
		}
		
//		int j = 0, temp;
//		for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 0) {
//                if (i != j) {
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//                j++;
//            }
//        }
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
	}
	public static void main(String[] args) {
		int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 } ;
		arrangeArray(arr);
	}
}
