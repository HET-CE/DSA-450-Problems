import java.util.Stack;

public class Program_6_Check_the_expression_has_valid_or_Balanced_parenthesis_or_not {
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character>st = new Stack<>();
        int i=0;
        char c;
        while(i<x.length()){
            if(x.charAt(i)=='(' || x.charAt(i)=='{' || x.charAt(i)=='['){
                st.push(x.charAt(i));
            }
            if (st.isEmpty())
                return false;
            else if(x.charAt(i)==')'){
                c = st.pop();
                if(c != '(')
                 return false;
            }
            
            else if(x.charAt(i)=='}'){
                c = st.pop();
                if(c != '{')
                 return false;
            }
            
            else if(x.charAt(i)==']'){
                c = st.pop();
                if(c != '[')
                 return false;
            }
         i++;
        }
        return (st.isEmpty());
    }

    public static void main(String[] args)
    {
        String expr = "([{}])";

        // Function call
        if (ispar(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}
