import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Program_1_Activity_Selection_Problem {

    public static int maxMeetings(int start[], int end[], int n) {
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = start[i];
            arr[i][1] = end[i];
        }

        Arrays.sort(arr, (a, b) -> a[1] - b[1]);
        List<int[]> rooms = new ArrayList<>();
        rooms.add(arr[0]);
        int tl = arr[0][1];
        for (int i = 1; i < n; i++) {
            if (arr[i][0] > tl) {
                rooms.add(arr[i]);
                tl = arr[i][1];
            }
        }
        return rooms.size();
    }

    public static void main(String[] args) {
        int s[] = { 1, 3, 0, 5, 8, 5 };
        int f[] = { 2, 4, 6, 7, 9, 9 };
        int n = s.length;

        System.out.println(maxMeetings(s, f, n));
    }
}