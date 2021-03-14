package com.company;

public class String_1_Reverse_a_String {
    public static void reverseString(char[] s) {
        int k = s.length-1;
        char temp;
        for(int i = 0 ; i < (s.length/2) ; i++){
            temp = s[i];
            s[i] = s[k];
            s[k] = temp;
            k--;
        }
        for(char c : s){
            System.out.print(c+ " ");
        }
    }

    public static void main(String[] args) {
        String str = "hello";
        char[] ch = str.toCharArray();
        reverseString(ch);
    }
}
