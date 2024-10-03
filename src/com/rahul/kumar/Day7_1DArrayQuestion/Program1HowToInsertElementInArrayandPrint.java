package com.rahul.kumar.Day7_1DArrayQuestion;

import java.util.Scanner;

public class Program1HowToInsertElementInArrayandPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int sizeArray = sc.nextInt();
		int [] arr = new int[sizeArray];
		System.out.println("Enter the Array Element");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Array arr is");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
