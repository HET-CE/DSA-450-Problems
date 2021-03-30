public class Program_4_Square_root_of_an_integer {
    
    public static int countSquares(int num){
        int count = 0;
        for(int i = 1 ; i < num ; i++){
            if(num > i*i){
                count++;
            }
        }
        return count;
    }
    // public static int floorSqrt(int x)
    // {
    //     // Base Cases
    //     if (x == 0 || x == 1)
    //         return x;
  
    //     // Do Binary Search for floor(sqrt(x))
    //     int start = 1, end = x, ans=0;
    //     while (start <= end)
    //     {
    //         int mid = (start + end) / 2;
  
    //         // If x is a perfect square
    //         if (mid*mid == x)
    //             return mid;
  
    //         // Since we need floor, we update answer when mid*mid is
    //         // smaller than x, and move closer to sqrt(x)
    //         if (mid*mid < x)
    //         {
    //             start = mid + 1;
    //             ans = mid;
    //         }
    //         else   // If mid*mid is greater than x
    //             end = mid-1;
    //     }
    //     return ans;
    // }
    public static void main(String[] args) {
        int num = 9;
        System.out.println(countSquares(num));
    }
}
