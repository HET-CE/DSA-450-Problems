
public class Array_16_Count_Inversion {
	public static void main(String[] args) {
//	 int arr[] = {2, 4, 1, 3, 5};
//	 int arr[] = {2, 3, 4, 5, 6};
//	 int arr[] = {10, 10, 10};
	 int arr[] = {468, 335, 1, 170, 225, 479, 359, 463, 465, 206, 146, 282, 328, 462, 492, 496, 443, 328, 
			     437, 392, 105, 403, 154, 293, 383, 422, 217, 219, 396, 448, 227, 272, 39, 370, 413, 168, 
			     300, 36, 395, 204, 312, 323};

	 int count = 0;
	 for(int i = 0 ; i < arr.length ; i++) {
		 for(int j = i+1 ; j < arr.length ; j++) {
			 if(arr[i]>arr[j]) {
				 count++;
			 }
		 }
	 }
	 System.out.println(count);
   }
}
