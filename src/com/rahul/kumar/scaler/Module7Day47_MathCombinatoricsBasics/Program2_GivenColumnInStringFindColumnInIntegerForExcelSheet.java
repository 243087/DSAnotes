package com.rahul.kumar.scaler.Module7Day47_MathCombinatoricsBasics;

public class Program2_GivenColumnInStringFindColumnInIntegerForExcelSheet {

	static int findColumn(String col) {
		int num =0;
		for(int i=0;i<col.length();i++) {
			int res = col.charAt(i)-64;
			num = num*26 + res;
		}
		return num;
	}
	public static void main(String[] args) {
		String col = "AB";
		System.out.println(findColumn(col));
	}
}
