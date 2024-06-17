package com.rahul.kumar.scaler.Day7_1DArrayQuestion;

import java.util.Scanner;

public class Program3PrintTheMaxElementFromTheArray {

	static int maxOfArray(int [] max) {
		int maxEle = max[0];
		for(int i=1;i<max.length;i++) {
			if(maxEle < max[i])
				maxEle = max[i];
		}
		return maxEle;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size Of Array ");
		int size = sc.nextInt();
		int [] arr = new int[size];

		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
	//	System.out.print("Array arr is"+arr.toString());
		System.out.println(maxOfArray(arr));
	}
}
