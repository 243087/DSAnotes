package com.rahul.kumar.Module8_Day61_DP2_TwoDimentional;

// < Question > : Imagine there is a matrix of N * M dimensions. Initially you are at ( 0 , 0 ). You can move in horizontal ( → ) 
//                and vertical ( ↓ ) directions with 1 step at a time. Total number of ways from ( 0 , 0 ) to ( N-1, M-1 ).

public class Program2_MatrixDirection_Recursion {

    static int uniquePaths(int r, int c) {
        if (r == 0 || c == 0)
            return 1;
        return uniquePaths(r - 1, c) + uniquePaths(r, c - 1);
    }
                                                              //      TC = O[2^(r*c)]       
    public static void main(String[] args) {
        int R = 3, C = 3;
        System.out.println("Unique Paths: " + uniquePaths(R - 1, C - 1)); 
    }
}

