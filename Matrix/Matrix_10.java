package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Matrix_10 {

    public static boolean is_Occur(int a, int[] arr){
        int i;
        for(i = 0 ; i < arr.length ; i++){
            if(arr[i] == a) {
                break;
            }
        }
        if(i == arr.length)
            return false;
        else
            return true;
    }

    public static void pairs(int[][] mat){
        int k ;
        ArrayList<Integer> result = new ArrayList<>();  // You can use HashSet too then this to List : result and RectifiedResult is not required
        HashSet<Integer> set=new HashSet<>();

        for (int i = 0; i < mat.length ; i++){
            for (int j = 0; j < mat[i].length ; j++){
                for(k = 0 ; k < mat.length ; k++) {
                    if (!is_Occur(mat[i][j], mat[k])) {
                        break;
                    }
                }
                if(k == mat.length){
//                    result.add(mat[i][j]);
                      set.add(mat[i][j]);
                }
            }
        }

//        List<Integer> RectifiedResult = result.stream()
//                                    .distinct()
//                                    .collect(Collectors.toList());
//        for(int i : RectifiedResult){
//            System.out.print(i+ " ");
//        }

        for(int i : set){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 1, 4, 8},
                {3, 7, 8, 5, 1},
                {8, 7, 7, 3, 1},
                {8, 1, 2, 7, 9}};

        pairs(mat);
    }
}