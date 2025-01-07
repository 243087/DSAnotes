package com.rahul.kumar.Day7_1DArrayQuestion;

import java.util.Scanner;

public class Program8CheckGivenArrayIsStrictlyIncreasingOrNot {

	static boolean strictlyIncrease(int [] arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(i+1<arr.length && arr[i]>=arr[i+1])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size Of Array ");
		int size = sc.nextInt();
		int [] arr = new int[size];

		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(strictlyIncrease(arr));
	
	
	
	
	}
}
