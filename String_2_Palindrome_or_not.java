package com.company;

public class String_2_Palindrome_or_not {
    public static boolean reverseString(char[] s) {

        int length = s.length;
        char[] tempArray = new char[length];
        for(int i = 0 ; i < length ; i++){
            tempArray[i] = s[i];
        }

        int k = length-1;
        char temp;
        for(int i = 0 ; i < (length/2) ; i++){
            temp = s[i];
            s[i] = s[k];
            s[k] = temp;
            k--;
        }

        int count;
        for (count = 0 ; count < length ; count++){
            if(tempArray[count] != s[count]){
                break;
            }
        }
        if(count != length)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        String str = "abba";
        char[] ch = str.toCharArray();
        boolean ans = reverseString(ch);
        System.out.println(ans);
    }
}
