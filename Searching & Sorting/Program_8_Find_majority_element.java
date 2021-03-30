public class Program_8_Find_majority_element {

    public static int majorityElement(int a[], int size) {
        int[] res = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1)
                res[0]++;
            else if (a[i] == 2)
                res[1]++;
            else if (a[i] == 3)
                res[2]++;
            else if (a[i] == 4)
                res[3]++;
            else if (a[i] == 5)
                res[4]++;
        }
        for (int i : res) {
            if (i > (size / 2))
                return i;
        }
        return -1;


        /*We Can wright Optimally this function. Like this */
        // Sort the array in O(nlogn)
    // Arrays.sort(arr);

    // int count = 1, max_ele = -1, 
    //      temp = arr[0], ele = 0,
    //         f = 0;

    // for(int i = 1; i < n; i++)
    // {
        
    //     // Increases the count if the 
    //     // same element occurs otherwise
    //     // starts counting new element
    //     if (temp == arr[i])
    //     {
    //         count++;
    //     }
    //     else 
    //     {
    //         count = 1;
    //         temp = arr[i];
    //     }

    //     // Sets maximum count and stores
    //     // maximum occured element so far
    //     // if maximum count becomes greater
    //     // than n/2 it breaks out setting
    //     // the flag
    //     if (max_ele < count) 
    //     {
    //         max_ele = count;
    //         ele = arr[i];

    //         if (max_ele > (n / 2)) 
    //         {
    //             f = 1;
    //             break;
    //         }
    //     }
    // }

    // // Returns maximum occured element
    // // if there is no such element, returns -1
    // return (f == 1 ? ele : -1);


        //  Time Complexity: O(nlogn). 
        //  Auxiliary Space: O(1).

    }

    public static void main(String[] args) {
        int[] arr = {3,1,3,3,2};
        System.out.println(majorityElement(arr, 5));
    }
}
