package com.rahul.kumar.Module5Day33_Hashing1;


// Given N elements. Find the first non-repeating element
public class Program2_FindFirstNonRepeatedElement {

	static void nonRepeated(int []arr) {
		for(int i=0;i<arr.length;i++) {
			int count =0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j])
					count++;
			}
			if(count==1) {
				System.out.print(arr[i]);                      //            TC = O[N^2]          SC= O[1]
				return;
			}
		}
	}
	public static void main(String[] args) {
		int []arr = {1,2,3,1,2,5};
		nonRepeated(arr);
	}
}
//   We can't solve this by using Hashmap bcoz hashmap doesn't store keys in the ordered way