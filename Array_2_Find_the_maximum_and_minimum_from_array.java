
public class Array_2_Find_the_maximum_and_minimum_from_array {

	static class Pair{
		int max,min;
	}
	
	static void getMinMax(int arr[]) {
		Pair obj = new Pair();
		if(arr.length == 1) {
			obj.min = arr[0];
			obj.max = arr[0];
		}
		else {
			if(arr[0] <= arr[1]) {
				obj.min = arr[0];
				obj.max = arr[1];
			}
			for(int i = 2 ; i < arr.length ; i++) {
				if(arr[i] < obj.min) {
					obj.min = arr[i];
				}
				else if(arr[i] > obj.max){
					obj.max = arr[i];
				}
			}
		}
		System.out.println("Minimum is "+obj.min);
		System.out.println("Maximum is "+obj.max);		
	}
	
	static void printArray(int arr[]) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 1, 3, 4, 3, 2};
		printArray(arr);
		getMinMax(arr);
	}

}
