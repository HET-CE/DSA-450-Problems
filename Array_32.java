package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;
    public class Array_32 {

        public static void main(String args[]) {

            int arr1[] = {1,3,2,3,4,5};
//            ArrayList<Integer> arr1 = new ArrayList<Integer>();
//            arr1.add(1);
//            arr1.add(2);
//            arr1.add(3);
//            arr1.add(3);
//            arr1.add(4);
            System.out.println("Enter two numbers");
            Scanner myObj = new Scanner(System.in);
            int a = myObj.nextInt();
            int b = myObj.nextInt();

            ArrayList<Integer> arr2 = new ArrayList<Integer>();

            for(int i = 0 ; i < arr1.length ; i++){
                if(arr1[i] <= a){
                    arr2.add(arr1[i]);
                }
            }
            for(int i = 0 ; i < arr1.length ; i++){
                if(arr1[i] < b && arr1[i] > a){
                    arr2.add(arr1[i]);
                }
            }
            for(int i = 0 ; i < arr1.length ; i++){
                if(arr1[i] >= b){
                    arr2.add(arr1[i]);
                }
            }

            for(int i : arr2){
                System.out.println(i);
            }
        }



//        public static void threeWayPartition(int[] arr, int lowVal, int highVal)
//        {
//
//            int  n = arr.length;
//
//            // Initialize ext available positions for
//            // smaller (than range) and greater lements
//            int start = 0, end = n-1;
//
//            // Traverse elements from left
//            for(int i = 0; i <= end;)
//            {
//
//                // If current element is smaller than
//                // range, put it on next available smaller
//                // position.
//
//                if(arr[i] < lowVal)
//                {
//
//                    int temp = arr[start];
//                    arr[start] = arr[i];
//                    arr[i] = temp;
//                    start++;
//                    i++;
//
//                }
//
//                // If current element is greater than
//                // range, put it on next available greater
//                // position.
//                else if(arr[i] > highVal)
//                {
//
//                    int temp = arr[end];
//                    arr[end] = arr[i];
//                    arr[i] = temp;
//                    end--;
//
//                }
//
//                else
//                    i++;
//            }
//
//        }
//
//        public static void main (String[] args)
//        {
//
//
//            int arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
//
//            threeWayPartition(arr, 10, 20);
//
//            System.out.println("Modified array ");
//            for (int i=0; i < arr.length; i++)
//            {
//                System.out.print(arr[i] + " ");
//
//            }
//        }
    }