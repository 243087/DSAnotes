package com.rahul.kumar.scaler.Module5Day27_BitManipulation1;

public class Program3_GivenIntegerNCountTheSetBitsOfNOptimised {
	static void checkBit(int num) {
		int count =0;
		while(num>0) {
			if((num&1)==1)
				count++;
			num = num>>1;
		}
		System.out.println(count);                       //            TC = O[logN]          SC = O[1]
	}
	public static void main(String[] args) {
		int num = 10;
	    checkBit(num);
	}
}
