package com.rahul.kumar.Module5Day30_Recursion;

public class Program4_SumOfAllTheElementsOfArray {

	static int sumElement(int []arr,int idx) {
		if(idx ==arr.length-1)
			return arr[idx];
		return arr[idx]+ sumElement(arr,idx+1);
	}
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5};
		System.out.println(sumElement(arr,0));
	}
}
