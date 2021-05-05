import java.util.Stack;

public class Program_12_Evaluation_of_Postfix_expression {
    public static int evaluatePostFix(String S)
    {
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < S.length(); i++){
            
            if( (S.charAt(i)) >=48 && (S.charAt(i)) <= 57){
                st.push(S.charAt(i)-48);
            }
            else{
                char c = S.charAt(i);
                int num1 = st.pop();
                int num2 = st.pop();
                if(c=='+')
                    st.push(num2+num1);
                else if(c=='-')
                    st.push(num2-num1);
                else if(c=='*')
                    st.push(num2*num1);
                else
                    st.push(num2/num1);
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String s= "231*+9-";
        System.out.println(evaluatePostFix(s));
    }
}
