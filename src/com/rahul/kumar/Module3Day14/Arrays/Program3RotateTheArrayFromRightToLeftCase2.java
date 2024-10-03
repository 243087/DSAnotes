package com.rahul.kumar.Module3Day14.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Program3RotateTheArrayFromRightToLeftCase2 {

	static int [] rotateArrayKtimes(int [] arr, int k) {
		k = k%arr.length;
		reverseArray(arr,0,arr.length-1);
		
		reverseArray(arr,0,k-1);
		
	reverseArray(arr,k,arr.length-1);
	return arr;
	}
	
	static int [] reverseArray(int [] arr, int start, int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start]= arr[end];
			arr[end] = temp;
			start++;
			end--;
		}                                                        //  TC = O[N]                SC = O[1]
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Rotation");
		int noOfRotation = sc.nextInt();
		int [] arr = {1,4,6,7,9,3,2};
		
		System.out.println("Given array is : "+Arrays.toString(arr));
		System.out.println("Rotated array is : "+Arrays.toString(rotateArrayKtimes(arr,noOfRotation)));
	}
}
