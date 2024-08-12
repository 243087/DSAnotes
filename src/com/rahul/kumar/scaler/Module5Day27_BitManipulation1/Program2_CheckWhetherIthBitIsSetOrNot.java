package com.rahul.kumar.scaler.Module5Day27_BitManipulation1;

public class Program2_CheckWhetherIthBitIsSetOrNot {

	static void check(int num,int i) {
		int x = num & (1<<i);
		if(x>0)
			System.out.println("true");
		else
			System.out.println("false");                                 //   TC = O[1]       
	}
	public static void main(String[] args) {
		int num = 89;
		check(num,5);
	}
}
