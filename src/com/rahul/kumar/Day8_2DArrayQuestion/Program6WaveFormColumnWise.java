package com.rahul.kumar.Day8_2DArrayQuestion;

public class Program6WaveFormColumnWise {

	static void printWave(int [][]arr) {
	     int row = arr.length;
	     int col = arr[0].length;
	     
	     for(int j=0;j<col;j++) {
	    	 if(j%2==0) {
	    	   for(int i=0;i<row;i++) {
	    		 System.out.print(arr[i][j]+" ");
	    	   }
	    	 }
	    	 else {
	    		 for(int k= row-1;k>=0;k--) {
	    			 System.out.print(arr[k][j]+" ");
	    		 }
	    	 }
	    	 System.out.println();
	     }
	}
	public static void main(String[] args) {
		int [][]matrix =  {{4,1,2},
		                  {7,8,9,},
		                  {3,7,11},
		                  };
		
		printWave(matrix);
	}
}
