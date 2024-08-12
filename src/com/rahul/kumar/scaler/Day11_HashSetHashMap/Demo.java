package com.rahul.kumar.scaler.Day11_HashSetHashMap;

public class Demo {

	public static void common(int []arr1,int  []arr2) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}
	public static void main(String[] args) {
		int []arr1 = {0,-2,4,10};
		int []arr2 = {1,-2,3,5,4};
		common(arr1,arr2);
	}
}
