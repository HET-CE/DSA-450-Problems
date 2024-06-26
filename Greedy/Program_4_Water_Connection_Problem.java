import java.util.*;

public class Program_4_Water_Connection_Problem {
    static int n, p;
  
    static int rd[] = new int[1100];
  
    static int wt[] = new int[1100];
  
    static int cd[] = new int[1100];
  
    static List <Integer> a = new ArrayList<Integer>();
                
    static List <Integer> b = new ArrayList<Integer>();
                
    static List <Integer> c = new ArrayList<Integer>();
      
    static int ans;
      
    static int dfs(int w)
    {
        if (cd[w] == 0)
            return w;
        if (wt[w] < ans)
            ans = wt[w];
              
        return dfs(cd[w]);
    }
  
    // Function to perform calculations.
    static void solve(int arr[][])
    {
        int i = 0;
      
        while (i < p)
        {
              
            int q = arr[i][0];
            int h = arr[i][1];
            int t = arr[i][2];
              
            cd[q] = h;
            wt[q] = t;
            rd[h] = q;
            i++;
        }
          
        a=new ArrayList<Integer>();
        b=new ArrayList<Integer>();
        c=new ArrayList<Integer>();
          
        for (int j = 1; j <= n; ++j)
          
            if (rd[j] == 0 && cd[j]>0) {
                ans = 1000000000;
                int w = dfs(j);
                  
                a.add(j);
                b.add(w);
                c.add(ans);
            }
              
        System.out.println(a.size());
          
        for (int j = 0; j < a.size(); ++j)
            System.out.println(a.get(j) + " " + b.get(j) + " " + c.get(j));
    }
  
    // main function
    public static void main(String args[])
    {
        n = 9;
        p = 6;
          
        for(int i = 0; i < 1100; i++)
            rd[i] = cd[i] = wt[i] = 0;
          
        int arr[][] = { { 7, 4, 98 },
                        { 5, 9, 72 },
                        { 4, 6, 10 },
                        { 2, 8, 22 },
                        { 9, 7, 17 },
                        { 3, 1, 66 } };
        solve(arr);
    }
}