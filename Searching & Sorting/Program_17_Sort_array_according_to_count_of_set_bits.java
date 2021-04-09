import java.util.Arrays;
import java.util.Comparator;

public class Program_17_Sort_array_according_to_count_of_set_bits {
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Integer arr[] = {5, 2, 3, 9, 4, 6, 7, 15, 32};
        int n = 9;
        sortBySetBitCount(arr, n);
        printArr(arr, n);
        System.out.println();
    }
 
    private static void printArr(Integer[] arr, int n)
    {
        // TODO Auto-generated method stub
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        // cout << arr[i] << " ";
    }
 
    private static Integer[] sortBySetBitCount(
        Integer[] arr, int n)
    {
        // TODO Auto-generated method stub
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer arg0, Integer arg1)
            {
                // TODO Auto-generated method stub
                int c1 = Integer.bitCount(arg0);
                int c2 = Integer.bitCount(arg1);
                if (c1 <= c2)
                    return 1;
                else
                    return -1;
            }
        });
        return arr;
    }
}
