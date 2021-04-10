import java.util.Arrays;
import java.util.Scanner;

public class Program_26_EKOSPOJ {

    public static int minHeightInMachine(int[] arr, int reqWood) {
        Arrays.sort(arr);
        int maxEle = arr[arr.length - 1], produceWood = 0, wood_from_single_tree = 0;
        while (maxEle != 0) {
            produceWood = 0;
            for (int i = 0; i < arr.length; i++) {
                wood_from_single_tree = arr[i] - maxEle;
                if (wood_from_single_tree < 0)
                    wood_from_single_tree = 0;
                else
                    produceWood += wood_from_single_tree;
                if (produceWood >= reqWood)
                    return maxEle;
            }

            maxEle--;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Enter Number of Trees and required amount of wood");
        Scanner obj = new Scanner(System.in);
        int trees = obj.nextInt();
        int wood = obj.nextInt();
        int[] arr = new int[trees];
        System.out.println("Enter height of trees");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }
        System.out.println();
        System.out.println(minHeightInMachine(arr, wood));
    }
}
