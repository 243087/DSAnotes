package com.rahul.kumar.scaler.Module5Day25_12DArrays;

public class Program4_PrintTheSpiralMatrix {

	static void spiralMatrix(int [][]arr) {
		int r = 0;
		int c =0;
		int size = arr.length;
		System.out.println(size);
		while(size>1) {
			for(int i=0;i<size-1;i++) {
				System.out.print(arr[r][c]+" ");
				c++;
			}
			for(int i=0;i<size-1;i++) {
				System.out.print(arr[r][c]+" ");
				r++; 	
			}
			for(int i=0;i<size-1;i++) {
				System.out.print(arr[r][c]+" ");
				c--;
			}
			for(int i=0;i<size-1;i++) {
				System.out.print(arr[r][c]+" ");
				r--;
			}
			r +=1;
			c +=1;
			size -=2;
		}
		if(size==1)                                                     //        TC = O[N^2]              SC = O[1]
			System.out.print(arr[r][c]);
	}

	public static void main(String[] args) {
		int [][]arr = {{1,2,3,4,5},
				       {6,7,8,9,10},
				       {11,12,13,14,15},
				       {16,17,18,19,20},
				       {21,22,23,24,25}};
		spiralMatrix(arr);
	}
}
