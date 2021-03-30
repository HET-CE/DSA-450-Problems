public class Program_2_Find_a_Fixed_Point_Value_equal_to_index_in_a_given_array {

    public static void occurance(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 15, 45, 2, 12, 7 };
        occurance(arr);
    }

    // static int binarySearch(int[] arr, int low, int high) {
    //     if (high >= low) {
    //         int mid = (low + high) / 2;

    //         if (mid == arr[mid])
    //             return mid;
    //         if (mid > arr[mid])
    //             return binarySearch(arr, (mid + 1), high);
    //         else
    //             return binarySearch(arr, low, (mid - 1));
    //     }
    //     return -1;
    // }

    // public static void Main() {
    //     int[] arr = { -10, -1, 0, 3, 10, 11, 30, 50, 100 };
    //     int n = arr.Length;
    //     Console.Write("Fixed Point is " + binarySearch(arr, 0, n - 1));
    // }
}
