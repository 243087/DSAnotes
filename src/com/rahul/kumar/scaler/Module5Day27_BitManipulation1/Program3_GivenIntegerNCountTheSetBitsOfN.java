package com.rahul.kumar.scaler.Module5Day27_BitManipulation1;

public class Program3_GivenIntegerNCountTheSetBitsOfN {

	static void checkBit(int num) {
		int count =0;
		for(int i=0;i<32;i++) {
			if(check(num,i)) {
				count++;
			}
		}
		System.out.println(count);
	}
	static boolean check(int num, int i) {                     
		int x = num & (1<<i);
		if(x>0)
			return true;
		else
			return false; 
	}
	public static void main(String[] args) {
		int num = 12;
	    checkBit(num);
	}
}
