public class Program_32_Distance_of_nearest_cell_having_1_in_a_binary_matrix {

    static int N = 3;
    static int M = 4;

    static void printDistance(int mat[][]) {
        int ans[][] = new int[N][M];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                ans[i][j] = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++)
                    for (int l = 0; l < M; l++) {
                        if (mat[k][l] == 1)
                            ans[i][j] = Math.min(ans[i][j], Math.abs(i - k) + Math.abs(j - l));
                    }
            }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++)
                System.out.print(ans[i][j] + " ");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int mat[][] = { { 0, 0, 0, 1 }, { 0, 0, 1, 1 }, { 0, 1, 1, 0 } };

        printDistance(mat);
    }
}