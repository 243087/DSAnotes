package com.rahul.kumar.Day11_HashSetHashMap;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
	int [] arr = {1,2,3,4,5};
	int noOfRotation = 2;
	System.out.println("Rotated array is : "+Arrays.toString(rotateArray(arr,noOfRotation)));
	}
	static int [] rotateArray(int []arr, int no){
	    no = no%arr.length;

	    
	    for(int i=0;i<no;i++){
	         int temp = arr[arr.length-1];
	         for(int j=arr.length-1;j>=1;j--){
	             arr[j] = arr[j-1];
	         }
	         arr[0] = temp;
	    }
	    return arr;
	}
}
