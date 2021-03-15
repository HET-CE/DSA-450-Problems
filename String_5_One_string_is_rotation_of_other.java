package com.company;

public class String_5_One_string_is_rotation_of_other {
    public static boolean is_Occur(char[] arr1 , char[] arr2) {
        if( arr1.length == arr2.length)
        {
            int i, flag;
            int j = 0;
            for (i = 0; i < arr1.length; i++) {
                for (j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        break;
                    }
                }
                if (j == arr2.length) {
                    return false;
                }
            }
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args) {
        String str1 = "ABACD";
        String str2 = "CDABa";

        char[] arrChar1 = str1.toCharArray();
        char[] arrChar2 = str2.toCharArray();
        boolean ans1 = is_Occur(arrChar1 , arrChar2);
        boolean ans2 = is_Occur(arrChar2 , arrChar1);
        if(ans1 == ans2)
            System.out.println(ans1);
        else
            System.out.println("false");
    }

    //  OPTIMAL

    /* Function checks if passed strings (str1 and str2)
      are rotations of each other */
//    static boolean areRotations(String str1, String str2)
//    {
//        // There lengths must be same and str2 must be
//        // a substring of str1 concatenated with str1.
//        return (str1.length() == str2.length()) &&
//                ((str1 + str1).indexOf(str2) != -1);
//    }
//
//    // Driver method
//    public static void main (String[] args)
//    {
//        String str1 = "AACD";
//        String str2 = "ACDA";
//
//        if (areRotations(str1, str2))
//            System.out.println("Strings are rotations of each other");
//        else
//            System.out.printf("Strings are not rotations of each other");
//    }
}
