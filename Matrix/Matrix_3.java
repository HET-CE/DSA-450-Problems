package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Matrix_3 {

    public static int median(int matrix[][], int r, int c){
        int median = 0;

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0 ; i < r ; i++)
            for(int j = 0; j < c; j++)
                arr.add(matrix[i][j]);

        Collections.sort(arr);

        int len = arr.size();
        if(len % 2 != 0)
            median = arr.get(len/2);
        else{
            int index = len/2;
            median = arr.get(index)+ arr.get(index+1);
        }
        return median;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5},{2, 6, 9},{3, 6, 9}};
        int r = matrix.length;
        int c = matrix[0].length;
        int ans = median(matrix, r, c);
        System.out.println(ans);
    }
}
