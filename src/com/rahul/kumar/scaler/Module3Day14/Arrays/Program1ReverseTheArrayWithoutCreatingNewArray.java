package com.rahul.kumar.scaler.Module3Day14.Arrays;

import java.util.Arrays;

public class Program1ReverseTheArrayWithoutCreatingNewArray {

	static int [] reverseArray(int [] reverseArray) {
		int first = 0;
		int last = reverseArray.length-1;
		while(first<last) {
			int temp = reverseArray[first];
			reverseArray[first] = reverseArray[last];
			reverseArray[last] = temp;
			first++;
			last--;
		}
		return reverseArray;                                    // TC = O[N]              SC = O[1]
	}
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6};
		System.out.println("Given array is : "+Arrays.toString(arr));
		System.out.println("Reversed array is : "+Arrays.toString(reverseArray(arr)));
		//System.out.println(reverseArray(arr));
	}
}
