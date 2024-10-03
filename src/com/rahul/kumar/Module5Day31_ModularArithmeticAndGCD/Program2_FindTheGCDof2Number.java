package com.rahul.kumar.Module5Day31_ModularArithmeticAndGCD;

public class Program2_FindTheGCDof2Number {

	static int findGCD(int num1,int num2) {
		if(num2 ==0)
			return num1;
		return findGCD(num2,num1%num2);                      //  TC = O[log2(min(num1,num2))]         SC =  O[log2(min(num1,num2))]
	}
	public static void main(String[] args) {
		int num1 = 500;
		int num2 = 25;                        
		System.out.println(findGCD(num1,num2));
	}
}
