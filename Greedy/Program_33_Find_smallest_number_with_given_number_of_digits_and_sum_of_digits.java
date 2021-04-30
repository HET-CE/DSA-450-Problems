// /*  My Approach */
// public class Program_33_Find_smallest_number_with_given_number_of_digits_and_sum_of_digits {
//     static int sumNum(int n){
//         int sum = 0;
//         while(n>0){
//         sum = sum + n%10;
//         n=n/10;
//         }
//         return sum;
//     }
//     static String smallestNumber(int S, int D){
//         // code here
//         String i = "1";
//         for(int j = 1 ; j < D; j++){
//             i = i + "0";
//         }
//         int k = Integer.parseInt(i);
//         String str;
//         while(true){
//             if(sumNum(k) == S){
//               str = String.valueOf(k);
//               return str;
//             } 
//             k++; 
//         }
//     }
//     public static void main(String[] args) {
//         int s= 9,d=2;
//         System.out.println(smallestNumber(s,d));
//     }
// }

/*  Optimized approach */

class Program_33_Find_smallest_number_with_given_number_of_digits_and_sum_of_digits {
    static String findSmallest(int s, int m) {
        if (s == 0) {
            return "-1";
        }

        if (s > 9 * m) {
            return "-1";
        }

        int[] res = new int[m];
        s -= 1;

        for (int i = m - 1; i > 0; i--) {
            if (s > 9) {
                res[i] = 9;
                s -= 9;
            } else {
                res[i] = s;
                s = 0;
            }
        }

        res[0] = s + 1;

        String result = "";
        for (int i = 0; i < m; i++)
            result = result + res[i];
        return result;
    }

    // driver program
    public static void main(String[] args) {
        int s = 9, m = 2;
        System.out.println(findSmallest(s, m));
    }
}