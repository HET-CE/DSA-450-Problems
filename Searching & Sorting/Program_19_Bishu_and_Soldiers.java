import java.util.Arrays;
import java.util.Scanner;

public class Program_19_Bishu_and_Soldiers {

    public static void bishu(int power , int[] arr) {
        Arrays.sort(arr);
        int sum = 0 ,i = 0 ; 
        if(power >= arr.length){
            return;
        }
        for(i = 0 ; i < power ; i++){
            sum += arr[i];
        }

        System.out.println(" Bishu can defeat " + i + " Soldiers , And total power of thate soldiers is " +sum);

    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter the size");
        int size = obj.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter the powers of soldiers");
        for (int i = 0 ; i <arr.length ; i++) {
            arr[i] = obj.nextInt();
        }

        System.out.println("Enter the bishu's power");
        int power = obj.nextInt();
        bishu(power , arr);
    }
}
