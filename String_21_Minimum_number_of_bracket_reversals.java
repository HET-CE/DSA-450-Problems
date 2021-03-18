package com.company;

import java.util.Stack;

public class String_21_Minimum_number_of_bracket_reversals {

    public static int MinReversal(String str) {
        int len = str.length();

        if(len % 2 != 0){
            return -1;
        }

        Stack<Character> s = new Stack<>();

        for(int i = 0 ; i < len ; i++){
            char c = str.charAt(i);
            if(c == '}' && !s.empty()){
                if(s.peek() == '{')
                    s.pop();
                else
                    s.push(c);
            }
            else
                s.push(c);
        }
        int red_line = s.size();
        int n = 0;
        while(s.peek() == '{' && !s.empty()){
            s.pop();
            n++;
        }
        return (red_line/2 + n%2) ;
    }
    public static void main (String[]args){
          String str = "}}{{";
          System.out.println(MinReversal(str));
    }
}