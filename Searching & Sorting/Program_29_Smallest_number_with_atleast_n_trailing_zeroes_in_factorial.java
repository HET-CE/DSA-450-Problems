import java.util.Scanner;

public class Program_29_Smallest_number_with_atleast_n_trailing_zeroes_in_factorial {
    
    public static void leastFact(int n) {
        int cn = 0;
        for(int i = 1 ; i <= n ; i++){
            // if( i%5 == 0)
            if( (i - (-1)) % 6 ==0)
            continue;
            cn += 5;
        }
        System.out.println(cn);
    }
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        leastFact(n);          
    }
}
