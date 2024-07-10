package com.rahul.kumar.scaler.Module3Day14.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Program2ReverseTheArrayFromMentionedIndexToAnotherIndex {

	static int [] reverseArray(int [] reverseArray, int first, int last) {
		while(first<last) {
			int temp = reverseArray[first];
			reverseArray[first] = reverseArray[last];
			reverseArray[last] = temp;
			first++;
			last--;
		}
		return reverseArray;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first element");
		int firstIndex = sc.nextInt();
		System.out.println("Enter the last element");
		int lastIndex = sc.nextInt();
		int [] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println("Given array is : "+Arrays.toString(arr));
		System.out.println("Reversed array is : "+Arrays.toString(reverseArray(arr,firstIndex,lastIndex)));
		//System.out.println(reverseArray(arr));
	}
}
