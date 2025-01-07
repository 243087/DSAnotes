package com.rahul.kumar.Module8_Day61_DP2_TwoDimentional;

// Find how many A-digit positive number exit, such that the sum of their digits equals B
// Note: A valid number does not contains leading zero means bt 1-9
// Ex - Input : A = 2, B = 4;     Output : 4  (13,22,31,40)

public class Program3_A_DigitNumber {

	static int countDigit(int A,int B) {
		int count = 0;
		int start = (int) Math.pow(10,A-1);
		int end = (int) Math.pow(10,A);
		
		for(int i=start;i<end;i++) {
			int digitCount = 0;
			int num = i;
			while(num>0) {
				int temp = num%10;
				digitCount += temp;
				num = num/10;
			}
			if(digitCount==B)
				count++;                                         //             TC = O[A*10^A]            SC = O[1]
		}
		return count;
	}
	public static void main(String[] args) {
		int A = 3;
		int B = 3;
		System.out.println(countDigit(A,B));
	}
}
