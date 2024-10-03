package com.rahul.kumar.scaler.Module5Day25_2DArrays;

public class Program5_SumOfAllPossibleSubmatrix {

	static void sumMatrix(int [][]arr) {
		int row = arr.length;
		int col = arr[0].length;
		int ans = 0;
		for(int r1=0;r1<row;r1++) {
			for(int c1=0;c1<col;c1++) {
				for(int r2=r1;r2<row;r2++) {
					for(int c2=c1;c2<col;c2++) {
						int sum =0;
						for(int i=r1;i<=r2;i++) {
							for(int j=c1;j<=c2;j++) {
								sum +=arr[i][j];
							}
						}
							ans += sum;                         //              TC = O[R*C]^3 --> O[N]^6        SC = O[1]
					}
				}
			}
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		int [][]arr = {{4,9,6},
				       {5,-1,2}
		              };
		sumMatrix(arr);
	}
}
