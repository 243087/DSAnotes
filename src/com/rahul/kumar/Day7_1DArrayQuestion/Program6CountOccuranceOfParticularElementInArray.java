package com.rahul.kumar.Day7_1DArrayQuestion;

import java.util.Scanner;

public class Program6CountOccuranceOfParticularElementInArray {

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
		System.out.println("Enter the Element");
		int element = sc.nextInt();
		System.out.println(checkElement(arr,element));
	
	
	}
}
