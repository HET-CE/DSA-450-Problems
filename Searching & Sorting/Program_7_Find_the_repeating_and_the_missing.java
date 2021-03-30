public class Program_7_Find_the_repeating_and_the_missing {

    public static void findTwoElement(int[] arr) {
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                res[0]++;
            else if (arr[i] == 2)
                res[1]++;
            else if (arr[i] == 3)
                res[2]++;
            else if (arr[i] == 4)
                res[3]++;
            else if (arr[i] == 5)
                res[4]++;
            else if (arr[i] == 6)
                res[5]++;
        }
        for (int i = 0; i < res.length; i++) {
            if (res[i] == 0) {
                System.out.println("Missing = " + (i + 1));
            } else if (res[i] == 2)
                System.out.println("Repeating = " + (i + 1));
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 6, 2, 1, 1 };
        findTwoElement(arr);
    }

    /*  OPTIMAL */

    // static void printTwoElements(int arr[], int size)
    // {
    //     int i;
    //     System.out.print("The repeating element is ");
 
    //     for (i = 0; i < size; i++) {
    //         int abs_val = Math.abs(arr[i]);
    //         if (arr[abs_val - 1] > 0)
    //             arr[abs_val - 1] = -arr[abs_val - 1];
    //         else
    //             System.out.println(abs_val);
    //     }
 
    //     System.out.print("And the missing element is ");
    //     for (i = 0; i < size; i++) {
    //         if (arr[i] > 0)
    //             System.out.println(i + 1);
    //     }
    // }
 
    // // Driver code
    // public static void main(String[] args)
    // {
    //     int arr[] = { 7, 3, 4, 5, 5, 6, 2 };
    //     int n = arr.length;
    //     printTwoElements(arr, n);
    // }

}
