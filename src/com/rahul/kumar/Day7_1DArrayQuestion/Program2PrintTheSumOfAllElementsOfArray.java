package com.rahul.kumar.Day7_1DArrayQuestion;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Program2PrintTheSumOfAllElementsOfArray {

	static int sumOfArray(int [] sumArray) {
		int sum = 0;
		for(int i=0;i<sumArray.length;i++) {
			sum +=sumArray[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size Of Array ");
		int size = sc.nextInt();
		int [] arr = new int[size];

		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array arr is"+Arrays.toString(arr));
		System.out.println(sumOfArray(arr));
	}
}
