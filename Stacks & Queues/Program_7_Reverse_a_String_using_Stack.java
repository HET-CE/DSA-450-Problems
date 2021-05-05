import java.util.Stack;

public class Program_7_Reverse_a_String_using_Stack {
    public static String reverse(String S){
        //code here
        Stack<Character>st = new Stack<>();
        for(int i = 0 ; i < S.length(); i++){
            st.push(S.charAt(i));
        }
        String res= "";
        while(!st.isEmpty()){
            res = res + st.pop(); 
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "het patel";
        String res = reverse(s);
        System.out.println(res);
    }
}
