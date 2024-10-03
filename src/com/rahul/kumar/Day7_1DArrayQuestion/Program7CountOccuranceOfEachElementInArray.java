package com.rahul.kumar.Day7_1DArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class Program7CountOccuranceOfEachElementInArray {
	
//	Program6CountOccuranceOfParticularElementInArray use = new Program6CountOccuranceOfParticularElementInArray();

	static int [] checkEachElement(int [] arr) {
		int [] newArr = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			newArr[i] =checkElement(arr,arr[i]);	
		}
		return newArr;
	}
	static int checkElement(int [] arr, int check) {
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==check)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size Of Array ");
		int size = sc.nextInt();
		int [] arr = new int[size];

		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(checkEachElement(arr)));
	
	
	
	}
}
