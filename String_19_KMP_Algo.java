//package com.company;
//
//public class String_19_KMP_Algo {
//    // Function to find largest prefix
//    // which is also a suffix
//    static int longestPrefixSuffix(String s)
//    {
//        int n = s.length();
//
//        // If n is less than 2
//        if(n < 2) {
//            return 0;
//        }
//
//        int len = 0;
//        int i = (n + 1)/2;
//
//        // Iterate i till n
//        while(i < n)
//        {
//
//            // If s[i] is equal to
//            // s[len]
//            if(s[i] == s[len])
//            {
//                ++len;
//                ++i;
//            }
//            else
//            {
//                i = i - len + 1;
//                len = 0;
//            }
//        }
//
//        // Return len
//        return len;
//
//    }
//
//    // Driver code
//    public static void main (String[] args)
//    {
//        String s = "blablabla";
//        System.out.println(longestPrefixSuffix(s));
//    }
//}
