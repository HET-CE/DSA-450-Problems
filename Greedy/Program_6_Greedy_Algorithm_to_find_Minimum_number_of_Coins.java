import java.util.*;
import java.lang.*;
import java.io.*;
 

public class Program_6_Greedy_Algorithm_to_find_Minimum_number_of_Coins {
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    ArrayList<Integer> l=new ArrayList<Integer>();
		    for(int i=0;i<n;i++)
		    {
		        l.add(sc.nextInt());
		    }
		    Collections.sort(l);
		   // System.out.println(l);
		    int min=Integer.MAX_VALUE;
		    int csum=0;
		    for(int i=0;i<l.size()-1;i++)
		    {
		        int r=csum;
		        for(int j=i+1;j<l.size();j++)
		        {
		            if(l.get(j)-l.get(i)>k)
		            {
		                r+=l.get(j)-l.get(i)-k;
		            }
		        }
		        min=Math.min(min,r);
		        csum+=l.get(i);
		    }
		    System.out.println(min);
		}
	}
}