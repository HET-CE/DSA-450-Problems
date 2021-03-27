package com.company;

import java.util.Arrays;

public class String_33_Write_a_program_tofind_the_smallest_window_that_contains_all_characters_of_string_itself {
//    final static int NO_OF_CHARS = 256;
//
//    // Find maximum distinct characters in any string
//    static int max_distinct_char(String str, int n) {
//
//        // Initialize all character's count with 0
//        int count[] = new int[NO_OF_CHARS];
//
//        // Increase the count in array if a character
//        // is found
//        for (int i = 0; i < n; i++) {
//            count[str.charAt(i)]++;
//        }
//
//        int max_distinct = 0;
//        for (int i = 0; i < NO_OF_CHARS; i++) {
//            if (count[i] != 0) {
//                max_distinct++;
//            }
//        }
//
//        return max_distinct;
//    }
//
//    static int smallesteSubstr_maxDistictChar(String str) {
//
//        int n = str.length();     // size of given string
//
//        // Find maximum distinct characters in any string
//        int max_distinct = max_distinct_char(str, n);
//        int minl = n;   // result
//
//        // Brute force approach to find all substrings
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//
//                String subs = null;
//                if(i<j)
//                    subs = str.substring(i, j);
//                else
//                    subs = str.substring(j, i);
//                int subs_lenght = subs.length();
//                int sub_distinct_char = max_distinct_char(subs, subs_lenght);
//
//                // We have to check here both conditions together
//                // 1. substring's distinct characters is equal
//                //    to maximum distinct characters
//                // 2. substing's length should be minimum
//                if (subs_lenght < minl && max_distinct == sub_distinct_char) {
//                    minl = subs_lenght;
//                }
//            }
//        }
//        return minl;
//    }
//
//    /* Driver program to test above function */
//    static public void main(String[] args) {
//        // Input String
//        String str = "AABBBCBB";
//
//        int len = smallesteSubstr_maxDistictChar(str);
//        System.out.println(" The length of the smallest substring"
//                + " consisting of maximum distinct "
//                + "characters : "+len);
//    }

    static final int MAX_CHARS = 256;

    // Function to find smallest window containing
    // all distinct characters
    static String findSubString(String str)
    {
        int n = str.length();

        // Count all distinct characters.
        int dist_count = 0;

        boolean[] visited = new boolean[MAX_CHARS];
        Arrays.fill(visited, false);
        for (int i = 0; i < n; i++) {
            if (visited[str.charAt(i)] == false) {
                visited[str.charAt(i)] = true;
                dist_count++;
            }
        }

        // Now follow the algorithm discussed in below
        // post. We basically maintain a window of characters
        // that contains all characters of given string.
        int start = 0, start_index = -1;
        int min_len = Integer.MAX_VALUE;

        int count = 0;
        int[] curr_count = new int[MAX_CHARS];
        for (int j = 0; j < n; j++) {
            // Count occurrence of characters of string
            curr_count[str.charAt(j)]++;

            // If any distinct character matched,
            // then increment count
            if (curr_count[str.charAt(j)] == 1)
                count++;

            // if all the characters are matched
            if (count == dist_count) {
                // Try to minimize the window i.e., check if
                // any character is occurring more no. of times
                // than its occurrence in pattern, if yes
                // then remove it from starting and also remove
                // the useless characters.
                while (curr_count[str.charAt(start)] > 1) {
                    if (curr_count[str.charAt(start)] > 1)
                        curr_count[str.charAt(start)]--;
                    start++;
                }

                // Update window size
                int len_window = j - start + 1;
                if (min_len > len_window) {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }
        // Return substring starting from start_index
        // and length min_len
        return str.substring(start_index, start_index + min_len);
    }

    // Driver code
    public static void main(String args[])
    {
        String str = "aabcbcdbca";
        System.out.println("Smallest window containing all distinct"
                + " characters is: " + findSubString(str));
    }


}
