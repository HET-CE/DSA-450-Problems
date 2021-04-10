import java.util.Scanner;

public class Program_31_ROTI_Prata_SPOJ {

    public static void totalTime(int[] arr, int cooks) {
        
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of cooks");
        Scanner obj = new Scanner(System.in);
        int cooks = obj.nextInt();
        System.out.println("Enter rank of cooks");
        
        int[] arr = new int[cooks];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = obj.nextInt();
        }
        totalTime(arr,cooks);
    }
}
