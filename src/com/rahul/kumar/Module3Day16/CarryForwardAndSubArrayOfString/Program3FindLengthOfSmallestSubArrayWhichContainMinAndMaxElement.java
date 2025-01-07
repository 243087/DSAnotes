package com.rahul.kumar.Module3Day16.CarryForwardAndSubArrayOfString;

// <Question> : Given an array A[].Return the length of smallest subarray which contains both max and min element of the array.
//     Eg     :  A = {3,6,2,1,6,5}   -> Ans 2(from index 3 to 4, it contains but max and min element of the array)
//                          
public class Program3FindLengthOfSmallestSubArrayWhichContainMinAndMaxElement {

	static void findLength(int []arr) {
		int min =arr[0];
		int max =arr[0];
		for(int i=0;i<arr.length;i++) {
			min = Math.min(min,arr[i]);
			max = Math.max(max,arr[i]);
		}
		int minLength = arr.length;
		for(int s=0;s<arr.length;s++) {
			for(int e=s;e<arr.length;e++) {
				boolean minFound = false;
				boolean maxFound = false;
				for(int i=s;i<=e;i++) {
					if(arr[i] == min)
						minFound = true;
					if(arr[i] == max)
						maxFound = true;
				}
				if(minFound && maxFound)
					minLength = Math.min(minLength, e-s+1);
			}
		}
		System.out.println(minLength);
	}
	public static void main(String[] args) {
		int []arr = {3,6,2,1,6,5};
		findLength(arr);
		
	}
}
