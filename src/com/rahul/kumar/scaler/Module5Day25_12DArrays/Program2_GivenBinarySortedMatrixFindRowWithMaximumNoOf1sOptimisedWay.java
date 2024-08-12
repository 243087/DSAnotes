package com.rahul.kumar.scaler.Module5Day25_12DArrays;

public class Program2_GivenBinarySortedMatrixFindRowWithMaximumNoOf1sOptimisedWay {
	
	static void maxOne(int [][]arr) {
	   int row = arr.length;
	   int col = arr[0].length;
	   int r=0;
	   int c=col-1;
	   int ans =0; 
	   
	   while(r<row && c>=0) {
		   while(c>=0 && arr[r][c]==1) {
			   ans = r;
			   c--;
		   }
		   r++;
	   }
	   System.out.println(ans);                         //                       TC = O[R+C]         SC = O[1]
	}
	
	public static void main(String[] args) {
		int [][]arr = {{0,0,0,0,1,1},
				       {0,0,1,1,1,1},
				       {0,0,0,0,0,1},
				       {0,0,0,0,1,1},
				       {0,1,1,1,1,1},
				       {0,0,0,1,1,1}};
		maxOne(arr);
	}
}
