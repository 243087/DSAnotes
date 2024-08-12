package com.rahul.kumar.scaler.Module4Day23InterviewQuestions;

public class Program2_FindTheMajorityElementOneMoreWay {

	static int countMajorityElement(int []arr) {
		for(int i=0;i<arr.length;i++) {
			int value = arr[i];
			int count =0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==value)
					count++;
			}
			if(count>(arr.length/2))
				return value;
		}                                                           //          TC = O[N^2]         SC = O[1]
		return -1;
	}
	public static void main(String[] args) {
		int []arr = {3,3,4,2,4,4,2,4,4,4};
		System.out.println(countMajorityElement(arr));
	}
}
