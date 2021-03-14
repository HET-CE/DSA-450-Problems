package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix_9 {

    public static int kthSmallest(int[][]mat,int n,int k){

        int[] arr = new int[n*n];
        int temp = 0;
        for(int i = 0; i < n ; i ++){
            for(int j = 0 ; j < n ; j++){
                arr[temp] = mat[i][j];
                temp++;
            }
        }
        Arrays.sort(arr);
        return(arr[k-1]);
    }

    public static void main(String[] args) {
        int[][] mat = {{16, 28, 60, 64},
            {22, 41, 63, 91},
            {27, 50, 87, 93},
            {36, 78, 87, 94 }};
        int n = 4;

        System.out.println("Enter a number");
        Scanner obj = new Scanner(System.in);
        int k = obj.nextInt();
        int ans = kthSmallest(mat, n, k);
        System.out.println(ans);
    }
}
