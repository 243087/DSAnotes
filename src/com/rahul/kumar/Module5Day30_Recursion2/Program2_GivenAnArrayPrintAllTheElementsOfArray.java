package com.rahul.kumar.Module5Day30_Recursion2;

public class Program2_GivenAnArrayPrintAllTheElementsOfArray {

	static void printAllElement(int []arr) {
		printElement(arr,0);
	}
	static void printElement(int []arr,int idx) {
		
		if(idx==arr.length) 
			return;

		System.out.print(arr[idx]+" "); 
		printElement(arr,idx+1);                          //             TC = O[N]            SC= O[N]
	}
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5};
		printAllElement(arr);
	}
}
