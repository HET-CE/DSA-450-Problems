package com.company;

public class Matrix_4 {

   static int rowWithMax1s(int arr[][], int n, int m){
        int count = 0 , precount = -1 , rn = 0;
        for(int i = 0 ; i <= n-1 ; i++){
            for( int j = 0 ; j <= m-1 ; j++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
            if(count > precount){
                precount = count;
                rn = i;
            }
        }
            return rn;
    }

    public static void main(String[] args) {
        int arr[][] = {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};
        int n = 4 , m = 4;
        int ans = rowWithMax1s(arr , n, m);
        System.out.println(ans);
    }
}
