package com.rahul.kumar.Module4Day18Array2DMatrix;

public class Demo {
	   public static void matrixRotate(int[][] A) {
	        int n = A.length;
	        for(int i=0 ; i<n ; i++){
	            for(int j=0 ; j<i ; j++){
	                int temp = A[i][j];
	                A[i][j] = A[j][i];
	                A[j][i] = temp;
	            }
	        }
	        for(int i=0 ; i<n ; i++){
	            for(int j=0 ; j<n/2 ; j++){
	                int temp = A[i][j];
	                A[i][j] = A[i][n-j-1];
	                A[i][n-j-1] = temp;
	            }
	        }
	        for(int i=0;i<A.length;i++) {
	        	for(int j=0;j<A[i].length;j++) {
	        		System.out.print(A[i][j]+" ");
	        	}
	        	System.out.println();
	        }
	        
	    }
	public static void main(String[] args) {
		int [][]arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		matrixRotate(arr); 
	}
}
