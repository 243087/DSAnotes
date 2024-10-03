package com.rahul.kumar.Module4Day23InterviewQuestions;

public class Program2_FindTheMajorityElementByMooresAlgorithm {

	static int moreeAlgorithm(int []arr) {
		int maxEle = -1;
		int freq = 0;
		for(int i=0;i<arr.length;i++) {
			if(freq ==0) {
				maxEle = arr[i];
				freq = 1;
			}
			else {
				if(maxEle==arr[i]) 
					freq +=1;
				else
					freq -=1;
			}
		}                                                //             TC = O[N]      SC = O[1]
		freq =0;
		for(int i=0;i<arr.length;i++) {
				if(arr[i]==maxEle)
					freq++;
		}
		if(freq>(arr.length/2))
			return maxEle;
		
		return -1;
	}
	public static void main(String[] args) {
		int []arr = {3,4,3,6,1,3,2,5,3,3,3};
		System.out.println(moreeAlgorithm(arr));
	}
}
