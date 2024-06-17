package com.rahul.kumar.scaler.Day9_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Program4GivenAnArrayListAndNeedToReturnMultipleOfGivenNumber {

	static ArrayList<Integer> printMultiple(ArrayList<Integer> al, int mul1, int mul2){
		ArrayList<Integer> arrlst = new ArrayList<>();
		for(int j=0;j<al.size();j++) {
			int check =al.get(j);
			if(check%mul1 ==0 || check%mul2 ==0) {
				arrlst.add(check);
			}
		}
		return arrlst;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		System.out.println("Enter the multiple check value");
		int mul1 = sc.nextInt();
		int mul2 = sc.nextInt();
		int size = 5;
		for(int i=0;i<size;i++) {
			int val = sc.nextInt();
		      al.add(val);
		}
		System.out.println("All entered elements are : "+al);
		
		System.out.println(printMultiple(al,mul1,mul2));
	}
}
