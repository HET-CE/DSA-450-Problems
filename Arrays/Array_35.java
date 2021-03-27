package com.company;

import java.util.Arrays;

public class Array_35 {
    public static void main(String[] args) {
        int[] arr = {90 ,100 ,78 ,89 ,67};
        int length = arr.length;
        Arrays.sort(arr);
        int index = length/2;
        int median = 0;
        if(length % 2 == 0)
            median = (arr[index] + arr[index-1]) / 2;
        else
            median = arr[index];
        System.out.println(median);

    }
}
