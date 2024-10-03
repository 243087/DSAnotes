package com.rahul.kumar.scaler.Module5Day30_Recursion;

import java.util.ArrayList;

public class Program5_FindAllTheIndexAtWhichElementAisPresent {

	static ArrayList<Integer> findElement(int []arr,int element) {
		ArrayList<Integer> al = new ArrayList<>();
		helper(arr,element,0,al);
		return al;
	}
	static void helper(int []arr,int B, int index, ArrayList<Integer> al) {
		if(index == arr.length)
			return;  
		if(arr[index]==B) {
			al.add(index);
		}
		helper(arr,B,index+1,al);
	}
	
	public static void main(String[] args) {
		int []arr = {4,5,3,1,5,4,5};
		int ele = 5;
		ArrayList<Integer> result =	findElement(arr,ele);
		System.out.println(result);
	}
}
