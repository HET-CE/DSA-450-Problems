import java.util.Arrays;
import java.util.Scanner;

public class Program_21_Kth_smallest_number_again {
    
    public static void smallest(int k,int[] arr){
        try{
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
        }
        catch(Exception e){
            System.out.println("-1");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Enter Kth Value");
        Scanner obj = new Scanner(System.in);
        int k = obj.nextInt();

        smallest(k,arr);
    }
}
