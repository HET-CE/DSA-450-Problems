package com.company;

import java.util.HashSet;

public class String_10_Print_all_SubSequence {
    // Set to store all the subsequences
    static HashSet<String> st = new HashSet<>();

    // Function computes all the subsequence of an string
    static void subsequence(String str)
    {

        // Iterate over the entire string
        for (int i = 0; i < str.length(); i++)
        {

            // Iterate from the end of the string
            // to generate substrings
            for (int j = str.length(); j > i; j--)
            {
                String sub_str = str.substring(i, j);

                if (!st.contains(sub_str))
                    st.add(sub_str);

                // Drop kth character in the substring
                // and if its not in the set then recur
                for (int k = 1; k < sub_str.length() - 1; k++)
                {
                    StringBuffer sb = new StringBuffer(sub_str);

                    // Drop character from the string
                    sb.deleteCharAt(k);
                    if (!st.contains(sb));
                    subsequence(sb.toString());
                }
            }
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        String s = "abc";
        subsequence(s);
        System.out.println(st);
    }
}