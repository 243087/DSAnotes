package com.rahul.kumar.scaler.Day7_1DArrayQuestion;

import java.util.Scanner;

public class Program4PrintTheMinElementFromTheArray {
	static int minOfArray(int [] max) {
		int minEle = max[0];
		for(int i=1;i<max.length;i++) {
			if(minEle > max[i])
				minEle = max[i];
		}
		return minEle;
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
		System.out.println(minOfArray(arr));
	
	}
}
