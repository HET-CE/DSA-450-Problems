import java.util.Stack;

public class Program_18_Length_of_the_Longest_Valid_Substring {
    
    static int findMaxLen(String str) {
        int n = str.length();
 
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);
 
        int result = 0;
 
        for (int i = 0; i < n; i++)
        {
            if (str.charAt(i) == '(')
                stk.push(i);
 
            else
            {
                if(!stk.empty())
                    stk.pop();
 
                if (!stk.empty())
                    result = Math.max(result, i - stk.peek());
                else
                    stk.push(i);
            }
        }
 
        return result;
    }


    /*  Number of characters that represent valid substring. */

    static int maxchar(String S) {
        Stack<Character> st = new Stack<>();
        int cn = 0;
        for(int i = 0 ; i < S.length(); i++){
            if(S.charAt(i)=='('){
                st.push(S.charAt(i));
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                    cn += 2;
                }
            }
        }
     return cn;
    }
    public static void main(String[] args) {
        String s = "())())(";
        System.out.println(findMaxLen(s));
        System.out.println(maxchar(s));
    }
}
