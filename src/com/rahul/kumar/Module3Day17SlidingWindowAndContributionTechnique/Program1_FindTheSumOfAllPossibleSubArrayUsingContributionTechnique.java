package com.rahul.kumar.Module3Day17SlidingWindowAndContributionTechnique;

public class Program1_FindTheSumOfAllPossibleSubArrayUsingContributionTechnique {

	static void sumSubArr(int []arr) {
		long total =0;
		for(int i=0;i<arr.length;i++) {
		  long	contSub = (i+1)*(arr.length-i);
			total += arr[i]*contSub;
		}
		System.out.println(total);                              //       TC = O[N]   SC= O[1]
	}
	public static void main(String[] args) {
		int []arr = {3,2,5};
		sumSubArr(arr);
	}
}
