package com.rahul.kumar.Module3Day16.CarryForwardAndSubArrayOfString;

public class Program1CountThePairOfElementsOfArrayMoreOptimise {

	static void countPairString(String str) {
		int count =0;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)=='a') {
				for(int j=i+1;j<str.length();j++) {
					if(str.charAt(j)=='g') {
						count++;
					}
				}
			}
		}
		System.out.println(count);                          //  Time Complexity = O[N*N]   ||  Space Complexity  = O[1]
	}
	public static void main(String[] args) {
		String str ="acgdgag";
		countPairString(str);
	}
}
