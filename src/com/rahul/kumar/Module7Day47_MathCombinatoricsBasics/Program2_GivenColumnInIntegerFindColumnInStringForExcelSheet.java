package com.rahul.kumar.Module7Day47_MathCombinatoricsBasics;

public class Program2_GivenColumnInIntegerFindColumnInStringForExcelSheet {

	static String findColumn(int n) {
		StringBuilder ans= new StringBuilder();
		
		while(n>0) {
			n -=1;
			int rem = n%26;
			int quo = n/26;
			ans.append((char)('A' + rem));
			n = quo;
		}
		return ans.reverse().toString();
	}
	public static void main(String[] args) {
		int n = 100;
		System.out.println(findColumn(n));
	}
}
