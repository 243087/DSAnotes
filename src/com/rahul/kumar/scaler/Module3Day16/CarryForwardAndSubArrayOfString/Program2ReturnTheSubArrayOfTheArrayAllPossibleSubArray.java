package com.rahul.kumar.scaler.Module3Day16.CarryForwardAndSubArrayOfString;

public class Program2ReturnTheSubArrayOfTheArrayAllPossibleSubArray {

	static void printSubArray(int []arr) {
		int n = arr.length;
		int newArrLength = (n*(n+1))/2;
		int [][] newArr = new int[newArrLength][];
		
		int index =0;
		for(int s=0;s<arr.length;s++) {
			for(int e=s;e<arr.length;e++) {
				int[] subArray = new int[e - s + 1];
				for(int i=s;i<=e;i++) {
					subArray[i - s] = arr[i];
				}
				newArr[index++] = subArray;
			}
		}
	}
	public static void main(String[] args) {
		int []arr = {5,2,1,6};
		printSubArray(arr);
	}
}
