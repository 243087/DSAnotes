package com.rahul.kumar.Module4Day22String;

public class Demo {

	  static String reverse(String A){
		    char []str = A.toCharArray();
		    int l = 0;
		    int r = str.length-1;
		    while(l<r){
		        char temp = str[l];
		        str[l] = str[r];
		        str[r] = temp;
		        l++;
		    }
		    return new String(str);
		    }
		 
		    public static void main(String[] args) {
		     	String s = "Scaler";
				System.out.print(reverse(s));
		    }
}
