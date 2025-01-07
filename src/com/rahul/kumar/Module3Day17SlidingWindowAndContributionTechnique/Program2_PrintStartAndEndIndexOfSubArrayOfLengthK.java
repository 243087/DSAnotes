package com.rahul.kumar.Module3Day17SlidingWindowAndContributionTechnique;

public class Program2_PrintStartAndEndIndexOfSubArrayOfLengthK {

	static void printIndex(int []arr, int k) {
		int l=0;
		int r=k-1;
		while(r<arr.length) {
			System.out.println(l+" - "+r);                     //       TC = O[N]     SC = O[1]
			l++;
			r++;
		}
	}
	public static void main(String[] args) {
		int []arr = {11,2,9,6,3,1,10,4};
		int length = 4;
		printIndex(arr,length);
	}
}
