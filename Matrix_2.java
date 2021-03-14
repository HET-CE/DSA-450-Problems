package com.company;

public class Matrix_2 {

    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0) return false;

        int n=matrix.length;   // Number of rows in a matrix
        int m=matrix[0].length; // Number of columns in the matrix

        int l=0;       // Initializing a left variable
        int r=n*m-1;   // Initializing a right variable

        // Applying BINARY SEARCH

        while(l<=r){

            int mid=(l+(r-l)/2);  // Since the whole matrix is like a linearly sorted array.

            if(matrix[mid/m][mid%m]==target){        //  |             |
                return true;                         //  | 1  3  5  7  | We are treatig this matrix as like a sorted array
            }                                        //  | 10 11 16 20 | and now applying the BINARY SEARCH.
            else if(matrix[mid/m][mid%m]<target){    //  | 23 30 34 60 | 1 3 5 7 10 11 16 20 23 30 34 60
                l=mid+1;                             //  |             |
            }
            else{
                r=mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 20;
        boolean c = searchMatrix(matrix,target);
        System.out.println(c);
    }
}
