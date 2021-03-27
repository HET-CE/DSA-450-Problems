package com.company;

public class Array_34 {
    static int palindrome(int arr[]){
        int count = 0;
        for (int i = 0 ; i < arr.length ; i++)
        {
            int temp = arr[i];
            int num2 = 0;
            int rem = 0;
            while (arr[i] != 0) {
                rem = arr[i] % 10;
                num2 = (num2 + rem) * 10;
                arr[i] = arr[i] / 10;
            }
            num2 = num2 / 10;
            if (temp == num2) {
                count++;
            }
            else{
                return 0;
            }
        }
         if(count == arr.length){
             return 1;
         }
         else
             return 0;
    }

    public static void main(String[] args) {
        int arr[] = {111, 222, 333, 949};
        int c = palindrome(arr);
        System.out.println(c);
    }
}