import java.util.Arrays;
import java.util.Collections;

public class Program_12_Minimum_Cost_to_cut_a_board_into_squares {

    static int minimumCostOfBreaking(Integer X[], Integer Y[], int m, int n) {
        int res = 0;

        Arrays.sort(X, Collections.reverseOrder());

        Arrays.sort(Y, Collections.reverseOrder());

        int hzntl = 1, vert = 1;

        int i = 0, j = 0;
        while (i < m && j < n) {
            if (X[i] > Y[j]) {
                res += X[i] * vert;

                hzntl++;
                i++;
            } else {
                res += Y[j] * hzntl;

                vert++;
                j++;
            }
        }

        int total = 0;
        while (i < m)
            total += X[i++];
        res += total * vert;

        total = 0;
        while (j < n)
            total += Y[j++];
        res += total * hzntl;

        return res;
    }

    public static void main(String arg[]) {
        int m = 6, n = 4;
        Integer X[] = { 2, 1, 3, 1, 4 };
        Integer Y[] = { 4, 1, 2 };
        System.out.print(minimumCostOfBreaking(X, Y, m - 1, n - 1));
    }
}