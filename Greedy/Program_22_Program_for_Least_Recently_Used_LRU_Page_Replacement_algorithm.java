import java.util.*;

public class Program_22_Program_for_Least_Recently_Used_LRU_Page_Replacement_algorithm {
    static int pageFaults(int N, int C, int pages[]){
        // code here
        if( C > N){
            return 0;
        }
        Queue arr = new LinkedList();
        int fault = C;
        for(int i = 0 ; i < C ; i++){
            arr.add(pages[i]);
        }
        for(int i = C ; i < N; i++){
            if(!arr.contains(pages[i])){
                arr.remove();
                arr.add(pages[i]);
                ++fault;
            }
        }
        return fault;
    }

    public static void main(String[] args) {
        int[] pages = {5, 0, 1, 3, 2, 4, 1, 0, 5};
        int N = 9;
        int C = 4;
        System.out.println(pageFaults(N, C, pages));
    }
}
