package com.rahul.kumar.Module3Day16.CarryForwardAndSubArrayOfString;

public class Program1CountThePairOfElementsOfArrayUsingCarryForward {

	static void countPairString(String str) {
		int countA = 0;
		int ans = 0;
		
		for(int i=0;i<str.length();i++) {
		    if(str.charAt(i)=='a')
		    	countA++;
		    if(str.charAt(i)=='g')
		    	ans +=countA;
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		String str ="bcaggaag";
		countPairString(str);
	}
}
