package com.rahul.kumar.scaler.Module3Day16.CarryForwardAndSubArrayOfString;



//Given a string s of lowercase characters return the count of pairs (i,j) such that
//  i<j and s[i]== 'a' and s[j]= 'g'
public class Program1CountThePairOfElementOfArray {

	static void countPairString(String str) {
		int count =0;
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<str.length();j++) {
				if(i<j && str.charAt(i)=='a' && str.charAt(j)=='g') {
					count++;
				}
			}
		}
		System.out.println(count);                            //  Time Complexity = O[N*N]   ||  Space Complexity  = O[1]
	}
	public static void main(String[] args) {
			String str = "abegag";
			countPairString(str);
			
	}
}
