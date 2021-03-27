package com.company;

public class String_20_String_to_equivalent_mobile_numeric_keypad {

    public static String printSequence(String[] str, String input){
        String output = "";
        for(int i = 0 ; i < input.length() ; i++){
            if(input.charAt(i) == ' '){
                output = output + i;
            }
            else{
                int index = input.charAt(i) - 'A';
                output = output + str[index];
            }
        }
        return output;
    }
    public static void main(String[] args) {
        String[] str = {"2","22","222",
                "3","33","333",
                "4","44","444",
                "5","55","555",
                "6","66","666",
                "7","77","777","7777",
                "8","88","888",
                "9","99","999","9999"
        };

        String input = "HET";
        System.out.println(printSequence(str, input));
    }
}
