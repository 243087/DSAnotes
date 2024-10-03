package com.rahul.kumar.Module4Day20SortingBasic;

// A[i] is noble if count of elements smaller than A[i] is equal to A[i]
public class Program2_CountTheNobleIntegerForDistinctElementOnly {

	static void countNoble(int []arr) {
		int countNoble =0;
		for(int i=0;i<arr.length;i++) {
			int check =0;
			for(int j=0;j<arr.length;j++) {  
				if(arr[i]>arr[j])
					check++;
			}
			if(check==arr[i])
				countNoble++;
		}
		System.out.println(countNoble);                              //                TC = O[N^2]      SC = O[1]
	}

	public static void main(String[] args) {
		int []arr = {1,-5,3,5,-10,4};
		countNoble(arr);
	}
}
