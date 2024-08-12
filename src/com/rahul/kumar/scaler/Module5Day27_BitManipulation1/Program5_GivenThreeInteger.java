package com.rahul.kumar.scaler.Module5Day27_BitManipulation1;

public class Program5_GivenThreeInteger {

	static void formNumber(int A,int B,int C) {
		int ans =0;
		for(int i=C; i<= (C+B-1); i++) {
			ans = ans|(1<<i);
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		int A =4;
		int B =3;
		int C =2;
		
		formNumber(A,B,C);
	}
}
