package com.rahul.kumar.Module3Day14.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Program3RotateTheArrayFromRightToLeftCase1 {

	static int [] rotateArray(int [] rotateArray, int noOfRotation) {
		noOfRotation = noOfRotation%rotateArray.length;
		for(int i=0;i<noOfRotation;i++) {
			int temp = rotateArray[rotateArray.length-1];
			for(int j=rotateArray.length-1;j>=1;j--) {
				rotateArray[j] = rotateArray[j-1];
			}
			rotateArray[0] = temp;                              //       TC = O[N^2]                 SC = O[1] 
		}
		return rotateArray;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Rotation");
		int noOfRotation = sc.nextInt();
		int [] arr = {1,2,3,4,5,6};
		
		System.out.println("Given array is : "+Arrays.toString(arr));
		System.out.println("Rotated array is : "+Arrays.toString(rotateArray(arr,noOfRotation)));
	}
}
