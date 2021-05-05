import java.util.Stack;

public class Program_38_NEXT_smaller_element {
    public static void printNSE(int arr[], int n) {
        Stack<Integer> s = new Stack<Integer>();

        s.push(arr[0]);

        for (int i = 1; i < n; i++) {

            if (s.empty()) {
                s.push(arr[i]);
                continue;
            }

            while (s.empty() == false && s.peek() > arr[i]) {
                System.out.println(s.peek() + " --> " + arr[i]);
                s.pop();
            }

            s.push(arr[i]);
        }

        while (s.empty() == false) {
            System.out.println(s.peek() + " --> " + "-1");
            s.pop();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 11, 13, 21, 3 };
        int n = arr.length;
        printNSE(arr, n);
    }
}