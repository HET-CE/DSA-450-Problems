import java.util.Stack;

public class Program_13_Implement_a_method_to_insert_an_element_at_its_bottom_without_using_any_other_data_structure {
    static Stack st = new Stack();
    
    static void insert_at_bottom(char x){

        if(st.isEmpty())
            st.push(x);
    
        else{
    
            char a = (char) st.peek();
            st.pop();
            insert_at_bottom(x);
    
            st.push(a);
        }
    }

    public static void main(String[] args) {
        char x = '2';
        st.push('1');
        st.push('3');
        st.push('4');
        st.push('5');
        st.push('6');
        insert_at_bottom(x);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
