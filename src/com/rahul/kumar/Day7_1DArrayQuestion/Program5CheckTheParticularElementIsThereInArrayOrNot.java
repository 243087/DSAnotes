package com.rahul.kumar.Day7_1DArrayQuestion;

import java.util.Scanner;

public class Program5CheckTheParticularElementIsThereInArrayOrNot {

	static boolean elementOfArray(int [] arr,int numCheck) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==numCheck)
				return true;
		}
		return false;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size Of Array ");
		int size = sc.nextInt();
		int [] arr = new int[size];

		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to check");
		int numCheck = sc.nextInt();
		System.out.println(elementOfArray(arr, numCheck));
	
	}
}
