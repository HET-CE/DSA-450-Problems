import java.util.Arrays;

public class Progrm_13_Count_triplet_with_sum_smaller_than_a_given_value {

    public static void triplets(int[] arr,int num) {
        Arrays.sort(arr);
        int a = arr[0] ,temp = 0;
        for(int i = 1 ; i < arr.length-1 ; i++){
            for(int j = i+1 ; j < arr.length; j++){
                temp = a + arr[i] + arr[j]; 
                if(temp < num){
                    System.out.println(a +" "+ arr[i] +" "+ arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 3, 4, 7 };
        triplets(arr , 12);
    }
}
