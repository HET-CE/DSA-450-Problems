public class Program_10_The_celebrity_Problem {
    static int MATRIX[][] = { { 0, 0, 1, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 0 }, { 0, 0, 1, 0 } };

    static boolean knows(int a, int b) {
        boolean res = (MATRIX[a][b] == 1) ? true : false;
        return res;
    }

    static int findCelebrity(int n) {
        int a = 0;
        int b = n - 1;

        while (a < b) {
            if (knows(a, b))
                a++;
            else
                b--;
        }

        for (int i = 0; i < n; i++) {
            if (i != a && (knows(a, i) || !knows(i, a)))
                return -1;
        }
        return a;
    }

    public static void main(String[] args) {
        int n = 4;
        int result = findCelebrity(n);
        if (result == -1) {
            System.out.println("No Celebrity");
        } else
            System.out.println("Celebrity ID " + result);
    }
}

// import java.util.*;

// public class Program_10_The_celebrity_Problem {
//     static int MATRIX[][] = { { 0, 0, 1, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 0 }, { 0, 0, 1, 0 } };

//     static boolean knows(int a, int b) {
//         boolean res = (MATRIX[a][b] == 1) ? true : false;
//         return res;
//     }

//     static int findCelebrity(int n) {
//         Stack<Integer> st = new Stack<>();
//         int c;

//         for (int i = 0; i < n; i++) {
//             st.push(i);
//         }

//         while (st.size() > 1) {
//             int a = st.pop();
//             int b = st.pop();

//             if (knows(a, b)) {
//                 st.push(b);
//             }

//             else
//                 st.push(a);
//         }

//         if (st.empty())
//             return -1;

//         c = st.pop();

//         for (int i = 0; i < n; i++) {
//             if (i != c && (knows(c, i) || !knows(i, c)))
//                 return -1;
//         }
//         return c;
//     }

//     public static void main(String[] args) {
//         int n = 4;
//         int result = findCelebrity(n);
//         if (result == -1) {
//             System.out.println("No Celebrity");
//         } else
//             System.out.println("Celebrity ID " + result);
//     }
// }