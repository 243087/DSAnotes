package com.rahul.kumar.Module4Day22String;

// <Question> : Find the number of occurrences of bob in string A consisting of lowercase English alphabets.

public class AdditionalAssignment2 {

	static int count(String str) {
		String s = "bob";
		int count =0;
		for(int i=0;i<str.length()-2;i++) {
			String sub = str.substring(i,i+3);
			if(s.equals(sub))
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		String s = "bobob";
		System.out.println(count(s));
	}
}

//                  OR

/*
public int count(String A) {
    int count=0;
    for(int i=0;i<A.length()-2;i++){
        if(A.charAt(i)=='b' && A.charAt(i+1)=='o'&& A.charAt(i+2)=='b'){
            count++;
        }
    }
    return count;
} */