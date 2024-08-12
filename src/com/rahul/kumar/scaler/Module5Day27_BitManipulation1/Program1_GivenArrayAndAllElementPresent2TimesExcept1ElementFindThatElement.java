package com.rahul.kumar.scaler.Module5Day27_BitManipulation1;

//Given arr[N] where every element is present twice except one unique element.Find that unique element


public class Program1_GivenArrayAndAllElementPresent2TimesExcept1ElementFindThatElement {

	static void findUniqueElement(int []arr) {
		int xor =0;
		for(int i=0;i<arr.length;i++) {
			xor = xor^arr[i];
		}
		System.out.println(xor);                                 //          TC = O[N]       SC = O[1]
	}
	public static void main(String[] args) {
		int []arr = {1,2,3,1,2,3,5};
		findUniqueElement(arr);
	}
}
