package com.rahul.kumar.scaler.Module4Day23InterviewQuestions;

import java.util.Arrays;

public class Program2_FindTheMajorityElement {

	static int countMajorityElement(int []arr) {
			int [] newArr = new int[arr.length];
			
			for(int i=0;i<arr.length;i++) {
				newArr[i] =checkElement(arr,arr[i]);	
			}
             System.out.println("Fequency Array is "+Arrays.toString(newArr));
           for(int j=0;j<newArr.length;j++) {
        	   if(newArr[j]>(newArr.length/2))
        		   return arr[j];
           }                                               //     TC = O[N]      SC = O[N]
           return 0;
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
		int []arr = {3,3,4,2,4,4,2,4,4,4};
		System.out.println(countMajorityElement(arr));
	}
}
