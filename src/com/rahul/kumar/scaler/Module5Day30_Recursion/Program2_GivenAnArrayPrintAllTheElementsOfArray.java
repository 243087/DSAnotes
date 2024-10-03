package com.rahul.kumar.scaler.Module5Day30_Recursion;

public class Program2_GivenAnArrayPrintAllTheElementsOfArray {

	static void printAllElement(int []arr,int idx) {
		
		if(idx==arr.length) {
			return;
		}
		System.out.print(arr[idx]+" "); 
		printAllElement(arr,idx+1);                          //             TC = O[N]            SC= O[N]
	}
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5};
		printAllElement(arr,0);
	}
}
