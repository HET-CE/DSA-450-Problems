public class Program_11_maximum_sum_such_that_no_2_elements_are_adjacent {

    public static void totalAmount(int[] arr) {
        int len = arr.length, sum_odd = 0, sum_even = 0;
        for (int i = 0; i < len; i += 2) {
            sum_even += arr[i];
            if (len % 2 != 0 && i == len-1)
                break;
            sum_odd += arr[i+1];
        }
        if (sum_even > sum_odd)
            System.out.println(sum_even);
        else
            System.out.println(sum_odd);
    }


    // public void FindMaxSum(int arr[])
    // {
    //     int incl = arr[0];
    //     int excl = 0;
    //     int excl_new;
    //     int i;
    // int len = arr.length;

    //     for (i = 1; i < len; i++)
    //     {
    //         /* current max excluding i */
    //         excl_new = (incl > excl) ? incl : excl;

    //         /* current max including i */
    //         incl = excl + arr[i];
    //         excl = excl_new;
    //     }

    //     /* max of incl and excl */
    //     if(incl > excl) 
            // System.out.println(incl);
            // else
            // System.out.println(excl);
    // }


    public static void main(String[] args) {
        int arr[] = { 5, 5, 10, 100, 1000, 5};
        totalAmount(arr);
    }
}