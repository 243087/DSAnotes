package com.rahul.kumar.scaler.Module7Day47_MathCombinatoricsBasics;

public class Program3_Assignment3 {

	static int compute(int A,int B,int C){
		int [][] ans = new int[A+1][B+1];
		
		for(int r=0;r<=A;r++) {
			for(int c=0;c<=B;c++) {
				if(c>r)
					ans[r][c] = 0;
				else if(c==0)
					ans[r][c] = 1;
				else
					ans[r][c] = ans[r-1][c]+ans[r-1][c-1]%C;
			}
		}
		return ans[A][B];
	}
	public static void main(String[] args) {
		int A = 5;
		int B = 2;
		int C = 13;
		
		System.out.println(compute(A,B,C));
	}
}
