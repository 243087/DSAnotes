package com.rahul.kumar.Module4Day20SortingBasic;

import java.util.Arrays;
import java.util.Scanner;

public class Program5_KthMinimumElementInArrayUsingSelectionSort {

	static void findKthMinElement(int []arr,int index) {
		for(int i=0;i<index;i++) {
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex])
					minIndex = j;
			}
			swap(arr,i,minIndex);
		}
		System.out.println("Before sorting"+Arrays.toString(arr));
		System.out.println(index+"st min element in array is "+arr[index-1]);
	}
	static void swap(int []arr, int i,int minIndex) {
		int temp = arr[i];
		arr[i]   = arr[minIndex];
		arr[minIndex] = temp;                           //                        TC = O[N^2]      SC = O[1]
	}
	public static void main(String[] args) {
		int []arr = {5,1,4,9,2};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int index = sc.nextInt();
		System.out.println("Before sorting"+Arrays.toString(arr));
		findKthMinElement(arr,index);
	}
}
