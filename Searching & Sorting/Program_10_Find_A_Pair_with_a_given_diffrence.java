public class Program_10_Find_A_Pair_with_a_given_diffrence {

    public static int pairing(int[] arr , int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(target == Math.abs(arr[i] - arr[j])){
                    return 1;
                }       
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = { 5, 20, 3, 2, 5, 80 };
        int target = 78;
        System.out.println(pairing(arr , target));
    }


    /* Optimal */


    // // The function assumes that the array is sorted
    // static boolean findPair(int arr[],int n)
    // {
    //     int size = arr.length;
  
    //     // Initialize positions of two elements
    //     int i = 0, j = 1;
  
    //     // Search for a pair
    //     while (i < size && j < size)
    //     {
    //         if (i != j && arr[j]-arr[i] == n)
    //         {
    //             System.out.print("Pair Found: "+
    //                              "( "+arr[i]+", "+ arr[j]+" )");
    //             return true;
    //         }
    //         else if (arr[j] - arr[i] < n)
    //             j++;
    //         else
    //             i++;
    //     }
  
    //     System.out.print("No such pair");
    //     return false;
    // }
  
    // // Driver program to test above function
    // public static void main (String[] args)
    // {
    //     int arr[] = {1, 8, 30, 40, 100};
    //     int n = 60;
    //     findPair(arr,n);
    // }
}