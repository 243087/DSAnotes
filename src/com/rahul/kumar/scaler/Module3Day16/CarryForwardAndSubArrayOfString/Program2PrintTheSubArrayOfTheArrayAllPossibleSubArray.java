package com.rahul.kumar.scaler.Module3Day16.CarryForwardAndSubArrayOfString;

public class Program2PrintTheSubArrayOfTheArrayAllPossibleSubArray {

	static void printSubArray(int []arr) {
		for(int s=0;s<arr.length;s++) {
			for(int e=s;e<arr.length;e++) {
				for(int i=s;i<=e;i++) {
					System.out.print(arr[i]);
					if(i<e) {
						System.out.print(",");
					}
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		int []arr = {5,2,1,6};
		printSubArray(arr);
	}
}
